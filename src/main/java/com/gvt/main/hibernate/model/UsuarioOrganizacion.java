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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
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
 * UsuarioOrganizacion generated by hbm2java
 */
@Entity
@EntityListeners({ AuditingEntityListener.class })
@Table(name="usuario_organizacion"
    ,schema="public"
)
public class UsuarioOrganizacion  implements Versionable,Seleccionable,Identificable,Fillable,Cleanable,Auditable,java.io.Serializable {


 	
 	private Long id;
 	
 	private long version;
 	
 	private Persona persona;
 	
 	private Caja caja;
 	
 	private Organizacion organizacionByIdSede;
 	
 	private Usuario usuarioByIdUsuarioTrabajaCon;
 	
 	private Usuario usuarioByIdUsuario;
 	
 	private Organizacion organizacionByIdSedeDefault;
 	
 	private Organizacion organizacionByIdOrganizacion;
 	@CreatedBy
 	private String usuarioCreacion;
 	@CreatedDate
 	private LocalDateTime fechaCreacion;
 	@LastModifiedBy
 	private String usuarioModificacion;
 	@LastModifiedDate
 	private LocalDateTime fechaModificacion;

    public UsuarioOrganizacion() {
    	// default constructor
    }

	
    public UsuarioOrganizacion(Organizacion organizacionByIdSede, Usuario usuarioByIdUsuario, Organizacion organizacionByIdOrganizacion) {
        this.organizacionByIdSede = organizacionByIdSede;
        this.usuarioByIdUsuario = usuarioByIdUsuario;
        this.organizacionByIdOrganizacion = organizacionByIdOrganizacion;
    }
    public UsuarioOrganizacion(Persona persona, Caja caja, Organizacion organizacionByIdSede, Usuario usuarioByIdUsuarioTrabajaCon, Usuario usuarioByIdUsuario, Organizacion organizacionByIdSedeDefault, Organizacion organizacionByIdOrganizacion, String usuarioCreacion, LocalDateTime fechaCreacion, String usuarioModificacion, LocalDateTime fechaModificacion) {
       this.persona = persona;
       this.caja = caja;
       this.organizacionByIdSede = organizacionByIdSede;
       this.usuarioByIdUsuarioTrabajaCon = usuarioByIdUsuarioTrabajaCon;
       this.usuarioByIdUsuario = usuarioByIdUsuario;
       this.organizacionByIdSedeDefault = organizacionByIdSedeDefault;
       this.organizacionByIdOrganizacion = organizacionByIdOrganizacion;
       this.usuarioCreacion = usuarioCreacion;
       this.fechaCreacion = fechaCreacion;
       this.usuarioModificacion = usuarioModificacion;
       this.fechaModificacion = fechaModificacion;
    }
   
