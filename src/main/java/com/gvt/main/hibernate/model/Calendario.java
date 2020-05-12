package com.gvt.main.hibernate.model;
// Generated 12-may-2020 16:27:19 by Hibernate Tools 3.2.2.GA and Assent Architecture


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gvt.core.domain.types.Auditable;
import com.gvt.core.domain.types.Cleanable;
import com.gvt.core.domain.types.Fillable;
import com.gvt.core.domain.types.Identificable;
import com.gvt.core.domain.types.Seleccionable;
import com.gvt.core.domain.types.Versionable;
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
 * Calendario generated by hbm2java
 */
@Entity
@EntityListeners({ AuditingEntityListener.class })
@Table(name="calendario"
    ,schema="public"
)
public class Calendario  implements Versionable,Seleccionable,Identificable,Fillable,Cleanable,Auditable,java.io.Serializable {


 	
 	private Long id;
 	
 	private long version;
 	
 	private Organizacion organizacion;
 	
 	private MotivoCalendario motivoCalendario;
 	
 	private Persona personaByIdDoctor;
 	
 	private OpcionSino opcionSinoByEsRevisado;
 	
 	private Persona personaByIdPersona;
 	
 	private OpcionSino opcionSinoByEsEliminado;
 	
 	private Date fechaDesde;
 	
 	private Date fechaHasta;
 	
 	private Integer orden;
 	
 	private Date horaLlegadaPersona;
 	
 	private Date horaAtecionPersona;
 	
 	private String observaciones;
 	@CreatedBy
 	private String usuarioCreacion;
 	@CreatedDate
 	private Date fechaCreacion;
 	@LastModifiedBy
 	private String usuarioModificacion;
 	@LastModifiedDate
 	private Date fechaModificacion;

    public Calendario() {
    	// default constructor
    }

	
    public Calendario(Persona personaByIdPersona, Date fechaDesde, Date fechaHasta) {
        this.personaByIdPersona = personaByIdPersona;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
    }
    public Calendario(Organizacion organizacion, MotivoCalendario motivoCalendario, Persona personaByIdDoctor, OpcionSino opcionSinoByEsRevisado, Persona personaByIdPersona, OpcionSino opcionSinoByEsEliminado, Date fechaDesde, Date fechaHasta, Integer orden, Date horaLlegadaPersona, Date horaAtecionPersona, String observaciones, String usuarioCreacion, Date fechaCreacion, String usuarioModificacion, Date fechaModificacion) {
       this.organizacion = organizacion;
       this.motivoCalendario = motivoCalendario;
       this.personaByIdDoctor = personaByIdDoctor;
       this.opcionSinoByEsRevisado = opcionSinoByEsRevisado;
       this.personaByIdPersona = personaByIdPersona;
       this.opcionSinoByEsEliminado = opcionSinoByEsEliminado;
       this.fechaDesde = fechaDesde;
       this.fechaHasta = fechaHasta;
       this.orden = orden;
       this.horaLlegadaPersona = horaLlegadaPersona;
       this.horaAtecionPersona = horaAtecionPersona;
       this.observaciones = observaciones;
       this.usuarioCreacion = usuarioCreacion;
       this.fechaCreacion = fechaCreacion;
       this.usuarioModificacion = usuarioModificacion;
       this.fechaModificacion = fechaModificacion;
    }
   
