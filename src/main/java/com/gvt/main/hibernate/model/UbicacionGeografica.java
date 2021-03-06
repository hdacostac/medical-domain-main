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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
 * UbicacionGeografica generated by hbm2java
 */
@Entity
@EntityListeners({ AuditingEntityListener.class })
@Table(name="ubicacion_geografica"
    ,schema="public"
    , uniqueConstraints = @UniqueConstraint(columnNames="codigo_ubicacion_geografica") 
)
public class UbicacionGeografica  implements Versionable,Seleccionable,Identificable,Fillable,Cleanable,Auditable,java.io.Serializable {


 	
 	private Long id;
 	
 	private long version;
 	
 	private UbicacionGeografica ubicacionGeografica;
 	
 	private String codigoUbicacionGeografica;
 	
 	private String nombreUbicacionGeografica;
 	
 	private String nombreAbreviadoUbicacionGeografica;
 	
 	private String zonaHorariaUbicacionGeografica;
 	
 	private String codigoTelefonoUbicacionGeografica;
 	
 	private String formatoTelefonoUbicacionGeografica;
 	@CreatedBy
 	private String usuarioCreacion;
 	@CreatedDate
 	private LocalDateTime fechaCreacion;
 	@LastModifiedBy
 	private String usuarioModificacion;
 	@LastModifiedDate
 	private LocalDateTime fechaModificacion;
 	
 	private String language;
 	
 	private Set<UbicacionGeografica> ubicacionGeograficas = new HashSet<UbicacionGeografica>(0);
 	
 	private Set<CodigoPostal> codigoPostals = new HashSet<CodigoPostal>(0);
 	
 	private Set<Persona> personasForIdPais = new HashSet<Persona>(0);
 	
 	private Set<Persona> personasForIdUbicacionGeograficaNacimiento = new HashSet<Persona>(0);
 	
 	private Set<TipoDocumentoIdentificacion> tipoDocumentoIdentificacions = new HashSet<TipoDocumentoIdentificacion>(0);
 	
 	private Set<Usuario> usuarios = new HashSet<Usuario>(0);
 	
 	private Set<Organizacion> organizacionsForIdUbicacionGeograficaPais = new HashSet<Organizacion>(0);
 	
 	private Set<Organizacion> organizacionsForIdUbicacionGeograficaEstado = new HashSet<Organizacion>(0);

    public UbicacionGeografica() {
    	// default constructor
    }

	
    public UbicacionGeografica(String codigoUbicacionGeografica, String nombreUbicacionGeografica, String nombreAbreviadoUbicacionGeografica) {
        this.codigoUbicacionGeografica = codigoUbicacionGeografica;
        this.nombreUbicacionGeografica = nombreUbicacionGeografica;
        this.nombreAbreviadoUbicacionGeografica = nombreAbreviadoUbicacionGeografica;
    }
    public UbicacionGeografica(UbicacionGeografica ubicacionGeografica, String codigoUbicacionGeografica, String nombreUbicacionGeografica, String nombreAbreviadoUbicacionGeografica, String zonaHorariaUbicacionGeografica, String codigoTelefonoUbicacionGeografica, String formatoTelefonoUbicacionGeografica, String usuarioCreacion, LocalDateTime fechaCreacion, String usuarioModificacion, LocalDateTime fechaModificacion, String language, Set<UbicacionGeografica> ubicacionGeograficas, Set<CodigoPostal> codigoPostals, Set<Persona> personasForIdPais, Set<Persona> personasForIdUbicacionGeograficaNacimiento, Set<TipoDocumentoIdentificacion> tipoDocumentoIdentificacions, Set<Usuario> usuarios, Set<Organizacion> organizacionsForIdUbicacionGeograficaPais, Set<Organizacion> organizacionsForIdUbicacionGeograficaEstado) {
       this.ubicacionGeografica = ubicacionGeografica;
       this.codigoUbicacionGeografica = codigoUbicacionGeografica;
       this.nombreUbicacionGeografica = nombreUbicacionGeografica;
       this.nombreAbreviadoUbicacionGeografica = nombreAbreviadoUbicacionGeografica;
       this.zonaHorariaUbicacionGeografica = zonaHorariaUbicacionGeografica;
       this.codigoTelefonoUbicacionGeografica = codigoTelefonoUbicacionGeografica;
       this.formatoTelefonoUbicacionGeografica = formatoTelefonoUbicacionGeografica;
       this.usuarioCreacion = usuarioCreacion;
       this.fechaCreacion = fechaCreacion;
       this.usuarioModificacion = usuarioModificacion;
       this.fechaModificacion = fechaModificacion;
       this.language = language;
       this.ubicacionGeograficas = ubicacionGeograficas;
       this.codigoPostals = codigoPostals;
       this.personasForIdPais = personasForIdPais;
       this.personasForIdUbicacionGeograficaNacimiento = personasForIdUbicacionGeograficaNacimiento;
       this.tipoDocumentoIdentificacions = tipoDocumentoIdentificacions;
       this.usuarios = usuarios;
       this.organizacionsForIdUbicacionGeograficaPais = organizacionsForIdUbicacionGeograficaPais;
       this.organizacionsForIdUbicacionGeograficaEstado = organizacionsForIdUbicacionGeograficaEstado;
    }
   
