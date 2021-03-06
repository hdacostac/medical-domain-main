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
 * Compras generated by hbm2java
 */
@Entity
@EntityListeners({ AuditingEntityListener.class })
@Table(name="compras"
    ,schema="public"
    , uniqueConstraints = {@UniqueConstraint(columnNames={"numero_documento", "id_organizacion"}), @UniqueConstraint(columnNames={"numero_factura_proveedor", "rif_proveedor"})} 
)
public class Compras  implements Versionable,Seleccionable,Identificable,Fillable,Cleanable,Auditable,java.io.Serializable {


 	
 	private Long id;
 	
 	private long version;
 	
 	private OpcionSino opcionSinoByEsCargadoInventario;
 	
 	private OpcionSino opcionSinoByEsBloqueada;
 	
 	private StatusDocumento statusDocumento;
 	
 	private Almacen almacen;
 	
 	private OpcionSino opcionSinoByEsPagada;
 	
 	private Organizacion organizacion;
 	
 	private String numeroDocumento;
 	
 	private String numeroFacturaProveedor;
 	
 	private String numeroControlFacturaProveedor;
 	
 	private LocalDateTime fechaElaboracionFactura;
 	
 	private LocalDateTime fechaVencimientoFactura;
 	
 	private String codigoProveedor;
 	
 	private String rifProveedor;
 	
 	private String nombreProveedor;
 	
 	private String telefonoFijoProveedor;
 	
 	private String direccionProveedor;
 	
 	private String numeroComprobanteRetencion;
 	
 	private LocalDateTime fechaComprobanteRetencion;
 	
 	private String numeroPlanillaImportacion;
 	
 	private String numeroExpedienteImportacion;
 	
 	private BigDecimal montoSubtotal;
 	
 	private BigDecimal montoExento;
 	
 	private BigDecimal montoGravable1;
 	
 	private Float porcentajeIva1;
 	
 	private BigDecimal montoIva1;
 	
 	private BigDecimal montoGravable2;
 	
 	private Float porcentajeIva2;
 	
 	private BigDecimal montoIva2;
 	
 	private BigDecimal montoGravable3;
 	
 	private Float porcentajeIva3;
 	
 	private BigDecimal montoIva3;
 	
 	private BigDecimal montoGravable4;
 	
 	private Float porcentajeIva4;
 	
 	private BigDecimal montoIva4;
 	
 	private BigDecimal montoGravable5;
 	
 	private Float porcentajeIva5;
 	
 	private BigDecimal montoIva5;
 	
 	private BigDecimal montoTotal;
 	
 	private Float descuento;
 	
 	private String responsableCompras;
 	@CreatedBy
 	private String usuarioCreacion;
 	@CreatedDate
 	private LocalDateTime fechaCreacion;
 	@LastModifiedBy
 	private String usuarioModificacion;
 	@LastModifiedDate
 	private LocalDateTime fechaModificacion;
 	
 	private Set<RenglonCompras> renglonComprases = new HashSet<RenglonCompras>(0);
 	
 	private Set<ComprasFormaPago> comprasFormaPagos = new HashSet<ComprasFormaPago>(0);

