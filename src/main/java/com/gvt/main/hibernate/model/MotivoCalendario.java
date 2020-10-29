package com.gvt.main.hibernate.model;
// Generated 29-oct-2020 13:48:51 by Hibernate Tools 3.2.2.GA and Assent Architecture


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
 * MotivoCalendario generated by hbm2java
 */
@Entity
@EntityListeners({ AuditingEntityListener.class })
@Table(name="motivo_calendario"
    ,schema="public"
    , uniqueConstraints = @UniqueConstraint(columnNames="codigo_motivo_calendario") 
)
public class MotivoCalendario  implements Versionable,Seleccionable,Identificable,Fillable,Cleanable,Auditable,java.io.Serializable {


 	
 	private Long id;
 	
 	private long version;
 	
 	private String codigoMotivoCalendario;
 	
 	private String nombreMotivoCalendario;
 	@CreatedBy
 	private String usuarioCreacion;
 	@CreatedDate
 	private LocalDateTime fechaCreacion;
 	@LastModifiedBy
 	private String usuarioModificacion;
 	@LastModifiedDate
 	private LocalDateTime fechaModificacion;
 	
 	private Set<CalendarioIncidencias> calendarioIncidenciases = new HashSet<CalendarioIncidencias>(0);
 	
 	private Set<MotivoCalendarioOrganizacion> motivoCalendarioOrganizacions = new HashSet<MotivoCalendarioOrganizacion>(0);
 	
 	private Set<CitasPendientes> citasPendienteses = new HashSet<CitasPendientes>(0);
 	
 	private Set<TiempoEstimadoAtencion> tiempoEstimadoAtencions = new HashSet<TiempoEstimadoAtencion>(0);
 	
 	private Set<HorarioMedicoCota> horarioMedicoCotas = new HashSet<HorarioMedicoCota>(0);
 	
 	private Set<Calendario> calendarios = new HashSet<Calendario>(0);

    public MotivoCalendario() {
    	// default constructor
    }

	
    public MotivoCalendario(String codigoMotivoCalendario, String nombreMotivoCalendario) {
        this.codigoMotivoCalendario = codigoMotivoCalendario;
        this.nombreMotivoCalendario = nombreMotivoCalendario;
    }
    public MotivoCalendario(String codigoMotivoCalendario, String nombreMotivoCalendario, String usuarioCreacion, LocalDateTime fechaCreacion, String usuarioModificacion, LocalDateTime fechaModificacion, Set<CalendarioIncidencias> calendarioIncidenciases, Set<MotivoCalendarioOrganizacion> motivoCalendarioOrganizacions, Set<CitasPendientes> citasPendienteses, Set<TiempoEstimadoAtencion> tiempoEstimadoAtencions, Set<HorarioMedicoCota> horarioMedicoCotas, Set<Calendario> calendarios) {
       this.codigoMotivoCalendario = codigoMotivoCalendario;
       this.nombreMotivoCalendario = nombreMotivoCalendario;
       this.usuarioCreacion = usuarioCreacion;
       this.fechaCreacion = fechaCreacion;
       this.usuarioModificacion = usuarioModificacion;
       this.fechaModificacion = fechaModificacion;
       this.calendarioIncidenciases = calendarioIncidenciases;
       this.motivoCalendarioOrganizacions = motivoCalendarioOrganizacions;
       this.citasPendienteses = citasPendienteses;
       this.tiempoEstimadoAtencions = tiempoEstimadoAtencions;
       this.horarioMedicoCotas = horarioMedicoCotas;
       this.calendarios = calendarios;
    }
   
  @GenericGenerator(name = "motivo_calendario_seq_gen", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "motivo_calendario_id_seq"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            })
  @GeneratedValue(generator = "motivo_calendario_seq_gen")
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
    
    @Column(name="codigo_motivo_calendario", unique=true, nullable=false, length=16)
    public String getCodigoMotivoCalendario() {
        return this.codigoMotivoCalendario;
    }
    
    public void setCodigoMotivoCalendario(String codigoMotivoCalendario) {
        this.codigoMotivoCalendario = codigoMotivoCalendario;
    }
    
    @Column(name="nombre_motivo_calendario", nullable=false, length=64)
    public String getNombreMotivoCalendario() {
        return this.nombreMotivoCalendario;
    }
    
    public void setNombreMotivoCalendario(String nombreMotivoCalendario) {
        this.nombreMotivoCalendario = nombreMotivoCalendario;
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
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="motivoCalendario")
    public Set<CalendarioIncidencias> getCalendarioIncidenciases() {
        return this.calendarioIncidenciases;
    }
    
    public void setCalendarioIncidenciases(Set<CalendarioIncidencias> calendarioIncidenciases) {
        this.calendarioIncidenciases = calendarioIncidenciases;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="motivoCalendario")
    public Set<MotivoCalendarioOrganizacion> getMotivoCalendarioOrganizacions() {
        return this.motivoCalendarioOrganizacions;
    }
    
    public void setMotivoCalendarioOrganizacions(Set<MotivoCalendarioOrganizacion> motivoCalendarioOrganizacions) {
        this.motivoCalendarioOrganizacions = motivoCalendarioOrganizacions;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="motivoCalendario")
    public Set<CitasPendientes> getCitasPendienteses() {
        return this.citasPendienteses;
    }
    
    public void setCitasPendienteses(Set<CitasPendientes> citasPendienteses) {
        this.citasPendienteses = citasPendienteses;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="motivoCalendario")
    public Set<TiempoEstimadoAtencion> getTiempoEstimadoAtencions() {
        return this.tiempoEstimadoAtencions;
    }
    
    public void setTiempoEstimadoAtencions(Set<TiempoEstimadoAtencion> tiempoEstimadoAtencions) {
        this.tiempoEstimadoAtencions = tiempoEstimadoAtencions;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="motivoCalendario")
    public Set<HorarioMedicoCota> getHorarioMedicoCotas() {
        return this.horarioMedicoCotas;
    }
    
    public void setHorarioMedicoCotas(Set<HorarioMedicoCota> horarioMedicoCotas) {
        this.horarioMedicoCotas = horarioMedicoCotas;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="motivoCalendario")
    public Set<Calendario> getCalendarios() {
        return this.calendarios;
    }
    
    public void setCalendarios(Set<Calendario> calendarios) {
        this.calendarios = calendarios;
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
      buffer.append("codigoMotivoCalendario").append("='").append(getCodigoMotivoCalendario()).append("' ");			
      buffer.append("nombreMotivoCalendario").append("='").append(getNombreMotivoCalendario()).append("' ");			
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
		 	
		 if (!(other instanceof MotivoCalendario)) 
		 	return false;
		 	
		 MotivoCalendario castOther = ( MotivoCalendario ) other; 
         
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
    
    public MotivoCalendario createPOJO() {
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

