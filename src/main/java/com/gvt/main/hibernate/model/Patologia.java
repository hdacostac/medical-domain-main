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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
 * Patologia generated by hbm2java
 */
@Entity
@EntityListeners({ AuditingEntityListener.class })
@Table(name="patologia"
    ,schema="public"
    , uniqueConstraints = @UniqueConstraint(columnNames="codigo_patologia") 
)
public class Patologia  implements Versionable,Seleccionable,Identificable,Fillable,Cleanable,Auditable,java.io.Serializable {


 	
 	private Long id;
 	
 	private long version;
 	
 	private Especialidad especialidad;
 	
 	private String codigoPatologia;
 	
 	private String nombrePatologia;
 	
 	private String codigoAdicional;
 	@CreatedBy
 	private String usuarioCreacion;
 	@CreatedDate
 	private Date fechaCreacion;
 	@LastModifiedBy
 	private String usuarioModificacion;
 	@LastModifiedDate
 	private Date fechaModificacion;
 	
 	private Set<ParteDiente> parteDientesForIdPatologia5 = new HashSet<ParteDiente>(0);
 	
 	private Set<ParteDiente> parteDientesForIdPatologia9 = new HashSet<ParteDiente>(0);
 	
 	private Set<ParteDiente> parteDientesForIdPatologia2 = new HashSet<ParteDiente>(0);
 	
 	private Set<PatologiaOrganizacion> patologiaOrganizacions = new HashSet<PatologiaOrganizacion>(0);
 	
 	private Set<ParteDiente> parteDientesForIdPatologia1 = new HashSet<ParteDiente>(0);
 	
 	private Set<Diente> dientesForIdPatologia4 = new HashSet<Diente>(0);
 	
 	private Set<Diente> dientesForIdPatologia5 = new HashSet<Diente>(0);
 	
 	private Set<ParteDiente> parteDientesForIdPatologia4 = new HashSet<ParteDiente>(0);
 	
 	private Set<Diente> dientesForIdPatologia7 = new HashSet<Diente>(0);
 	
 	private Set<Diente> dientesForIdPatologia6 = new HashSet<Diente>(0);
 	
 	private Set<Diente> dientesForIdPatologia8 = new HashSet<Diente>(0);
 	
 	private Set<ParteDiente> parteDientesForIdPatologia7 = new HashSet<ParteDiente>(0);
 	
 	private Set<ParteDiente> parteDientesForIdPatologia3 = new HashSet<ParteDiente>(0);
 	
 	private Set<ConsultaMedicaCirugiaPlasticaReconstructiva> consultaMedicaCirugiaPlasticaReconstructivas = new HashSet<ConsultaMedicaCirugiaPlasticaReconstructiva>(0);
 	
 	private Set<Diente> dientesForIdPatologia3 = new HashSet<Diente>(0);
 	
 	private Set<ParteDiente> parteDientesForIdPatologia6 = new HashSet<ParteDiente>(0);
 	
 	private Set<Diente> dientesForIdPatologia2 = new HashSet<Diente>(0);
 	
 	private Set<Diente> dientesForIdPatologia10 = new HashSet<Diente>(0);
 	
 	private Set<Diente> dientesForIdPatologia1 = new HashSet<Diente>(0);
 	
 	private Set<Diente> dientesForIdPatologia9 = new HashSet<Diente>(0);
 	
 	private Set<ParteDiente> parteDientesForIdPatologia8 = new HashSet<ParteDiente>(0);
 	
 	private Set<ParteDiente> parteDientesForIdPatologia10 = new HashSet<ParteDiente>(0);
 	
 	private Set<ConsultaMedicaCardiologia> consultaMedicaCardiologias = new HashSet<ConsultaMedicaCardiologia>(0);

