package com.perpustakaan.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.perpustakaan.model.Peminjaman;

public class PeminjamanDaoImpl implements PeminjamanDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void save(Peminjaman peminjaman) throws Exception {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(peminjaman);
		session.flush();
		session.close();
	}

	@Override
	public void delete(int id) throws Exception {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Peminjaman peminjaman = new Peminjaman();
		peminjaman.setId(id);
		session.delete(peminjaman);
		session.flush();
		session.close();
		
	}

	@Override
	public List<Peminjaman> getAll() throws Exception {
		// TODO Auto-generated method stub
		
	    Session session = sessionFactory.getCurrentSession();
	    List<Peminjaman>getAll=session.createCriteria(Peminjaman.class).list();
	    //getAll = 
		return getAll;
	}

	@Override
	public void update(Peminjaman peminjaman) throws Exception {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.update(peminjaman);
		session.flush();
		session.close();
	}

	@Override
	public Peminjaman getId(int id) throws Exception {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Peminjaman peminjaman = session.get(Peminjaman.class,id);
		return peminjaman;
	}

}