  @GenericGenerator(name = "ubicacion_geografica_seq_gen", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "ubicacion_geografica_id_seq"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            })
  @GeneratedValue(generator = "ubicacion_geografica_seq_gen")
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
    @JoinColumn(name="id_ubicacion_geografica_superior")
    public UbicacionGeografica getUbicacionGeografica() {
        return this.ubicacionGeografica;
    }
    
    public void setUbicacionGeografica(UbicacionGeografica ubicacionGeografica) {
        this.ubicacionGeografica = ubicacionGeografica;
    }
    
    @Column(name="codigo_ubicacion_geografica", unique=true, nullable=false, length=16)
    public String getCodigoUbicacionGeografica() {
        return this.codigoUbicacionGeografica;
    }
    
    public void setCodigoUbicacionGeografica(String codigoUbicacionGeografica) {
        this.codigoUbicacionGeografica = codigoUbicacionGeografica;
    }
    
    @Column(name="nombre_ubicacion_geografica", nullable=false, length=64)
    public String getNombreUbicacionGeografica() {
        return this.nombreUbicacionGeografica;
    }
    
    public void setNombreUbicacionGeografica(String nombreUbicacionGeografica) {
        this.nombreUbicacionGeografica = nombreUbicacionGeografica;
    }
    
    @Column(name="nombre_abreviado_ubicacion_geografica", nullable=false, length=64)
    public String getNombreAbreviadoUbicacionGeografica() {
        return this.nombreAbreviadoUbicacionGeografica;
    }
    
    public void setNombreAbreviadoUbicacionGeografica(String nombreAbreviadoUbicacionGeografica) {
        this.nombreAbreviadoUbicacionGeografica = nombreAbreviadoUbicacionGeografica;
    }
    
    @Column(name="zona_horaria_ubicacion_geografica", length=64)
    public String getZonaHorariaUbicacionGeografica() {
        return this.zonaHorariaUbicacionGeografica;
    }
    
    public void setZonaHorariaUbicacionGeografica(String zonaHorariaUbicacionGeografica) {
        this.zonaHorariaUbicacionGeografica = zonaHorariaUbicacionGeografica;
    }
    
    @Column(name="codigo_telefono_ubicacion_geografica", length=8)
    public String getCodigoTelefonoUbicacionGeografica() {
        return this.codigoTelefonoUbicacionGeografica;
    }
    
    public void setCodigoTelefonoUbicacionGeografica(String codigoTelefonoUbicacionGeografica) {
        this.codigoTelefonoUbicacionGeografica = codigoTelefonoUbicacionGeografica;
    }
    
    @Column(name="formato_telefono_ubicacion_geografica", length=64)
    public String getFormatoTelefonoUbicacionGeografica() {
        return this.formatoTelefonoUbicacionGeografica;
    }
    
    public void setFormatoTelefonoUbicacionGeografica(String formatoTelefonoUbicacionGeografica) {
        this.formatoTelefonoUbicacionGeografica = formatoTelefonoUbicacionGeografica;
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
    
    @Column(name="language", length=5)
    public String getLanguage() {
        return this.language;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="ubicacionGeografica")
    public Set<UbicacionGeografica> getUbicacionGeograficas() {
        return this.ubicacionGeograficas;
    }
    
    public void setUbicacionGeograficas(Set<UbicacionGeografica> ubicacionGeograficas) {
        this.ubicacionGeograficas = ubicacionGeograficas;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="ubicacionGeografica")
    public Set<CodigoPostal> getCodigoPostals() {
        return this.codigoPostals;
    }
    
    public void setCodigoPostals(Set<CodigoPostal> codigoPostals) {
        this.codigoPostals = codigoPostals;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="ubicacionGeograficaByIdPais")
    public Set<Persona> getPersonasForIdPais() {
        return this.personasForIdPais;
    }
    
    public void setPersonasForIdPais(Set<Persona> personasForIdPais) {
        this.personasForIdPais = personasForIdPais;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="ubicacionGeograficaByIdUbicacionGeograficaNacimiento")
    public Set<Persona> getPersonasForIdUbicacionGeograficaNacimiento() {
        return this.personasForIdUbicacionGeograficaNacimiento;
    }
    
    public void setPersonasForIdUbicacionGeograficaNacimiento(Set<Persona> personasForIdUbicacionGeograficaNacimiento) {
        this.personasForIdUbicacionGeograficaNacimiento = personasForIdUbicacionGeograficaNacimiento;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="ubicacionGeografica")
    public Set<TipoDocumentoIdentificacion> getTipoDocumentoIdentificacions() {
        return this.tipoDocumentoIdentificacions;
    }
    
    public void setTipoDocumentoIdentificacions(Set<TipoDocumentoIdentificacion> tipoDocumentoIdentificacions) {
        this.tipoDocumentoIdentificacions = tipoDocumentoIdentificacions;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="ubicacionGeografica")
    public Set<Usuario> getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="ubicacionGeograficaByIdUbicacionGeograficaPais")
    public Set<Organizacion> getOrganizacionsForIdUbicacionGeograficaPais() {
        return this.organizacionsForIdUbicacionGeograficaPais;
    }
    
    public void setOrganizacionsForIdUbicacionGeograficaPais(Set<Organizacion> organizacionsForIdUbicacionGeograficaPais) {
        this.organizacionsForIdUbicacionGeograficaPais = organizacionsForIdUbicacionGeograficaPais;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="ubicacionGeograficaByIdUbicacionGeograficaEstado")
    public Set<Organizacion> getOrganizacionsForIdUbicacionGeograficaEstado() {
        return this.organizacionsForIdUbicacionGeograficaEstado;
    }
    
    public void setOrganizacionsForIdUbicacionGeograficaEstado(Set<Organizacion> organizacionsForIdUbicacionGeograficaEstado) {
        this.organizacionsForIdUbicacionGeograficaEstado = organizacionsForIdUbicacionGeograficaEstado;
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
      buffer.append("ubicacionGeografica").append("='").append(getUbicacionGeografica()).append("' ");			
      buffer.append("codigoUbicacionGeografica").append("='").append(getCodigoUbicacionGeografica()).append("' ");			
      buffer.append("nombreUbicacionGeografica").append("='").append(getNombreUbicacionGeografica()).append("' ");			
      buffer.append("nombreAbreviadoUbicacionGeografica").append("='").append(getNombreAbreviadoUbicacionGeografica()).append("' ");			
      buffer.append("zonaHorariaUbicacionGeografica").append("='").append(getZonaHorariaUbicacionGeografica()).append("' ");			
      buffer.append("codigoTelefonoUbicacionGeografica").append("='").append(getCodigoTelefonoUbicacionGeografica()).append("' ");			
      buffer.append("formatoTelefonoUbicacionGeografica").append("='").append(getFormatoTelefonoUbicacionGeografica()).append("' ");			
      buffer.append("usuarioCreacion").append("='").append(getUsuarioCreacion()).append("' ");			
      buffer.append("fechaCreacion").append("='").append(getFechaCreacion()).append("' ");			
      buffer.append("usuarioModificacion").append("='").append(getUsuarioModificacion()).append("' ");			
      buffer.append("fechaModificacion").append("='").append(getFechaModificacion()).append("' ");			
      buffer.append("language").append("='").append(getLanguage()).append("' ");			
      buffer.append("]");
      
      return buffer.toString();
     }

	@Override
	public boolean equals(Object other) {
         if (this == other) 
         	return true;
         	
		 if (other == null) 
		 	return false;
		 	
		 if (!(other instanceof UbicacionGeografica)) 
		 	return false;
		 	
		 UbicacionGeografica castOther = ( UbicacionGeografica ) other; 
         
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
		if(this.ubicacionGeografica != null &&
			(ubicacionGeografica.getId() == null || this.ubicacionGeografica.getId().longValue() == 0)) {
			ubicacionGeografica = null;
		}
    }
    
    public void fillPOJO() {
		if(this.ubicacionGeografica == null) {
			ubicacionGeografica = new UbicacionGeografica();
		}
    }
    
    public UbicacionGeografica createPOJO() {
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

