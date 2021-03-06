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
 * Caja generated by hbm2java
 */
@Entity
@EntityListeners({ AuditingEntityListener.class })
@Table(name="caja"
    ,schema="public"
    , uniqueConstraints = @UniqueConstraint(columnNames={"codigo_caja", "id_organizacion"}) 
)
public class Caja  implements Versionable,Seleccionable,Identificable,Fillable,Cleanable,Auditable,java.io.Serializable {


 	
 	private Long id;
 	
 	private long version;
 	
 	private Organizacion organizacion;
 	
 	private String codigoCaja;
 	
 	private String nombreCaja;
 	
 	private String serieIdentificacion;
 	
 	private Long nextNroReciboPagoTercero;
 	
 	private Long nextNroControl;
 	
 	private Long nextNroFactura;
 	
 	private Long nextNroNotaDebito;
 	
 	private Long nextNroNotaCredito;
 	
 	private Long nextNroOrdenEntrega;
 	
 	private Long nextNroFormaLibre;
 	
 	private Long nextNroReciboPago;
 	@CreatedBy
 	private String usuarioCreacion;
 	@CreatedDate
 	private LocalDateTime fechaCreacion;
 	@LastModifiedBy
 	private String usuarioModificacion;
 	@LastModifiedDate
 	private LocalDateTime fechaModificacion;
 	
 	private Set<UsuarioOrganizacion> usuarioOrganizacions = new HashSet<UsuarioOrganizacion>(0);

    public Caja() {
    	// default constructor
    }

	
    public Caja(Organizacion organizacion, String codigoCaja, String nombreCaja) {
        this.organizacion = organizacion;
        this.codigoCaja = codigoCaja;
        this.nombreCaja = nombreCaja;
    }
    public Caja(Organizacion organizacion, String codigoCaja, String nombreCaja, String serieIdentificacion, Long nextNroReciboPagoTercero, Long nextNroControl, Long nextNroFactura, Long nextNroNotaDebito, Long nextNroNotaCredito, Long nextNroOrdenEntrega, Long nextNroFormaLibre, Long nextNroReciboPago, String usuarioCreacion, LocalDateTime fechaCreacion, String usuarioModificacion, LocalDateTime fechaModificacion, Set<UsuarioOrganizacion> usuarioOrganizacions) {
       this.organizacion = organizacion;
       this.codigoCaja = codigoCaja;
       this.nombreCaja = nombreCaja;
       this.serieIdentificacion = serieIdentificacion;
       this.nextNroReciboPagoTercero = nextNroReciboPagoTercero;
       this.nextNroControl = nextNroControl;
       this.nextNroFactura = nextNroFactura;
       this.nextNroNotaDebito = nextNroNotaDebito;
       this.nextNroNotaCredito = nextNroNotaCredito;
       this.nextNroOrdenEntrega = nextNroOrdenEntrega;
       this.nextNroFormaLibre = nextNroFormaLibre;
       this.nextNroReciboPago = nextNroReciboPago;
       this.usuarioCreacion = usuarioCreacion;
       this.fechaCreacion = fechaCreacion;
       this.usuarioModificacion = usuarioModificacion;
       this.fechaModificacion = fechaModificacion;
       this.usuarioOrganizacions = usuarioOrganizacions;
    }
   
