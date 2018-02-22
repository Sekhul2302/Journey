package com.perpustakaan.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.perpustakaan.model.PeminjamanItem;

public class PeminjamanItemDaoImpl implements PeminjamanItemDao {

	@Autowired
	SessionFactory sessionFactory;
		
	@Override
	public void save(PeminjamanItem peminjamanItem) throws Exception {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(peminjamanItem);
		session.flush();
		session.close();
	}

	@Override
	public void update(PeminjamanItem peminjamanItem) throws Exception {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.update(peminjamanItem);
		session.flush();
		session.close();
	}

	@Override
	public void delete(int id) throws Exception {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		PeminjamanItem peminjamanItem = new PeminjamanItem();
		peminjamanItem.setId(id);
		session.delete(peminjamanItem);
		session.flush();
		session.close();
	}

	@Override
	public List<PeminjamanItem> getAll() throws Exception {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<PeminjamanItem>getALL = session.createCriteria(PeminjamanItem.class).list();
		return getALL;
	}

	@Override
	public PeminjamanItem edit(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
