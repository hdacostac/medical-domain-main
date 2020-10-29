package com.gvt.main.hibernate.model;
// Generated 29-oct-2020 13:48:51 by Hibernate Tools 3.2.2.GA and Assent Architecture


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gvt.core.domain.types.Auditable;
import com.gvt.core.domain.types.Cleanable;
import com.gvt.core.domain.types.Fillable;
import com.gvt.core.domain.types.Identificable;
import com.gvt.core.domain.types.Seleccionable;
import com.gvt.core.domain.types.Versionable;
import java.math.BigDecimal;
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
 * RenglonPedido generated by hbm2java
 */
@Entity
@EntityListeners({ AuditingEntityListener.class })
@Table(name="renglon_pedido"
    ,schema="public"
)
public class RenglonPedido  implements Versionable,Seleccionable,Identificable,Fillable,Cleanable,Auditable,java.io.Serializable {


 	
 	private Long id;
 	
 	private long version;
 	
 	private Pedido pedido;
 	
 	private OpcionSino opcionSino;
 	
 	private String codigoTipoProducto;
 	
 	private String nombreTipoProducto;
 	
 	private String descripcionRenglonPedido;
 	
 	private String codigoCategoriaProducto;
 	
 	private String nombreCategoriaProducto;
 	
 	private float porcentajeIva;
 	
 	private double cantidadRenglonPedido;
 	
 	private short tipoPrecio;
 	
 	private BigDecimal precioTipoProducto;
 	
 	private BigDecimal totalRenglonPedido;
 	
 	private String loteRenglonPedido;
 	
 	private String serieRenglonPedido;
 	@CreatedBy
 	private String usuarioCreacion;
 	@CreatedDate
 	private LocalDateTime fechaCreacion;
 	@LastModifiedBy
 	private String usuarioModificacion;
 	@LastModifiedDate
 	private LocalDateTime fechaModificacion;

    public RenglonPedido() {
    	// default constructor
    }

	
    public RenglonPedido(Pedido pedido, OpcionSino opcionSino, String codigoTipoProducto, String nombreTipoProducto, float porcentajeIva, double cantidadRenglonPedido, short tipoPrecio, BigDecimal precioTipoProducto, BigDecimal totalRenglonPedido) {
        this.pedido = pedido;
        this.opcionSino = opcionSino;
        this.codigoTipoProducto = codigoTipoProducto;
        this.nombreTipoProducto = nombreTipoProducto;
        this.porcentajeIva = porcentajeIva;
        this.cantidadRenglonPedido = cantidadRenglonPedido;
        this.tipoPrecio = tipoPrecio;
        this.precioTipoProducto = precioTipoProducto;
        this.totalRenglonPedido = totalRenglonPedido;
    }
    public RenglonPedido(Pedido pedido, OpcionSino opcionSino, String codigoTipoProducto, String nombreTipoProducto, String descripcionRenglonPedido, String codigoCategoriaProducto, String nombreCategoriaProducto, float porcentajeIva, double cantidadRenglonPedido, short tipoPrecio, BigDecimal precioTipoProducto, BigDecimal totalRenglonPedido, String loteRenglonPedido, String serieRenglonPedido, String usuarioCreacion, LocalDateTime fechaCreacion, String usuarioModificacion, LocalDateTime fechaModificacion) {
       this.pedido = pedido;
       this.opcionSino = opcionSino;
       this.codigoTipoProducto = codigoTipoProducto;
       this.nombreTipoProducto = nombreTipoProducto;
       this.descripcionRenglonPedido = descripcionRenglonPedido;
       this.codigoCategoriaProducto = codigoCategoriaProducto;
       this.nombreCategoriaProducto = nombreCategoriaProducto;
       this.porcentajeIva = porcentajeIva;
       this.cantidadRenglonPedido = cantidadRenglonPedido;
       this.tipoPrecio = tipoPrecio;
       this.precioTipoProducto = precioTipoProducto;
       this.totalRenglonPedido = totalRenglonPedido;
       this.loteRenglonPedido = loteRenglonPedido;
       this.serieRenglonPedido = serieRenglonPedido;
       this.usuarioCreacion = usuarioCreacion;
       this.fechaCreacion = fechaCreacion;
       this.usuarioModificacion = usuarioModificacion;
       this.fechaModificacion = fechaModificacion;
    }
   
