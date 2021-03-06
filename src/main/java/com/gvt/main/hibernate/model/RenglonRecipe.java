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
 * RenglonRecipe generated by hbm2java
 */
@Entity
@EntityListeners({ AuditingEntityListener.class })
@Table(name="renglon_recipe"
    ,schema="public"
)
public class RenglonRecipe  implements Versionable,Seleccionable,Identificable,Fillable,Cleanable,Auditable,java.io.Serializable {


 	
 	private Long id;
 	
 	private long version;
 	
 	private Recipe recipe;
 	
 	private String codigo;
 	
 	private String nombreComercial;
 	
 	private String principioActivo;
 	
 	private String concentracion;
 	
 	private String formaFarmaceutica;
 	
 	private String fabricante;
 	
 	private String registroSanitario;
 	
 	private long cantidad;
 	
 	private String indicacion;
 	@CreatedBy
 	private String usuarioCreacion;
 	@CreatedDate
 	private LocalDateTime fechaCreacion;
 	@LastModifiedBy
 	private String usuarioModificacion;
 	@LastModifiedDate
 	private LocalDateTime fechaModificacion;

    public RenglonRecipe() {
    	// default constructor
    }

	
    public RenglonRecipe(Recipe recipe, String codigo, long cantidad) {
        this.recipe = recipe;
        this.codigo = codigo;
        this.cantidad = cantidad;
    }
    public RenglonRecipe(Recipe recipe, String codigo, String nombreComercial, String principioActivo, String concentracion, String formaFarmaceutica, String fabricante, String registroSanitario, long cantidad, String indicacion, String usuarioCreacion, LocalDateTime fechaCreacion, String usuarioModificacion, LocalDateTime fechaModificacion) {
       this.recipe = recipe;
       this.codigo = codigo;
       this.nombreComercial = nombreComercial;
       this.principioActivo = principioActivo;
       this.concentracion = concentracion;
       this.formaFarmaceutica = formaFarmaceutica;
       this.fabricante = fabricante;
       this.registroSanitario = registroSanitario;
       this.cantidad = cantidad;
       this.indicacion = indicacion;
       this.usuarioCreacion = usuarioCreacion;
       this.fechaCreacion = fechaCreacion;
       this.usuarioModificacion = usuarioModificacion;
       this.fechaModificacion = fechaModificacion;
    }
   
  @GenericGenerator(name = "renglon_recipe_seq_gen", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "renglon_recipe_id_seq"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            })
  @GeneratedValue(generator = "renglon_recipe_seq_gen")
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
    @JoinColumn(name="id_recipe", nullable=false)
    public Recipe getRecipe() {
        return this.recipe;
    }
    
    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
    
    @Column(name="codigo", nullable=false, length=64)
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    @Column(name="nombre_comercial")
    public String getNombreComercial() {
        return this.nombreComercial;
    }
    
    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }
    
    @Column(name="principio_activo")
    public String getPrincipioActivo() {
        return this.principioActivo;
    }
    
    public void setPrincipioActivo(String principioActivo) {
        this.principioActivo = principioActivo;
    }
    
    @Column(name="concentracion", length=64)
    public String getConcentracion() {
        return this.concentracion;
    }
    
    public void setConcentracion(String concentracion) {
        this.concentracion = concentracion;
    }
    
    @Column(name="forma_farmaceutica", length=64)
    public String getFormaFarmaceutica() {
        return this.formaFarmaceutica;
    }
    
    public void setFormaFarmaceutica(String formaFarmaceutica) {
        this.formaFarmaceutica = formaFarmaceutica;
    }
    
    @Column(name="fabricante")
    public String getFabricante() {
        return this.fabricante;
    }
    
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    @Column(name="registro_sanitario", length=64)
    public String getRegistroSanitario() {
        return this.registroSanitario;
    }
    
    public void setRegistroSanitario(String registroSanitario) {
        this.registroSanitario = registroSanitario;
    }
    
    @Column(name="cantidad", nullable=false)
    public long getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }
    
    @Column(name="indicacion")
    public String getIndicacion() {
        return this.indicacion;
    }
    
    public void setIndicacion(String indicacion) {
        this.indicacion = indicacion;
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
      buffer.append("recipe").append("='").append(getRecipe()).append("' ");			
      buffer.append("codigo").append("='").append(getCodigo()).append("' ");			
      buffer.append("nombreComercial").append("='").append(getNombreComercial()).append("' ");			
      buffer.append("principioActivo").append("='").append(getPrincipioActivo()).append("' ");			
      buffer.append("concentracion").append("='").append(getConcentracion()).append("' ");			
      buffer.append("formaFarmaceutica").append("='").append(getFormaFarmaceutica()).append("' ");			
      buffer.append("fabricante").append("='").append(getFabricante()).append("' ");			
      buffer.append("registroSanitario").append("='").append(getRegistroSanitario()).append("' ");			
      buffer.append("cantidad").append("='").append(getCantidad()).append("' ");			
      buffer.append("indicacion").append("='").append(getIndicacion()).append("' ");			
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
		 	
		 if (!(other instanceof RenglonRecipe)) 
		 	return false;
		 	
		 RenglonRecipe castOther = ( RenglonRecipe ) other; 
         
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
		if(this.recipe != null &&
			(recipe.getId() == null || this.recipe.getId().longValue() == 0)) {
			recipe = null;
		}
    }
    
    public void fillPOJO() {
		if(this.recipe == null) {
			recipe = new Recipe();
		}
    }
    
    public RenglonRecipe createPOJO() {
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

