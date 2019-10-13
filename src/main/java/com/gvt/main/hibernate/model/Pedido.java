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
 * Pedido generated by hbm2java
 */
@Entity
@EntityListeners({ AuditingEntityListener.class })
@Table(name="pedido"
    ,schema="public"
    , uniqueConstraints = @UniqueConstraint(columnNames={"codigo_pedido", "id_organizacion"}) 
)
public class Pedido  implements Versionable,Seleccionable,Identificable,Fillable,Cleanable,Auditable,java.io.Serializable {


 	
 	private Long id;
 	
 	private long version;
 	
 	private OpcionSino opcionSinoByEsImpresa;
 	
 	private OpcionSino opcionSinoByEsDespachado;
 	
 	private TipoDocumento tipoDocumento;
 	
 	private OpcionSino opcionSinoByEsPote;
 	
 	private StatusDocumento statusDocumento;
 	
 	private OpcionSino opcionSinoByEsLiberado;
 	
 	private Organizacion organizacion;
 	
 	private String codigoPedido;
 	
 	private Date fechaElaboracionPedido;
 	
 	private BigDecimal montoSubtotalPedido;
 	
 	private BigDecimal montoExentoPedido;
 	
 	private BigDecimal montoGravablePedido1;
 	
 	private Float porcentajeIvaPedido1;
 	
 	private BigDecimal montoIvaPedido1;
 	
 	private BigDecimal montoGravablePedido2;
 	
 	private Float porcentajeIvaPedido2;
 	
 	private BigDecimal montoIvaPedido2;
 	
 	private BigDecimal montoGravablePedido3;
 	
 	private Float porcentajeIvaPedido3;
 	
 	private BigDecimal montoIvaPedido3;
 	
 	private BigDecimal montoGravablePedido4;
 	
 	private Float porcentajeIvaPedido4;
 	
 	private BigDecimal montoIvaPedido4;
 	
 	private BigDecimal montoGravablePedido5;
 	
 	private Float porcentajeIvaPedido5;
 	
 	private BigDecimal montoIvaPedido5;
 	
 	private BigDecimal montoTotalPedido;
 	
 	private String codigoUbicacionGeograficaEmision;
 	
 	private String nombreUbicacionGeograficaEmision;
 	
 	private String observaciones;
 	
 	private String codigoPersona;
 	
 	private String cedulaCliente;
 	
 	private String nombreCliente;
 	
 	private String apellidoCliente;
 	
 	private String telefonoCliente;
 	
 	private String direccionCliente;
 	
 	private String procedimientoRealizar;
 	@CreatedBy
 	private String usuarioCreacion;
 	@CreatedDate
 	private Date fechaCreacion;
 	@LastModifiedBy
 	private String usuarioModificacion;
 	@LastModifiedDate
 	private Date fechaModificacion;
 	
 	private Set<Documento> documentos = new HashSet<Documento>(0);
 	
 	private Set<RenglonPedido> renglonPedidos = new HashSet<RenglonPedido>(0);
 	
 	private Set<CartaAval> cartaAvals = new HashSet<CartaAval>(0);

