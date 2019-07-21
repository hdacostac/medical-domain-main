package com.gvt.main.hibernate.model;
// Generated 21-jul-2019 22:45:07 by Hibernate Tools 3.2.2.GA and Assent Architecture


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
 * Gastos generated by hbm2java
 */
@Entity
@EntityListeners({ AuditingEntityListener.class })
@Table(name="gastos"
    ,schema="public"
    , uniqueConstraints = @UniqueConstraint(columnNames={"numero_factura", "id_proveedor"}) 
)
public class Gastos  implements Versionable,Seleccionable,Identificable,Fillable,Cleanable,Auditable,java.io.Serializable {


 	
 	private Long id;
 	
 	private long version;
 	
 	private Persona persona;
 	
 	private String numeroFactura;
 	
 	private String numeroControlFactura;
 	
 	private Date fechaElaboracionFactura;
 	
 	private String descripcionCompra;
 	
 	private BigDecimal totalBaseImponible;
 	
 	private BigDecimal totalExento;
 	
 	private BigDecimal totalImpuesto;
 	
 	private BigDecimal porcentajeImpuesto;
 	
 	private BigDecimal totalGasto;
 	
 	private String rifProveedor;
 	
 	private String nombreProveedor;
 	
 	private String telefonoFijoProveedor;
 	
 	private String direccionProveedor;
 	@CreatedBy
 	private String usuarioCreacion;
 	@CreatedDate
 	private Date fechaCreacion;
 	@LastModifiedBy
 	private String usuarioModificacion;
 	@LastModifiedDate
 	private Date fechaModificacion;

    public Gastos() {
    	// default constructor
    }

	
    public Gastos(Persona persona, String numeroFactura, String descripcionCompra, BigDecimal totalBaseImponible, BigDecimal totalGasto) {
        this.persona = persona;
        this.numeroFactura = numeroFactura;
        this.descripcionCompra = descripcionCompra;
        this.totalBaseImponible = totalBaseImponible;
        this.totalGasto = totalGasto;
    }
    public Gastos(Persona persona, String numeroFactura, String numeroControlFactura, Date fechaElaboracionFactura, String descripcionCompra, BigDecimal totalBaseImponible, BigDecimal totalExento, BigDecimal totalImpuesto, BigDecimal porcentajeImpuesto, BigDecimal totalGasto, String rifProveedor, String nombreProveedor, String telefonoFijoProveedor, String direccionProveedor, String usuarioCreacion, Date fechaCreacion, String usuarioModificacion, Date fechaModificacion) {
       this.persona = persona;
       this.numeroFactura = numeroFactura;
       this.numeroControlFactura = numeroControlFactura;
       this.fechaElaboracionFactura = fechaElaboracionFactura;
       this.descripcionCompra = descripcionCompra;
       this.totalBaseImponible = totalBaseImponible;
       this.totalExento = totalExento;
       this.totalImpuesto = totalImpuesto;
       this.porcentajeImpuesto = porcentajeImpuesto;
       this.totalGasto = totalGasto;
       this.rifProveedor = rifProveedor;
       this.nombreProveedor = nombreProveedor;
       this.telefonoFijoProveedor = telefonoFijoProveedor;
       this.direccionProveedor = direccionProveedor;
       this.usuarioCreacion = usuarioCreacion;
       this.fechaCreacion = fechaCreacion;
       this.usuarioModificacion = usuarioModificacion;
       this.fechaModificacion = fechaModificacion;
    }
   
