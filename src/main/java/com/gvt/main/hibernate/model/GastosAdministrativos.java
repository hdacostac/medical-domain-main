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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
 * GastosAdministrativos generated by hbm2java
 */
@Entity
@EntityListeners({ AuditingEntityListener.class })
@Table(name="gastos_administrativos"
    ,schema="public"
    , uniqueConstraints = @UniqueConstraint(columnNames={"fecha_desde_gastos_administrativos", "id_organizacion"}) 
)
public class GastosAdministrativos  implements Versionable,Seleccionable,Identificable,Fillable,Cleanable,Auditable,java.io.Serializable {


 	
 	private Long id;
 	
 	private long version;
 	
 	private Organizacion organizacion;
 	
 	private float porcentajeGastosAdministrativos;
 	
 	private LocalDateTime fechaDesdeGastosAdministrativos;
 	@CreatedBy
 	private String usuarioCreacion;
 	@CreatedDate
 	private LocalDateTime fechaCreacion;
 	@LastModifiedBy
 	private String usuarioModificacion;
 	@LastModifiedDate
 	private LocalDateTime fechaModificacion;

    public GastosAdministrativos() {
    	// default constructor
    }

	
    public GastosAdministrativos(float porcentajeGastosAdministrativos, LocalDateTime fechaDesdeGastosAdministrativos) {
        this.porcentajeGastosAdministrativos = porcentajeGastosAdministrativos;
        this.fechaDesdeGastosAdministrativos = fechaDesdeGastosAdministrativos;
    }
    public GastosAdministrativos(Organizacion organizacion, float porcentajeGastosAdministrativos, LocalDateTime fechaDesdeGastosAdministrativos, String usuarioCreacion, LocalDateTime fechaCreacion, String usuarioModificacion, LocalDateTime fechaModificacion) {
       this.organizacion = organizacion;
       this.porcentajeGastosAdministrativos = porcentajeGastosAdministrativos;
       this.fechaDesdeGastosAdministrativos = fechaDesdeGastosAdministrativos;
       this.usuarioCreacion = usuarioCreacion;
       this.fechaCreacion = fechaCreacion;
       this.usuarioModificacion = usuarioModificacion;
       this.fechaModificacion = fechaModificacion;
    }
   
  @GenericGenerator(name = "gastos_administrativos_seq_gen", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "gastos_administrativos_id_seq"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            })
  @GeneratedValue(generator = "gastos_administrativos_seq_gen")
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
    @JoinColumn(name="id_organizacion")
    public Organizacion getOrganizacion() {
        return this.organizacion;
    }
    
    public void setOrganizacion(Organizacion organizacion) {
        this.organizacion = organizacion;
    }
    
    @Column(name="porcentaje_gastos_administrativos", nullable=false, precision=8, scale=8)
    public float getPorcentajeGastosAdministrativos() {
        return this.porcentajeGastosAdministrativos;
    }
    
    public void setPorcentajeGastosAdministrativos(float porcentajeGastosAdministrativos) {
        this.porcentajeGastosAdministrativos = porcentajeGastosAdministrativos;
    }
    
    @Column(name="fecha_desde_gastos_administrativos", nullable=false, length=29)
    public LocalDateTime getFechaDesdeGastosAdministrativos() {
        return this.fechaDesdeGastosAdministrativos;
    }
    
    public void setFechaDesdeGastosAdministrativos(LocalDateTime fechaDesdeGastosAdministrativos) {
        this.fechaDesdeGastosAdministrativos = fechaDesdeGastosAdministrativos;
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
      buffer.append("organizacion").append("='").append(getOrganizacion()).append("' ");			
      buffer.append("porcentajeGastosAdministrativos").append("='").append(getPorcentajeGastosAdministrativos()).append("' ");			
      buffer.append("fechaDesdeGastosAdministrativos").append("='").append(getFechaDesdeGastosAdministrativos()).append("' ");			
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
		 	
		 if (!(other instanceof GastosAdministrativos)) 
		 	return false;
		 	
		 GastosAdministrativos castOther = ( GastosAdministrativos ) other; 
         
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
    }
    
    public void fillPOJO() {
		if(this.organizacion == null) {
			organizacion = new Organizacion();
		}
    }
    
    public GastosAdministrativos createPOJO() {
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

