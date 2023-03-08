package com.distribuida.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="DetalleFacturas")
public class FacturaDetalle {
	
	//		
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_detalle_factura")
	private int idDetalleFactura;
	
	@Column(name="cantidad")
	private int cantidad;
	
	@Column(name="subtotal")
	private Double subtotal;
	
	@ManyToOne(cascade= {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name="id_factura")
	private Factura factura;
	
	@ManyToOne(cascade= {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name="id_producto")
	private Producto producto;
	


	public FacturaDetalle() {
		
	}
	public FacturaDetalle(Producto producto) {
		this.producto=producto;
	}
	
	public FacturaDetalle(int idDetalleFactura,int cantidad, Double subtotal) {
		this.idDetalleFactura = idDetalleFactura;
		this.subtotal = subtotal;
	}
	public FacturaDetalle(int idDetalleFactura, Double subtotal) {
		this.idDetalleFactura = idDetalleFactura;
		this.subtotal = subtotal;
	}
	

	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getIdDetalleFactura() {
		return idDetalleFactura;
	}

	public void setIdDetalleFactura(int idDetalleFactura) {
		this.idDetalleFactura = idDetalleFactura;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public Factura getFactura() {
		return factura;
	}
	@Autowired
	public void setFactura(Factura factura) {
		this.factura =factura;
	}
	public Producto getProducto() {
		return producto;
	}
	@Autowired
	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "FacturaDetalle [idDetalleFactura=" + idDetalleFactura + ", cantidad=" + cantidad + ", subtotal="
				+ subtotal + ", factura=" + factura + ", producto=" + producto + "]";
	}
	
	


}