    public Patologia() {
    	// default constructor
    }

	
    public Patologia(String codigoPatologia, String nombrePatologia) {
        this.codigoPatologia = codigoPatologia;
        this.nombrePatologia = nombrePatologia;
    }
    public Patologia(Especialidad especialidad, String codigoPatologia, String nombrePatologia, String codigoAdicional, String usuarioCreacion, Date fechaCreacion, String usuarioModificacion, Date fechaModificacion, Set<ParteDiente> parteDientesForIdPatologia5, Set<ParteDiente> parteDientesForIdPatologia9, Set<ParteDiente> parteDientesForIdPatologia2, Set<PatologiaOrganizacion> patologiaOrganizacions, Set<ParteDiente> parteDientesForIdPatologia1, Set<Diente> dientesForIdPatologia4, Set<Diente> dientesForIdPatologia5, Set<ParteDiente> parteDientesForIdPatologia4, Set<Diente> dientesForIdPatologia7, Set<Diente> dientesForIdPatologia6, Set<Diente> dientesForIdPatologia8, Set<ParteDiente> parteDientesForIdPatologia7, Set<ParteDiente> parteDientesForIdPatologia3, Set<ConsultaMedicaCirugiaPlasticaReconstructiva> consultaMedicaCirugiaPlasticaReconstructivas, Set<Diente> dientesForIdPatologia3, Set<ParteDiente> parteDientesForIdPatologia6, Set<Diente> dientesForIdPatologia2, Set<Diente> dientesForIdPatologia10, Set<Diente> dientesForIdPatologia1, Set<Diente> dientesForIdPatologia9, Set<ParteDiente> parteDientesForIdPatologia8, Set<ParteDiente> parteDientesForIdPatologia10, Set<ConsultaMedicaCardiologia> consultaMedicaCardiologias) {
       this.especialidad = especialidad;
       this.codigoPatologia = codigoPatologia;
       this.nombrePatologia = nombrePatologia;
       this.codigoAdicional = codigoAdicional;
       this.usuarioCreacion = usuarioCreacion;
       this.fechaCreacion = fechaCreacion;
       this.usuarioModificacion = usuarioModificacion;
       this.fechaModificacion = fechaModificacion;
       this.parteDientesForIdPatologia5 = parteDientesForIdPatologia5;
       this.parteDientesForIdPatologia9 = parteDientesForIdPatologia9;
       this.parteDientesForIdPatologia2 = parteDientesForIdPatologia2;
       this.patologiaOrganizacions = patologiaOrganizacions;
       this.parteDientesForIdPatologia1 = parteDientesForIdPatologia1;
       this.dientesForIdPatologia4 = dientesForIdPatologia4;
       this.dientesForIdPatologia5 = dientesForIdPatologia5;
       this.parteDientesForIdPatologia4 = parteDientesForIdPatologia4;
       this.dientesForIdPatologia7 = dientesForIdPatologia7;
       this.dientesForIdPatologia6 = dientesForIdPatologia6;
       this.dientesForIdPatologia8 = dientesForIdPatologia8;
       this.parteDientesForIdPatologia7 = parteDientesForIdPatologia7;
       this.parteDientesForIdPatologia3 = parteDientesForIdPatologia3;
       this.consultaMedicaCirugiaPlasticaReconstructivas = consultaMedicaCirugiaPlasticaReconstructivas;
       this.dientesForIdPatologia3 = dientesForIdPatologia3;
       this.parteDientesForIdPatologia6 = parteDientesForIdPatologia6;
       this.dientesForIdPatologia2 = dientesForIdPatologia2;
       this.dientesForIdPatologia10 = dientesForIdPatologia10;
       this.dientesForIdPatologia1 = dientesForIdPatologia1;
       this.dientesForIdPatologia9 = dientesForIdPatologia9;
       this.parteDientesForIdPatologia8 = parteDientesForIdPatologia8;
       this.parteDientesForIdPatologia10 = parteDientesForIdPatologia10;
       this.consultaMedicaCardiologias = consultaMedicaCardiologias;
    }
   
