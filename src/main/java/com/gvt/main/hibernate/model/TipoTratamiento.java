package com.gvt.main.hibernate.model;
// Generated 09-feb-2020 20:04:15 by Hibernate Tools 3.2.2.GA and Assent Architecture


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gvt.core.domain.types.Auditable;
import com.gvt.core.domain.types.Cleanable;
import com.gvt.core.domain.types.Fillable;
import com.gvt.core.domain.types.Identificable;
import com.gvt.core.domain.types.Seleccionable;
import com.gvt.core.domain.types.Versionable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
 * TipoTratamiento generated by hbm2java
 */
@Entity
@EntityListeners({ AuditingEntityListener.class })
@Table(name="tipo_tratamiento"
    ,schema="public"
    , uniqueConstraints = @UniqueConstraint(columnNames="codigo_tipo_tratamiento") 
)
public class TipoTratamiento  implements Versionable,Seleccionable,Identificable,Fillable,Cleanable,Auditable,java.io.Serializable {


 	
 	private Long id;
 	
 	private long version;
 	
 	private String codigoTipoTratamiento;
 	
 	private String nombreTipoTratamiento;
 	@CreatedBy
 	private String usuarioCreacion;
 	@CreatedDate
 	private Date fechaCreacion;
 	@LastModifiedBy
 	private String usuarioModificacion;
 	@LastModifiedDate
 	private Date fechaModificacion;
 	
 	private Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoCirugiaDermolipectomia = new HashSet<PersonaAntecedentesDermatoestetica>(0);
 	
 	private Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserCo2 = new HashSet<PersonaAntecedentesDermatoestetica>(0);
 	
 	private Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserErbium = new HashSet<PersonaAntecedentesDermatoestetica>(0);
 	
 	private Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserVbeam = new HashSet<PersonaAntecedentesDermatoestetica>(0);
 	
 	private Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoAcidoHialuronico = new HashSet<PersonaAntecedentesDermatoestetica>(0);
 	
 	private Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserQswitch = new HashSet<PersonaAntecedentesDermatoestetica>(0);
 	
 	private Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoLimpiezaFacial = new HashSet<PersonaAntecedentesDermatoestetica>(0);
 	
 	private Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoPlasmaRicoPlaqueta = new HashSet<PersonaAntecedentesDermatoestetica>(0);
 	
 	private Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoVelashape = new HashSet<PersonaAntecedentesDermatoestetica>(0);
 	
 	private Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoMasajeDrenajeLinfatico = new HashSet<PersonaAntecedentesDermatoestetica>(0);
 	
 	private Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoProtesisMamarias = new HashSet<PersonaAntecedentesDermatoestetica>(0);
 	
 	private Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoQuimioexfoliacion = new HashSet<PersonaAntecedentesDermatoestetica>(0);
 	
 	private Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoRadiofrecuencia = new HashSet<PersonaAntecedentesDermatoestetica>(0);
 	
 	private Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoDepilacionLaser = new HashSet<PersonaAntecedentesDermatoestetica>(0);
 	
 	private Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserGalaxy = new HashSet<PersonaAntecedentesDermatoestetica>(0);
 	
 	private Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoUltracavitacion = new HashSet<PersonaAntecedentesDermatoestetica>(0);
 	
 	private Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoIpl = new HashSet<PersonaAntecedentesDermatoestetica>(0);

