package com.perpustakaan.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.perpustakaan.model.Buku;

@Repository
public class BukuDaoImpl implements BukuDao {

	@Autowired
	private SessionFactory sessionFactory; 
		
	public void save(Buku buku) throws Exception {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(buku);
		session.flush();
		session.close();
	}

	public void update(Buku buku) throws Exception {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.update(buku);
		session.flush();
		session.clear();
	}

	public void delete(int id) throws Exception {
		// TODO Auto-generated method stub
		Buku buku = new Buku();
		buku.setId(id);
		Session session = sessionFactory.getCurrentSession();
		session.delete(buku);
		session.flush();
		session.close();
		
	}

	public List<Buku> getAll() throws Exception {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<Buku>listBuku = session.createCriteria(Buku.class).list();
		return listBuku;
	}

	public Buku getIdBuku(int id) throws Exception {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Buku buku =session.get(Buku.class,id);
		return buku;
	}

}
