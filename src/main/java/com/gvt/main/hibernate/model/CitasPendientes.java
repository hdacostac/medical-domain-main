package com.gvt.main.hibernate.model;
// Generated 12-oct-2019 23:40:17 by Hibernate Tools 3.2.2.GA and Assent Architecture


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gvt.domain.types.Auditable;
import com.gvt.domain.types.Cleanable;
import com.gvt.domain.types.Fillable;
import com.gvt.domain.types.Identificable;
import com.gvt.domain.types.Seleccionable;
import com.gvt.domain.types.Versionable;
import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
 * CitasPendientes generated by hbm2java
 */
@Entity
@EntityListeners({ AuditingEntityListener.class })
@Table(name="citas_pendientes"
    ,schema="public"
)
public class CitasPendientes  implements Versionable,Seleccionable,Identificable,Fillable,Cleanable,Auditable,java.io.Serializable {


 	
 	private Long id;
 	
 	private long version;
 	
 	private MotivoCalendario motivoCalendario;
 	
 	private Persona personaByIdDoctor;
 	
 	private Persona personaByIdPersona;
 	
 	private Organizacion organizacion;
 	
 	private Date fecha;
 	@CreatedBy
 	private String usuarioCreacion;
 	@CreatedDate
 	private Date fechaCreacion;
 	@LastModifiedBy
 	private String usuarioModificacion;
 	@LastModifiedDate
 	private Date fechaModificacion;

    public CitasPendientes() {
    	// default constructor
    }

	
    public CitasPendientes(Persona personaByIdPersona, Date fecha) {
        this.personaByIdPersona = personaByIdPersona;
        this.fecha = fecha;
    }
    public CitasPendientes(MotivoCalendario motivoCalendario, Persona personaByIdDoctor, Persona personaByIdPersona, Organizacion organizacion, Date fecha, String usuarioCreacion, Date fechaCreacion, String usuarioModificacion, Date fechaModificacion) {
       this.motivoCalendario = motivoCalendario;
       this.personaByIdDoctor = personaByIdDoctor;
       this.personaByIdPersona = personaByIdPersona;
       this.organizacion = organizacion;
       this.fecha = fecha;
       this.usuarioCreacion = usuarioCreacion;
       this.fechaCreacion = fechaCreacion;
       this.usuarioModificacion = usuarioModificacion;
       this.fechaModificacion = fechaModificacion;
    }
   
  @GenericGenerator(name = "citas_pendientes_seq_gen", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "citas_pendientes_id_seq"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            })
  @GeneratedValue(generator = "citas_pendientes_seq_gen")
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
    @JoinColumn(name="id_motivo_calendario")
    public MotivoCalendario getMotivoCalendario() {
        return this.motivoCalendario;
    }
    
    public void setMotivoCalendario(MotivoCalendario motivoCalendario) {
        this.motivoCalendario = motivoCalendario;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_doctor")
    public Persona getPersonaByIdDoctor() {
        return this.personaByIdDoctor;
    }
    
    public void setPersonaByIdDoctor(Persona personaByIdDoctor) {
        this.personaByIdDoctor = personaByIdDoctor;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_persona", nullable=false)
    public Persona getPersonaByIdPersona() {
        return this.personaByIdPersona;
    }
    
    public void setPersonaByIdPersona(Persona personaByIdPersona) {
        this.personaByIdPersona = personaByIdPersona;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_organizacion")
    public Organizacion getOrganizacion() {
        return this.organizacion;
    }
    
    public void setOrganizacion(Organizacion organizacion) {
        this.organizacion = organizacion;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="fecha", nullable=false, length=29)
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
      buffer.append("motivoCalendario").append("='").append(getMotivoCalendario()).append("' ");			
      buffer.append("personaByIdDoctor").append("='").append(getPersonaByIdDoctor()).append("' ");			
      buffer.append("personaByIdPersona").append("='").append(getPersonaByIdPersona()).append("' ");			
      buffer.append("organizacion").append("='").append(getOrganizacion()).append("' ");			
      buffer.append("fecha").append("='").append(getFecha()).append("' ");			
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
		 	
		 if (!(other instanceof CitasPendientes)) 
		 	return false;
		 	
		 CitasPendientes castOther = ( CitasPendientes ) other; 
         
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
		if(this.motivoCalendario != null &&
			(motivoCalendario.getId() == null || this.motivoCalendario.getId().longValue() == 0)) {
			motivoCalendario = null;
		}
		if(this.personaByIdDoctor != null &&
			(personaByIdDoctor.getId() == null || this.personaByIdDoctor.getId().longValue() == 0)) {
			personaByIdDoctor = null;
		}
		if(this.personaByIdPersona != null &&
			(personaByIdPersona.getId() == null || this.personaByIdPersona.getId().longValue() == 0)) {
			personaByIdPersona = null;
		}
		if(this.organizacion != null &&
			(organizacion.getId() == null || this.organizacion.getId().longValue() == 0)) {
			organizacion = null;
		}
    }
    
    public void fillPOJO() {
		if(this.motivoCalendario == null) {
			motivoCalendario = new MotivoCalendario();
		}
		if(this.personaByIdDoctor == null) {
			personaByIdDoctor = new Persona();
		}
		if(this.personaByIdPersona == null) {
			personaByIdPersona = new Persona();
		}
		if(this.organizacion == null) {
			organizacion = new Organizacion();
		}
    }
    
    public CitasPendientes createPOJO() {
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

