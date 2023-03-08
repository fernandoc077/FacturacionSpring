package com.distribuida.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.distribuida.entities.Producto;

@Repository // importar esto de org.springframework
public class ProductoDAOImpl implements ProductoDAO {
	
	@Autowired // importar esto de org.springframework
	private SessionFactory sessionFactory;// importar esto de org.hibernate

	@Override
	@Transactional // importar esto de org.springframework
	public List<Producto> findAll() {
		Session session = sessionFactory.getCurrentSession();
		List<Producto>productos= session.createQuery("from Producto",Producto.class).getResultList();	
		return productos;
	}

	@Override
	@Transactional // importar esto de org.springframework
	public Producto findOne(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query<Producto> query = session.createQuery("select pr from Producto pr where pr.idProducto = :keyId",Producto.class);
		
		query.setParameter("keyId",id);
		return query.getSingleResult();
	}

	@Override
	@Transactional // importar esto de org.springframework
	public void add(Producto producto) {
		
		// el HQL no permite hacer un Insert INTO
		Session session = sessionFactory.getCurrentSession();
		session.save(producto);
		
	}

	@Override
	@Transactional // importar esto de org.springframework
	public void up(Producto producto) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("update Producto set nombre=:nombre,descripcion=:descripcion,precio=:precio,stock=:stock where idProducto=:id_producto");
		query.setParameter("nombre", producto.getNombre());
		query.setParameter("descripcion", producto.getDescripcion());
		query.setParameter("precio", producto.getPrecio());
		query.setParameter("producto", producto.getStock());
		query.setParameter("id_producto", producto.getIdProducto());
		query.executeUpdate();
	}
	@Override
	@Transactional // importar esto de org.springframework
	public void del(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("delete from Producto where idProducto= :id");
		query.setParameter("id", id);
		query.executeUpdate();

	}
	@Override
	@Transactional // importar esto de org.springframework
	public List<Producto> findAll(String busqueda) {
		
		Session session = sessionFactory.getCurrentSession();
		Query<Producto> query = session.createQuery(
				"select pr from Producto pr"
				+" where pr.nombre LIKE :Busqueda"
				+" or pr.descripcion LIKE :Busqueda "
				+" or pr.precio LIKE :Busqueda"
				+" or pr.stock LIKE :Busqueda"
				,Producto.class);
		
		query.setParameter("Busqueda", "%"+busqueda+"%");
		return query.getResultList();
	}

}