    public TipoTratamiento() {
    	// default constructor
    }

	
    public TipoTratamiento(String codigoTipoTratamiento, String nombreTipoTratamiento) {
        this.codigoTipoTratamiento = codigoTipoTratamiento;
        this.nombreTipoTratamiento = nombreTipoTratamiento;
    }
    public TipoTratamiento(String codigoTipoTratamiento, String nombreTipoTratamiento, String usuarioCreacion, Date fechaCreacion, String usuarioModificacion, Date fechaModificacion, Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoCirugiaDermolipectomia, Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserCo2, Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserErbium, Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserVbeam, Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoAcidoHialuronico, Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserQswitch, Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoLimpiezaFacial, Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoPlasmaRicoPlaqueta, Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoVelashape, Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoMasajeDrenajeLinfatico, Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoProtesisMamarias, Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoQuimioexfoliacion, Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoRadiofrecuencia, Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoDepilacionLaser, Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserGalaxy, Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoUltracavitacion, Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoIpl) {
       this.codigoTipoTratamiento = codigoTipoTratamiento;
       this.nombreTipoTratamiento = nombreTipoTratamiento;
       this.usuarioCreacion = usuarioCreacion;
       this.fechaCreacion = fechaCreacion;
       this.usuarioModificacion = usuarioModificacion;
       this.fechaModificacion = fechaModificacion;
       this.personaAntecedentesDermatoesteticasForIdTipoTratamientoCirugiaDermolipectomia = personaAntecedentesDermatoesteticasForIdTipoTratamientoCirugiaDermolipectomia;
       this.personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserCo2 = personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserCo2;
       this.personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserErbium = personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserErbium;
       this.personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserVbeam = personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserVbeam;
       this.personaAntecedentesDermatoesteticasForIdTipoTratamientoAcidoHialuronico = personaAntecedentesDermatoesteticasForIdTipoTratamientoAcidoHialuronico;
       this.personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserQswitch = personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserQswitch;
       this.personaAntecedentesDermatoesteticasForIdTipoTratamientoLimpiezaFacial = personaAntecedentesDermatoesteticasForIdTipoTratamientoLimpiezaFacial;
       this.personaAntecedentesDermatoesteticasForIdTipoTratamientoPlasmaRicoPlaqueta = personaAntecedentesDermatoesteticasForIdTipoTratamientoPlasmaRicoPlaqueta;
       this.personaAntecedentesDermatoesteticasForIdTipoTratamientoVelashape = personaAntecedentesDermatoesteticasForIdTipoTratamientoVelashape;
       this.personaAntecedentesDermatoesteticasForIdTipoTratamientoMasajeDrenajeLinfatico = personaAntecedentesDermatoesteticasForIdTipoTratamientoMasajeDrenajeLinfatico;
       this.personaAntecedentesDermatoesteticasForIdTipoTratamientoProtesisMamarias = personaAntecedentesDermatoesteticasForIdTipoTratamientoProtesisMamarias;
       this.personaAntecedentesDermatoesteticasForIdTipoTratamientoQuimioexfoliacion = personaAntecedentesDermatoesteticasForIdTipoTratamientoQuimioexfoliacion;
       this.personaAntecedentesDermatoesteticasForIdTipoTratamientoRadiofrecuencia = personaAntecedentesDermatoesteticasForIdTipoTratamientoRadiofrecuencia;
       this.personaAntecedentesDermatoesteticasForIdTipoTratamientoDepilacionLaser = personaAntecedentesDermatoesteticasForIdTipoTratamientoDepilacionLaser;
       this.personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserGalaxy = personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserGalaxy;
       this.personaAntecedentesDermatoesteticasForIdTipoTratamientoUltracavitacion = personaAntecedentesDermatoesteticasForIdTipoTratamientoUltracavitacion;
       this.personaAntecedentesDermatoesteticasForIdTipoTratamientoIpl = personaAntecedentesDermatoesteticasForIdTipoTratamientoIpl;
    }
   