  @GenericGenerator(name = "caja_seq_gen", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "caja_id_seq"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            })
  @GeneratedValue(generator = "caja_seq_gen")
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
    @JoinColumn(name="id_organizacion", nullable=false)
    public Organizacion getOrganizacion() {
        return this.organizacion;
    }
    
    public void setOrganizacion(Organizacion organizacion) {
        this.organizacion = organizacion;
    }
    
    @Column(name="codigo_caja", nullable=false, length=16)
    public String getCodigoCaja() {
        return this.codigoCaja;
    }
    
    public void setCodigoCaja(String codigoCaja) {
        this.codigoCaja = codigoCaja;
    }
    
    @Column(name="nombre_caja", nullable=false, length=64)
    public String getNombreCaja() {
        return this.nombreCaja;
    }
    
    public void setNombreCaja(String nombreCaja) {
        this.nombreCaja = nombreCaja;
    }
    
    @Column(name="serie_identificacion", length=2)
    public String getSerieIdentificacion() {
        return this.serieIdentificacion;
    }
    
    public void setSerieIdentificacion(String serieIdentificacion) {
        this.serieIdentificacion = serieIdentificacion;
    }
    
    @Column(name="next_nro_recibo_pago_tercero")
    public Long getNextNroReciboPagoTercero() {
        return this.nextNroReciboPagoTercero;
    }
    
    public void setNextNroReciboPagoTercero(Long nextNroReciboPagoTercero) {
        this.nextNroReciboPagoTercero = nextNroReciboPagoTercero;
    }
    
    @Column(name="next_nro_control")
    public Long getNextNroControl() {
        return this.nextNroControl;
    }
    
    public void setNextNroControl(Long nextNroControl) {
        this.nextNroControl = nextNroControl;
    }
    
    @Column(name="next_nro_factura")
    public Long getNextNroFactura() {
        return this.nextNroFactura;
    }
    
    public void setNextNroFactura(Long nextNroFactura) {
        this.nextNroFactura = nextNroFactura;
    }
    
    @Column(name="next_nro_nota_debito")
    public Long getNextNroNotaDebito() {
        return this.nextNroNotaDebito;
    }
    
    public void setNextNroNotaDebito(Long nextNroNotaDebito) {
        this.nextNroNotaDebito = nextNroNotaDebito;
    }
    
    @Column(name="next_nro_nota_credito")
    public Long getNextNroNotaCredito() {
        return this.nextNroNotaCredito;
    }
    
    public void setNextNroNotaCredito(Long nextNroNotaCredito) {
        this.nextNroNotaCredito = nextNroNotaCredito;
    }
    
    @Column(name="next_nro_orden_entrega")
    public Long getNextNroOrdenEntrega() {
        return this.nextNroOrdenEntrega;
    }
    
    public void setNextNroOrdenEntrega(Long nextNroOrdenEntrega) {
        this.nextNroOrdenEntrega = nextNroOrdenEntrega;
    }
    
    @Column(name="next_nro_forma_libre")
    public Long getNextNroFormaLibre() {
        return this.nextNroFormaLibre;
    }
    
    public void setNextNroFormaLibre(Long nextNroFormaLibre) {
        this.nextNroFormaLibre = nextNroFormaLibre;
    }
    
    @Column(name="next_nro_recibo_pago")
    public Long getNextNroReciboPago() {
        return this.nextNroReciboPago;
    }
    
    public void setNextNroReciboPago(Long nextNroReciboPago) {
        this.nextNroReciboPago = nextNroReciboPago;
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
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="caja")
    public Set<UsuarioOrganizacion> getUsuarioOrganizacions() {
        return this.usuarioOrganizacions;
    }
    
    public void setUsuarioOrganizacions(Set<UsuarioOrganizacion> usuarioOrganizacions) {
        this.usuarioOrganizacions = usuarioOrganizacions;
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
      buffer.append("organizacion").append("='").append(getOrganizacion()).append("' ");			
      buffer.append("codigoCaja").append("='").append(getCodigoCaja()).append("' ");			
      buffer.append("nombreCaja").append("='").append(getNombreCaja()).append("' ");			
      buffer.append("serieIdentificacion").append("='").append(getSerieIdentificacion()).append("' ");			
      buffer.append("nextNroReciboPagoTercero").append("='").append(getNextNroReciboPagoTercero()).append("' ");			
      buffer.append("nextNroControl").append("='").append(getNextNroControl()).append("' ");			
      buffer.append("nextNroFactura").append("='").append(getNextNroFactura()).append("' ");			
      buffer.append("nextNroNotaDebito").append("='").append(getNextNroNotaDebito()).append("' ");			
      buffer.append("nextNroNotaCredito").append("='").append(getNextNroNotaCredito()).append("' ");			
      buffer.append("nextNroOrdenEntrega").append("='").append(getNextNroOrdenEntrega()).append("' ");			
      buffer.append("nextNroFormaLibre").append("='").append(getNextNroFormaLibre()).append("' ");			
      buffer.append("nextNroReciboPago").append("='").append(getNextNroReciboPago()).append("' ");			
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
		 	
		 if (!(other instanceof Caja)) 
		 	return false;
		 	
		 Caja castOther = ( Caja ) other; 
         
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
		if(this.organizacion != null &&
			(organizacion.getId() == null || this.organizacion.getId().longValue() == 0)) {
			organizacion = null;
		}
    }
    
    public void fillPOJO() {
		if(this.organizacion == null) {
			organizacion = new Organizacion();
		}
    }
    
    public Caja createPOJO() {
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

