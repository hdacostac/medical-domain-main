package com.gvt.main.populator;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Locale;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.javafaker.Faker;

public class FakerDataPopulator implements Runnable {

	private static final Logger LOGGER = LoggerFactory.getLogger(FakerDataPopulator.class);

	public static void main(String[] args) {
		LOGGER.info("Populating with fake data");

		FakerDataPopulator fakeDataPopulator = new FakerDataPopulator();

		for (int x = 0; x < 8; ++x) {
			Thread thread = new Thread(fakeDataPopulator);
			thread.start();
		}
	}

	@Override
	public void run() {
		populate();
	}

	private void populate() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://localhost:5432/hr_liquibase_test_1_0_0");
		dataSource.setUsername("gvtmain");
		dataSource.setPassword("gvtmain");

		int prevPercentDone = 0;
		QueryRunner run = new QueryRunner(dataSource);
		Faker faker = new Faker(new Locale("es", "ES"));
		Long idOrganizacion = 7L;

		for (int x = 0, total = 10000; x <= total; ++x) {
			try {
				run.update(
						"insert into persona (id,codigo_persona,cedula_persona,nombre_persona,apellido_persona,direccion_persona,id_organizacion,"
								+ "id_categoria_persona,fecha_nacimiento_persona,telefono_fijo_persona,e_mail_persona) "
								+ "values (nextval('id_persona'::regclass),?,?,?,?,?,?,?,?,?,?)",
						RandomStringUtils.randomAlphanumeric(16),
						RandomStringUtils.randomAlphanumeric(1) + "-" + RandomStringUtils.randomNumeric(14),
						faker.name().firstName(), faker.name().lastName() + " " + faker.name().lastName(),
						faker.address().fullAddress(), idOrganizacion, 1,
						new Date(faker.date().birthday(18, 64).getTime()), faker.phoneNumber().cellPhone(),
						StringUtils.stripAccents(StringUtils.deleteWhitespace(faker.internet().emailAddress())));
			} catch (SQLException sqle) {
				LOGGER.error("error", sqle);
			}

			prevPercentDone = printPercentDone(prevPercentDone, x, total);
		}
	}

	private int printPercentDone(int prevPercentDone, int x, int total) {
		int percentDone = (x * 100) / total;

		if (percentDone % 5 == 0 && percentDone != prevPercentDone) {
			LOGGER.info("Done...{}%", percentDone);
		}

		return percentDone;
	}

}
