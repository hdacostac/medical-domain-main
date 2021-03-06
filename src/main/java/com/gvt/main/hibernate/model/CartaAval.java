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
 * CartaAval generated by hbm2java
 */
@Entity
@EntityListeners({ AuditingEntityListener.class })
@Table(name="carta_aval"
    ,schema="public"
    , uniqueConstraints = @UniqueConstraint(columnNames="codigo_carta_aval") 
)
public class CartaAval  implements Versionable,Seleccionable,Identificable,Fillable,Cleanable,Auditable,java.io.Serializable {


 	
 	private Long id;
 	
 	private long version;
 	
 	private Persona persona;
 	
 	private StatusCartaAval statusCartaAval;
 	
 	private Pedido pedido;
 	
 	private String codigoCartaAval;
 	
 	private LocalDateTime fechaCartaAval;
 	
 	private LocalDateTime fechaVencimientoCartaAval;
 	
 	private BigDecimal montoCartaAval;
 	@CreatedBy
 	private String usuarioCreacion;
 	@CreatedDate
 	private LocalDateTime fechaCreacion;
 	@LastModifiedBy
 	private String usuarioModificacion;
 	@LastModifiedDate
 	private LocalDateTime fechaModificacion;

    public CartaAval() {
    	// default constructor
    }

	
    public CartaAval(Persona persona, StatusCartaAval statusCartaAval, String codigoCartaAval) {
        this.persona = persona;
        this.statusCartaAval = statusCartaAval;
        this.codigoCartaAval = codigoCartaAval;
    }
    public CartaAval(Persona persona, StatusCartaAval statusCartaAval, Pedido pedido, String codigoCartaAval, LocalDateTime fechaCartaAval, LocalDateTime fechaVencimientoCartaAval, BigDecimal montoCartaAval, String usuarioCreacion, LocalDateTime fechaCreacion, String usuarioModificacion, LocalDateTime fechaModificacion) {
       this.persona = persona;
       this.statusCartaAval = statusCartaAval;
       this.pedido = pedido;
       this.codigoCartaAval = codigoCartaAval;
       this.fechaCartaAval = fechaCartaAval;
       this.fechaVencimientoCartaAval = fechaVencimientoCartaAval;
       this.montoCartaAval = montoCartaAval;
       this.usuarioCreacion = usuarioCreacion;
       this.fechaCreacion = fechaCreacion;
       this.usuarioModificacion = usuarioModificacion;
       this.fechaModificacion = fechaModificacion;
    }
   
  @GenericGenerator(name = "carta_aval_seq_gen", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "carta_aval_id_seq"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            })
  @GeneratedValue(generator = "carta_aval_seq_gen")
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
    @JoinColumn(name="id_acreedor", nullable=false)
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_status_carta_aval", nullable=false)
    public StatusCartaAval getStatusCartaAval() {
        return this.statusCartaAval;
    }
    
    public void setStatusCartaAval(StatusCartaAval statusCartaAval) {
        this.statusCartaAval = statusCartaAval;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_pedido")
    public Pedido getPedido() {
        return this.pedido;
    }
    
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    @Column(name="codigo_carta_aval", unique=true, nullable=false, length=16)
    public String getCodigoCartaAval() {
        return this.codigoCartaAval;
    }
    
    public void setCodigoCartaAval(String codigoCartaAval) {
        this.codigoCartaAval = codigoCartaAval;
    }
    
    @Column(name="fecha_carta_aval", length=29)
    public LocalDateTime getFechaCartaAval() {
        return this.fechaCartaAval;
    }
    
    public void setFechaCartaAval(LocalDateTime fechaCartaAval) {
        this.fechaCartaAval = fechaCartaAval;
    }
    
    @Column(name="fecha_vencimiento_carta_aval", length=29)
    public LocalDateTime getFechaVencimientoCartaAval() {
        return this.fechaVencimientoCartaAval;
    }
    
    public void setFechaVencimientoCartaAval(LocalDateTime fechaVencimientoCartaAval) {
        this.fechaVencimientoCartaAval = fechaVencimientoCartaAval;
    }
    
    @Column(name="monto_carta_aval", precision=22)
    public BigDecimal getMontoCartaAval() {
        return this.montoCartaAval;
    }
    
    public void setMontoCartaAval(BigDecimal montoCartaAval) {
        this.montoCartaAval = montoCartaAval;
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
      buffer.append("statusCartaAval").append("='").append(getStatusCartaAval()).append("' ");			
      buffer.append("pedido").append("='").append(getPedido()).append("' ");			
      buffer.append("codigoCartaAval").append("='").append(getCodigoCartaAval()).append("' ");			
      buffer.append("fechaCartaAval").append("='").append(getFechaCartaAval()).append("' ");			
      buffer.append("fechaVencimientoCartaAval").append("='").append(getFechaVencimientoCartaAval()).append("' ");			
      buffer.append("montoCartaAval").append("='").append(getMontoCartaAval()).append("' ");			
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
		 	
		 if (!(other instanceof CartaAval)) 
		 	return false;
		 	
		 CartaAval castOther = ( CartaAval ) other; 
         
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
		if(this.statusCartaAval != null &&
			(statusCartaAval.getId() == null || this.statusCartaAval.getId().longValue() == 0)) {
			statusCartaAval = null;
		}
		if(this.pedido != null &&
			(pedido.getId() == null || this.pedido.getId().longValue() == 0)) {
			pedido = null;
		}
    }
    
    public void fillPOJO() {
		if(this.persona == null) {
			persona = new Persona();
		}
		if(this.statusCartaAval == null) {
			statusCartaAval = new StatusCartaAval();
		}
		if(this.pedido == null) {
			pedido = new Pedido();
		}
    }
    
    public CartaAval createPOJO() {
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

