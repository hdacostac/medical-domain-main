package com.gvt.main.hibernate.model;
// Generated 24-may-2020 17:36:56 by Hibernate Tools 3.2.2.GA and Assent Architecture


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gvt.core.domain.types.Auditable;
import com.gvt.core.domain.types.Cleanable;
import com.gvt.core.domain.types.Fillable;
import com.gvt.core.domain.types.Identificable;
import com.gvt.core.domain.types.Seleccionable;
import com.gvt.core.domain.types.Versionable;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;
import javax.xml.bind.annotation.XmlTransient;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * ConsultaMedicaOdontologica generated by hbm2java
 */
@Entity
@EntityListeners({ AuditingEntityListener.class })
@Table(name="consulta_medica_odontologica"
    ,schema="public"
    , uniqueConstraints = @UniqueConstraint(columnNames={"id_persona", "fecha_consulta_medica"}) 
)
public class ConsultaMedicaOdontologica  implements Versionable,Seleccionable,Identificable,Fillable,Cleanable,Auditable,java.io.Serializable {


 	
 	private Long id;
 	
 	private long version;
 	
 	private OpcionSino opcionSinoByEsActiva;
 	
 	private OpcionSino opcionSinoByEsAdulto;
 	
 	private Persona persona;
 	
 	private OpcionSino opcionSinoByEsPublica;
 	
 	private LocalDateTime fechaConsultaMedica;
 	
 	private String motivoConsulta;
 	
 	private String enfermedadActual;
 	
 	private String tensionArterial;
 	
 	private String frecuenciaCardiaca;
 	
 	private String temperatura;
 	
 	private String frecuenciaRespiratoria;
 	
 	private String peso;
 	
 	private String talla;
 	
 	private String estatura;
 	
 	private String examenesParaclinicos;
 	
 	private String diagnostico;
 	
 	private String tratamiento;
 	
 	private String evolucion;
 	
 	private String codigoDoctor;
 	
 	private String cedulaDoctor;
 	
 	private String nombreDoctor;
 	
 	private String apellidoDoctor;
 	
 	private String url1;
 	
 	private String url2;
 	
 	private String url3;
 	
 	private String url4;
 	
 	private String url5;
 	
 	private String url6;
 	
 	private String url7;
 	
 	private String url8;
 	
 	private String url9;
 	
 	private String url10;
 	
 	private String url11;
 	
 	private String url12;
 	
 	private String url13;
 	
 	private String url14;
 	
 	private String url15;
 	
 	private String url16;
 	
 	private String url17;
 	
 	private String url18;
 	
 	private String url19;
 	
 	private String url20;
 	
 	private String observaciones;
 	
 	private String labHb;
 	
 	private String labHcto;
 	
 	private String labGb;
 	
 	private String labSeg;
 	
 	private String labLinf;
 	
 	private String labMono;
 	
 	private String labEos;
 	
 	private Long labGrupo;
 	
 	private Long labRh;
 	
 	private String labPlaquetas;
 	
 	private String labGlicemia;
 	
 	private String labUrea;
 	
 	private String labCreatinina;
 	
 	private String labHierroSerico;
 	
 	private String labAcidoUrico;
 	
 	private String labVdrl;
 	
 	private String labHiv;
 	
 	private String labHepatitisB;
 	
 	private String labOrina;
 	
 	private String labCultivos;
 	
 	private String labToxoplasmosis;
 	
 	private String labRubeola;
 	
 	private String labProtTotales;
 	
 	private String labScreeningPrenatal;
 	
 	private String labOtro;
 	@CreatedBy
 	private String usuarioCreacion;
 	@CreatedDate
 	private LocalDateTime fechaCreacion;
 	@LastModifiedBy
 	private String usuarioModificacion;
 	@LastModifiedDate
 	private LocalDateTime fechaModificacion;
 	
 	private Set<Diente> dientes = new HashSet<Diente>(0);