  @GenericGenerator(name = "gastos_seq_gen", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "gastos_id_seq"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            })
  @GeneratedValue(generator = "gastos_seq_gen")
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
    @JoinColumn(name="id_proveedor", nullable=false)
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    @Column(name="numero_factura", nullable=false, length=64)
    public String getNumeroFactura() {
        return this.numeroFactura;
    }
    
    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }
    
    @Column(name="numero_control_factura", length=64)
    public String getNumeroControlFactura() {
        return this.numeroControlFactura;
    }
    
    public void setNumeroControlFactura(String numeroControlFactura) {
        this.numeroControlFactura = numeroControlFactura;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="fecha_elaboracion_factura", length=29)
    public Date getFechaElaboracionFactura() {
        return this.fechaElaboracionFactura;
    }
    
    public void setFechaElaboracionFactura(Date fechaElaboracionFactura) {
        this.fechaElaboracionFactura = fechaElaboracionFactura;
    }
    
    @Column(name="descripcion_compra", nullable=false)
    public String getDescripcionCompra() {
        return this.descripcionCompra;
    }
    
    public void setDescripcionCompra(String descripcionCompra) {
        this.descripcionCompra = descripcionCompra;
    }
    
    @Column(name="total_base_imponible", nullable=false, precision=22)
    public BigDecimal getTotalBaseImponible() {
        return this.totalBaseImponible;
    }
    
    public void setTotalBaseImponible(BigDecimal totalBaseImponible) {
        this.totalBaseImponible = totalBaseImponible;
    }
    
    @Column(name="total_exento", precision=22)
    public BigDecimal getTotalExento() {
        return this.totalExento;
    }
    
    public void setTotalExento(BigDecimal totalExento) {
        this.totalExento = totalExento;
    }
    
    @Column(name="total_impuesto", precision=22)
    public BigDecimal getTotalImpuesto() {
        return this.totalImpuesto;
    }
    
    public void setTotalImpuesto(BigDecimal totalImpuesto) {
        this.totalImpuesto = totalImpuesto;
    }
    
    @Column(name="porcentaje_impuesto", precision=22)
    public BigDecimal getPorcentajeImpuesto() {
        return this.porcentajeImpuesto;
    }
    
    public void setPorcentajeImpuesto(BigDecimal porcentajeImpuesto) {
        this.porcentajeImpuesto = porcentajeImpuesto;
    }
    
    @Column(name="total_gasto", nullable=false, precision=22)
    public BigDecimal getTotalGasto() {
        return this.totalGasto;
    }
    
    public void setTotalGasto(BigDecimal totalGasto) {
        this.totalGasto = totalGasto;
    }
    
    @Column(name="rif_proveedor", length=64)
    public String getRifProveedor() {
        return this.rifProveedor;
    }
    
    public void setRifProveedor(String rifProveedor) {
        this.rifProveedor = rifProveedor;
    }
    
    @Column(name="nombre_proveedor", length=128)
    public String getNombreProveedor() {
        return this.nombreProveedor;
    }
    
    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }
    
    @Column(name="telefono_fijo_proveedor", length=32)
    public String getTelefonoFijoProveedor() {
        return this.telefonoFijoProveedor;
    }
    
    public void setTelefonoFijoProveedor(String telefonoFijoProveedor) {
        this.telefonoFijoProveedor = telefonoFijoProveedor;
    }
    
    @Column(name="direccion_proveedor")
    public String getDireccionProveedor() {
        return this.direccionProveedor;
    }
    
    public void setDireccionProveedor(String direccionProveedor) {
        this.direccionProveedor = direccionProveedor;
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
      buffer.append("persona").append("='").append(getPersona()).append("' ");			
      buffer.append("numeroFactura").append("='").append(getNumeroFactura()).append("' ");			
      buffer.append("numeroControlFactura").append("='").append(getNumeroControlFactura()).append("' ");			
      buffer.append("fechaElaboracionFactura").append("='").append(getFechaElaboracionFactura()).append("' ");			
      buffer.append("descripcionCompra").append("='").append(getDescripcionCompra()).append("' ");			
      buffer.append("totalBaseImponible").append("='").append(getTotalBaseImponible()).append("' ");			
      buffer.append("totalExento").append("='").append(getTotalExento()).append("' ");			
      buffer.append("totalImpuesto").append("='").append(getTotalImpuesto()).append("' ");			
      buffer.append("porcentajeImpuesto").append("='").append(getPorcentajeImpuesto()).append("' ");			
      buffer.append("totalGasto").append("='").append(getTotalGasto()).append("' ");			
      buffer.append("rifProveedor").append("='").append(getRifProveedor()).append("' ");			
      buffer.append("nombreProveedor").append("='").append(getNombreProveedor()).append("' ");			
      buffer.append("telefonoFijoProveedor").append("='").append(getTelefonoFijoProveedor()).append("' ");			
      buffer.append("direccionProveedor").append("='").append(getDireccionProveedor()).append("' ");			
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
		 	
		 if (!(other instanceof Gastos)) 
		 	return false;
		 	
		 Gastos castOther = ( Gastos ) other; 
         
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
    
    public Gastos createPOJO() {
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

