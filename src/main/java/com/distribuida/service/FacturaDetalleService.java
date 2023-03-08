package com.distribuida.service;

import java.util.List;

import com.distribuida.entities.FacturaDetalle;

public interface FacturaDetalleService {
	
	public List<FacturaDetalle>findAll();
	public FacturaDetalle findOne(int id);
	public void add(FacturaDetalle facturaDetalle);
	public void up(FacturaDetalle facturaDetalle);
	public void del (int id);
	
	public void add(int cantidad,double subtotal, int id_Factura, int id_producto);
	public void up(int idFacturaDetalle, int cantidad, double subtotal,int id_factura,int id_producto);
}