  @GenericGenerator(name = "tipo_tratamiento_seq_gen", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "tipo_tratamiento_id_seq"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            })
  @GeneratedValue(generator = "tipo_tratamiento_seq_gen")
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
    
    @Column(name="codigo_tipo_tratamiento", unique=true, nullable=false, length=16)
    public String getCodigoTipoTratamiento() {
        return this.codigoTipoTratamiento;
    }
    
    public void setCodigoTipoTratamiento(String codigoTipoTratamiento) {
        this.codigoTipoTratamiento = codigoTipoTratamiento;
    }
    
    @Column(name="nombre_tipo_tratamiento", nullable=false, length=64)
    public String getNombreTipoTratamiento() {
        return this.nombreTipoTratamiento;
    }
    
    public void setNombreTipoTratamiento(String nombreTipoTratamiento) {
        this.nombreTipoTratamiento = nombreTipoTratamiento;
    }
    
    @Column(name="usuario_creacion", length=64)
    public String getUsuarioCreacion() {
        return this.usuarioCreacion;
    }
    
    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="fecha_creacion", length=29)
    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }
    
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    @Column(name="usuario_modificacion", length=64)
    public String getUsuarioModificacion() {
        return this.usuarioModificacion;
    }
    
    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="fecha_modificacion", length=29)
    public Date getFechaModificacion() {
        return this.fechaModificacion;
    }
    
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoTratamientoByIdTipoTratamientoCirugiaDermolipectomia")
    public Set<PersonaAntecedentesDermatoestetica> getPersonaAntecedentesDermatoesteticasForIdTipoTratamientoCirugiaDermolipectomia() {
        return this.personaAntecedentesDermatoesteticasForIdTipoTratamientoCirugiaDermolipectomia;
    }
    
    public void setPersonaAntecedentesDermatoesteticasForIdTipoTratamientoCirugiaDermolipectomia(Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoCirugiaDermolipectomia) {
        this.personaAntecedentesDermatoesteticasForIdTipoTratamientoCirugiaDermolipectomia = personaAntecedentesDermatoesteticasForIdTipoTratamientoCirugiaDermolipectomia;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoTratamientoByIdTipoTratamientoLaserCo2")
    public Set<PersonaAntecedentesDermatoestetica> getPersonaAntecedentesDermatoesteticasForIdTipoTratamientoLaserCo2() {
        return this.personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserCo2;
    }
    
    public void setPersonaAntecedentesDermatoesteticasForIdTipoTratamientoLaserCo2(Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserCo2) {
        this.personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserCo2 = personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserCo2;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoTratamientoByIdTipoTratamientoLaserErbium")
    public Set<PersonaAntecedentesDermatoestetica> getPersonaAntecedentesDermatoesteticasForIdTipoTratamientoLaserErbium() {
        return this.personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserErbium;
    }
    
    public void setPersonaAntecedentesDermatoesteticasForIdTipoTratamientoLaserErbium(Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserErbium) {
        this.personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserErbium = personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserErbium;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoTratamientoByIdTipoTratamientoLaserVbeam")
    public Set<PersonaAntecedentesDermatoestetica> getPersonaAntecedentesDermatoesteticasForIdTipoTratamientoLaserVbeam() {
        return this.personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserVbeam;
    }
    
    public void setPersonaAntecedentesDermatoesteticasForIdTipoTratamientoLaserVbeam(Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserVbeam) {
        this.personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserVbeam = personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserVbeam;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoTratamientoByIdTipoTratamientoAcidoHialuronico")
    public Set<PersonaAntecedentesDermatoestetica> getPersonaAntecedentesDermatoesteticasForIdTipoTratamientoAcidoHialuronico() {
        return this.personaAntecedentesDermatoesteticasForIdTipoTratamientoAcidoHialuronico;
    }
    
    public void setPersonaAntecedentesDermatoesteticasForIdTipoTratamientoAcidoHialuronico(Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoAcidoHialuronico) {
        this.personaAntecedentesDermatoesteticasForIdTipoTratamientoAcidoHialuronico = personaAntecedentesDermatoesteticasForIdTipoTratamientoAcidoHialuronico;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoTratamientoByIdTipoTratamientoLaserQswitch")
    public Set<PersonaAntecedentesDermatoestetica> getPersonaAntecedentesDermatoesteticasForIdTipoTratamientoLaserQswitch() {
        return this.personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserQswitch;
    }
    
    public void setPersonaAntecedentesDermatoesteticasForIdTipoTratamientoLaserQswitch(Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserQswitch) {
        this.personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserQswitch = personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserQswitch;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoTratamientoByIdTipoTratamientoLimpiezaFacial")
    public Set<PersonaAntecedentesDermatoestetica> getPersonaAntecedentesDermatoesteticasForIdTipoTratamientoLimpiezaFacial() {
        return this.personaAntecedentesDermatoesteticasForIdTipoTratamientoLimpiezaFacial;
    }
    
    public void setPersonaAntecedentesDermatoesteticasForIdTipoTratamientoLimpiezaFacial(Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoLimpiezaFacial) {
        this.personaAntecedentesDermatoesteticasForIdTipoTratamientoLimpiezaFacial = personaAntecedentesDermatoesteticasForIdTipoTratamientoLimpiezaFacial;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoTratamientoByIdTipoTratamientoPlasmaRicoPlaqueta")
    public Set<PersonaAntecedentesDermatoestetica> getPersonaAntecedentesDermatoesteticasForIdTipoTratamientoPlasmaRicoPlaqueta() {
        return this.personaAntecedentesDermatoesteticasForIdTipoTratamientoPlasmaRicoPlaqueta;
    }
    
    public void setPersonaAntecedentesDermatoesteticasForIdTipoTratamientoPlasmaRicoPlaqueta(Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoPlasmaRicoPlaqueta) {
        this.personaAntecedentesDermatoesteticasForIdTipoTratamientoPlasmaRicoPlaqueta = personaAntecedentesDermatoesteticasForIdTipoTratamientoPlasmaRicoPlaqueta;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoTratamientoByIdTipoTratamientoVelashape")
    public Set<PersonaAntecedentesDermatoestetica> getPersonaAntecedentesDermatoesteticasForIdTipoTratamientoVelashape() {
        return this.personaAntecedentesDermatoesteticasForIdTipoTratamientoVelashape;
    }
    
    public void setPersonaAntecedentesDermatoesteticasForIdTipoTratamientoVelashape(Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoVelashape) {
        this.personaAntecedentesDermatoesteticasForIdTipoTratamientoVelashape = personaAntecedentesDermatoesteticasForIdTipoTratamientoVelashape;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoTratamientoByIdTipoTratamientoMasajeDrenajeLinfatico")
    public Set<PersonaAntecedentesDermatoestetica> getPersonaAntecedentesDermatoesteticasForIdTipoTratamientoMasajeDrenajeLinfatico() {
        return this.personaAntecedentesDermatoesteticasForIdTipoTratamientoMasajeDrenajeLinfatico;
    }
    
    public void setPersonaAntecedentesDermatoesteticasForIdTipoTratamientoMasajeDrenajeLinfatico(Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoMasajeDrenajeLinfatico) {
        this.personaAntecedentesDermatoesteticasForIdTipoTratamientoMasajeDrenajeLinfatico = personaAntecedentesDermatoesteticasForIdTipoTratamientoMasajeDrenajeLinfatico;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoTratamientoByIdTipoTratamientoProtesisMamarias")
    public Set<PersonaAntecedentesDermatoestetica> getPersonaAntecedentesDermatoesteticasForIdTipoTratamientoProtesisMamarias() {
        return this.personaAntecedentesDermatoesteticasForIdTipoTratamientoProtesisMamarias;
    }
    
    public void setPersonaAntecedentesDermatoesteticasForIdTipoTratamientoProtesisMamarias(Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoProtesisMamarias) {
        this.personaAntecedentesDermatoesteticasForIdTipoTratamientoProtesisMamarias = personaAntecedentesDermatoesteticasForIdTipoTratamientoProtesisMamarias;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoTratamientoByIdTipoTratamientoQuimioexfoliacion")
    public Set<PersonaAntecedentesDermatoestetica> getPersonaAntecedentesDermatoesteticasForIdTipoTratamientoQuimioexfoliacion() {
        return this.personaAntecedentesDermatoesteticasForIdTipoTratamientoQuimioexfoliacion;
    }
    
    public void setPersonaAntecedentesDermatoesteticasForIdTipoTratamientoQuimioexfoliacion(Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoQuimioexfoliacion) {
        this.personaAntecedentesDermatoesteticasForIdTipoTratamientoQuimioexfoliacion = personaAntecedentesDermatoesteticasForIdTipoTratamientoQuimioexfoliacion;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoTratamientoByIdTipoTratamientoRadiofrecuencia")
    public Set<PersonaAntecedentesDermatoestetica> getPersonaAntecedentesDermatoesteticasForIdTipoTratamientoRadiofrecuencia() {
        return this.personaAntecedentesDermatoesteticasForIdTipoTratamientoRadiofrecuencia;
    }
    
    public void setPersonaAntecedentesDermatoesteticasForIdTipoTratamientoRadiofrecuencia(Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoRadiofrecuencia) {
        this.personaAntecedentesDermatoesteticasForIdTipoTratamientoRadiofrecuencia = personaAntecedentesDermatoesteticasForIdTipoTratamientoRadiofrecuencia;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoTratamientoByIdTipoTratamientoDepilacionLaser")
    public Set<PersonaAntecedentesDermatoestetica> getPersonaAntecedentesDermatoesteticasForIdTipoTratamientoDepilacionLaser() {
        return this.personaAntecedentesDermatoesteticasForIdTipoTratamientoDepilacionLaser;
    }
    
    public void setPersonaAntecedentesDermatoesteticasForIdTipoTratamientoDepilacionLaser(Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoDepilacionLaser) {
        this.personaAntecedentesDermatoesteticasForIdTipoTratamientoDepilacionLaser = personaAntecedentesDermatoesteticasForIdTipoTratamientoDepilacionLaser;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoTratamientoByIdTipoTratamientoLaserGalaxy")
    public Set<PersonaAntecedentesDermatoestetica> getPersonaAntecedentesDermatoesteticasForIdTipoTratamientoLaserGalaxy() {
        return this.personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserGalaxy;
    }
    
    public void setPersonaAntecedentesDermatoesteticasForIdTipoTratamientoLaserGalaxy(Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserGalaxy) {
        this.personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserGalaxy = personaAntecedentesDermatoesteticasForIdTipoTratamientoLaserGalaxy;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoTratamientoByIdTipoTratamientoUltracavitacion")
    public Set<PersonaAntecedentesDermatoestetica> getPersonaAntecedentesDermatoesteticasForIdTipoTratamientoUltracavitacion() {
        return this.personaAntecedentesDermatoesteticasForIdTipoTratamientoUltracavitacion;
    }
    
    public void setPersonaAntecedentesDermatoesteticasForIdTipoTratamientoUltracavitacion(Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoUltracavitacion) {
        this.personaAntecedentesDermatoesteticasForIdTipoTratamientoUltracavitacion = personaAntecedentesDermatoesteticasForIdTipoTratamientoUltracavitacion;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoTratamientoByIdTipoTratamientoIpl")
    public Set<PersonaAntecedentesDermatoestetica> getPersonaAntecedentesDermatoesteticasForIdTipoTratamientoIpl() {
        return this.personaAntecedentesDermatoesteticasForIdTipoTratamientoIpl;
    }
    
    public void setPersonaAntecedentesDermatoesteticasForIdTipoTratamientoIpl(Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticasForIdTipoTratamientoIpl) {
        this.personaAntecedentesDermatoesteticasForIdTipoTratamientoIpl = personaAntecedentesDermatoesteticasForIdTipoTratamientoIpl;
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
      buffer.append("codigoTipoTratamiento").append("='").append(getCodigoTipoTratamiento()).append("' ");			
      buffer.append("nombreTipoTratamiento").append("='").append(getNombreTipoTratamiento()).append("' ");			
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
		 	
		 if (!(other instanceof TipoTratamiento)) 
		 	return false;
		 	
		 TipoTratamiento castOther = ( TipoTratamiento ) other; 
         
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
    }
    
    public void fillPOJO() {
    }
    
    public TipoTratamiento createPOJO() {
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