  @GenericGenerator(name = "patologia_seq_gen", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "patologia_id_seq"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            })
  @GeneratedValue(generator = "patologia_seq_gen")
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
    @JoinColumn(name="id_especialidad")
    public Especialidad getEspecialidad() {
        return this.especialidad;
    }
    
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
    
    @Column(name="codigo_patologia", unique=true, nullable=false, length=16)
    public String getCodigoPatologia() {
        return this.codigoPatologia;
    }
    
    public void setCodigoPatologia(String codigoPatologia) {
        this.codigoPatologia = codigoPatologia;
    }
    
    @Column(name="nombre_patologia", nullable=false, length=64)
    public String getNombrePatologia() {
        return this.nombrePatologia;
    }
    
    public void setNombrePatologia(String nombrePatologia) {
        this.nombrePatologia = nombrePatologia;
    }
    
    @Column(name="codigo_adicional", length=64)
    public String getCodigoAdicional() {
        return this.codigoAdicional;
    }
    
    public void setCodigoAdicional(String codigoAdicional) {
        this.codigoAdicional = codigoAdicional;
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
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="patologiaByIdPatologia5")
    public Set<ParteDiente> getParteDientesForIdPatologia5() {
        return this.parteDientesForIdPatologia5;
    }
    
    public void setParteDientesForIdPatologia5(Set<ParteDiente> parteDientesForIdPatologia5) {
        this.parteDientesForIdPatologia5 = parteDientesForIdPatologia5;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="patologiaByIdPatologia9")
    public Set<ParteDiente> getParteDientesForIdPatologia9() {
        return this.parteDientesForIdPatologia9;
    }
    
    public void setParteDientesForIdPatologia9(Set<ParteDiente> parteDientesForIdPatologia9) {
        this.parteDientesForIdPatologia9 = parteDientesForIdPatologia9;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="patologiaByIdPatologia2")
    public Set<ParteDiente> getParteDientesForIdPatologia2() {
        return this.parteDientesForIdPatologia2;
    }
    
    public void setParteDientesForIdPatologia2(Set<ParteDiente> parteDientesForIdPatologia2) {
        this.parteDientesForIdPatologia2 = parteDientesForIdPatologia2;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="patologia")
    public Set<PatologiaOrganizacion> getPatologiaOrganizacions() {
        return this.patologiaOrganizacions;
    }
    
    public void setPatologiaOrganizacions(Set<PatologiaOrganizacion> patologiaOrganizacions) {
        this.patologiaOrganizacions = patologiaOrganizacions;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="patologiaByIdPatologia1")
    public Set<ParteDiente> getParteDientesForIdPatologia1() {
        return this.parteDientesForIdPatologia1;
    }
    
    public void setParteDientesForIdPatologia1(Set<ParteDiente> parteDientesForIdPatologia1) {
        this.parteDientesForIdPatologia1 = parteDientesForIdPatologia1;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="patologiaByIdPatologia4")
    public Set<Diente> getDientesForIdPatologia4() {
        return this.dientesForIdPatologia4;
    }
    
    public void setDientesForIdPatologia4(Set<Diente> dientesForIdPatologia4) {
        this.dientesForIdPatologia4 = dientesForIdPatologia4;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="patologiaByIdPatologia5")
    public Set<Diente> getDientesForIdPatologia5() {
        return this.dientesForIdPatologia5;
    }
    
    public void setDientesForIdPatologia5(Set<Diente> dientesForIdPatologia5) {
        this.dientesForIdPatologia5 = dientesForIdPatologia5;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="patologiaByIdPatologia4")
    public Set<ParteDiente> getParteDientesForIdPatologia4() {
        return this.parteDientesForIdPatologia4;
    }
    
    public void setParteDientesForIdPatologia4(Set<ParteDiente> parteDientesForIdPatologia4) {
        this.parteDientesForIdPatologia4 = parteDientesForIdPatologia4;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="patologiaByIdPatologia7")
    public Set<Diente> getDientesForIdPatologia7() {
        return this.dientesForIdPatologia7;
    }
    
    public void setDientesForIdPatologia7(Set<Diente> dientesForIdPatologia7) {
        this.dientesForIdPatologia7 = dientesForIdPatologia7;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="patologiaByIdPatologia6")
    public Set<Diente> getDientesForIdPatologia6() {
        return this.dientesForIdPatologia6;
    }
    
    public void setDientesForIdPatologia6(Set<Diente> dientesForIdPatologia6) {
        this.dientesForIdPatologia6 = dientesForIdPatologia6;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="patologiaByIdPatologia8")
    public Set<Diente> getDientesForIdPatologia8() {
        return this.dientesForIdPatologia8;
    }
    
    public void setDientesForIdPatologia8(Set<Diente> dientesForIdPatologia8) {
        this.dientesForIdPatologia8 = dientesForIdPatologia8;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="patologiaByIdPatologia7")
    public Set<ParteDiente> getParteDientesForIdPatologia7() {
        return this.parteDientesForIdPatologia7;
    }
    
    public void setParteDientesForIdPatologia7(Set<ParteDiente> parteDientesForIdPatologia7) {
        this.parteDientesForIdPatologia7 = parteDientesForIdPatologia7;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="patologiaByIdPatologia3")
    public Set<ParteDiente> getParteDientesForIdPatologia3() {
        return this.parteDientesForIdPatologia3;
    }
    
    public void setParteDientesForIdPatologia3(Set<ParteDiente> parteDientesForIdPatologia3) {
        this.parteDientesForIdPatologia3 = parteDientesForIdPatologia3;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="patologia")
    public Set<ConsultaMedicaCirugiaPlasticaReconstructiva> getConsultaMedicaCirugiaPlasticaReconstructivas() {
        return this.consultaMedicaCirugiaPlasticaReconstructivas;
    }
    
    public void setConsultaMedicaCirugiaPlasticaReconstructivas(Set<ConsultaMedicaCirugiaPlasticaReconstructiva> consultaMedicaCirugiaPlasticaReconstructivas) {
        this.consultaMedicaCirugiaPlasticaReconstructivas = consultaMedicaCirugiaPlasticaReconstructivas;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="patologiaByIdPatologia3")
    public Set<Diente> getDientesForIdPatologia3() {
        return this.dientesForIdPatologia3;
    }
    
    public void setDientesForIdPatologia3(Set<Diente> dientesForIdPatologia3) {
        this.dientesForIdPatologia3 = dientesForIdPatologia3;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="patologiaByIdPatologia6")
    public Set<ParteDiente> getParteDientesForIdPatologia6() {
        return this.parteDientesForIdPatologia6;
    }
    
    public void setParteDientesForIdPatologia6(Set<ParteDiente> parteDientesForIdPatologia6) {
        this.parteDientesForIdPatologia6 = parteDientesForIdPatologia6;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="patologiaByIdPatologia2")
    public Set<Diente> getDientesForIdPatologia2() {
        return this.dientesForIdPatologia2;
    }
    
    public void setDientesForIdPatologia2(Set<Diente> dientesForIdPatologia2) {
        this.dientesForIdPatologia2 = dientesForIdPatologia2;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="patologiaByIdPatologia10")
    public Set<Diente> getDientesForIdPatologia10() {
        return this.dientesForIdPatologia10;
    }
    
    public void setDientesForIdPatologia10(Set<Diente> dientesForIdPatologia10) {
        this.dientesForIdPatologia10 = dientesForIdPatologia10;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="patologiaByIdPatologia1")
    public Set<Diente> getDientesForIdPatologia1() {
        return this.dientesForIdPatologia1;
    }
    
    public void setDientesForIdPatologia1(Set<Diente> dientesForIdPatologia1) {
        this.dientesForIdPatologia1 = dientesForIdPatologia1;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="patologiaByIdPatologia9")
    public Set<Diente> getDientesForIdPatologia9() {
        return this.dientesForIdPatologia9;
    }
    
    public void setDientesForIdPatologia9(Set<Diente> dientesForIdPatologia9) {
        this.dientesForIdPatologia9 = dientesForIdPatologia9;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="patologiaByIdPatologia8")
    public Set<ParteDiente> getParteDientesForIdPatologia8() {
        return this.parteDientesForIdPatologia8;
    }
    
    public void setParteDientesForIdPatologia8(Set<ParteDiente> parteDientesForIdPatologia8) {
        this.parteDientesForIdPatologia8 = parteDientesForIdPatologia8;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="patologiaByIdPatologia10")
    public Set<ParteDiente> getParteDientesForIdPatologia10() {
        return this.parteDientesForIdPatologia10;
    }
    
    public void setParteDientesForIdPatologia10(Set<ParteDiente> parteDientesForIdPatologia10) {
        this.parteDientesForIdPatologia10 = parteDientesForIdPatologia10;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="patologia")
    public Set<ConsultaMedicaCardiologia> getConsultaMedicaCardiologias() {
        return this.consultaMedicaCardiologias;
    }
    
    public void setConsultaMedicaCardiologias(Set<ConsultaMedicaCardiologia> consultaMedicaCardiologias) {
        this.consultaMedicaCardiologias = consultaMedicaCardiologias;
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
      buffer.append("especialidad").append("='").append(getEspecialidad()).append("' ");			
      buffer.append("codigoPatologia").append("='").append(getCodigoPatologia()).append("' ");			
      buffer.append("nombrePatologia").append("='").append(getNombrePatologia()).append("' ");			
      buffer.append("codigoAdicional").append("='").append(getCodigoAdicional()).append("' ");			
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
		 	
		 if (!(other instanceof Patologia)) 
		 	return false;
		 	
		 Patologia castOther = ( Patologia ) other; 
         
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
		if(this.especialidad != null &&
			(especialidad.getId() == null || this.especialidad.getId().longValue() == 0)) {
			especialidad = null;
		}
    }
    
    public void fillPOJO() {
		if(this.especialidad == null) {
			especialidad = new Especialidad();
		}
    }
    
    public Patologia createPOJO() {
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

