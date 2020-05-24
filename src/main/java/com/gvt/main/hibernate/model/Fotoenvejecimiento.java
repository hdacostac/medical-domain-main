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
 * Fotoenvejecimiento generated by hbm2java
 */
@Entity
@EntityListeners({ AuditingEntityListener.class })
@Table(name="fotoenvejecimiento"
    ,schema="public"
)
public class Fotoenvejecimiento  implements Versionable,Seleccionable,Identificable,Fillable,Cleanable,Auditable,java.io.Serializable {


 	
 	private Long id;
 	
 	private long version;
 	
 	private String numeroFotoenvejecimiento;
 	
 	private String edad;
 	
 	private String manchas;
 	
 	private String queratosisActinicas;
 	
 	private String arrugas;
 	@CreatedBy
 	private String usuarioCreacion;
 	@CreatedDate
 	private LocalDateTime fechaCreacion;
 	@LastModifiedBy
 	private String usuarioModificacion;
 	@LastModifiedDate
 	private LocalDateTime fechaModificacion;
 	
 	private Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticas = new HashSet<PersonaAntecedentesDermatoestetica>(0);

    public Fotoenvejecimiento() {
    	// default constructor
    }

    public Fotoenvejecimiento(String numeroFotoenvejecimiento, String edad, String manchas, String queratosisActinicas, String arrugas, String usuarioCreacion, LocalDateTime fechaCreacion, String usuarioModificacion, LocalDateTime fechaModificacion, Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticas) {
       this.numeroFotoenvejecimiento = numeroFotoenvejecimiento;
       this.edad = edad;
       this.manchas = manchas;
       this.queratosisActinicas = queratosisActinicas;
       this.arrugas = arrugas;
       this.usuarioCreacion = usuarioCreacion;
       this.fechaCreacion = fechaCreacion;
       this.usuarioModificacion = usuarioModificacion;
       this.fechaModificacion = fechaModificacion;
       this.personaAntecedentesDermatoesteticas = personaAntecedentesDermatoesteticas;
    }
   
  @GenericGenerator(name = "fotoenvejecimiento_seq_gen", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "fotoenvejecimiento_id_seq"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            })
  @GeneratedValue(generator = "fotoenvejecimiento_seq_gen")
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
    
    @Column(name="numero_fotoenvejecimiento", length=8)
    public String getNumeroFotoenvejecimiento() {
        return this.numeroFotoenvejecimiento;
    }
    
    public void setNumeroFotoenvejecimiento(String numeroFotoenvejecimiento) {
        this.numeroFotoenvejecimiento = numeroFotoenvejecimiento;
    }
    
    @Column(name="edad")
    public String getEdad() {
        return this.edad;
    }
    
    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    @Column(name="manchas")
    public String getManchas() {
        return this.manchas;
    }
    
    public void setManchas(String manchas) {
        this.manchas = manchas;
    }
    
    @Column(name="queratosis_actinicas")
    public String getQueratosisActinicas() {
        return this.queratosisActinicas;
    }
    
    public void setQueratosisActinicas(String queratosisActinicas) {
        this.queratosisActinicas = queratosisActinicas;
    }
    
    @Column(name="arrugas")
    public String getArrugas() {
        return this.arrugas;
    }
    
    public void setArrugas(String arrugas) {
        this.arrugas = arrugas;
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
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="fotoenvejecimiento")
    public Set<PersonaAntecedentesDermatoestetica> getPersonaAntecedentesDermatoesteticas() {
        return this.personaAntecedentesDermatoesteticas;
    }
    
    public void setPersonaAntecedentesDermatoesteticas(Set<PersonaAntecedentesDermatoestetica> personaAntecedentesDermatoesteticas) {
        this.personaAntecedentesDermatoesteticas = personaAntecedentesDermatoesteticas;
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
      buffer.append("numeroFotoenvejecimiento").append("='").append(getNumeroFotoenvejecimiento()).append("' ");			
      buffer.append("edad").append("='").append(getEdad()).append("' ");			
      buffer.append("manchas").append("='").append(getManchas()).append("' ");			
      buffer.append("queratosisActinicas").append("='").append(getQueratosisActinicas()).append("' ");			
      buffer.append("arrugas").append("='").append(getArrugas()).append("' ");			
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
		 	
		 if (!(other instanceof Fotoenvejecimiento)) 
		 	return false;
		 	
		 Fotoenvejecimiento castOther = ( Fotoenvejecimiento ) other; 
         
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
    
    public Fotoenvejecimiento createPOJO() {
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

