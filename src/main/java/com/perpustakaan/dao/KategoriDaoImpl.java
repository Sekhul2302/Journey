package com.perpustakaan.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.perpustakaan.model.Anggota;
import com.perpustakaan.model.Buku;
import com.perpustakaan.model.Kategori;

@Repository
public class KategoriDaoImpl implements KategoriDao{

	@Autowired
	SessionFactory sessionFactory;
	
	public void save(Kategori kategori) throws Exception {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(kategori);
		session.flush();
		session.close();
	}

	public void update(Kategori kategori) throws Exception {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.update(kategori);
		session.flush();
		session.close();
	}

	public void delete(int id) throws Exception {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Kategori kategori = new Kategori();
		kategori.setId(id);
		session.delete(kategori);
		session.flush();
		session.close();
	}

	public List<Kategori> getAll() throws Exception {
		// TODO Auto-generated method stub
		List<Kategori>getAll = null;
		Session session = sessionFactory.getCurrentSession();
		getAll=session.createCriteria(Kategori.class).list();
		return getAll;
	}

	public Kategori getId(int id) throws Exception {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Kategori kategori = new Kategori();
		session.get(Buku.class,id);
		return kategori;
	}

}
