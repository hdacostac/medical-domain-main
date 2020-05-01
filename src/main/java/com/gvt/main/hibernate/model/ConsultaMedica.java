package com.gvt.main.hibernate.model;
// Generated 01-may-2020 12:20:32 by Hibernate Tools 3.2.2.GA and Assent Architecture


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
 * ConsultaMedica generated by hbm2java
 */
@Entity
@EntityListeners({ AuditingEntityListener.class })
@Table(name="consulta_medica"
    ,schema="public"
    , uniqueConstraints = @UniqueConstraint(columnNames={"id_persona", "fecha_consulta_medica"}) 
)
public class ConsultaMedica  implements Versionable,Seleccionable,Identificable,Fillable,Cleanable,Auditable,java.io.Serializable {


 	
 	private Long id;
 	
 	private long version;
 	
 	private OpcionSino opcionSinoByEsActiva;
 	
 	private Persona persona;
 	
 	private OpcionSino opcionSinoByEsPublica;
 	
 	private Date fechaConsultaMedica;
 	
 	private String motivoConsulta;
 	
 	private String tensionArterial;
 	
 	private String frecuenciaCardiaca;
 	
 	private String temperatura;
 	
 	private String peso;
 	
 	private String estatura;
 	
 	private String diagnostico;
 	
 	private String tratamiento;
 	
 	private String evolucion;
 	
 	private String examenFisicoOtros;
 	@CreatedBy
 	private String usuarioCreacion;
 	@CreatedDate
 	private Date fechaCreacion;
 	@LastModifiedBy
 	private String usuarioModificacion;
 	@LastModifiedDate
 	private Date fechaModificacion;
 	
 	private Set<ConsultaMedicaProtocoloCie10> consultaMedicaProtocoloCie10s = new HashSet<ConsultaMedicaProtocoloCie10>(0);
 	
 	private Set<ConsultaMedicaImagen> consultaMedicaImagens = new HashSet<ConsultaMedicaImagen>(0);

    public ConsultaMedica() {
    	// default constructor
    }

	
    public ConsultaMedica(OpcionSino opcionSinoByEsActiva, Persona persona, Date fechaConsultaMedica) {
        this.opcionSinoByEsActiva = opcionSinoByEsActiva;
        this.persona = persona;
        this.fechaConsultaMedica = fechaConsultaMedica;
    }
    public ConsultaMedica(OpcionSino opcionSinoByEsActiva, Persona persona, OpcionSino opcionSinoByEsPublica, Date fechaConsultaMedica, String motivoConsulta, String tensionArterial, String frecuenciaCardiaca, String temperatura, String peso, String estatura, String diagnostico, String tratamiento, String evolucion, String examenFisicoOtros, String usuarioCreacion, Date fechaCreacion, String usuarioModificacion, Date fechaModificacion, Set<ConsultaMedicaProtocoloCie10> consultaMedicaProtocoloCie10s, Set<ConsultaMedicaImagen> consultaMedicaImagens) {
       this.opcionSinoByEsActiva = opcionSinoByEsActiva;
       this.persona = persona;
       this.opcionSinoByEsPublica = opcionSinoByEsPublica;
       this.fechaConsultaMedica = fechaConsultaMedica;
       this.motivoConsulta = motivoConsulta;
       this.tensionArterial = tensionArterial;
       this.frecuenciaCardiaca = frecuenciaCardiaca;
       this.temperatura = temperatura;
       this.peso = peso;
       this.estatura = estatura;
       this.diagnostico = diagnostico;
       this.tratamiento = tratamiento;
       this.evolucion = evolucion;
       this.examenFisicoOtros = examenFisicoOtros;
       this.usuarioCreacion = usuarioCreacion;
       this.fechaCreacion = fechaCreacion;
       this.usuarioModificacion = usuarioModificacion;
       this.fechaModificacion = fechaModificacion;
       this.consultaMedicaProtocoloCie10s = consultaMedicaProtocoloCie10s;
       this.consultaMedicaImagens = consultaMedicaImagens;
    }
   