    public Pedido() {
    	// default constructor
    }

	
    public Pedido(OpcionSino opcionSinoByEsImpresa, TipoDocumento tipoDocumento, OpcionSino opcionSinoByEsPote, StatusDocumento statusDocumento, String codigoPedido, Date fechaElaboracionPedido, BigDecimal montoSubtotalPedido, BigDecimal montoExentoPedido, BigDecimal montoTotalPedido, String codigoUbicacionGeograficaEmision, String nombreUbicacionGeograficaEmision, String codigoPersona, String cedulaCliente, String nombreCliente, String telefonoCliente, String direccionCliente) {
        this.opcionSinoByEsImpresa = opcionSinoByEsImpresa;
        this.tipoDocumento = tipoDocumento;
        this.opcionSinoByEsPote = opcionSinoByEsPote;
        this.statusDocumento = statusDocumento;
        this.codigoPedido = codigoPedido;
        this.fechaElaboracionPedido = fechaElaboracionPedido;
        this.montoSubtotalPedido = montoSubtotalPedido;
        this.montoExentoPedido = montoExentoPedido;
        this.montoTotalPedido = montoTotalPedido;
        this.codigoUbicacionGeograficaEmision = codigoUbicacionGeograficaEmision;
        this.nombreUbicacionGeograficaEmision = nombreUbicacionGeograficaEmision;
        this.codigoPersona = codigoPersona;
        this.cedulaCliente = cedulaCliente;
        this.nombreCliente = nombreCliente;
        this.telefonoCliente = telefonoCliente;
        this.direccionCliente = direccionCliente;
    }
    public Pedido(OpcionSino opcionSinoByEsImpresa, OpcionSino opcionSinoByEsDespachado, TipoDocumento tipoDocumento, OpcionSino opcionSinoByEsPote, StatusDocumento statusDocumento, OpcionSino opcionSinoByEsLiberado, Organizacion organizacion, String codigoPedido, Date fechaElaboracionPedido, BigDecimal montoSubtotalPedido, BigDecimal montoExentoPedido, BigDecimal montoGravablePedido1, Float porcentajeIvaPedido1, BigDecimal montoIvaPedido1, BigDecimal montoGravablePedido2, Float porcentajeIvaPedido2, BigDecimal montoIvaPedido2, BigDecimal montoGravablePedido3, Float porcentajeIvaPedido3, BigDecimal montoIvaPedido3, BigDecimal montoGravablePedido4, Float porcentajeIvaPedido4, BigDecimal montoIvaPedido4, BigDecimal montoGravablePedido5, Float porcentajeIvaPedido5, BigDecimal montoIvaPedido5, BigDecimal montoTotalPedido, String codigoUbicacionGeograficaEmision, String nombreUbicacionGeograficaEmision, String observaciones, String codigoPersona, String cedulaCliente, String nombreCliente, String apellidoCliente, String telefonoCliente, String direccionCliente, String procedimientoRealizar, String usuarioCreacion, Date fechaCreacion, String usuarioModificacion, Date fechaModificacion, Set<Documento> documentos, Set<RenglonPedido> renglonPedidos, Set<CartaAval> cartaAvals) {
       this.opcionSinoByEsImpresa = opcionSinoByEsImpresa;
       this.opcionSinoByEsDespachado = opcionSinoByEsDespachado;
       this.tipoDocumento = tipoDocumento;
       this.opcionSinoByEsPote = opcionSinoByEsPote;
       this.statusDocumento = statusDocumento;
       this.opcionSinoByEsLiberado = opcionSinoByEsLiberado;
       this.organizacion = organizacion;
       this.codigoPedido = codigoPedido;
       this.fechaElaboracionPedido = fechaElaboracionPedido;
       this.montoSubtotalPedido = montoSubtotalPedido;
       this.montoExentoPedido = montoExentoPedido;
       this.montoGravablePedido1 = montoGravablePedido1;
       this.porcentajeIvaPedido1 = porcentajeIvaPedido1;
       this.montoIvaPedido1 = montoIvaPedido1;
       this.montoGravablePedido2 = montoGravablePedido2;
       this.porcentajeIvaPedido2 = porcentajeIvaPedido2;
       this.montoIvaPedido2 = montoIvaPedido2;
       this.montoGravablePedido3 = montoGravablePedido3;
       this.porcentajeIvaPedido3 = porcentajeIvaPedido3;
       this.montoIvaPedido3 = montoIvaPedido3;
       this.montoGravablePedido4 = montoGravablePedido4;
       this.porcentajeIvaPedido4 = porcentajeIvaPedido4;
       this.montoIvaPedido4 = montoIvaPedido4;
       this.montoGravablePedido5 = montoGravablePedido5;
       this.porcentajeIvaPedido5 = porcentajeIvaPedido5;
       this.montoIvaPedido5 = montoIvaPedido5;
       this.montoTotalPedido = montoTotalPedido;
       this.codigoUbicacionGeograficaEmision = codigoUbicacionGeograficaEmision;
       this.nombreUbicacionGeograficaEmision = nombreUbicacionGeograficaEmision;
       this.observaciones = observaciones;
       this.codigoPersona = codigoPersona;
       this.cedulaCliente = cedulaCliente;
       this.nombreCliente = nombreCliente;
       this.apellidoCliente = apellidoCliente;
       this.telefonoCliente = telefonoCliente;
       this.direccionCliente = direccionCliente;
       this.procedimientoRealizar = procedimientoRealizar;
       this.usuarioCreacion = usuarioCreacion;
       this.fechaCreacion = fechaCreacion;
       this.usuarioModificacion = usuarioModificacion;
       this.fechaModificacion = fechaModificacion;
       this.documentos = documentos;
       this.renglonPedidos = renglonPedidos;
       this.cartaAvals = cartaAvals;
    }
   