    public ConsultaMedicaOdontologica() {
    	// default constructor
    }

	
    public ConsultaMedicaOdontologica(OpcionSino opcionSinoByEsActiva, Persona persona, LocalDateTime fechaConsultaMedica) {
        this.opcionSinoByEsActiva = opcionSinoByEsActiva;
        this.persona = persona;
        this.fechaConsultaMedica = fechaConsultaMedica;
    }
    public ConsultaMedicaOdontologica(OpcionSino opcionSinoByEsActiva, OpcionSino opcionSinoByEsAdulto, Persona persona, OpcionSino opcionSinoByEsPublica, LocalDateTime fechaConsultaMedica, String motivoConsulta, String enfermedadActual, String tensionArterial, String frecuenciaCardiaca, String temperatura, String frecuenciaRespiratoria, String peso, String talla, String estatura, String examenesParaclinicos, String diagnostico, String tratamiento, String evolucion, String codigoDoctor, String cedulaDoctor, String nombreDoctor, String apellidoDoctor, String url1, String url2, String url3, String url4, String url5, String url6, String url7, String url8, String url9, String url10, String url11, String url12, String url13, String url14, String url15, String url16, String url17, String url18, String url19, String url20, String observaciones, String labHb, String labHcto, String labGb, String labSeg, String labLinf, String labMono, String labEos, Long labGrupo, Long labRh, String labPlaquetas, String labGlicemia, String labUrea, String labCreatinina, String labHierroSerico, String labAcidoUrico, String labVdrl, String labHiv, String labHepatitisB, String labOrina, String labCultivos, String labToxoplasmosis, String labRubeola, String labProtTotales, String labScreeningPrenatal, String labOtro, String usuarioCreacion, LocalDateTime fechaCreacion, String usuarioModificacion, LocalDateTime fechaModificacion, Set<Diente> dientes) {
       this.opcionSinoByEsActiva = opcionSinoByEsActiva;
       this.opcionSinoByEsAdulto = opcionSinoByEsAdulto;
       this.persona = persona;
       this.opcionSinoByEsPublica = opcionSinoByEsPublica;
       this.fechaConsultaMedica = fechaConsultaMedica;
       this.motivoConsulta = motivoConsulta;
       this.enfermedadActual = enfermedadActual;
       this.tensionArterial = tensionArterial;
       this.frecuenciaCardiaca = frecuenciaCardiaca;
       this.temperatura = temperatura;
       this.frecuenciaRespiratoria = frecuenciaRespiratoria;
       this.peso = peso;
       this.talla = talla;
       this.estatura = estatura;
       this.examenesParaclinicos = examenesParaclinicos;
       this.diagnostico = diagnostico;
       this.tratamiento = tratamiento;
       this.evolucion = evolucion;
       this.codigoDoctor = codigoDoctor;
       this.cedulaDoctor = cedulaDoctor;
       this.nombreDoctor = nombreDoctor;
       this.apellidoDoctor = apellidoDoctor;
       this.url1 = url1;
       this.url2 = url2;
       this.url3 = url3;
       this.url4 = url4;
       this.url5 = url5;
       this.url6 = url6;
       this.url7 = url7;
       this.url8 = url8;
       this.url9 = url9;
       this.url10 = url10;
       this.url11 = url11;
       this.url12 = url12;
       this.url13 = url13;
       this.url14 = url14;
       this.url15 = url15;
       this.url16 = url16;
       this.url17 = url17;
       this.url18 = url18;
       this.url19 = url19;
       this.url20 = url20;
       this.observaciones = observaciones;
       this.labHb = labHb;
       this.labHcto = labHcto;
       this.labGb = labGb;
       this.labSeg = labSeg;
       this.labLinf = labLinf;
       this.labMono = labMono;
       this.labEos = labEos;
       this.labGrupo = labGrupo;
       this.labRh = labRh;
       this.labPlaquetas = labPlaquetas;
       this.labGlicemia = labGlicemia;
       this.labUrea = labUrea;
       this.labCreatinina = labCreatinina;
       this.labHierroSerico = labHierroSerico;
       this.labAcidoUrico = labAcidoUrico;
       this.labVdrl = labVdrl;
       this.labHiv = labHiv;
       this.labHepatitisB = labHepatitisB;
       this.labOrina = labOrina;
       this.labCultivos = labCultivos;
       this.labToxoplasmosis = labToxoplasmosis;
       this.labRubeola = labRubeola;
       this.labProtTotales = labProtTotales;
       this.labScreeningPrenatal = labScreeningPrenatal;
       this.labOtro = labOtro;
       this.usuarioCreacion = usuarioCreacion;
       this.fechaCreacion = fechaCreacion;
       this.usuarioModificacion = usuarioModificacion;
       this.fechaModificacion = fechaModificacion;
       this.dientes = dientes;
    }
   
