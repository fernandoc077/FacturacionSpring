package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Factura;

public interface IFacturaDAO {
	
	public List<Factura> findAll();
	
	public Factura findOne(int id);
	
	//public void up(Factura factura);
	
	public void add(Factura factura);
	
	
	public void del(int id);
	
	// Personalizados
	 public List<Factura> findAll(String busqueda);

}
