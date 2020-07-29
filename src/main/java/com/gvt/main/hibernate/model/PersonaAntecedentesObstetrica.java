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
 * PersonaAntecedentesObstetrica generated by hbm2java
 */
@Entity
@EntityListeners({ AuditingEntityListener.class })
@Table(name="persona_antecedentes_obstetrica"
    ,schema="public"
    , uniqueConstraints = @UniqueConstraint(columnNames="id_persona") 
)
public class PersonaAntecedentesObstetrica  implements Versionable,Seleccionable,Identificable,Fillable,Cleanable,Auditable,java.io.Serializable {


 	
 	private Long id;
 	
 	private long version;
 	
 	private Persona persona;
 	
 	private String comentariosAlergias;
 	
 	private String medicamentosSuplementos;
 	
 	private String otrosAntecedentesPersonales;
 	
 	private String otrosAntecedentesFamiliares;
 	
 	private Long numeroGestas;
 	
 	private Long numeroParas;
 	
 	private Long numeroAbortos;
 	
 	private Long numeroCesareas;
 	@CreatedBy
 	private String usuarioCreacion;
 	@CreatedDate
 	private LocalDateTime fechaCreacion;
 	@LastModifiedBy
 	private String usuarioModificacion;
 	@LastModifiedDate
 	private LocalDateTime fechaModificacion;

    public PersonaAntecedentesObstetrica() {
    	// default constructor
    }

	
    public PersonaAntecedentesObstetrica(Persona persona) {
        this.persona = persona;
    }
    public PersonaAntecedentesObstetrica(Persona persona, String comentariosAlergias, String medicamentosSuplementos, String otrosAntecedentesPersonales, String otrosAntecedentesFamiliares, Long numeroGestas, Long numeroParas, Long numeroAbortos, Long numeroCesareas, String usuarioCreacion, LocalDateTime fechaCreacion, String usuarioModificacion, LocalDateTime fechaModificacion) {
       this.persona = persona;
       this.comentariosAlergias = comentariosAlergias;
       this.medicamentosSuplementos = medicamentosSuplementos;
       this.otrosAntecedentesPersonales = otrosAntecedentesPersonales;
       this.otrosAntecedentesFamiliares = otrosAntecedentesFamiliares;
       this.numeroGestas = numeroGestas;
       this.numeroParas = numeroParas;
       this.numeroAbortos = numeroAbortos;
       this.numeroCesareas = numeroCesareas;
       this.usuarioCreacion = usuarioCreacion;
       this.fechaCreacion = fechaCreacion;
       this.usuarioModificacion = usuarioModificacion;
       this.fechaModificacion = fechaModificacion;
    }
   
  @GenericGenerator(name = "persona_antecedentes_obstetrica_seq_gen", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "persona_antecedentes_obstetrica_id_seq"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            })
  @GeneratedValue(generator = "persona_antecedentes_obstetrica_seq_gen")
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
    @JoinColumn(name="id_persona", unique=true, nullable=false)
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    @Column(name="comentarios_alergias")
    public String getComentariosAlergias() {
        return this.comentariosAlergias;
    }
    
    public void setComentariosAlergias(String comentariosAlergias) {
        this.comentariosAlergias = comentariosAlergias;
    }
    
    @Column(name="medicamentos_suplementos")
    public String getMedicamentosSuplementos() {
        return this.medicamentosSuplementos;
    }
    
    public void setMedicamentosSuplementos(String medicamentosSuplementos) {
        this.medicamentosSuplementos = medicamentosSuplementos;
    }
    
    @Column(name="otros_antecedentes_personales")
    public String getOtrosAntecedentesPersonales() {
        return this.otrosAntecedentesPersonales;
    }
    
    public void setOtrosAntecedentesPersonales(String otrosAntecedentesPersonales) {
        this.otrosAntecedentesPersonales = otrosAntecedentesPersonales;
    }
    
    @Column(name="otros_antecedentes_familiares")
    public String getOtrosAntecedentesFamiliares() {
        return this.otrosAntecedentesFamiliares;
    }
    
    public void setOtrosAntecedentesFamiliares(String otrosAntecedentesFamiliares) {
        this.otrosAntecedentesFamiliares = otrosAntecedentesFamiliares;
    }
    
    @Column(name="numero_gestas")
    public Long getNumeroGestas() {
        return this.numeroGestas;
    }
    
    public void setNumeroGestas(Long numeroGestas) {
        this.numeroGestas = numeroGestas;
    }
    
    @Column(name="numero_paras")
    public Long getNumeroParas() {
        return this.numeroParas;
    }
    
    public void setNumeroParas(Long numeroParas) {
        this.numeroParas = numeroParas;
    }
    
    @Column(name="numero_abortos")
    public Long getNumeroAbortos() {
        return this.numeroAbortos;
    }
    
    public void setNumeroAbortos(Long numeroAbortos) {
        this.numeroAbortos = numeroAbortos;
    }
    
    @Column(name="numero_cesareas")
    public Long getNumeroCesareas() {
        return this.numeroCesareas;
    }
    
    public void setNumeroCesareas(Long numeroCesareas) {
        this.numeroCesareas = numeroCesareas;
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
      buffer.append("comentariosAlergias").append("='").append(getComentariosAlergias()).append("' ");			
      buffer.append("medicamentosSuplementos").append("='").append(getMedicamentosSuplementos()).append("' ");			
      buffer.append("otrosAntecedentesPersonales").append("='").append(getOtrosAntecedentesPersonales()).append("' ");			
      buffer.append("otrosAntecedentesFamiliares").append("='").append(getOtrosAntecedentesFamiliares()).append("' ");			
      buffer.append("numeroGestas").append("='").append(getNumeroGestas()).append("' ");			
      buffer.append("numeroParas").append("='").append(getNumeroParas()).append("' ");			
      buffer.append("numeroAbortos").append("='").append(getNumeroAbortos()).append("' ");			
      buffer.append("numeroCesareas").append("='").append(getNumeroCesareas()).append("' ");			
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
		 	
		 if (!(other instanceof PersonaAntecedentesObstetrica)) 
		 	return false;
		 	
		 PersonaAntecedentesObstetrica castOther = ( PersonaAntecedentesObstetrica ) other; 
         
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
    }
    
    public void fillPOJO() {
		if(this.persona == null) {
			persona = new Persona();
		}
    }
    
    public PersonaAntecedentesObstetrica createPOJO() {
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

