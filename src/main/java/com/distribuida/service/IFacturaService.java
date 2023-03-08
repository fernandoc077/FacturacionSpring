package com.distribuida.service;

import java.util.Date;
import java.util.List;

import com.distribuida.entities.Factura;

public interface IFacturaService {
	
	public List<Factura> findAll();
	
	public Factura findOne(int id);
	
	//public void up(Factura factura);
	
	public void add(Date fecha,double total_neto,double iva, double total,int id_cliente);
	
	
	public void del(int id);
	
	// Personalizados
	 public List<Factura> findAll(String busqueda);

}