  @GenericGenerator(name = "renglon_pedido_seq_gen", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "renglon_pedido_id_seq"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            })
  @GeneratedValue(generator = "renglon_pedido_seq_gen")
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
    @JoinColumn(name="id_pedido", nullable=false)
    public Pedido getPedido() {
        return this.pedido;
    }
    
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="es_exento", nullable=false)
    public OpcionSino getOpcionSino() {
        return this.opcionSino;
    }
    
    public void setOpcionSino(OpcionSino opcionSino) {
        this.opcionSino = opcionSino;
    }
    
    @Column(name="codigo_tipo_producto", nullable=false, length=64)
    public String getCodigoTipoProducto() {
        return this.codigoTipoProducto;
    }
    
    public void setCodigoTipoProducto(String codigoTipoProducto) {
        this.codigoTipoProducto = codigoTipoProducto;
    }
    
    @Column(name="nombre_tipo_producto", nullable=false)
    public String getNombreTipoProducto() {
        return this.nombreTipoProducto;
    }
    
    public void setNombreTipoProducto(String nombreTipoProducto) {
        this.nombreTipoProducto = nombreTipoProducto;
    }
    
    @Column(name="descripcion_renglon_pedido")
    public String getDescripcionRenglonPedido() {
        return this.descripcionRenglonPedido;
    }
    
    public void setDescripcionRenglonPedido(String descripcionRenglonPedido) {
        this.descripcionRenglonPedido = descripcionRenglonPedido;
    }
    
    @Column(name="codigo_categoria_producto", length=16)
    public String getCodigoCategoriaProducto() {
        return this.codigoCategoriaProducto;
    }
    
    public void setCodigoCategoriaProducto(String codigoCategoriaProducto) {
        this.codigoCategoriaProducto = codigoCategoriaProducto;
    }
    
    @Column(name="nombre_categoria_producto", length=64)
    public String getNombreCategoriaProducto() {
        return this.nombreCategoriaProducto;
    }
    
    public void setNombreCategoriaProducto(String nombreCategoriaProducto) {
        this.nombreCategoriaProducto = nombreCategoriaProducto;
    }
    
    @Column(name="porcentaje_iva", nullable=false, precision=8, scale=8)
    public float getPorcentajeIva() {
        return this.porcentajeIva;
    }
    
    public void setPorcentajeIva(float porcentajeIva) {
        this.porcentajeIva = porcentajeIva;
    }
    
    @Column(name="cantidad_renglon_pedido", nullable=false, precision=17, scale=17)
    public double getCantidadRenglonPedido() {
        return this.cantidadRenglonPedido;
    }
    
    public void setCantidadRenglonPedido(double cantidadRenglonPedido) {
        this.cantidadRenglonPedido = cantidadRenglonPedido;
    }
    
    @Column(name="tipo_precio", nullable=false)
    public short getTipoPrecio() {
        return this.tipoPrecio;
    }
    
    public void setTipoPrecio(short tipoPrecio) {
        this.tipoPrecio = tipoPrecio;
    }
    
    @Column(name="precio_tipo_producto", nullable=false, precision=22)
    public BigDecimal getPrecioTipoProducto() {
        return this.precioTipoProducto;
    }
    
    public void setPrecioTipoProducto(BigDecimal precioTipoProducto) {
        this.precioTipoProducto = precioTipoProducto;
    }
    
    @Column(name="total_renglon_pedido", nullable=false, precision=22)
    public BigDecimal getTotalRenglonPedido() {
        return this.totalRenglonPedido;
    }
    
    public void setTotalRenglonPedido(BigDecimal totalRenglonPedido) {
        this.totalRenglonPedido = totalRenglonPedido;
    }
    
    @Column(name="lote_renglon_pedido", length=32)
    public String getLoteRenglonPedido() {
        return this.loteRenglonPedido;
    }
    
    public void setLoteRenglonPedido(String loteRenglonPedido) {
        this.loteRenglonPedido = loteRenglonPedido;
    }
    
    @Column(name="serie_renglon_pedido", length=32)
    public String getSerieRenglonPedido() {
        return this.serieRenglonPedido;
    }
    
    public void setSerieRenglonPedido(String serieRenglonPedido) {
        this.serieRenglonPedido = serieRenglonPedido;
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
      buffer.append("pedido").append("='").append(getPedido()).append("' ");			
      buffer.append("opcionSino").append("='").append(getOpcionSino()).append("' ");			
      buffer.append("codigoTipoProducto").append("='").append(getCodigoTipoProducto()).append("' ");			
      buffer.append("nombreTipoProducto").append("='").append(getNombreTipoProducto()).append("' ");			
      buffer.append("descripcionRenglonPedido").append("='").append(getDescripcionRenglonPedido()).append("' ");			
      buffer.append("codigoCategoriaProducto").append("='").append(getCodigoCategoriaProducto()).append("' ");			
      buffer.append("nombreCategoriaProducto").append("='").append(getNombreCategoriaProducto()).append("' ");			
      buffer.append("porcentajeIva").append("='").append(getPorcentajeIva()).append("' ");			
      buffer.append("cantidadRenglonPedido").append("='").append(getCantidadRenglonPedido()).append("' ");			
      buffer.append("tipoPrecio").append("='").append(getTipoPrecio()).append("' ");			
      buffer.append("precioTipoProducto").append("='").append(getPrecioTipoProducto()).append("' ");			
      buffer.append("totalRenglonPedido").append("='").append(getTotalRenglonPedido()).append("' ");			
      buffer.append("loteRenglonPedido").append("='").append(getLoteRenglonPedido()).append("' ");			
      buffer.append("serieRenglonPedido").append("='").append(getSerieRenglonPedido()).append("' ");			
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
		 	
		 if (!(other instanceof RenglonPedido)) 
		 	return false;
		 	
		 RenglonPedido castOther = ( RenglonPedido ) other; 
         
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
		if(this.pedido != null &&
			(pedido.getId() == null || this.pedido.getId().longValue() == 0)) {
			pedido = null;
		}
		if(this.opcionSino != null &&
			(opcionSino.getId() == null || this.opcionSino.getId().longValue() == 0)) {
			opcionSino = null;
		}
    }
    
    public void fillPOJO() {
		if(this.pedido == null) {
			pedido = new Pedido();
		}
		if(this.opcionSino == null) {
			opcionSino = new OpcionSino();
		}
    }
    
    public RenglonPedido createPOJO() {
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