    public Compras() {
    	// default constructor
    }

	
    public Compras(OpcionSino opcionSinoByEsBloqueada, StatusDocumento statusDocumento, OpcionSino opcionSinoByEsPagada, Organizacion organizacion, String numeroDocumento, String numeroFacturaProveedor, BigDecimal montoSubtotal, BigDecimal montoExento, BigDecimal montoTotal) {
        this.opcionSinoByEsBloqueada = opcionSinoByEsBloqueada;
        this.statusDocumento = statusDocumento;
        this.opcionSinoByEsPagada = opcionSinoByEsPagada;
        this.organizacion = organizacion;
        this.numeroDocumento = numeroDocumento;
        this.numeroFacturaProveedor = numeroFacturaProveedor;
        this.montoSubtotal = montoSubtotal;
        this.montoExento = montoExento;
        this.montoTotal = montoTotal;
    }
    public Compras(OpcionSino opcionSinoByEsCargadoInventario, OpcionSino opcionSinoByEsBloqueada, StatusDocumento statusDocumento, Almacen almacen, OpcionSino opcionSinoByEsPagada, Organizacion organizacion, String numeroDocumento, String numeroFacturaProveedor, String numeroControlFacturaProveedor, LocalDateTime fechaElaboracionFactura, LocalDateTime fechaVencimientoFactura, String codigoProveedor, String rifProveedor, String nombreProveedor, String telefonoFijoProveedor, String direccionProveedor, String numeroComprobanteRetencion, LocalDateTime fechaComprobanteRetencion, String numeroPlanillaImportacion, String numeroExpedienteImportacion, BigDecimal montoSubtotal, BigDecimal montoExento, BigDecimal montoGravable1, Float porcentajeIva1, BigDecimal montoIva1, BigDecimal montoGravable2, Float porcentajeIva2, BigDecimal montoIva2, BigDecimal montoGravable3, Float porcentajeIva3, BigDecimal montoIva3, BigDecimal montoGravable4, Float porcentajeIva4, BigDecimal montoIva4, BigDecimal montoGravable5, Float porcentajeIva5, BigDecimal montoIva5, BigDecimal montoTotal, Float descuento, String responsableCompras, String usuarioCreacion, LocalDateTime fechaCreacion, String usuarioModificacion, LocalDateTime fechaModificacion, Set<RenglonCompras> renglonComprases, Set<ComprasFormaPago> comprasFormaPagos) {
       this.opcionSinoByEsCargadoInventario = opcionSinoByEsCargadoInventario;
       this.opcionSinoByEsBloqueada = opcionSinoByEsBloqueada;
       this.statusDocumento = statusDocumento;
       this.almacen = almacen;
       this.opcionSinoByEsPagada = opcionSinoByEsPagada;
       this.organizacion = organizacion;
       this.numeroDocumento = numeroDocumento;
       this.numeroFacturaProveedor = numeroFacturaProveedor;
       this.numeroControlFacturaProveedor = numeroControlFacturaProveedor;
       this.fechaElaboracionFactura = fechaElaboracionFactura;
       this.fechaVencimientoFactura = fechaVencimientoFactura;
       this.codigoProveedor = codigoProveedor;
       this.rifProveedor = rifProveedor;
       this.nombreProveedor = nombreProveedor;
       this.telefonoFijoProveedor = telefonoFijoProveedor;
       this.direccionProveedor = direccionProveedor;
       this.numeroComprobanteRetencion = numeroComprobanteRetencion;
       this.fechaComprobanteRetencion = fechaComprobanteRetencion;
       this.numeroPlanillaImportacion = numeroPlanillaImportacion;
       this.numeroExpedienteImportacion = numeroExpedienteImportacion;
       this.montoSubtotal = montoSubtotal;
       this.montoExento = montoExento;
       this.montoGravable1 = montoGravable1;
       this.porcentajeIva1 = porcentajeIva1;
       this.montoIva1 = montoIva1;
       this.montoGravable2 = montoGravable2;
       this.porcentajeIva2 = porcentajeIva2;
       this.montoIva2 = montoIva2;
       this.montoGravable3 = montoGravable3;
       this.porcentajeIva3 = porcentajeIva3;
       this.montoIva3 = montoIva3;
       this.montoGravable4 = montoGravable4;
       this.porcentajeIva4 = porcentajeIva4;
       this.montoIva4 = montoIva4;
       this.montoGravable5 = montoGravable5;
       this.porcentajeIva5 = porcentajeIva5;
       this.montoIva5 = montoIva5;
       this.montoTotal = montoTotal;
       this.descuento = descuento;
       this.responsableCompras = responsableCompras;
       this.usuarioCreacion = usuarioCreacion;
       this.fechaCreacion = fechaCreacion;
       this.usuarioModificacion = usuarioModificacion;
       this.fechaModificacion = fechaModificacion;
       this.renglonComprases = renglonComprases;
       this.comprasFormaPagos = comprasFormaPagos;
    }
   
