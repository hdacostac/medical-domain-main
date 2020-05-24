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
 * Laboratorio generated by hbm2java
 */
@Entity
@EntityListeners({ AuditingEntityListener.class })
@Table(name="laboratorio"
    ,schema="public"
)
public class Laboratorio  implements Versionable,Seleccionable,Identificable,Fillable,Cleanable,Auditable,java.io.Serializable {


 	
 	private Long id;
 	
 	private long version;
 	
 	private String labHb;
 	
 	private String labHcto;
 	
 	private String labSeg;
 	
 	private String labLinf;
 	
 	private String labMono;
 	
 	private String labEos;
 	
 	private String labPlaquetas;
 	
 	private String labGlicemia;
 	
 	private String labUrea;
 	
 	private String labCreatinina;
 	
 	private String labHierroSerico;
 	
 	private String labAcidoUrico;
 	
 	private String labVdrl;
 	
 	private String labHiv;
 	
 	private String labHepatitisB;
 	
 	private String labOrina;
 	
 	private String labCultivos;
 	
 	private String labToxoplasmosis;
 	
 	private String labRubeola;
 	
 	private String labProtTotales;
 	
 	private String labLeucocitos;
 	
 	private String labGlobulosRojos;
 	
 	private String labUroana;
 	
 	private String labHeces;
 	
 	private String labVhbS;
 	
 	private String labVhbCo;
 	
 	private String labTrigliceridos;
 	
 	private String labColesterol;
 	
 	private String labScreeningGenetico;
 	
 	private String labCargaGlucosada50;
 	
 	private String labCitologia;
 	
 	private String labOtro;
 	@CreatedBy
 	private String usuarioCreacion;
 	@CreatedDate
 	private LocalDateTime fechaCreacion;
 	@LastModifiedBy
 	private String usuarioModificacion;
 	@LastModifiedDate
 	private LocalDateTime fechaModificacion;
 	
 	private Set<ConsultaMedicaObstetricia> consultaMedicaObstetricias = new HashSet<ConsultaMedicaObstetricia>(0);

    public Laboratorio() {
    	// default constructor
    }

    public Laboratorio(String labHb, String labHcto, String labSeg, String labLinf, String labMono, String labEos, String labPlaquetas, String labGlicemia, String labUrea, String labCreatinina, String labHierroSerico, String labAcidoUrico, String labVdrl, String labHiv, String labHepatitisB, String labOrina, String labCultivos, String labToxoplasmosis, String labRubeola, String labProtTotales, String labLeucocitos, String labGlobulosRojos, String labUroana, String labHeces, String labVhbS, String labVhbCo, String labTrigliceridos, String labColesterol, String labScreeningGenetico, String labCargaGlucosada50, String labCitologia, String labOtro, String usuarioCreacion, LocalDateTime fechaCreacion, String usuarioModificacion, LocalDateTime fechaModificacion, Set<ConsultaMedicaObstetricia> consultaMedicaObstetricias) {
       this.labHb = labHb;
       this.labHcto = labHcto;
       this.labSeg = labSeg;
       this.labLinf = labLinf;
       this.labMono = labMono;
       this.labEos = labEos;
       this.labPlaquetas = labPlaquetas;
       this.labGlicemia = labGlicemia;
       this.labUrea = labUrea;
       this.labCreatinina = labCreatinina;
       this.labHierroSerico = labHierroSerico;
       this.labAcidoUrico = labAcidoUrico;
       this.labVdrl = labVdrl;
       this.labHiv = labHiv;
       this.labHepatitisB = labHepatitisB;
       this.labOrina = labOrina;
       this.labCultivos = labCultivos;
       this.labToxoplasmosis = labToxoplasmosis;
       this.labRubeola = labRubeola;
       this.labProtTotales = labProtTotales;
       this.labLeucocitos = labLeucocitos;
       this.labGlobulosRojos = labGlobulosRojos;
       this.labUroana = labUroana;
       this.labHeces = labHeces;
       this.labVhbS = labVhbS;
       this.labVhbCo = labVhbCo;
       this.labTrigliceridos = labTrigliceridos;
       this.labColesterol = labColesterol;
       this.labScreeningGenetico = labScreeningGenetico;
       this.labCargaGlucosada50 = labCargaGlucosada50;
       this.labCitologia = labCitologia;
       this.labOtro = labOtro;
       this.usuarioCreacion = usuarioCreacion;
       this.fechaCreacion = fechaCreacion;
       this.usuarioModificacion = usuarioModificacion;
       this.fechaModificacion = fechaModificacion;
       this.consultaMedicaObstetricias = consultaMedicaObstetricias;
    }
   
