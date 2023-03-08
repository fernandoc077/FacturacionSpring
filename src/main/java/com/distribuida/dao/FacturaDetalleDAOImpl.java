package com.distribuida.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.distribuida.entities.FacturaDetalle;

@Repository
public class FacturaDetalleDAOImpl implements FacturaDetalleDAO {
	
	@Autowired
	public SessionFactory sessionFactory;
	@Override
	@Transactional
	public List<FacturaDetalle> findAll() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from FacturaDetalle",FacturaDetalle.class).getResultList();
	}

	@Override
	@Transactional
	public FacturaDetalle findOne(int id) {
		// TODO Auto-generated method stub
		 Session session = sessionFactory.getCurrentSession();
		 return session.get(FacturaDetalle.class, id);
	}

	@Override
	@Transactional
	public void add(FacturaDetalle facturaDetalle) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(facturaDetalle);
	}

	@Override
	@Transactional
	public void up(FacturaDetalle facturaDetalle) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(facturaDetalle);

	}

	@Override
	@Transactional
	public void del(int id) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(findOne(id));
	}

}
