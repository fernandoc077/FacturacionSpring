package com.distribuida.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component //importar del org.springframework
@Entity // importar de javax.persistence
@Table(name="Productos")// importar de javax.persistence

public class Producto {
	
	//Atributos
	@Id // Importar de javax.persistence//
	@GeneratedValue(strategy=GenerationType.IDENTITY) // importar de javax.persistence los dos
	//id_producto	nombre	descripcion	precio	stock
	
	@Column(name="id_producto")
	private int idProducto;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="descripcion")	
	private String descripcion;
	
	@Column(name="precio")
	private double  precio;
	
	@Column(name="stock")
	private int stock;
	
	// contructores
	public Producto() {
		
	}
	public Producto(int idProducto, String nombre,String descripcion,Double precio,int stock) {
		this.idProducto = idProducto;
		this.nombre= nombre;
		this.descripcion=descripcion;
		this.precio=precio;
		this.stock=stock;
	}
	
	public Producto(String nombre, String descripcion, double precio, int stock) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
	}
	// metodos setter and getters
	
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", precio=" + precio + ", stock=" + stock + "]";
	}
	
	
}
