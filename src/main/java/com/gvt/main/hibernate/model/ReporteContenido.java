package com.gvt.main.hibernate.model;
// Generated 29-jul-2020 23:17:45 by Hibernate Tools 3.2.2.GA and Assent Architecture


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
 * ReporteContenido generated by hbm2java
 */
@Entity
@EntityListeners({ AuditingEntityListener.class })
@Table(name="reporte_contenido"
    ,schema="public"
)
public class ReporteContenido  implements Versionable,Seleccionable,Identificable,Fillable,Cleanable,Auditable,java.io.Serializable {


 	
 	private Long id;
 	
 	private long version;
 	
 	private PlantillaReporteOrganizacion plantillaReporteOrganizacion;
 	
 	private Persona persona;
 	
 	private Organizacion organizacion;
 	
 	private String header;
 	
 	private String postHeader;
 	
 	private String body;
 	
 	private String preFooter;
 	
 	private String footer;
 	
 	private LocalDateTime fechaElaboracion;
 	@CreatedBy
 	private String usuarioCreacion;
 	@CreatedDate
 	private LocalDateTime fechaCreacion;
 	@LastModifiedBy
 	private String usuarioModificacion;
 	@LastModifiedDate
 	private LocalDateTime fechaModificacion;

    public ReporteContenido() {
    	// default constructor
    }

	
    public ReporteContenido(PlantillaReporteOrganizacion plantillaReporteOrganizacion, Persona persona, Organizacion organizacion, LocalDateTime fechaElaboracion) {
        this.plantillaReporteOrganizacion = plantillaReporteOrganizacion;
        this.persona = persona;
        this.organizacion = organizacion;
        this.fechaElaboracion = fechaElaboracion;
    }
    public ReporteContenido(PlantillaReporteOrganizacion plantillaReporteOrganizacion, Persona persona, Organizacion organizacion, String header, String postHeader, String body, String preFooter, String footer, LocalDateTime fechaElaboracion, String usuarioCreacion, LocalDateTime fechaCreacion, String usuarioModificacion, LocalDateTime fechaModificacion) {
       this.plantillaReporteOrganizacion = plantillaReporteOrganizacion;
       this.persona = persona;
       this.organizacion = organizacion;
       this.header = header;
       this.postHeader = postHeader;
       this.body = body;
       this.preFooter = preFooter;
       this.footer = footer;
       this.fechaElaboracion = fechaElaboracion;
       this.usuarioCreacion = usuarioCreacion;
       this.fechaCreacion = fechaCreacion;
       this.usuarioModificacion = usuarioModificacion;
       this.fechaModificacion = fechaModificacion;
    }
   
  @GenericGenerator(name = "reporte_contenido_seq_gen", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "reporte_contenido_id_seq"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            })
  @GeneratedValue(generator = "reporte_contenido_seq_gen")
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
    @JoinColumn(name="id_plantilla_reporte_organizacion", nullable=false)
    public PlantillaReporteOrganizacion getPlantillaReporteOrganizacion() {
        return this.plantillaReporteOrganizacion;
    }
    
    public void setPlantillaReporteOrganizacion(PlantillaReporteOrganizacion plantillaReporteOrganizacion) {
        this.plantillaReporteOrganizacion = plantillaReporteOrganizacion;
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
    @JoinColumn(name="id_organizacion", nullable=false)
    public Organizacion getOrganizacion() {
        return this.organizacion;
    }
    
    public void setOrganizacion(Organizacion organizacion) {
        this.organizacion = organizacion;
    }
    
    @Column(name="header")
    public String getHeader() {
        return this.header;
    }
    
    public void setHeader(String header) {
        this.header = header;
    }
    
    @Column(name="post_header")
    public String getPostHeader() {
        return this.postHeader;
    }
    
    public void setPostHeader(String postHeader) {
        this.postHeader = postHeader;
    }
    
    @Column(name="body")
    public String getBody() {
        return this.body;
    }
    
    public void setBody(String body) {
        this.body = body;
    }
    
    @Column(name="pre_footer")
    public String getPreFooter() {
        return this.preFooter;
    }
    
    public void setPreFooter(String preFooter) {
        this.preFooter = preFooter;
    }
    
    @Column(name="footer")
    public String getFooter() {
        return this.footer;
    }
    
    public void setFooter(String footer) {
        this.footer = footer;
    }
    
    @Column(name="fecha_elaboracion", nullable=false, length=29)
    public LocalDateTime getFechaElaboracion() {
        return this.fechaElaboracion;
    }
    
    public void setFechaElaboracion(LocalDateTime fechaElaboracion) {
        this.fechaElaboracion = fechaElaboracion;
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
      buffer.append("plantillaReporteOrganizacion").append("='").append(getPlantillaReporteOrganizacion()).append("' ");			
      buffer.append("persona").append("='").append(getPersona()).append("' ");			
      buffer.append("organizacion").append("='").append(getOrganizacion()).append("' ");			
      buffer.append("header").append("='").append(getHeader()).append("' ");			
      buffer.append("postHeader").append("='").append(getPostHeader()).append("' ");			
      buffer.append("body").append("='").append(getBody()).append("' ");			
      buffer.append("preFooter").append("='").append(getPreFooter()).append("' ");			
      buffer.append("footer").append("='").append(getFooter()).append("' ");			
      buffer.append("fechaElaboracion").append("='").append(getFechaElaboracion()).append("' ");			
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
		 	
		 if (!(other instanceof ReporteContenido)) 
		 	return false;
		 	
		 ReporteContenido castOther = ( ReporteContenido ) other; 
         
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
		if(this.plantillaReporteOrganizacion != null &&
			(plantillaReporteOrganizacion.getId() == null || this.plantillaReporteOrganizacion.getId().longValue() == 0)) {
			plantillaReporteOrganizacion = null;
		}
		if(this.persona != null &&
			(persona.getId() == null || this.persona.getId().longValue() == 0)) {
			persona = null;
		}
		if(this.organizacion != null &&
			(organizacion.getId() == null || this.organizacion.getId().longValue() == 0)) {
			organizacion = null;
		}
    }
    
    public void fillPOJO() {
		if(this.plantillaReporteOrganizacion == null) {
			plantillaReporteOrganizacion = new PlantillaReporteOrganizacion();
		}
		if(this.persona == null) {
			persona = new Persona();
		}
		if(this.organizacion == null) {
			organizacion = new Organizacion();
		}
    }
    
    public ReporteContenido createPOJO() {
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