  @GenericGenerator(name = "consulta_medica_odontologica_seq_gen", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "consulta_medica_odontologica_id_seq"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            })
  @GeneratedValue(generator = "consulta_medica_odontologica_seq_gen")
  @Id
    
    @Column(name="id", unique=true, nullable=false)
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    @Version
    @Column(name="version", nullable=false)
    public long getVersion() {
        return this.version;
    }
    
    public void setVersion(long version) {
        this.version = version;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="es_activa", nullable=false)
    public OpcionSino getOpcionSinoByEsActiva() {
        return this.opcionSinoByEsActiva;
    }
    
    public void setOpcionSinoByEsActiva(OpcionSino opcionSinoByEsActiva) {
        this.opcionSinoByEsActiva = opcionSinoByEsActiva;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="es_adulto")
    public OpcionSino getOpcionSinoByEsAdulto() {
        return this.opcionSinoByEsAdulto;
    }
    
    public void setOpcionSinoByEsAdulto(OpcionSino opcionSinoByEsAdulto) {
        this.opcionSinoByEsAdulto = opcionSinoByEsAdulto;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_persona", nullable=false)
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="es_publica")
    public OpcionSino getOpcionSinoByEsPublica() {
        return this.opcionSinoByEsPublica;
    }
    
    public void setOpcionSinoByEsPublica(OpcionSino opcionSinoByEsPublica) {
        this.opcionSinoByEsPublica = opcionSinoByEsPublica;
    }
    
    @Column(name="fecha_consulta_medica", nullable=false, length=29)
    public LocalDateTime getFechaConsultaMedica() {
        return this.fechaConsultaMedica;
    }
    
    public void setFechaConsultaMedica(LocalDateTime fechaConsultaMedica) {
        this.fechaConsultaMedica = fechaConsultaMedica;
    }
    
    @Column(name="motivo_consulta")
    public String getMotivoConsulta() {
        return this.motivoConsulta;
    }
    
    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }
    
    @Column(name="enfermedad_actual")
    public String getEnfermedadActual() {
        return this.enfermedadActual;
    }
    
    public void setEnfermedadActual(String enfermedadActual) {
        this.enfermedadActual = enfermedadActual;
    }
    
    @Column(name="tension_arterial", length=16)
    public String getTensionArterial() {
        return this.tensionArterial;
    }
    
    public void setTensionArterial(String tensionArterial) {
        this.tensionArterial = tensionArterial;
    }
    
    @Column(name="frecuencia_cardiaca", length=16)
    public String getFrecuenciaCardiaca() {
        return this.frecuenciaCardiaca;
    }
    
    public void setFrecuenciaCardiaca(String frecuenciaCardiaca) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }
    
    @Column(name="temperatura", length=16)
    public String getTemperatura() {
        return this.temperatura;
    }
    
    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }
    
    @Column(name="frecuencia_respiratoria", length=16)
    public String getFrecuenciaRespiratoria() {
        return this.frecuenciaRespiratoria;
    }
    
    public void setFrecuenciaRespiratoria(String frecuenciaRespiratoria) {
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
    }
    
    @Column(name="peso", length=16)
    public String getPeso() {
        return this.peso;
    }
    
    public void setPeso(String peso) {
        this.peso = peso;
    }
    
    @Column(name="talla", length=16)
    public String getTalla() {
        return this.talla;
    }
    
    public void setTalla(String talla) {
        this.talla = talla;
    }
    
    @Column(name="estatura", length=16)
    public String getEstatura() {
        return this.estatura;
    }
    
    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }
    
    @Column(name="examenes_paraclinicos")
    public String getExamenesParaclinicos() {
        return this.examenesParaclinicos;
    }
    
    public void setExamenesParaclinicos(String examenesParaclinicos) {
        this.examenesParaclinicos = examenesParaclinicos;
    }
    
    @Column(name="diagnostico")
    public String getDiagnostico() {
        return this.diagnostico;
    }
    
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    
    @Column(name="tratamiento")
    public String getTratamiento() {
        return this.tratamiento;
    }
    
    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
    
    @Column(name="evolucion")
    public String getEvolucion() {
        return this.evolucion;
    }
    
    public void setEvolucion(String evolucion) {
        this.evolucion = evolucion;
    }
    
    @Column(name="codigo_doctor", length=16)
    public String getCodigoDoctor() {
        return this.codigoDoctor;
    }
    
    public void setCodigoDoctor(String codigoDoctor) {
        this.codigoDoctor = codigoDoctor;
    }
    
    @Column(name="cedula_doctor", length=64)
    public String getCedulaDoctor() {
        return this.cedulaDoctor;
    }
    
    public void setCedulaDoctor(String cedulaDoctor) {
        this.cedulaDoctor = cedulaDoctor;
    }
    
    @Column(name="nombre_doctor", length=64)
    public String getNombreDoctor() {
        return this.nombreDoctor;
    }
    
    public void setNombreDoctor(String nombreDoctor) {
        this.nombreDoctor = nombreDoctor;
    }
    
    @Column(name="apellido_doctor", length=64)
    public String getApellidoDoctor() {
        return this.apellidoDoctor;
    }
    
    public void setApellidoDoctor(String apellidoDoctor) {
        this.apellidoDoctor = apellidoDoctor;
    }
    
    @Column(name="url1")
    public String getUrl1() {
        return this.url1;
    }
    
    public void setUrl1(String url1) {
        this.url1 = url1;
    }
    
    @Column(name="url2")
    public String getUrl2() {
        return this.url2;
    }
    
    public void setUrl2(String url2) {
        this.url2 = url2;
    }
    
    @Column(name="url3")
    public String getUrl3() {
        return this.url3;
    }
    
    public void setUrl3(String url3) {
        this.url3 = url3;
    }
    
    @Column(name="url4")
    public String getUrl4() {
        return this.url4;
    }
    
    public void setUrl4(String url4) {
        this.url4 = url4;
    }
    
    @Column(name="url5")
    public String getUrl5() {
        return this.url5;
    }
    
    public void setUrl5(String url5) {
        this.url5 = url5;
    }
    
    @Column(name="url6")
    public String getUrl6() {
        return this.url6;
    }
    
    public void setUrl6(String url6) {
        this.url6 = url6;
    }
    
    @Column(name="url7")
    public String getUrl7() {
        return this.url7;
    }
    
    public void setUrl7(String url7) {
        this.url7 = url7;
    }
    
    @Column(name="url8")
    public String getUrl8() {
        return this.url8;
    }
    
    public void setUrl8(String url8) {
        this.url8 = url8;
    }
    
    @Column(name="url9")
    public String getUrl9() {
        return this.url9;
    }
    
    public void setUrl9(String url9) {
        this.url9 = url9;
    }
    
    @Column(name="url10")
    public String getUrl10() {
        return this.url10;
    }
    
    public void setUrl10(String url10) {
        this.url10 = url10;
    }
    
    @Column(name="url11")
    public String getUrl11() {
        return this.url11;
    }
    
    public void setUrl11(String url11) {
        this.url11 = url11;
    }
    
    @Column(name="url12")
    public String getUrl12() {
        return this.url12;
    }
    
    public void setUrl12(String url12) {
        this.url12 = url12;
    }
    
    @Column(name="url13")
    public String getUrl13() {
        return this.url13;
    }
    
    public void setUrl13(String url13) {
        this.url13 = url13;
    }
    
    @Column(name="url14")
    public String getUrl14() {
        return this.url14;
    }
    
    public void setUrl14(String url14) {
        this.url14 = url14;
    }
    
    @Column(name="url15")
    public String getUrl15() {
        return this.url15;
    }
    
    public void setUrl15(String url15) {
        this.url15 = url15;
    }
    
    @Column(name="url16")
    public String getUrl16() {
        return this.url16;
    }
    
    public void setUrl16(String url16) {
        this.url16 = url16;
    }
    
    @Column(name="url17")
    public String getUrl17() {
        return this.url17;
    }
    
    public void setUrl17(String url17) {
        this.url17 = url17;
    }
    
    @Column(name="url18")
    public String getUrl18() {
        return this.url18;
    }
    
    public void setUrl18(String url18) {
        this.url18 = url18;
    }
    
    @Column(name="url19")
    public String getUrl19() {
        return this.url19;
    }
    
    public void setUrl19(String url19) {
        this.url19 = url19;
    }
    
    @Column(name="url20")
    public String getUrl20() {
        return this.url20;
    }
    
    public void setUrl20(String url20) {
        this.url20 = url20;
    }
    
    @Column(name="observaciones")
    public String getObservaciones() {
        return this.observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    @Column(name="lab_hb", length=16)
    public String getLabHb() {
        return this.labHb;
    }
    
    public void setLabHb(String labHb) {
        this.labHb = labHb;
    }
    
    @Column(name="lab_hcto", length=16)
    public String getLabHcto() {
        return this.labHcto;
    }
    
    public void setLabHcto(String labHcto) {
        this.labHcto = labHcto;
    }
    
    @Column(name="lab_gb", length=16)
    public String getLabGb() {
        return this.labGb;
    }
    
    public void setLabGb(String labGb) {
        this.labGb = labGb;
    }
    
    @Column(name="lab_seg", length=16)
    public String getLabSeg() {
        return this.labSeg;
    }
    
    public void setLabSeg(String labSeg) {
        this.labSeg = labSeg;
    }
    
    @Column(name="lab_linf", length=16)
    public String getLabLinf() {
        return this.labLinf;
    }
    
    public void setLabLinf(String labLinf) {
        this.labLinf = labLinf;
    }
    
    @Column(name="lab_mono", length=16)
    public String getLabMono() {
        return this.labMono;
    }
    
    public void setLabMono(String labMono) {
        this.labMono = labMono;
    }
    
    @Column(name="lab_eos", length=16)
    public String getLabEos() {
        return this.labEos;
    }
    
    public void setLabEos(String labEos) {
        this.labEos = labEos;
    }
    
    @Column(name="lab_grupo")
    public Long getLabGrupo() {
        return this.labGrupo;
    }
    
    public void setLabGrupo(Long labGrupo) {
        this.labGrupo = labGrupo;
    }
    
    @Column(name="lab_rh")
    public Long getLabRh() {
        return this.labRh;
    }
    
    public void setLabRh(Long labRh) {
        this.labRh = labRh;
    }
    
    @Column(name="lab_plaquetas", length=16)
    public String getLabPlaquetas() {
        return this.labPlaquetas;
    }
    
    public void setLabPlaquetas(String labPlaquetas) {
        this.labPlaquetas = labPlaquetas;
    }
    
    @Column(name="lab_glicemia", length=16)
    public String getLabGlicemia() {
        return this.labGlicemia;
    }
    
    public void setLabGlicemia(String labGlicemia) {
        this.labGlicemia = labGlicemia;
    }
    
    @Column(name="lab_urea", length=16)
    public String getLabUrea() {
        return this.labUrea;
    }
    
    public void setLabUrea(String labUrea) {
        this.labUrea = labUrea;
    }
    
    @Column(name="lab_creatinina", length=16)
    public String getLabCreatinina() {
        return this.labCreatinina;
    }
    
    public void setLabCreatinina(String labCreatinina) {
        this.labCreatinina = labCreatinina;
    }
    
    @Column(name="lab_hierro_serico", length=16)
    public String getLabHierroSerico() {
        return this.labHierroSerico;
    }
    
    public void setLabHierroSerico(String labHierroSerico) {
        this.labHierroSerico = labHierroSerico;
    }
    
    @Column(name="lab_acido_urico", length=16)
    public String getLabAcidoUrico() {
        return this.labAcidoUrico;
    }
    
    public void setLabAcidoUrico(String labAcidoUrico) {
        this.labAcidoUrico = labAcidoUrico;
    }
    
    @Column(name="lab_vdrl", length=16)
    public String getLabVdrl() {
        return this.labVdrl;
    }
    
    public void setLabVdrl(String labVdrl) {
        this.labVdrl = labVdrl;
    }
    
    @Column(name="lab_hiv", length=16)
    public String getLabHiv() {
        return this.labHiv;
    }
    
    public void setLabHiv(String labHiv) {
        this.labHiv = labHiv;
    }
    
    @Column(name="lab_hepatitis_b", length=16)
    public String getLabHepatitisB() {
        return this.labHepatitisB;
    }
    
    public void setLabHepatitisB(String labHepatitisB) {
        this.labHepatitisB = labHepatitisB;
    }
    
    @Column(name="lab_orina", length=16)
    public String getLabOrina() {
        return this.labOrina;
    }
    
    public void setLabOrina(String labOrina) {
        this.labOrina = labOrina;
    }
    
    @Column(name="lab_cultivos", length=16)
    public String getLabCultivos() {
        return this.labCultivos;
    }
    
    public void setLabCultivos(String labCultivos) {
        this.labCultivos = labCultivos;
    }
    
    @Column(name="lab_toxoplasmosis", length=16)
    public String getLabToxoplasmosis() {
        return this.labToxoplasmosis;
    }
    
    public void setLabToxoplasmosis(String labToxoplasmosis) {
        this.labToxoplasmosis = labToxoplasmosis;
    }
    
    @Column(name="lab_rubeola", length=16)
    public String getLabRubeola() {
        return this.labRubeola;
    }
    
    public void setLabRubeola(String labRubeola) {
        this.labRubeola = labRubeola;
    }
    
    @Column(name="lab_prot_totales", length=16)
    public String getLabProtTotales() {
        return this.labProtTotales;
    }
    
    public void setLabProtTotales(String labProtTotales) {
        this.labProtTotales = labProtTotales;
    }
    
    @Column(name="lab_screening_prenatal")
    public String getLabScreeningPrenatal() {
        return this.labScreeningPrenatal;
    }
    
    public void setLabScreeningPrenatal(String labScreeningPrenatal) {
        this.labScreeningPrenatal = labScreeningPrenatal;
    }
    
    @Column(name="lab_otro")
    public String getLabOtro() {
        return this.labOtro;
    }
    
    public void setLabOtro(String labOtro) {
        this.labOtro = labOtro;
    }
    
    @Column(name="usuario_creacion", length=64)
    public String getUsuarioCreacion() {
        return this.usuarioCreacion;
    }
    
    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }
    
    @Column(name="fecha_creacion", length=29)
    public LocalDateTime getFechaCreacion() {
        return this.fechaCreacion;
    }
    
    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    @Column(name="usuario_modificacion", length=64)
    public String getUsuarioModificacion() {
        return this.usuarioModificacion;
    }
    
    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }
    
    @Column(name="fecha_modificacion", length=29)
    public LocalDateTime getFechaModificacion() {
        return this.fechaModificacion;
    }
    
    public void setFechaModificacion(LocalDateTime fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="consultaMedicaOdontologica")
    public Set<Diente> getDientes() {
        return this.dientes;
    }
    
    public void setDientes(Set<Diente> dientes) {
        this.dientes = dientes;
    }

    /**
     * toString
     * @return String
     */
     @Override
     public String toString() {
	  StringBuilder buffer = new StringBuilder();

      buffer.append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
      buffer.append("id").append("='").append(getId()).append("' ");			
      buffer.append("version").append("='").append(getVersion()).append("' ");			
      buffer.append("opcionSinoByEsActiva").append("='").append(getOpcionSinoByEsActiva()).append("' ");			
      buffer.append("opcionSinoByEsAdulto").append("='").append(getOpcionSinoByEsAdulto()).append("' ");			
      buffer.append("persona").append("='").append(getPersona()).append("' ");			
      buffer.append("opcionSinoByEsPublica").append("='").append(getOpcionSinoByEsPublica()).append("' ");			
      buffer.append("fechaConsultaMedica").append("='").append(getFechaConsultaMedica()).append("' ");			
      buffer.append("motivoConsulta").append("='").append(getMotivoConsulta()).append("' ");			
      buffer.append("enfermedadActual").append("='").append(getEnfermedadActual()).append("' ");			
      buffer.append("tensionArterial").append("='").append(getTensionArterial()).append("' ");			
      buffer.append("frecuenciaCardiaca").append("='").append(getFrecuenciaCardiaca()).append("' ");			
      buffer.append("temperatura").append("='").append(getTemperatura()).append("' ");			
      buffer.append("frecuenciaRespiratoria").append("='").append(getFrecuenciaRespiratoria()).append("' ");			
      buffer.append("peso").append("='").append(getPeso()).append("' ");			
      buffer.append("talla").append("='").append(getTalla()).append("' ");			
      buffer.append("estatura").append("='").append(getEstatura()).append("' ");			
      buffer.append("examenesParaclinicos").append("='").append(getExamenesParaclinicos()).append("' ");			
      buffer.append("diagnostico").append("='").append(getDiagnostico()).append("' ");			
      buffer.append("tratamiento").append("='").append(getTratamiento()).append("' ");			
      buffer.append("evolucion").append("='").append(getEvolucion()).append("' ");			
      buffer.append("codigoDoctor").append("='").append(getCodigoDoctor()).append("' ");			
      buffer.append("cedulaDoctor").append("='").append(getCedulaDoctor()).append("' ");			
      buffer.append("nombreDoctor").append("='").append(getNombreDoctor()).append("' ");			
      buffer.append("apellidoDoctor").append("='").append(getApellidoDoctor()).append("' ");			
      buffer.append("url1").append("='").append(getUrl1()).append("' ");			
      buffer.append("url2").append("='").append(getUrl2()).append("' ");			
      buffer.append("url3").append("='").append(getUrl3()).append("' ");			
      buffer.append("url4").append("='").append(getUrl4()).append("' ");			
      buffer.append("url5").append("='").append(getUrl5()).append("' ");			
      buffer.append("url6").append("='").append(getUrl6()).append("' ");			
      buffer.append("url7").append("='").append(getUrl7()).append("' ");			
      buffer.append("url8").append("='").append(getUrl8()).append("' ");			
      buffer.append("url9").append("='").append(getUrl9()).append("' ");			
      buffer.append("url10").append("='").append(getUrl10()).append("' ");			
      buffer.append("url11").append("='").append(getUrl11()).append("' ");			
      buffer.append("url12").append("='").append(getUrl12()).append("' ");			
      buffer.append("url13").append("='").append(getUrl13()).append("' ");			
      buffer.append("url14").append("='").append(getUrl14()).append("' ");			
      buffer.append("url15").append("='").append(getUrl15()).append("' ");			
      buffer.append("url16").append("='").append(getUrl16()).append("' ");			
      buffer.append("url17").append("='").append(getUrl17()).append("' ");			
      buffer.append("url18").append("='").append(getUrl18()).append("' ");			
      buffer.append("url19").append("='").append(getUrl19()).append("' ");			
      buffer.append("url20").append("='").append(getUrl20()).append("' ");			
      buffer.append("observaciones").append("='").append(getObservaciones()).append("' ");			
      buffer.append("labHb").append("='").append(getLabHb()).append("' ");			
      buffer.append("labHcto").append("='").append(getLabHcto()).append("' ");			
      buffer.append("labGb").append("='").append(getLabGb()).append("' ");			
      buffer.append("labSeg").append("='").append(getLabSeg()).append("' ");			
      buffer.append("labLinf").append("='").append(getLabLinf()).append("' ");			
      buffer.append("labMono").append("='").append(getLabMono()).append("' ");			
      buffer.append("labEos").append("='").append(getLabEos()).append("' ");			
      buffer.append("labGrupo").append("='").append(getLabGrupo()).append("' ");			
      buffer.append("labRh").append("='").append(getLabRh()).append("' ");			
      buffer.append("labPlaquetas").append("='").append(getLabPlaquetas()).append("' ");			
      buffer.append("labGlicemia").append("='").append(getLabGlicemia()).append("' ");			
      buffer.append("labUrea").append("='").append(getLabUrea()).append("' ");			
      buffer.append("labCreatinina").append("='").append(getLabCreatinina()).append("' ");			
      buffer.append("labHierroSerico").append("='").append(getLabHierroSerico()).append("' ");			
      buffer.append("labAcidoUrico").append("='").append(getLabAcidoUrico()).append("' ");			
      buffer.append("labVdrl").append("='").append(getLabVdrl()).append("' ");			
      buffer.append("labHiv").append("='").append(getLabHiv()).append("' ");			
      buffer.append("labHepatitisB").append("='").append(getLabHepatitisB()).append("' ");			
      buffer.append("labOrina").append("='").append(getLabOrina()).append("' ");			
      buffer.append("labCultivos").append("='").append(getLabCultivos()).append("' ");			
      buffer.append("labToxoplasmosis").append("='").append(getLabToxoplasmosis()).append("' ");			
      buffer.append("labRubeola").append("='").append(getLabRubeola()).append("' ");			
      buffer.append("labProtTotales").append("='").append(getLabProtTotales()).append("' ");			
      buffer.append("labScreeningPrenatal").append("='").append(getLabScreeningPrenatal()).append("' ");			
      buffer.append("labOtro").append("='").append(getLabOtro()).append("' ");			
      buffer.append("usuarioCreacion").append("='").append(getUsuarioCreacion()).append("' ");			
      buffer.append("fechaCreacion").append("='").append(getFechaCreacion()).append("' ");			
      buffer.append("usuarioModificacion").append("='").append(getUsuarioModificacion()).append("' ");			
      buffer.append("fechaModificacion").append("='").append(getFechaModificacion()).append("' ");			
      buffer.append("]");
      
      return buffer.toString();
     }

	@Override
	public boolean equals(Object other) {
         if (this == other) 
         	return true;
         	
		 if (other == null) 
		 	return false;
		 	
		 if (!(other instanceof ConsultaMedicaOdontologica)) 
		 	return false;
		 	
		 ConsultaMedicaOdontologica castOther = ( ConsultaMedicaOdontologica ) other; 
         
		 return ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) )
 && (this.getVersion()==castOther.getVersion());
   }
   
   @Override
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + (int) this.getVersion();
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         return result;
   }   

  // The following is extra code specified in src/main/config/templates
