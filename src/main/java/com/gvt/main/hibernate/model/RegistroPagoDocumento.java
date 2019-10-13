package com.gvt.main.hibernate.model;
// Generated 12-oct-2019 23:40:17 by Hibernate Tools 3.2.2.GA and Assent Architecture


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gvt.domain.types.Auditable;
import com.gvt.domain.types.Cleanable;
import com.gvt.domain.types.Fillable;
import com.gvt.domain.types.Identificable;
import com.gvt.domain.types.Seleccionable;
import com.gvt.domain.types.Versionable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
 * RegistroPagoDocumento generated by hbm2java
 */
@Entity
@EntityListeners({ AuditingEntityListener.class })
@Table(name="registro_pago_documento"
    ,schema="public"
)
public class RegistroPagoDocumento  implements Versionable,Seleccionable,Identificable,Fillable,Cleanable,Auditable,java.io.Serializable {


 	
 	private Long id;
 	
 	private long version;
 	
 	private OpcionSino opcionSinoByEsIslr;
 	
 	private OpcionSino opcionSinoByEsOtroImpuesto;
 	
 	private Documento documento;
 	
 	private Banco banco;
 	
 	private FormaPago formaPago;
 	
 	private String nroOperacion;
 	
 	private BigDecimal montoOperacion;
 	
 	private String observaciones;
 	@CreatedBy
 	private String usuarioCreacion;
 	@CreatedDate
 	private Date fechaCreacion;
 	@LastModifiedBy
 	private String usuarioModificacion;
 	@LastModifiedDate
 	private Date fechaModificacion;

    public RegistroPagoDocumento() {
    	// default constructor
    }

	
    public RegistroPagoDocumento(OpcionSino opcionSinoByEsIslr, OpcionSino opcionSinoByEsOtroImpuesto, Documento documento, FormaPago formaPago, BigDecimal montoOperacion) {
        this.opcionSinoByEsIslr = opcionSinoByEsIslr;
        this.opcionSinoByEsOtroImpuesto = opcionSinoByEsOtroImpuesto;
        this.documento = documento;
        this.formaPago = formaPago;
        this.montoOperacion = montoOperacion;
    }
    public RegistroPagoDocumento(OpcionSino opcionSinoByEsIslr, OpcionSino opcionSinoByEsOtroImpuesto, Documento documento, Banco banco, FormaPago formaPago, String nroOperacion, BigDecimal montoOperacion, String observaciones, String usuarioCreacion, Date fechaCreacion, String usuarioModificacion, Date fechaModificacion) {
       this.opcionSinoByEsIslr = opcionSinoByEsIslr;
       this.opcionSinoByEsOtroImpuesto = opcionSinoByEsOtroImpuesto;
       this.documento = documento;
       this.banco = banco;
       this.formaPago = formaPago;
       this.nroOperacion = nroOperacion;
       this.montoOperacion = montoOperacion;
       this.observaciones = observaciones;
       this.usuarioCreacion = usuarioCreacion;
       this.fechaCreacion = fechaCreacion;
       this.usuarioModificacion = usuarioModificacion;
       this.fechaModificacion = fechaModificacion;
    }
   
  @GenericGenerator(name = "registro_pago_documento_seq_gen", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "registro_pago_documento_id_seq"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            })
  @GeneratedValue(generator = "registro_pago_documento_seq_gen")
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
    @JoinColumn(name="es_islr", nullable=false)
    public OpcionSino getOpcionSinoByEsIslr() {
        return this.opcionSinoByEsIslr;
    }
    
    public void setOpcionSinoByEsIslr(OpcionSino opcionSinoByEsIslr) {
        this.opcionSinoByEsIslr = opcionSinoByEsIslr;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="es_otro_impuesto", nullable=false)
    public OpcionSino getOpcionSinoByEsOtroImpuesto() {
        return this.opcionSinoByEsOtroImpuesto;
    }
    
    public void setOpcionSinoByEsOtroImpuesto(OpcionSino opcionSinoByEsOtroImpuesto) {
        this.opcionSinoByEsOtroImpuesto = opcionSinoByEsOtroImpuesto;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_documento", nullable=false)
    public Documento getDocumento() {
        return this.documento;
    }
    
    public void setDocumento(Documento documento) {
        this.documento = documento;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_banco")
    public Banco getBanco() {
        return this.banco;
    }
    
    public void setBanco(Banco banco) {
        this.banco = banco;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_forma_pago", nullable=false)
    public FormaPago getFormaPago() {
        return this.formaPago;
    }
    
    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }
    
    @Column(name="nro_operacion", length=32)
    public String getNroOperacion() {
        return this.nroOperacion;
    }
    
    public void setNroOperacion(String nroOperacion) {
        this.nroOperacion = nroOperacion;
    }
    
    @Column(name="monto_operacion", nullable=false, precision=22)
    public BigDecimal getMontoOperacion() {
        return this.montoOperacion;
    }
    
    public void setMontoOperacion(BigDecimal montoOperacion) {
        this.montoOperacion = montoOperacion;
    }
    
    @Column(name="observaciones")
    public String getObservaciones() {
        return this.observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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
      buffer.append("opcionSinoByEsIslr").append("='").append(getOpcionSinoByEsIslr()).append("' ");			
      buffer.append("opcionSinoByEsOtroImpuesto").append("='").append(getOpcionSinoByEsOtroImpuesto()).append("' ");			
      buffer.append("documento").append("='").append(getDocumento()).append("' ");			
      buffer.append("banco").append("='").append(getBanco()).append("' ");			
      buffer.append("formaPago").append("='").append(getFormaPago()).append("' ");			
      buffer.append("nroOperacion").append("='").append(getNroOperacion()).append("' ");			
      buffer.append("montoOperacion").append("='").append(getMontoOperacion()).append("' ");			
      buffer.append("observaciones").append("='").append(getObservaciones()).append("' ");			
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
		 	
		 if (!(other instanceof RegistroPagoDocumento)) 
		 	return false;
		 	
		 RegistroPagoDocumento castOther = ( RegistroPagoDocumento ) other; 
         
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
		if(this.opcionSinoByEsIslr != null &&
			(opcionSinoByEsIslr.getId() == null || this.opcionSinoByEsIslr.getId().longValue() == 0)) {
			opcionSinoByEsIslr = null;
		}
		if(this.opcionSinoByEsOtroImpuesto != null &&
			(opcionSinoByEsOtroImpuesto.getId() == null || this.opcionSinoByEsOtroImpuesto.getId().longValue() == 0)) {
			opcionSinoByEsOtroImpuesto = null;
		}
		if(this.documento != null &&
			(documento.getId() == null || this.documento.getId().longValue() == 0)) {
			documento = null;
		}
		if(this.banco != null &&
			(banco.getId() == null || this.banco.getId().longValue() == 0)) {
			banco = null;
		}
		if(this.formaPago != null &&
			(formaPago.getId() == null || this.formaPago.getId().longValue() == 0)) {
			formaPago = null;
		}
    }
    
    public void fillPOJO() {
		if(this.opcionSinoByEsIslr == null) {
			opcionSinoByEsIslr = new OpcionSino();
		}
		if(this.opcionSinoByEsOtroImpuesto == null) {
			opcionSinoByEsOtroImpuesto = new OpcionSino();
		}
		if(this.documento == null) {
			documento = new Documento();
		}
		if(this.banco == null) {
			banco = new Banco();
		}
		if(this.formaPago == null) {
			formaPago = new FormaPago();
		}
    }
    
    public RegistroPagoDocumento createPOJO() {
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

