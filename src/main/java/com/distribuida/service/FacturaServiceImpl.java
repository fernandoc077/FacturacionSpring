package com.distribuida.service;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.dao.IFacturaDAO;
import com.distribuida.dao.ProductoDAO;
import com.distribuida.entities.Cliente;
import com.distribuida.entities.Factura;
import com.distribuida.entities.Producto;

@Service
public class FacturaServiceImpl implements IFacturaService {
	
	@Autowired
	private IFacturaDAO facturaDAO;
	
	@Autowired
	private ClienteDAO clienteDAO;

	@Override
	public List<Factura> findAll() {
		// TODO Auto-generated method stub
		return facturaDAO.findAll();
	}

	@Override
	public Factura findOne(int id) {
		// TODO Auto-generated method stub
		return facturaDAO.findOne(id);
	}

	@Override
	public void add(Date fecha,double total_neto, double iva, double total, int id_cliente) {
		// TODO Auto-generated method stub
		Cliente cliente = clienteDAO.findOne(id_cliente);
		Factura factura1=new Factura(new Date(),22.22,0.12,25.36);
		factura1.setCliente(cliente);
		facturaDAO.add(factura1);
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		facturaDAO.del(id);
	}

	@Override
	public List<Factura> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return facturaDAO.findAll(busqueda);
	}

}