  @GenericGenerator(name = "pedido_seq_gen", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "pedido_id_seq"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            })
  @GeneratedValue(generator = "pedido_seq_gen")
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
    @JoinColumn(name="es_impresa", nullable=false)
    public OpcionSino getOpcionSinoByEsImpresa() {
        return this.opcionSinoByEsImpresa;
    }
    
    public void setOpcionSinoByEsImpresa(OpcionSino opcionSinoByEsImpresa) {
        this.opcionSinoByEsImpresa = opcionSinoByEsImpresa;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="es_despachado")
    public OpcionSino getOpcionSinoByEsDespachado() {
        return this.opcionSinoByEsDespachado;
    }
    
    public void setOpcionSinoByEsDespachado(OpcionSino opcionSinoByEsDespachado) {
        this.opcionSinoByEsDespachado = opcionSinoByEsDespachado;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_tipo_documento", nullable=false)
    public TipoDocumento getTipoDocumento() {
        return this.tipoDocumento;
    }
    
    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="es_pote", nullable=false)
    public OpcionSino getOpcionSinoByEsPote() {
        return this.opcionSinoByEsPote;
    }
    
    public void setOpcionSinoByEsPote(OpcionSino opcionSinoByEsPote) {
        this.opcionSinoByEsPote = opcionSinoByEsPote;
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
    @JoinColumn(name="es_liberado")
    public OpcionSino getOpcionSinoByEsLiberado() {
        return this.opcionSinoByEsLiberado;
    }
    
    public void setOpcionSinoByEsLiberado(OpcionSino opcionSinoByEsLiberado) {
        this.opcionSinoByEsLiberado = opcionSinoByEsLiberado;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_organizacion")
    public Organizacion getOrganizacion() {
        return this.organizacion;
    }
    
    public void setOrganizacion(Organizacion organizacion) {
        this.organizacion = organizacion;
    }
    
    @Column(name="codigo_pedido", nullable=false, length=16)
    public String getCodigoPedido() {
        return this.codigoPedido;
    }
    
    public void setCodigoPedido(String codigoPedido) {
        this.codigoPedido = codigoPedido;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="fecha_elaboracion_pedido", nullable=false, length=29)
    public Date getFechaElaboracionPedido() {
        return this.fechaElaboracionPedido;
    }
    
    public void setFechaElaboracionPedido(Date fechaElaboracionPedido) {
        this.fechaElaboracionPedido = fechaElaboracionPedido;
    }
    
    @Column(name="monto_subtotal_pedido", nullable=false, precision=22)
    public BigDecimal getMontoSubtotalPedido() {
        return this.montoSubtotalPedido;
    }
    
    public void setMontoSubtotalPedido(BigDecimal montoSubtotalPedido) {
        this.montoSubtotalPedido = montoSubtotalPedido;
    }
    
    @Column(name="monto_exento_pedido", nullable=false, precision=22)
    public BigDecimal getMontoExentoPedido() {
        return this.montoExentoPedido;
    }
    
    public void setMontoExentoPedido(BigDecimal montoExentoPedido) {
        this.montoExentoPedido = montoExentoPedido;
    }
    
    @Column(name="monto_gravable_pedido1", precision=22)
    public BigDecimal getMontoGravablePedido1() {
        return this.montoGravablePedido1;
    }
    
    public void setMontoGravablePedido1(BigDecimal montoGravablePedido1) {
        this.montoGravablePedido1 = montoGravablePedido1;
    }
    
    @Column(name="porcentaje_iva_pedido1", precision=8, scale=8)
    public Float getPorcentajeIvaPedido1() {
        return this.porcentajeIvaPedido1;
    }
    
    public void setPorcentajeIvaPedido1(Float porcentajeIvaPedido1) {
        this.porcentajeIvaPedido1 = porcentajeIvaPedido1;
    }
    
    @Column(name="monto_iva_pedido1", precision=22)
    public BigDecimal getMontoIvaPedido1() {
        return this.montoIvaPedido1;
    }
    
    public void setMontoIvaPedido1(BigDecimal montoIvaPedido1) {
        this.montoIvaPedido1 = montoIvaPedido1;
    }
    
    @Column(name="monto_gravable_pedido2", precision=22)
    public BigDecimal getMontoGravablePedido2() {
        return this.montoGravablePedido2;
    }
    
    public void setMontoGravablePedido2(BigDecimal montoGravablePedido2) {
        this.montoGravablePedido2 = montoGravablePedido2;
    }
    
    @Column(name="porcentaje_iva_pedido2", precision=8, scale=8)
    public Float getPorcentajeIvaPedido2() {
        return this.porcentajeIvaPedido2;
    }
    
    public void setPorcentajeIvaPedido2(Float porcentajeIvaPedido2) {
        this.porcentajeIvaPedido2 = porcentajeIvaPedido2;
    }
    
    @Column(name="monto_iva_pedido2", precision=22)
    public BigDecimal getMontoIvaPedido2() {
        return this.montoIvaPedido2;
    }
    
    public void setMontoIvaPedido2(BigDecimal montoIvaPedido2) {
        this.montoIvaPedido2 = montoIvaPedido2;
    }
    
    @Column(name="monto_gravable_pedido3", precision=22)
    public BigDecimal getMontoGravablePedido3() {
        return this.montoGravablePedido3;
    }
    
    public void setMontoGravablePedido3(BigDecimal montoGravablePedido3) {
        this.montoGravablePedido3 = montoGravablePedido3;
    }
    
    @Column(name="porcentaje_iva_pedido3", precision=8, scale=8)
    public Float getPorcentajeIvaPedido3() {
        return this.porcentajeIvaPedido3;
    }
    
    public void setPorcentajeIvaPedido3(Float porcentajeIvaPedido3) {
        this.porcentajeIvaPedido3 = porcentajeIvaPedido3;
    }
    
    @Column(name="monto_iva_pedido3", precision=22)
    public BigDecimal getMontoIvaPedido3() {
        return this.montoIvaPedido3;
    }
    
    public void setMontoIvaPedido3(BigDecimal montoIvaPedido3) {
        this.montoIvaPedido3 = montoIvaPedido3;
    }
    
    @Column(name="monto_gravable_pedido4", precision=22)
    public BigDecimal getMontoGravablePedido4() {
        return this.montoGravablePedido4;
    }
    
    public void setMontoGravablePedido4(BigDecimal montoGravablePedido4) {
        this.montoGravablePedido4 = montoGravablePedido4;
    }
    
    @Column(name="porcentaje_iva_pedido4", precision=8, scale=8)
    public Float getPorcentajeIvaPedido4() {
        return this.porcentajeIvaPedido4;
    }
    
    public void setPorcentajeIvaPedido4(Float porcentajeIvaPedido4) {
        this.porcentajeIvaPedido4 = porcentajeIvaPedido4;
    }
    
    @Column(name="monto_iva_pedido4", precision=22)
    public BigDecimal getMontoIvaPedido4() {
        return this.montoIvaPedido4;
    }
    
    public void setMontoIvaPedido4(BigDecimal montoIvaPedido4) {
        this.montoIvaPedido4 = montoIvaPedido4;
    }
    
    @Column(name="monto_gravable_pedido5", precision=22)
    public BigDecimal getMontoGravablePedido5() {
        return this.montoGravablePedido5;
    }
    
    public void setMontoGravablePedido5(BigDecimal montoGravablePedido5) {
        this.montoGravablePedido5 = montoGravablePedido5;
    }
    
    @Column(name="porcentaje_iva_pedido5", precision=8, scale=8)
    public Float getPorcentajeIvaPedido5() {
        return this.porcentajeIvaPedido5;
    }
    
    public void setPorcentajeIvaPedido5(Float porcentajeIvaPedido5) {
        this.porcentajeIvaPedido5 = porcentajeIvaPedido5;
    }
    
    @Column(name="monto_iva_pedido5", precision=22)
    public BigDecimal getMontoIvaPedido5() {
        return this.montoIvaPedido5;
    }
    
    public void setMontoIvaPedido5(BigDecimal montoIvaPedido5) {
        this.montoIvaPedido5 = montoIvaPedido5;
    }
    
    @Column(name="monto_total_pedido", nullable=false, precision=22)
    public BigDecimal getMontoTotalPedido() {
        return this.montoTotalPedido;
    }
    
    public void setMontoTotalPedido(BigDecimal montoTotalPedido) {
        this.montoTotalPedido = montoTotalPedido;
    }
    
    @Column(name="codigo_ubicacion_geografica_emision", nullable=false, length=16)
    public String getCodigoUbicacionGeograficaEmision() {
        return this.codigoUbicacionGeograficaEmision;
    }
    
    public void setCodigoUbicacionGeograficaEmision(String codigoUbicacionGeograficaEmision) {
        this.codigoUbicacionGeograficaEmision = codigoUbicacionGeograficaEmision;
    }
    
    @Column(name="nombre_ubicacion_geografica_emision", nullable=false, length=64)
    public String getNombreUbicacionGeograficaEmision() {
        return this.nombreUbicacionGeograficaEmision;
    }
    
    public void setNombreUbicacionGeograficaEmision(String nombreUbicacionGeograficaEmision) {
        this.nombreUbicacionGeograficaEmision = nombreUbicacionGeograficaEmision;
    }
    
    @Column(name="observaciones")
    public String getObservaciones() {
        return this.observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    @Column(name="codigo_persona", nullable=false, length=16)
    public String getCodigoPersona() {
        return this.codigoPersona;
    }
    
    public void setCodigoPersona(String codigoPersona) {
        this.codigoPersona = codigoPersona;
    }
    
    @Column(name="cedula_cliente", nullable=false, length=64)
    public String getCedulaCliente() {
        return this.cedulaCliente;
    }
    
    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }
    
    @Column(name="nombre_cliente", nullable=false, length=64)
    public String getNombreCliente() {
        return this.nombreCliente;
    }
    
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    
    @Column(name="apellido_cliente", length=64)
    public String getApellidoCliente() {
        return this.apellidoCliente;
    }
    
    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }
    
    @Column(name="telefono_cliente", nullable=false, length=32)
    public String getTelefonoCliente() {
        return this.telefonoCliente;
    }
    
    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }
    
    @Column(name="direccion_cliente", nullable=false)
    public String getDireccionCliente() {
        return this.direccionCliente;
    }
    
    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }
    
    @Column(name="procedimiento_realizar")
    public String getProcedimientoRealizar() {
        return this.procedimientoRealizar;
    }
    
    public void setProcedimientoRealizar(String procedimientoRealizar) {
        this.procedimientoRealizar = procedimientoRealizar;
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
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="pedido")
    public Set<Documento> getDocumentos() {
        return this.documentos;
    }
    
    public void setDocumentos(Set<Documento> documentos) {
        this.documentos = documentos;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="pedido")
    public Set<RenglonPedido> getRenglonPedidos() {
        return this.renglonPedidos;
    }
    
    public void setRenglonPedidos(Set<RenglonPedido> renglonPedidos) {
        this.renglonPedidos = renglonPedidos;
    }
	@XmlTransient
	@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="pedido")
    public Set<CartaAval> getCartaAvals() {
        return this.cartaAvals;
    }
    
    public void setCartaAvals(Set<CartaAval> cartaAvals) {
        this.cartaAvals = cartaAvals;
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
      buffer.append("opcionSinoByEsImpresa").append("='").append(getOpcionSinoByEsImpresa()).append("' ");			
      buffer.append("opcionSinoByEsDespachado").append("='").append(getOpcionSinoByEsDespachado()).append("' ");			
      buffer.append("tipoDocumento").append("='").append(getTipoDocumento()).append("' ");			
      buffer.append("opcionSinoByEsPote").append("='").append(getOpcionSinoByEsPote()).append("' ");			
      buffer.append("statusDocumento").append("='").append(getStatusDocumento()).append("' ");			
      buffer.append("opcionSinoByEsLiberado").append("='").append(getOpcionSinoByEsLiberado()).append("' ");			
      buffer.append("organizacion").append("='").append(getOrganizacion()).append("' ");			
      buffer.append("codigoPedido").append("='").append(getCodigoPedido()).append("' ");			
      buffer.append("fechaElaboracionPedido").append("='").append(getFechaElaboracionPedido()).append("' ");			
      buffer.append("montoSubtotalPedido").append("='").append(getMontoSubtotalPedido()).append("' ");			
      buffer.append("montoExentoPedido").append("='").append(getMontoExentoPedido()).append("' ");			
      buffer.append("montoGravablePedido1").append("='").append(getMontoGravablePedido1()).append("' ");			
      buffer.append("porcentajeIvaPedido1").append("='").append(getPorcentajeIvaPedido1()).append("' ");			
      buffer.append("montoIvaPedido1").append("='").append(getMontoIvaPedido1()).append("' ");			
      buffer.append("montoGravablePedido2").append("='").append(getMontoGravablePedido2()).append("' ");			
      buffer.append("porcentajeIvaPedido2").append("='").append(getPorcentajeIvaPedido2()).append("' ");			
      buffer.append("montoIvaPedido2").append("='").append(getMontoIvaPedido2()).append("' ");			
      buffer.append("montoGravablePedido3").append("='").append(getMontoGravablePedido3()).append("' ");			
      buffer.append("porcentajeIvaPedido3").append("='").append(getPorcentajeIvaPedido3()).append("' ");			
      buffer.append("montoIvaPedido3").append("='").append(getMontoIvaPedido3()).append("' ");			
      buffer.append("montoGravablePedido4").append("='").append(getMontoGravablePedido4()).append("' ");			
      buffer.append("porcentajeIvaPedido4").append("='").append(getPorcentajeIvaPedido4()).append("' ");			
      buffer.append("montoIvaPedido4").append("='").append(getMontoIvaPedido4()).append("' ");			
      buffer.append("montoGravablePedido5").append("='").append(getMontoGravablePedido5()).append("' ");			
      buffer.append("porcentajeIvaPedido5").append("='").append(getPorcentajeIvaPedido5()).append("' ");			
      buffer.append("montoIvaPedido5").append("='").append(getMontoIvaPedido5()).append("' ");			
      buffer.append("montoTotalPedido").append("='").append(getMontoTotalPedido()).append("' ");			
      buffer.append("codigoUbicacionGeograficaEmision").append("='").append(getCodigoUbicacionGeograficaEmision()).append("' ");			
      buffer.append("nombreUbicacionGeograficaEmision").append("='").append(getNombreUbicacionGeograficaEmision()).append("' ");			
      buffer.append("observaciones").append("='").append(getObservaciones()).append("' ");			
      buffer.append("codigoPersona").append("='").append(getCodigoPersona()).append("' ");			
      buffer.append("cedulaCliente").append("='").append(getCedulaCliente()).append("' ");			
      buffer.append("nombreCliente").append("='").append(getNombreCliente()).append("' ");			
      buffer.append("apellidoCliente").append("='").append(getApellidoCliente()).append("' ");			
      buffer.append("telefonoCliente").append("='").append(getTelefonoCliente()).append("' ");			
      buffer.append("direccionCliente").append("='").append(getDireccionCliente()).append("' ");			
      buffer.append("procedimientoRealizar").append("='").append(getProcedimientoRealizar()).append("' ");			
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
		 	
		 if (!(other instanceof Pedido)) 
		 	return false;
		 	
		 Pedido castOther = ( Pedido ) other; 
         
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
		if(this.opcionSinoByEsImpresa != null &&
			(opcionSinoByEsImpresa.getId() == null || this.opcionSinoByEsImpresa.getId().longValue() == 0)) {
			opcionSinoByEsImpresa = null;
		}
		if(this.opcionSinoByEsDespachado != null &&
			(opcionSinoByEsDespachado.getId() == null || this.opcionSinoByEsDespachado.getId().longValue() == 0)) {
			opcionSinoByEsDespachado = null;
		}
		if(this.tipoDocumento != null &&
			(tipoDocumento.getId() == null || this.tipoDocumento.getId().longValue() == 0)) {
			tipoDocumento = null;
		}
		if(this.opcionSinoByEsPote != null &&
			(opcionSinoByEsPote.getId() == null || this.opcionSinoByEsPote.getId().longValue() == 0)) {
			opcionSinoByEsPote = null;
		}
		if(this.statusDocumento != null &&
			(statusDocumento.getId() == null || this.statusDocumento.getId().longValue() == 0)) {
			statusDocumento = null;
		}
		if(this.opcionSinoByEsLiberado != null &&
			(opcionSinoByEsLiberado.getId() == null || this.opcionSinoByEsLiberado.getId().longValue() == 0)) {
			opcionSinoByEsLiberado = null;
		}
		if(this.organizacion != null &&
			(organizacion.getId() == null || this.organizacion.getId().longValue() == 0)) {
			organizacion = null;
		}
    }
    
    public void fillPOJO() {
		if(this.opcionSinoByEsImpresa == null) {
			opcionSinoByEsImpresa = new OpcionSino();
		}
		if(this.opcionSinoByEsDespachado == null) {
			opcionSinoByEsDespachado = new OpcionSino();
		}
		if(this.tipoDocumento == null) {
			tipoDocumento = new TipoDocumento();
		}
		if(this.opcionSinoByEsPote == null) {
			opcionSinoByEsPote = new OpcionSino();
		}
		if(this.statusDocumento == null) {
			statusDocumento = new StatusDocumento();
		}
		if(this.opcionSinoByEsLiberado == null) {
			opcionSinoByEsLiberado = new OpcionSino();
		}
		if(this.organizacion == null) {
			organizacion = new Organizacion();
		}
    }
    
    public Pedido createPOJO() {
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