  @GenericGenerator(name = "compras_seq_gen", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "compras_id_seq"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            })
  @GeneratedValue(generator = "compras_seq_gen")
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
    @JoinColumn(name="es_cargado_inventario")
    public OpcionSino getOpcionSinoByEsCargadoInventario() {
        return this.opcionSinoByEsCargadoInventario;
    }
    
    public void setOpcionSinoByEsCargadoInventario(OpcionSino opcionSinoByEsCargadoInventario) {
        this.opcionSinoByEsCargadoInventario = opcionSinoByEsCargadoInventario;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="es_bloqueada", nullable=false)
    public OpcionSino getOpcionSinoByEsBloqueada() {
        return this.opcionSinoByEsBloqueada;
    }
    
    public void setOpcionSinoByEsBloqueada(OpcionSino opcionSinoByEsBloqueada) {
        this.opcionSinoByEsBloqueada = opcionSinoByEsBloqueada;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_status_documento", nullable=false)
    public StatusDocumento getStatusDocumento() {
        return this.statusDocumento;
    }
    
    public void setStatusDocumento(StatusDocumento statusDocumento) {
        this.statusDocumento = statusDocumento;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_almacen")
    public Almacen getAlmacen() {
        return this.almacen;
    }
    
    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="es_pagada", nullable=false)
    public OpcionSino getOpcionSinoByEsPagada() {
        return this.opcionSinoByEsPagada;
    }
    
    public void setOpcionSinoByEsPagada(OpcionSino opcionSinoByEsPagada) {
        this.opcionSinoByEsPagada = opcionSinoByEsPagada;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_organizacion", nullable=false)
    public Organizacion getOrganizacion() {
        return this.organizacion;
    }
    
    public void setOrganizacion(Organizacion organizacion) {
        this.organizacion = organizacion;
    }
    
    @Column(name="numero_documento", nullable=false, length=16)
    public String getNumeroDocumento() {
        return this.numeroDocumento;
    }
    
    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
    
    @Column(name="numero_factura_proveedor", nullable=false, length=64)
    public String getNumeroFacturaProveedor() {
        return this.numeroFacturaProveedor;
    }
    
    public void setNumeroFacturaProveedor(String numeroFacturaProveedor) {
        this.numeroFacturaProveedor = numeroFacturaProveedor;
    }
    
    @Column(name="numero_control_factura_proveedor", length=64)
    public String getNumeroControlFacturaProveedor() {
        return this.numeroControlFacturaProveedor;
    }
    
    public void setNumeroControlFacturaProveedor(String numeroControlFacturaProveedor) {
        this.numeroControlFacturaProveedor = numeroControlFacturaProveedor;
    }
    
    @Column(name="fecha_elaboracion_factura", length=29)
    public LocalDateTime getFechaElaboracionFactura() {
        return this.fechaElaboracionFactura;
    }
    
    public void setFechaElaboracionFactura(LocalDateTime fechaElaboracionFactura) {
        this.fechaElaboracionFactura = fechaElaboracionFactura;
    }
    
    @Column(name="fecha_vencimiento_factura", length=29)
    public LocalDateTime getFechaVencimientoFactura() {
        return this.fechaVencimientoFactura;
    }
    
    public void setFechaVencimientoFactura(LocalDateTime fechaVencimientoFactura) {
        this.fechaVencimientoFactura = fechaVencimientoFactura;
    }
    
    @Column(name="codigo_proveedor", length=16)
    public String getCodigoProveedor() {
        return this.codigoProveedor;
    }
    
    public void setCodigoProveedor(String codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
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
    
    @Column(name="numero_comprobante_retencion", length=64)
    public String getNumeroComprobanteRetencion() {
        return this.numeroComprobanteRetencion;
    }
    
    public void setNumeroComprobanteRetencion(String numeroComprobanteRetencion) {
        this.numeroComprobanteRetencion = numeroComprobanteRetencion;
    }
    
    @Column(name="fecha_comprobante_retencion", length=29)
    public LocalDateTime getFechaComprobanteRetencion() {
        return this.fechaComprobanteRetencion;
    }
    
    public void setFechaComprobanteRetencion(LocalDateTime fechaComprobanteRetencion) {
        this.fechaComprobanteRetencion = fechaComprobanteRetencion;
    }
    
    @Column(name="numero_planilla_importacion", length=64)
    public String getNumeroPlanillaImportacion() {
        return this.numeroPlanillaImportacion;
    }
    
    public void setNumeroPlanillaImportacion(String numeroPlanillaImportacion) {
        this.numeroPlanillaImportacion = numeroPlanillaImportacion;
    }
    
    @Column(name="numero_expediente_importacion", length=64)
    public String getNumeroExpedienteImportacion() {
        return this.numeroExpedienteImportacion;
    }
    
    public void setNumeroExpedienteImportacion(String numeroExpedienteImportacion) {
        this.numeroExpedienteImportacion = numeroExpedienteImportacion;
    }
    
    @Column(name="monto_subtotal", nullable=false, precision=22)
    public BigDecimal getMontoSubtotal() {
        return this.montoSubtotal;
    }
    
    public void setMontoSubtotal(BigDecimal montoSubtotal) {
        this.montoSubtotal = montoSubtotal;
    }
    
    @Column(name="monto_exento", nullable=false, precision=22)
    public BigDecimal getMontoExento() {
        return this.montoExento;
    }
    
    public void setMontoExento(BigDecimal montoExento) {
        this.montoExento = montoExento;
    }
    
    @Column(name="monto_gravable1", precision=22)
    public BigDecimal getMontoGravable1() {
        return this.montoGravable1;
    }
    
    public void setMontoGravable1(BigDecimal montoGravable1) {
        this.montoGravable1 = montoGravable1;
    }
    
    @Column(name="porcentaje_iva1", precision=8, scale=8)
    public Float getPorcentajeIva1() {
        return this.porcentajeIva1;
    }
    
    public void setPorcentajeIva1(Float porcentajeIva1) {
        this.porcentajeIva1 = porcentajeIva1;
    }
    
    @Column(name="monto_iva1", precision=22)
    public BigDecimal getMontoIva1() {
        return this.montoIva1;
    }
    
    public void setMontoIva1(BigDecimal montoIva1) {
        this.montoIva1 = montoIva1;
    }
    
    @Column(name="monto_gravable2", precision=22)
    public BigDecimal getMontoGravable2() {
        return this.montoGravable2;
    }
    
    public void setMontoGravable2(BigDecimal montoGravable2) {
        this.montoGravable2 = montoGravable2;
    }
    
    @Column(name="porcentaje_iva2", precision=8, scale=8)
    public Float getPorcentajeIva2() {
        return this.porcentajeIva2;
    }
    
    public void setPorcentajeIva2(Float porcentajeIva2) {
        this.porcentajeIva2 = porcentajeIva2;
    }
    
    @Column(name="monto_iva2", precision=22)
    public BigDecimal getMontoIva2() {
        return this.montoIva2;
    }
    
    public void setMontoIva2(BigDecimal montoIva2) {
        this.montoIva2 = montoIva2;
    }
    
    @Column(name="monto_gravable3", precision=22)
    public BigDecimal getMontoGravable3() {
        return this.montoGravable3;
    }
    
    public void setMontoGravable3(BigDecimal montoGravable3) {
        this.montoGravable3 = montoGravable3;
    }
    
    @Column(name="porcentaje_iva3", precision=8, scale=8)
    public Float getPorcentajeIva3() {
        return this.porcentajeIva3;
    }
    
    public void setPorcentajeIva3(Float porcentajeIva3) {
        this.porcentajeIva3 = porcentajeIva3;
    }
    
    @Column(name="monto_iva3", precision=22)
    public BigDecimal getMontoIva3() {
        return this.montoIva3;
    }
    
    public void setMontoIva3(BigDecimal montoIva3) {
        this.montoIva3 = montoIva3;
    }
    
    @Column(name="monto_gravable4", precision=22)
    public BigDecimal getMontoGravable4() {
        return this.montoGravable4;
    }
    
    public void setMontoGravable4(BigDecimal montoGravable4) {
        this.montoGravable4 = montoGravable4;
    }
    
    @Column(name="porcentaje_iva4", precision=8, scale=8)
    public Float getPorcentajeIva4() {
        return this.porcentajeIva4;
    }
    
    public void setPorcentajeIva4(Float porcentajeIva4) {
        this.porcentajeIva4 = porcentajeIva4;
    }
    
    @Column(name="monto_iva4", precision=22)
    public BigDecimal getMontoIva4() {
        return this.montoIva4;
    }
    
    public void setMontoIva4(BigDecimal montoIva4) {
        this.montoIva4 = montoIva4;
    }
    
    @Column(name="monto_gravable5", precision=22)
    public BigDecimal getMontoGravable5() {
        return this.montoGravable5;
    }
    
    public void setMontoGravable5(BigDecimal montoGravable5) {
        this.montoGravable5 = montoGravable5;
    }
    
    @Column(name="porcentaje_iva5", precision=8, scale=8)
    public Float getPorcentajeIva5() {
        return this.porcentajeIva5;
    }
    
    public void setPorcentajeIva5(Float porcentajeIva5) {
        this.porcentajeIva5 = porcentajeIva5;
    }
    
    @Column(name="monto_iva5", precision=22)
    public BigDecimal getMontoIva5() {
        return this.montoIva5;
    }
    
    public void setMontoIva5(BigDecimal montoIva5) {
        this.montoIva5 = montoIva5;
    }
    
    @Column(name="monto_total", nullable=false, precision=22)
    public BigDecimal getMontoTotal() {
        return this.montoTotal;
    }
    
    public void setMontoTotal(BigDecimal montoTotal) {
        this.montoTotal = montoTotal;
    }
    
    @Column(name="descuento", precision=8, scale=8)
    public Float getDescuento() {
        return this.descuento;
    }
    
    public void setDescuento(Float descuento) {
        this.descuento = descuento;
    }
    
    @Column(name="responsable_compras", length=64)
    public String getResponsableCompras() {
        return this.responsableCompras;
    }
    
    public void setResponsableCompras(String responsableCompras) {
        this.responsableCompras = responsableCompras;
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
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="compras")
    public Set<RenglonCompras> getRenglonComprases() {
        return this.renglonComprases;
    }
    
    public void setRenglonComprases(Set<RenglonCompras> renglonComprases) {
        this.renglonComprases = renglonComprases;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="compras")
    public Set<ComprasFormaPago> getComprasFormaPagos() {
        return this.comprasFormaPagos;
    }
    
    public void setComprasFormaPagos(Set<ComprasFormaPago> comprasFormaPagos) {
        this.comprasFormaPagos = comprasFormaPagos;
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
      buffer.append("opcionSinoByEsCargadoInventario").append("='").append(getOpcionSinoByEsCargadoInventario()).append("' ");			
      buffer.append("opcionSinoByEsBloqueada").append("='").append(getOpcionSinoByEsBloqueada()).append("' ");			
      buffer.append("statusDocumento").append("='").append(getStatusDocumento()).append("' ");			
      buffer.append("almacen").append("='").append(getAlmacen()).append("' ");			
      buffer.append("opcionSinoByEsPagada").append("='").append(getOpcionSinoByEsPagada()).append("' ");			
      buffer.append("organizacion").append("='").append(getOrganizacion()).append("' ");			
      buffer.append("numeroDocumento").append("='").append(getNumeroDocumento()).append("' ");			
      buffer.append("numeroFacturaProveedor").append("='").append(getNumeroFacturaProveedor()).append("' ");			
      buffer.append("numeroControlFacturaProveedor").append("='").append(getNumeroControlFacturaProveedor()).append("' ");			
      buffer.append("fechaElaboracionFactura").append("='").append(getFechaElaboracionFactura()).append("' ");			
      buffer.append("fechaVencimientoFactura").append("='").append(getFechaVencimientoFactura()).append("' ");			
      buffer.append("codigoProveedor").append("='").append(getCodigoProveedor()).append("' ");			
      buffer.append("rifProveedor").append("='").append(getRifProveedor()).append("' ");			
      buffer.append("nombreProveedor").append("='").append(getNombreProveedor()).append("' ");			
      buffer.append("telefonoFijoProveedor").append("='").append(getTelefonoFijoProveedor()).append("' ");			
      buffer.append("direccionProveedor").append("='").append(getDireccionProveedor()).append("' ");			
      buffer.append("numeroComprobanteRetencion").append("='").append(getNumeroComprobanteRetencion()).append("' ");			
      buffer.append("fechaComprobanteRetencion").append("='").append(getFechaComprobanteRetencion()).append("' ");			
      buffer.append("numeroPlanillaImportacion").append("='").append(getNumeroPlanillaImportacion()).append("' ");			
      buffer.append("numeroExpedienteImportacion").append("='").append(getNumeroExpedienteImportacion()).append("' ");			
      buffer.append("montoSubtotal").append("='").append(getMontoSubtotal()).append("' ");			
      buffer.append("montoExento").append("='").append(getMontoExento()).append("' ");			
      buffer.append("montoGravable1").append("='").append(getMontoGravable1()).append("' ");			
      buffer.append("porcentajeIva1").append("='").append(getPorcentajeIva1()).append("' ");			
      buffer.append("montoIva1").append("='").append(getMontoIva1()).append("' ");			
      buffer.append("montoGravable2").append("='").append(getMontoGravable2()).append("' ");			
      buffer.append("porcentajeIva2").append("='").append(getPorcentajeIva2()).append("' ");			
      buffer.append("montoIva2").append("='").append(getMontoIva2()).append("' ");			
      buffer.append("montoGravable3").append("='").append(getMontoGravable3()).append("' ");			
      buffer.append("porcentajeIva3").append("='").append(getPorcentajeIva3()).append("' ");			
      buffer.append("montoIva3").append("='").append(getMontoIva3()).append("' ");			
      buffer.append("montoGravable4").append("='").append(getMontoGravable4()).append("' ");			
      buffer.append("porcentajeIva4").append("='").append(getPorcentajeIva4()).append("' ");			
      buffer.append("montoIva4").append("='").append(getMontoIva4()).append("' ");			
      buffer.append("montoGravable5").append("='").append(getMontoGravable5()).append("' ");			
      buffer.append("porcentajeIva5").append("='").append(getPorcentajeIva5()).append("' ");			
      buffer.append("montoIva5").append("='").append(getMontoIva5()).append("' ");			
      buffer.append("montoTotal").append("='").append(getMontoTotal()).append("' ");			
      buffer.append("descuento").append("='").append(getDescuento()).append("' ");			
      buffer.append("responsableCompras").append("='").append(getResponsableCompras()).append("' ");			
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
		 	
		 if (!(other instanceof Compras)) 
		 	return false;
		 	
		 Compras castOther = ( Compras ) other; 
         
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
		if(this.opcionSinoByEsCargadoInventario != null &&
			(opcionSinoByEsCargadoInventario.getId() == null || this.opcionSinoByEsCargadoInventario.getId().longValue() == 0)) {
			opcionSinoByEsCargadoInventario = null;
		}
		if(this.opcionSinoByEsBloqueada != null &&
			(opcionSinoByEsBloqueada.getId() == null || this.opcionSinoByEsBloqueada.getId().longValue() == 0)) {
			opcionSinoByEsBloqueada = null;
		}
		if(this.statusDocumento != null &&
			(statusDocumento.getId() == null || this.statusDocumento.getId().longValue() == 0)) {
			statusDocumento = null;
		}
		if(this.almacen != null &&
			(almacen.getId() == null || this.almacen.getId().longValue() == 0)) {
			almacen = null;
		}
		if(this.opcionSinoByEsPagada != null &&
			(opcionSinoByEsPagada.getId() == null || this.opcionSinoByEsPagada.getId().longValue() == 0)) {
			opcionSinoByEsPagada = null;
		}
		if(this.organizacion != null &&
			(organizacion.getId() == null || this.organizacion.getId().longValue() == 0)) {
			organizacion = null;
		}
    }
    
    public void fillPOJO() {
		if(this.opcionSinoByEsCargadoInventario == null) {
			opcionSinoByEsCargadoInventario = new OpcionSino();
		}
		if(this.opcionSinoByEsBloqueada == null) {
			opcionSinoByEsBloqueada = new OpcionSino();
		}
		if(this.statusDocumento == null) {
			statusDocumento = new StatusDocumento();
		}
		if(this.almacen == null) {
			almacen = new Almacen();
		}
		if(this.opcionSinoByEsPagada == null) {
			opcionSinoByEsPagada = new OpcionSino();
		}
		if(this.organizacion == null) {
			organizacion = new Organizacion();
		}
    }
    
    public Compras createPOJO() {
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