  @GenericGenerator(name = "usuario_organizacion_seq_gen", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "usuario_organizacion_id_seq"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            })
  @GeneratedValue(generator = "usuario_organizacion_seq_gen")
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
    @JoinColumn(name="id_doctor_default")
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_caja_default")
    public Caja getCaja() {
        return this.caja;
    }
    
    public void setCaja(Caja caja) {
        this.caja = caja;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_sede", nullable=false)
    public Organizacion getOrganizacionByIdSede() {
        return this.organizacionByIdSede;
    }
    
    public void setOrganizacionByIdSede(Organizacion organizacionByIdSede) {
        this.organizacionByIdSede = organizacionByIdSede;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_usuario_trabaja_con")
    public Usuario getUsuarioByIdUsuarioTrabajaCon() {
        return this.usuarioByIdUsuarioTrabajaCon;
    }
    
    public void setUsuarioByIdUsuarioTrabajaCon(Usuario usuarioByIdUsuarioTrabajaCon) {
        this.usuarioByIdUsuarioTrabajaCon = usuarioByIdUsuarioTrabajaCon;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_usuario", nullable=false)
    public Usuario getUsuarioByIdUsuario() {
        return this.usuarioByIdUsuario;
    }
    
    public void setUsuarioByIdUsuario(Usuario usuarioByIdUsuario) {
        this.usuarioByIdUsuario = usuarioByIdUsuario;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_sede_default")
    public Organizacion getOrganizacionByIdSedeDefault() {
        return this.organizacionByIdSedeDefault;
    }
    
    public void setOrganizacionByIdSedeDefault(Organizacion organizacionByIdSedeDefault) {
        this.organizacionByIdSedeDefault = organizacionByIdSedeDefault;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_organizacion", nullable=false)
    public Organizacion getOrganizacionByIdOrganizacion() {
        return this.organizacionByIdOrganizacion;
    }
    
    public void setOrganizacionByIdOrganizacion(Organizacion organizacionByIdOrganizacion) {
        this.organizacionByIdOrganizacion = organizacionByIdOrganizacion;
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
      buffer.append("persona").append("='").append(getPersona()).append("' ");			
      buffer.append("caja").append("='").append(getCaja()).append("' ");			
      buffer.append("organizacionByIdSede").append("='").append(getOrganizacionByIdSede()).append("' ");			
      buffer.append("usuarioByIdUsuarioTrabajaCon").append("='").append(getUsuarioByIdUsuarioTrabajaCon()).append("' ");			
      buffer.append("usuarioByIdUsuario").append("='").append(getUsuarioByIdUsuario()).append("' ");			
      buffer.append("organizacionByIdSedeDefault").append("='").append(getOrganizacionByIdSedeDefault()).append("' ");			
      buffer.append("organizacionByIdOrganizacion").append("='").append(getOrganizacionByIdOrganizacion()).append("' ");			
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
		 	
		 if (!(other instanceof UsuarioOrganizacion)) 
		 	return false;
		 	
		 UsuarioOrganizacion castOther = ( UsuarioOrganizacion ) other; 
         
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
		if(this.persona != null &&
			(persona.getId() == null || this.persona.getId().longValue() == 0)) {
			persona = null;
		}
		if(this.caja != null &&
			(caja.getId() == null || this.caja.getId().longValue() == 0)) {
			caja = null;
		}
		if(this.organizacionByIdSede != null &&
			(organizacionByIdSede.getId() == null || this.organizacionByIdSede.getId().longValue() == 0)) {
			organizacionByIdSede = null;
		}
		if(this.usuarioByIdUsuarioTrabajaCon != null &&
			(usuarioByIdUsuarioTrabajaCon.getId() == null || this.usuarioByIdUsuarioTrabajaCon.getId().longValue() == 0)) {
			usuarioByIdUsuarioTrabajaCon = null;
		}
		if(this.usuarioByIdUsuario != null &&
			(usuarioByIdUsuario.getId() == null || this.usuarioByIdUsuario.getId().longValue() == 0)) {
			usuarioByIdUsuario = null;
		}
		if(this.organizacionByIdSedeDefault != null &&
			(organizacionByIdSedeDefault.getId() == null || this.organizacionByIdSedeDefault.getId().longValue() == 0)) {
			organizacionByIdSedeDefault = null;
		}
		if(this.organizacionByIdOrganizacion != null &&
			(organizacionByIdOrganizacion.getId() == null || this.organizacionByIdOrganizacion.getId().longValue() == 0)) {
			organizacionByIdOrganizacion = null;
		}
    }
    
    public void fillPOJO() {
		if(this.persona == null) {
			persona = new Persona();
		}
		if(this.caja == null) {
			caja = new Caja();
		}
		if(this.organizacionByIdSede == null) {
			organizacionByIdSede = new Organizacion();
		}
		if(this.usuarioByIdUsuarioTrabajaCon == null) {
			usuarioByIdUsuarioTrabajaCon = new Usuario();
		}
		if(this.usuarioByIdUsuario == null) {
			usuarioByIdUsuario = new Usuario();
		}
		if(this.organizacionByIdSedeDefault == null) {
			organizacionByIdSedeDefault = new Organizacion();
		}
		if(this.organizacionByIdOrganizacion == null) {
			organizacionByIdOrganizacion = new Organizacion();
		}
    }
    
    public UsuarioOrganizacion createPOJO() {
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

