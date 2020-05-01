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
 * ActionMetadata generated by hbm2java
 */
@Entity
@EntityListeners({ AuditingEntityListener.class })
@Table(name="action_metadata"
    ,schema="public"
    , uniqueConstraints = @UniqueConstraint(columnNames="codigo_action_metadata") 
)
public class ActionMetadata  implements Versionable,Seleccionable,Identificable,Fillable,Cleanable,Auditable,java.io.Serializable {


 	
 	private Long id;
 	
 	private long version;
 	
 	private ActionMetadata actionMetadata;
 	
 	private Sistema sistema;
 	
 	private TipoNodo tipoNodo;
 	
 	private String codigoActionMetadata;
 	
 	private String nombreActionMetadata;
 	
 	private short esActiva;
 	@CreatedBy
 	private String usuarioCreacion;
 	@CreatedDate
 	private Date fechaCreacion;
 	@LastModifiedBy
 	private String usuarioModificacion;
 	@LastModifiedDate
 	private Date fechaModificacion;
 	
 	private Set<RolAction> rolActions = new HashSet<RolAction>(0);
 	
 	private Set<ActionMetadata> actionMetadatas = new HashSet<ActionMetadata>(0);

    public ActionMetadata() {
    	// default constructor
    }

	
    public ActionMetadata(String codigoActionMetadata, String nombreActionMetadata, short esActiva) {
        this.codigoActionMetadata = codigoActionMetadata;
        this.nombreActionMetadata = nombreActionMetadata;
        this.esActiva = esActiva;
    }
    public ActionMetadata(ActionMetadata actionMetadata, Sistema sistema, TipoNodo tipoNodo, String codigoActionMetadata, String nombreActionMetadata, short esActiva, String usuarioCreacion, Date fechaCreacion, String usuarioModificacion, Date fechaModificacion, Set<RolAction> rolActions, Set<ActionMetadata> actionMetadatas) {
       this.actionMetadata = actionMetadata;
       this.sistema = sistema;
       this.tipoNodo = tipoNodo;
       this.codigoActionMetadata = codigoActionMetadata;
       this.nombreActionMetadata = nombreActionMetadata;
       this.esActiva = esActiva;
       this.usuarioCreacion = usuarioCreacion;
       this.fechaCreacion = fechaCreacion;
       this.usuarioModificacion = usuarioModificacion;
       this.fechaModificacion = fechaModificacion;
       this.rolActions = rolActions;
       this.actionMetadatas = actionMetadatas;
    }
   
  @GenericGenerator(name = "action_metadata_seq_gen", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "action_metadata_id_seq"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            })
  @GeneratedValue(generator = "action_metadata_seq_gen")
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
    @JoinColumn(name="id_action_metadata_superior")
    public ActionMetadata getActionMetadata() {
        return this.actionMetadata;
    }
    
    public void setActionMetadata(ActionMetadata actionMetadata) {
        this.actionMetadata = actionMetadata;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_sistema")
    public Sistema getSistema() {
        return this.sistema;
    }
    
    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_tipo_nodo")
    public TipoNodo getTipoNodo() {
        return this.tipoNodo;
    }
    
    public void setTipoNodo(TipoNodo tipoNodo) {
        this.tipoNodo = tipoNodo;
    }
    
    @Column(name="codigo_action_metadata", unique=true, nullable=false, length=64)
    public String getCodigoActionMetadata() {
        return this.codigoActionMetadata;
    }
    
    public void setCodigoActionMetadata(String codigoActionMetadata) {
        this.codigoActionMetadata = codigoActionMetadata;
    }
    
    @Column(name="nombre_action_metadata", nullable=false, length=128)
    public String getNombreActionMetadata() {
        return this.nombreActionMetadata;
    }
    
    public void setNombreActionMetadata(String nombreActionMetadata) {
        this.nombreActionMetadata = nombreActionMetadata;
    }
    
    @Column(name="es_activa", nullable=false)
    public short getEsActiva() {
        return this.esActiva;
    }
    
    public void setEsActiva(short esActiva) {
        this.esActiva = esActiva;
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
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="actionMetadata")
    public Set<RolAction> getRolActions() {
        return this.rolActions;
    }
    
    public void setRolActions(Set<RolAction> rolActions) {
        this.rolActions = rolActions;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="actionMetadata")
    public Set<ActionMetadata> getActionMetadatas() {
        return this.actionMetadatas;
    }
    
    public void setActionMetadatas(Set<ActionMetadata> actionMetadatas) {
        this.actionMetadatas = actionMetadatas;
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
      buffer.append("actionMetadata").append("='").append(getActionMetadata()).append("' ");			
      buffer.append("sistema").append("='").append(getSistema()).append("' ");			
      buffer.append("tipoNodo").append("='").append(getTipoNodo()).append("' ");			
      buffer.append("codigoActionMetadata").append("='").append(getCodigoActionMetadata()).append("' ");			
      buffer.append("nombreActionMetadata").append("='").append(getNombreActionMetadata()).append("' ");			
      buffer.append("esActiva").append("='").append(getEsActiva()).append("' ");			
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
		 	
		 if (!(other instanceof ActionMetadata)) 
		 	return false;
		 	
		 ActionMetadata castOther = ( ActionMetadata ) other; 
         
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
		if(this.actionMetadata != null &&
			(actionMetadata.getId() == null || this.actionMetadata.getId().longValue() == 0)) {
			actionMetadata = null;
		}
		if(this.sistema != null &&
			(sistema.getId() == null || this.sistema.getId().longValue() == 0)) {
			sistema = null;
		}
		if(this.tipoNodo != null &&
			(tipoNodo.getId() == null || this.tipoNodo.getId().longValue() == 0)) {
			tipoNodo = null;
		}
    }
    
    public void fillPOJO() {
		if(this.actionMetadata == null) {
			actionMetadata = new ActionMetadata();
		}
		if(this.sistema == null) {
			sistema = new Sistema();
		}
		if(this.tipoNodo == null) {
			tipoNodo = new TipoNodo();
		}
    }
    
    public ActionMetadata createPOJO() {
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

