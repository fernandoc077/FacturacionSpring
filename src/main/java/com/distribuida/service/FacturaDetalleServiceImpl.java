package com.distribuida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.FacturaDetalleDAO;
import com.distribuida.dao.IFacturaDAO;
import com.distribuida.dao.ProductoDAO;
import com.distribuida.entities.Factura;
import com.distribuida.entities.FacturaDetalle;
import com.distribuida.entities.Producto;

@Service
public class FacturaDetalleServiceImpl implements FacturaDetalleService {
	
	@Autowired
	private FacturaDetalleDAO facturaDetalleService;
	
	@Autowired
	private IFacturaDAO facturaService;
	
	@Autowired
	private ProductoDAO productoService;
	
	@Override
	public List<FacturaDetalle> findAll() {
		// TODO Auto-generated method stub
		return facturaDetalleService.findAll();
	}

	@Override
	public FacturaDetalle findOne(int id) {
		// TODO Auto-generated method stub
		return facturaDetalleService.findOne(id);
	}

	@Override
	public void add(FacturaDetalle facturaDetalle) {
		// TODO Auto-generated method stub
		facturaDetalleService.add(facturaDetalle);

	}

	@Override
	public void up(FacturaDetalle facturaDetalle) {
		// TODO Auto-generated method stub
		facturaDetalleService.up(facturaDetalle);
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		facturaDetalleService.del(id);
	}

	@Override
	public void add(int cantidad, double subtotal, int id_factura, int id_producto) {
		// TODO Auto-generated method stub
		Factura factura = facturaService.findOne(id_factura);
		Producto producto=productoService.findOne(id_producto);
		FacturaDetalle facturaDetalle =new FacturaDetalle(cantidad,subtotal);
		facturaDetalle.setFactura(factura);
		facturaDetalle.setProducto(producto);
		
		facturaDetalleService.add(facturaDetalle);
	}

	@Override
	public void up(int idFacturaDetalle, int cantidad, double subtotal, int id_factura, int id_producto) {
		// TODO Auto-generated method stub
		Factura factura = facturaService.findOne(id_factura);
		Producto producto=productoService.findOne(id_producto);
		FacturaDetalle facturaDetalle =new FacturaDetalle(idFacturaDetalle,cantidad,subtotal);
		facturaDetalle.setFactura(factura);
		facturaDetalle.setProducto(producto);
		
		facturaDetalleService.add(facturaDetalle);
	}

}
