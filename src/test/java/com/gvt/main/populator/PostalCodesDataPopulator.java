package com.gvt.main.populator;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.TreeMap;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PostalCodesDataPopulator implements Runnable {

	private static final Logger logger = LoggerFactory.getLogger(PostalCodesDataPopulator.class);

	private static BasicDataSource dataSource;

	public static void main(String[] args) {
		logger.info("Populating postal code for Spain");

		dataSource = loadDataSource();

		PostalCodesDataPopulator fakeDataPopulator = new PostalCodesDataPopulator();

		for (int x = 0; x < 1; ++x) {
			Thread thread = new Thread(fakeDataPopulator);
			thread.start();
		}
	}

	@Override
	public void run() {
//		populate();
		try {
			readPostalCodes();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void readPostalCodes() throws IOException, InvalidFormatException, SQLException {
		FileInputStream file = new FileInputStream(
				getClass().getClassLoader().getResource("postalCodes.xls").getFile());
//		OPCPackage pkg = OPCPackage
//				.open(new File(getClass().getClassLoader().getResource("postalCodes.xls").getFile()));
		Workbook workbook = new HSSFWorkbook(file);
		Sheet sheet = workbook.getSheetAt(0);
		TreeMap<String, Tipo1> provincias = new TreeMap<>();
		TreeMap<String, Tipo1> poblaciones = new TreeMap<>();

		int fila = 0;
		long provinciaId = 0;
		long poblacionId = 0;
		long codigoPostalId = 0;

		Tipo1 provincia = null;
		Tipo1 poblacion = null;
		for (Row row : sheet) {
			fila++;

			if (fila == 1) { // Skip the header
				continue;
			}

//			if (fila == 50) {
//				break;
//			}

			for (Cell cell : row) {
				logger.debug("cell:{} type:{}", cell.getColumnIndex(), cell.getCellTypeEnum());

				switch (cell.getCellType()) {
				case STRING:
					logger.trace("Value:{}", cell.getStringCellValue());

					if (cell.getColumnIndex() == 1) {
						provincia = new Tipo1();
						provincia.setNombre(cell.getStringCellValue());

						Tipo1 added = provincias.putIfAbsent(provincia.getNombre(), provincia);

						if (added == null) {
							provincia.setId(++provinciaId);
							saveProvincia(provincia, "es");
						}

						logger.trace("Provincia created:{}", provincias.get(provincia.getNombre()));
					}

					if (cell.getColumnIndex() == 2) {
						poblacion = new Tipo1();
						poblacion.setNombre(cell.getStringCellValue());

						Tipo1 added = poblaciones.putIfAbsent(poblacion.getNombre(), poblacion);

						if (added == null) {
							poblacion.setId(++poblacionId);
							savePoblacion(poblacion, "es");
						}

						logger.trace("Poblacion created:{}", poblaciones.get(poblacion.getNombre()));
					}

					break;
				case NUMERIC:
					logger.trace("Value:{}, {}", cell.getNumericCellValue(),
							StringUtils.leftPad(String.valueOf((int) cell.getNumericCellValue()), 5, // @formatter:off
									"0"));

					saveCodigoPostal(StringUtils.leftPad(String.valueOf((int) cell.getNumericCellValue()), 5, "0"),
							provincias.get(provincia.getNombre()), poblaciones.get(poblacion.getNombre()),
							++codigoPostalId, 12);

					break;
				default:
					logger.trace("Value:{}", cell.getRichStringCellValue());
				}
			}

			logger.debug("****************************");
		}
	}

	private void saveCodigoPostal(String codigoPostal, Tipo1 provincia, Tipo1 poblacion, long codigoPostalId,
			int ubicacionGeograficaId) throws SQLException {
		QueryRunner run = new QueryRunner(dataSource);

		run.update(
				"insert into codigo_postal (id,codigo_postal,id_ubicacion_geografica,id_provincia,id_poblacion,usuario_creacion) "
						+ "values (?,?,?,?,?,'initial')",
				codigoPostalId, codigoPostal, ubicacionGeograficaId, provincia.getId(), poblacion.getId());
	}

	private void saveProvincia(Tipo1 provincia, String codPais) throws SQLException {
		QueryRunner run = new QueryRunner(dataSource);

		run.update(
				"insert into provincia (id,codigo_provincia,nombre_provincia,usuario_creacion) "
						+ "values (?,?,?,'initial')",
				provincia.getId(), "pro" + codPais + StringUtils.leftPad(String.valueOf(provincia.getId()), 5, "0"),
				provincia.getNombre());
	}

	private void savePoblacion(Tipo1 poblacion, String codPais) throws SQLException {
		QueryRunner run = new QueryRunner(dataSource);

		run.update(
				"insert into poblacion (id,codigo_poblacion,nombre_poblacion,usuario_creacion) "
						+ "values (?,?,?,'initial')",
				poblacion.getId(), "pob" + codPais + StringUtils.leftPad(String.valueOf(poblacion.getId()), 5, "0"),
				poblacion.getNombre());
	}

	private static BasicDataSource loadDataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://localhost:5432/hr_liquibase_test_1_0_0");
		dataSource.setUsername("gvtmain");
		dataSource.setPassword("gvtmain");

		return dataSource;
	}

	class Tipo1 {
		private Long id;
		private String nombre;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		@Override
		public String toString() {
			return "Tipo1 [id=" + id + ", nombre=" + nombre + "]";
		}

	}

}
