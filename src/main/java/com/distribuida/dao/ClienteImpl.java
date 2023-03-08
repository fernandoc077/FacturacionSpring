package com.distribuida.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.distribuida.entities.Cliente;


@Repository
public class ClienteImpl implements ClienteDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Cliente> findAll() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Cliente",Cliente.class).getResultList();
	}

	@Override
	@Transactional
	public Cliente findOne(int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Cliente.class,id);
	}

	@Override
	@Transactional
	public void add(Cliente cliente) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(cliente);
		
	}

	
	/*
	 * @Override
	 * 
	 * @Transactional public void up(Cliente cliente) { // TODO Auto-generatedmethod
	 * stub
	 * 
	 * }
	 */
	 

	@Override
	@Transactional
	public void del(int id) {
		Session session= sessionFactory.getCurrentSession();
		Cliente cliente = session.get(Cliente.class, id);
		session.delete(cliente);
		
	}

	@Override
	@Transactional
	public List<Cliente> findAll(String busqueda) {
		Session session=sessionFactory.getCurrentSession();
		Query<Cliente> query = session.createQuery(
				"select CL from Cliente CL"
				+" where CL.cedula like: KeyBusqueda"
				+" or CL.nombre like : KeyBusqueda "
				+" or CL.apellido like : KeyBusqueda"
				+" or CL.fecha_nac like : KeyBusqueda"
				+" or CL.direccion like : KeyBusqueda"
				+" or CL.telefono like : KeyBusqueda"
				+" or CL.correo like : KeyBusqueda"
				,Cliente.class);
		
		query.setParameter("KeyBusqueda", "%"+busqueda+"%");
		return query.getResultList();
	}
	
	

}
