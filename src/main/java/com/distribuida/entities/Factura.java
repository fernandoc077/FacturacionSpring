package com.distribuida.entities;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Component
@Entity
@Table(name="Facturas")
public class Factura {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//id_factura	fecha	total_neto	iva	total	id_cliente
	
	@Column(name="id_factura")
	private int idFactura;
	
	@Column(name="fecha")
	private Date fecha;
	
	@Column(name="total_neto")
	private Double totalNeto=0.0;
	@Column(name="iva")
	private Double iva;
	
	@Column(name="total")
	private Double Total;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_cliente ")
	private Cliente cliente;
	//private DatosEmpresa datosEmpresa;
	
	//Constructor
	public Factura() {
		
	}
	//Inyeccion de dependecias mediante constructor por parametro
	@Autowired
	public Factura(Cliente cliente) {
		this.cliente=cliente;
	}
//	public void setDatosEmpresa(DatosEmpresa datosEmpresa) {
//		this.datosEmpresa = datosEmpresa;
//	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Factura(int idFactura, Date fecha, Double totalNeto, Double iva, Double total) {
		this.idFactura = idFactura;
		this.fecha = fecha;
		this.totalNeto = totalNeto;
		this.iva = iva;
		Total = total;
	}
	public Factura( Date fecha, Double totalNeto, Double iva, Double total) {
		this.fecha = fecha;
		this.totalNeto = totalNeto;
		this.iva = iva;
		Total = total;
	}

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Double getTotalNeto() {
		return totalNeto;
	}

	public void setTotalNeto(Double totalNeto) {
		this.totalNeto = totalNeto;
	}
	
	public void setTotalNeto(Double subtotal,Boolean bool) {
		this.totalNeto = totalNeto+subtotal;
	}

	public Double getIva() {
		return iva;
	}

	public void setIva(Double iva) {
		this.iva = iva;
	}

	public Double getTotal() {
		return Total;
	}

	public void setTotal(Double total) {
		Total = total;
	}

	@Override
	public String toString() {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
		return "Factura [idFactura=" + idFactura + ", fecha=" + formato.format(fecha) + ", totalNeto=" + totalNeto + ", iva=" + iva
				+ ", Total=" + Total + ", cliente=" + cliente + "]";
	}

}