  @GenericGenerator(name = "calendario_seq_gen", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "calendario_id_seq"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            })
  @GeneratedValue(generator = "calendario_seq_gen")
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
    @JoinColumn(name="id_sede")
    public Organizacion getOrganizacion() {
        return this.organizacion;
    }
    
    public void setOrganizacion(Organizacion organizacion) {
        this.organizacion = organizacion;
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
    @JoinColumn(name="es_revisado")
    public OpcionSino getOpcionSinoByEsRevisado() {
        return this.opcionSinoByEsRevisado;
    }
    
    public void setOpcionSinoByEsRevisado(OpcionSino opcionSinoByEsRevisado) {
        this.opcionSinoByEsRevisado = opcionSinoByEsRevisado;
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
    @JoinColumn(name="es_eliminado")
    public OpcionSino getOpcionSinoByEsEliminado() {
        return this.opcionSinoByEsEliminado;
    }
    
    public void setOpcionSinoByEsEliminado(OpcionSino opcionSinoByEsEliminado) {
        this.opcionSinoByEsEliminado = opcionSinoByEsEliminado;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="fecha_desde", nullable=false, length=29)
    public Date getFechaDesde() {
        return this.fechaDesde;
    }
    
    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="fecha_hasta", nullable=false, length=29)
    public Date getFechaHasta() {
        return this.fechaHasta;
    }
    
    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }
    
    @Column(name="orden")
    public Integer getOrden() {
        return this.orden;
    }
    
    public void setOrden(Integer orden) {
        this.orden = orden;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="hora_llegada_persona", length=29)
    public Date getHoraLlegadaPersona() {
        return this.horaLlegadaPersona;
    }
    
    public void setHoraLlegadaPersona(Date horaLlegadaPersona) {
        this.horaLlegadaPersona = horaLlegadaPersona;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="hora_atecion_persona", length=29)
    public Date getHoraAtecionPersona() {
        return this.horaAtecionPersona;
    }
    
    public void setHoraAtecionPersona(Date horaAtecionPersona) {
        this.horaAtecionPersona = horaAtecionPersona;
    }
    
    @Column(name="observaciones")
    public String getObservaciones() {
        return this.observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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
      buffer.append("organizacion").append("='").append(getOrganizacion()).append("' ");			
      buffer.append("motivoCalendario").append("='").append(getMotivoCalendario()).append("' ");			
      buffer.append("personaByIdDoctor").append("='").append(getPersonaByIdDoctor()).append("' ");			
      buffer.append("opcionSinoByEsRevisado").append("='").append(getOpcionSinoByEsRevisado()).append("' ");			
      buffer.append("personaByIdPersona").append("='").append(getPersonaByIdPersona()).append("' ");			
      buffer.append("opcionSinoByEsEliminado").append("='").append(getOpcionSinoByEsEliminado()).append("' ");			
      buffer.append("fechaDesde").append("='").append(getFechaDesde()).append("' ");			
      buffer.append("fechaHasta").append("='").append(getFechaHasta()).append("' ");			
      buffer.append("orden").append("='").append(getOrden()).append("' ");			
      buffer.append("horaLlegadaPersona").append("='").append(getHoraLlegadaPersona()).append("' ");			
      buffer.append("horaAtecionPersona").append("='").append(getHoraAtecionPersona()).append("' ");			
      buffer.append("observaciones").append("='").append(getObservaciones()).append("' ");			
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
		 	
		 if (!(other instanceof Calendario)) 
		 	return false;
		 	
		 Calendario castOther = ( Calendario ) other; 
         
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
		if(this.organizacion != null &&
			(organizacion.getId() == null || this.organizacion.getId().longValue() == 0)) {
			organizacion = null;
		}
		if(this.motivoCalendario != null &&
			(motivoCalendario.getId() == null || this.motivoCalendario.getId().longValue() == 0)) {
			motivoCalendario = null;
		}
		if(this.personaByIdDoctor != null &&
			(personaByIdDoctor.getId() == null || this.personaByIdDoctor.getId().longValue() == 0)) {
			personaByIdDoctor = null;
		}
		if(this.opcionSinoByEsRevisado != null &&
			(opcionSinoByEsRevisado.getId() == null || this.opcionSinoByEsRevisado.getId().longValue() == 0)) {
			opcionSinoByEsRevisado = null;
		}
		if(this.personaByIdPersona != null &&
			(personaByIdPersona.getId() == null || this.personaByIdPersona.getId().longValue() == 0)) {
			personaByIdPersona = null;
		}
		if(this.opcionSinoByEsEliminado != null &&
			(opcionSinoByEsEliminado.getId() == null || this.opcionSinoByEsEliminado.getId().longValue() == 0)) {
			opcionSinoByEsEliminado = null;
		}
    }
    
    public void fillPOJO() {
		if(this.organizacion == null) {
			organizacion = new Organizacion();
		}
		if(this.motivoCalendario == null) {
			motivoCalendario = new MotivoCalendario();
		}
		if(this.personaByIdDoctor == null) {
			personaByIdDoctor = new Persona();
		}
		if(this.opcionSinoByEsRevisado == null) {
			opcionSinoByEsRevisado = new OpcionSino();
		}
		if(this.personaByIdPersona == null) {
			personaByIdPersona = new Persona();
		}
		if(this.opcionSinoByEsEliminado == null) {
			opcionSinoByEsEliminado = new OpcionSino();
		}
    }
    
    public Calendario createPOJO() {
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