  @GenericGenerator(name = "laboratorio_seq_gen", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "laboratorio_id_seq"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            })
  @GeneratedValue(generator = "laboratorio_seq_gen")
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
    
    @Column(name="lab_hb", length=16)
    public String getLabHb() {
        return this.labHb;
    }
    
    public void setLabHb(String labHb) {
        this.labHb = labHb;
    }
    
    @Column(name="lab_hcto", length=16)
    public String getLabHcto() {
        return this.labHcto;
    }
    
    public void setLabHcto(String labHcto) {
        this.labHcto = labHcto;
    }
    
    @Column(name="lab_seg", length=16)
    public String getLabSeg() {
        return this.labSeg;
    }
    
    public void setLabSeg(String labSeg) {
        this.labSeg = labSeg;
    }
    
    @Column(name="lab_linf", length=16)
    public String getLabLinf() {
        return this.labLinf;
    }
    
    public void setLabLinf(String labLinf) {
        this.labLinf = labLinf;
    }
    
    @Column(name="lab_mono", length=16)
    public String getLabMono() {
        return this.labMono;
    }
    
    public void setLabMono(String labMono) {
        this.labMono = labMono;
    }
    
    @Column(name="lab_eos", length=16)
    public String getLabEos() {
        return this.labEos;
    }
    
    public void setLabEos(String labEos) {
        this.labEos = labEos;
    }
    
    @Column(name="lab_plaquetas", length=16)
    public String getLabPlaquetas() {
        return this.labPlaquetas;
    }
    
    public void setLabPlaquetas(String labPlaquetas) {
        this.labPlaquetas = labPlaquetas;
    }
    
    @Column(name="lab_glicemia", length=16)
    public String getLabGlicemia() {
        return this.labGlicemia;
    }
    
    public void setLabGlicemia(String labGlicemia) {
        this.labGlicemia = labGlicemia;
    }
    
    @Column(name="lab_urea", length=16)
    public String getLabUrea() {
        return this.labUrea;
    }
    
    public void setLabUrea(String labUrea) {
        this.labUrea = labUrea;
    }
    
    @Column(name="lab_creatinina", length=16)
    public String getLabCreatinina() {
        return this.labCreatinina;
    }
    
    public void setLabCreatinina(String labCreatinina) {
        this.labCreatinina = labCreatinina;
    }
    
    @Column(name="lab_hierro_serico", length=16)
    public String getLabHierroSerico() {
        return this.labHierroSerico;
    }
    
    public void setLabHierroSerico(String labHierroSerico) {
        this.labHierroSerico = labHierroSerico;
    }
    
    @Column(name="lab_acido_urico", length=16)
    public String getLabAcidoUrico() {
        return this.labAcidoUrico;
    }
    
    public void setLabAcidoUrico(String labAcidoUrico) {
        this.labAcidoUrico = labAcidoUrico;
    }
    
    @Column(name="lab_vdrl", length=16)
    public String getLabVdrl() {
        return this.labVdrl;
    }
    
    public void setLabVdrl(String labVdrl) {
        this.labVdrl = labVdrl;
    }
    
    @Column(name="lab_hiv", length=16)
    public String getLabHiv() {
        return this.labHiv;
    }
    
    public void setLabHiv(String labHiv) {
        this.labHiv = labHiv;
    }
    
    @Column(name="lab_hepatitis_b", length=16)
    public String getLabHepatitisB() {
        return this.labHepatitisB;
    }
    
    public void setLabHepatitisB(String labHepatitisB) {
        this.labHepatitisB = labHepatitisB;
    }
    
    @Column(name="lab_orina", length=16)
    public String getLabOrina() {
        return this.labOrina;
    }
    
    public void setLabOrina(String labOrina) {
        this.labOrina = labOrina;
    }
    
    @Column(name="lab_cultivos", length=16)
    public String getLabCultivos() {
        return this.labCultivos;
    }
    
    public void setLabCultivos(String labCultivos) {
        this.labCultivos = labCultivos;
    }
    
    @Column(name="lab_toxoplasmosis", length=16)
    public String getLabToxoplasmosis() {
        return this.labToxoplasmosis;
    }
    
    public void setLabToxoplasmosis(String labToxoplasmosis) {
        this.labToxoplasmosis = labToxoplasmosis;
    }
    
    @Column(name="lab_rubeola", length=16)
    public String getLabRubeola() {
        return this.labRubeola;
    }
    
    public void setLabRubeola(String labRubeola) {
        this.labRubeola = labRubeola;
    }
    
    @Column(name="lab_prot_totales", length=16)
    public String getLabProtTotales() {
        return this.labProtTotales;
    }
    
    public void setLabProtTotales(String labProtTotales) {
        this.labProtTotales = labProtTotales;
    }
    
    @Column(name="lab_leucocitos", length=16)
    public String getLabLeucocitos() {
        return this.labLeucocitos;
    }
    
    public void setLabLeucocitos(String labLeucocitos) {
        this.labLeucocitos = labLeucocitos;
    }
    
    @Column(name="lab_globulos_rojos", length=16)
    public String getLabGlobulosRojos() {
        return this.labGlobulosRojos;
    }
    
    public void setLabGlobulosRojos(String labGlobulosRojos) {
        this.labGlobulosRojos = labGlobulosRojos;
    }
    
    @Column(name="lab_uroana", length=16)
    public String getLabUroana() {
        return this.labUroana;
    }
    
    public void setLabUroana(String labUroana) {
        this.labUroana = labUroana;
    }
    
    @Column(name="lab_heces", length=16)
    public String getLabHeces() {
        return this.labHeces;
    }
    
    public void setLabHeces(String labHeces) {
        this.labHeces = labHeces;
    }
    
    @Column(name="lab_vhb_s", length=16)
    public String getLabVhbS() {
        return this.labVhbS;
    }
    
    public void setLabVhbS(String labVhbS) {
        this.labVhbS = labVhbS;
    }
    
    @Column(name="lab_vhb_co", length=16)
    public String getLabVhbCo() {
        return this.labVhbCo;
    }
    
    public void setLabVhbCo(String labVhbCo) {
        this.labVhbCo = labVhbCo;
    }
    
    @Column(name="lab_trigliceridos", length=16)
    public String getLabTrigliceridos() {
        return this.labTrigliceridos;
    }
    
    public void setLabTrigliceridos(String labTrigliceridos) {
        this.labTrigliceridos = labTrigliceridos;
    }
    
    @Column(name="lab_colesterol", length=16)
    public String getLabColesterol() {
        return this.labColesterol;
    }
    
    public void setLabColesterol(String labColesterol) {
        this.labColesterol = labColesterol;
    }
    
    @Column(name="lab_screening_genetico")
    public String getLabScreeningGenetico() {
        return this.labScreeningGenetico;
    }
    
    public void setLabScreeningGenetico(String labScreeningGenetico) {
        this.labScreeningGenetico = labScreeningGenetico;
    }
    
    @Column(name="lab_carga_glucosada_50")
    public String getLabCargaGlucosada50() {
        return this.labCargaGlucosada50;
    }
    
    public void setLabCargaGlucosada50(String labCargaGlucosada50) {
        this.labCargaGlucosada50 = labCargaGlucosada50;
    }
    
    @Column(name="lab_citologia")
    public String getLabCitologia() {
        return this.labCitologia;
    }
    
    public void setLabCitologia(String labCitologia) {
        this.labCitologia = labCitologia;
    }
    
    @Column(name="lab_otro")
    public String getLabOtro() {
        return this.labOtro;
    }
    
    public void setLabOtro(String labOtro) {
        this.labOtro = labOtro;
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
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="laboratorio")
    public Set<ConsultaMedicaObstetricia> getConsultaMedicaObstetricias() {
        return this.consultaMedicaObstetricias;
    }
    
    public void setConsultaMedicaObstetricias(Set<ConsultaMedicaObstetricia> consultaMedicaObstetricias) {
        this.consultaMedicaObstetricias = consultaMedicaObstetricias;
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
      buffer.append("labHb").append("='").append(getLabHb()).append("' ");			
      buffer.append("labHcto").append("='").append(getLabHcto()).append("' ");			
      buffer.append("labSeg").append("='").append(getLabSeg()).append("' ");			
      buffer.append("labLinf").append("='").append(getLabLinf()).append("' ");			
      buffer.append("labMono").append("='").append(getLabMono()).append("' ");			
      buffer.append("labEos").append("='").append(getLabEos()).append("' ");			
      buffer.append("labPlaquetas").append("='").append(getLabPlaquetas()).append("' ");			
      buffer.append("labGlicemia").append("='").append(getLabGlicemia()).append("' ");			
      buffer.append("labUrea").append("='").append(getLabUrea()).append("' ");			
      buffer.append("labCreatinina").append("='").append(getLabCreatinina()).append("' ");			
      buffer.append("labHierroSerico").append("='").append(getLabHierroSerico()).append("' ");			
      buffer.append("labAcidoUrico").append("='").append(getLabAcidoUrico()).append("' ");			
      buffer.append("labVdrl").append("='").append(getLabVdrl()).append("' ");			
      buffer.append("labHiv").append("='").append(getLabHiv()).append("' ");			
      buffer.append("labHepatitisB").append("='").append(getLabHepatitisB()).append("' ");			
      buffer.append("labOrina").append("='").append(getLabOrina()).append("' ");			
      buffer.append("labCultivos").append("='").append(getLabCultivos()).append("' ");			
      buffer.append("labToxoplasmosis").append("='").append(getLabToxoplasmosis()).append("' ");			
      buffer.append("labRubeola").append("='").append(getLabRubeola()).append("' ");			
      buffer.append("labProtTotales").append("='").append(getLabProtTotales()).append("' ");			
      buffer.append("labLeucocitos").append("='").append(getLabLeucocitos()).append("' ");			
      buffer.append("labGlobulosRojos").append("='").append(getLabGlobulosRojos()).append("' ");			
      buffer.append("labUroana").append("='").append(getLabUroana()).append("' ");			
      buffer.append("labHeces").append("='").append(getLabHeces()).append("' ");			
      buffer.append("labVhbS").append("='").append(getLabVhbS()).append("' ");			
      buffer.append("labVhbCo").append("='").append(getLabVhbCo()).append("' ");			
      buffer.append("labTrigliceridos").append("='").append(getLabTrigliceridos()).append("' ");			
      buffer.append("labColesterol").append("='").append(getLabColesterol()).append("' ");			
      buffer.append("labScreeningGenetico").append("='").append(getLabScreeningGenetico()).append("' ");			
      buffer.append("labCargaGlucosada50").append("='").append(getLabCargaGlucosada50()).append("' ");			
      buffer.append("labCitologia").append("='").append(getLabCitologia()).append("' ");			
      buffer.append("labOtro").append("='").append(getLabOtro()).append("' ");			
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
		 	
		 if (!(other instanceof Laboratorio)) 
		 	return false;
		 	
		 Laboratorio castOther = ( Laboratorio ) other; 
         
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
    
    public Laboratorio createPOJO() {
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