// Adding extra-code
	private boolean comesFromExternalDataSource = false;
	private boolean selected;
	
	@javax.persistence.Transient
    public boolean isExternalDataSource() {
		return this.comesFromExternalDataSource;
    }

    public void setExternalDataSource(boolean value) {
        this.comesFromExternalDataSource = value;
    }

	@javax.persistence.Transient
	public boolean getSelected() {
		return selected;
	}

    public void setSelected(boolean selected) {
		this.selected = selected;
    }
    
    public void cleanPOJO() {
		if(this.opcionSinoByEsActiva != null &&
			(opcionSinoByEsActiva.getId() == null || this.opcionSinoByEsActiva.getId().longValue() == 0)) {
			opcionSinoByEsActiva = null;
		}
		if(this.opcionSinoByEsAdulto != null &&
			(opcionSinoByEsAdulto.getId() == null || this.opcionSinoByEsAdulto.getId().longValue() == 0)) {
			opcionSinoByEsAdulto = null;
		}
		if(this.persona != null &&
			(persona.getId() == null || this.persona.getId().longValue() == 0)) {
			persona = null;
		}
		if(this.opcionSinoByEsPublica != null &&
			(opcionSinoByEsPublica.getId() == null || this.opcionSinoByEsPublica.getId().longValue() == 0)) {
			opcionSinoByEsPublica = null;
		}
    }
    
    public void fillPOJO() {
		if(this.opcionSinoByEsActiva == null) {
			opcionSinoByEsActiva = new OpcionSino();
		}
		if(this.opcionSinoByEsAdulto == null) {
			opcionSinoByEsAdulto = new OpcionSino();
		}
		if(this.persona == null) {
			persona = new Persona();
		}
		if(this.opcionSinoByEsPublica == null) {
			opcionSinoByEsPublica = new OpcionSino();
		}
    }
    
    public ConsultaMedicaOdontologica createPOJO() {
		fillPOJO();
		
		return this;
	}
	
//	@PrePersist
//	public void onPrePersist() {
//		this.fechaCreacion = new Date();
//		this.usuarioCreacion = getSecurityContextPrincipal();
//	}
//
//	@PreUpdate
//	public void onPreUpdate() {
//		this.fechaModificacion = new Date();
//		this.usuarioModificacion = getSecurityContextPrincipal();
//	}
//
//	@javax.persistence.Transient
//	private String getSecurityContextPrincipal() {
//		String principal;
//		String UNKNOWN_USER = "unknownUser";
//
//		if (SecurityContextHolder.getContext().getAuthentication() == null) {
//			principal = UNKNOWN_USER;
//		} else {
//			try {
//				principal = ((User) SecurityContextHolder.getContext().getAuthentication().getPrincipal())
//						.getUsername();
//			} catch (ClassCastException e) {
//				principal = UNKNOWN_USER;
//			}
//		}
//
//		return principal;
//	}
	
  // end of extra code specified in the hbm.xml files

}

