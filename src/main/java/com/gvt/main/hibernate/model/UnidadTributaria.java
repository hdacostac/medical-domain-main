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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
 * UnidadTributaria generated by hbm2java
 */
@Entity
@EntityListeners({ AuditingEntityListener.class })
@Table(name="unidad_tributaria"
    ,schema="public"
    , uniqueConstraints = @UniqueConstraint(columnNames="fecha_desde_unidad_tributaria") 
)
public class UnidadTributaria  implements Versionable,Seleccionable,Identificable,Fillable,Cleanable,Auditable,java.io.Serializable {


 	
 	private Long id;
 	
 	private long version;
 	
 	private float valorUnidadTributaria;
 	
 	private Date fechaDesdeUnidadTributaria;
 	@CreatedBy
 	private String usuarioCreacion;
 	@CreatedDate
 	private Date fechaCreacion;
 	@LastModifiedBy
 	private String usuarioModificacion;
 	@LastModifiedDate
 	private Date fechaModificacion;

    public UnidadTributaria() {
    	// default constructor
    }

	
    public UnidadTributaria(float valorUnidadTributaria, Date fechaDesdeUnidadTributaria) {
        this.valorUnidadTributaria = valorUnidadTributaria;
        this.fechaDesdeUnidadTributaria = fechaDesdeUnidadTributaria;
    }
    public UnidadTributaria(float valorUnidadTributaria, Date fechaDesdeUnidadTributaria, String usuarioCreacion, Date fechaCreacion, String usuarioModificacion, Date fechaModificacion) {
       this.valorUnidadTributaria = valorUnidadTributaria;
       this.fechaDesdeUnidadTributaria = fechaDesdeUnidadTributaria;
       this.usuarioCreacion = usuarioCreacion;
       this.fechaCreacion = fechaCreacion;
       this.usuarioModificacion = usuarioModificacion;
       this.fechaModificacion = fechaModificacion;
    }
   
  @GenericGenerator(name = "unidad_tributaria_seq_gen", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "unidad_tributaria_id_seq"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            })
  @GeneratedValue(generator = "unidad_tributaria_seq_gen")
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
    
    @Column(name="valor_unidad_tributaria", nullable=false, precision=8, scale=8)
    public float getValorUnidadTributaria() {
        return this.valorUnidadTributaria;
    }
    
    public void setValorUnidadTributaria(float valorUnidadTributaria) {
        this.valorUnidadTributaria = valorUnidadTributaria;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="fecha_desde_unidad_tributaria", unique=true, nullable=false, length=29)
    public Date getFechaDesdeUnidadTributaria() {
        return this.fechaDesdeUnidadTributaria;
    }
    
    public void setFechaDesdeUnidadTributaria(Date fechaDesdeUnidadTributaria) {
        this.fechaDesdeUnidadTributaria = fechaDesdeUnidadTributaria;
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
      buffer.append("valorUnidadTributaria").append("='").append(getValorUnidadTributaria()).append("' ");			
      buffer.append("fechaDesdeUnidadTributaria").append("='").append(getFechaDesdeUnidadTributaria()).append("' ");			
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
		 	
		 if (!(other instanceof UnidadTributaria)) 
		 	return false;
		 	
		 UnidadTributaria castOther = ( UnidadTributaria ) other; 
         
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
    
    public UnidadTributaria createPOJO() {
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