  @GenericGenerator(name = "consulta_medica_seq_gen", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "consulta_medica_id_seq"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            })
  @GeneratedValue(generator = "consulta_medica_seq_gen")
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
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="fecha_consulta_medica", nullable=false, length=29)
    public Date getFechaConsultaMedica() {
        return this.fechaConsultaMedica;
    }
    
    public void setFechaConsultaMedica(Date fechaConsultaMedica) {
        this.fechaConsultaMedica = fechaConsultaMedica;
    }
    
    @Column(name="motivo_consulta")
    public String getMotivoConsulta() {
        return this.motivoConsulta;
    }
    
    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
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
    
    @Column(name="peso", length=16)
    public String getPeso() {
        return this.peso;
    }
    
    public void setPeso(String peso) {
        this.peso = peso;
    }
    
    @Column(name="estatura", length=16)
    public String getEstatura() {
        return this.estatura;
    }
    
    public void setEstatura(String estatura) {
        this.estatura = estatura;
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
    
    @Column(name="examen_fisico_otros")
    public String getExamenFisicoOtros() {
        return this.examenFisicoOtros;
    }
    
    public void setExamenFisicoOtros(String examenFisicoOtros) {
        this.examenFisicoOtros = examenFisicoOtros;
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
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="consultaMedica")
    public Set<ConsultaMedicaProtocoloCie10> getConsultaMedicaProtocoloCie10s() {
        return this.consultaMedicaProtocoloCie10s;
    }
    
    public void setConsultaMedicaProtocoloCie10s(Set<ConsultaMedicaProtocoloCie10> consultaMedicaProtocoloCie10s) {
        this.consultaMedicaProtocoloCie10s = consultaMedicaProtocoloCie10s;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="consultaMedica")
    public Set<ConsultaMedicaImagen> getConsultaMedicaImagens() {
        return this.consultaMedicaImagens;
    }
    
    public void setConsultaMedicaImagens(Set<ConsultaMedicaImagen> consultaMedicaImagens) {
        this.consultaMedicaImagens = consultaMedicaImagens;
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
      buffer.append("persona").append("='").append(getPersona()).append("' ");			
      buffer.append("opcionSinoByEsPublica").append("='").append(getOpcionSinoByEsPublica()).append("' ");			
      buffer.append("fechaConsultaMedica").append("='").append(getFechaConsultaMedica()).append("' ");			
      buffer.append("motivoConsulta").append("='").append(getMotivoConsulta()).append("' ");			
      buffer.append("tensionArterial").append("='").append(getTensionArterial()).append("' ");			
      buffer.append("frecuenciaCardiaca").append("='").append(getFrecuenciaCardiaca()).append("' ");			
      buffer.append("temperatura").append("='").append(getTemperatura()).append("' ");			
      buffer.append("peso").append("='").append(getPeso()).append("' ");			
      buffer.append("estatura").append("='").append(getEstatura()).append("' ");			
      buffer.append("diagnostico").append("='").append(getDiagnostico()).append("' ");			
      buffer.append("tratamiento").append("='").append(getTratamiento()).append("' ");			
      buffer.append("evolucion").append("='").append(getEvolucion()).append("' ");			
      buffer.append("examenFisicoOtros").append("='").append(getExamenFisicoOtros()).append("' ");			
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
		 	
		 if (!(other instanceof ConsultaMedica)) 
		 	return false;
		 	
		 ConsultaMedica castOther = ( ConsultaMedica ) other; 
         
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
		if(this.persona == null) {
			persona = new Persona();
		}
		if(this.opcionSinoByEsPublica == null) {
			opcionSinoByEsPublica = new OpcionSino();
		}
    }
    
    public ConsultaMedica createPOJO() {
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

