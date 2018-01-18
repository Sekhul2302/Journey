package com.perpustakaan.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.perpustakaan.model.Anggota;

@Repository
public class AnggotaDaoImpl implements AnggotaDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public void save(Anggota anggota) throws Exception {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(anggota);
		session.flush();
		session.close();
	}

	public void delete(int id) throws Exception {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Anggota anggota = new Anggota();
		anggota.setId(id);
		session.delete(anggota);
		session.flush();
		session.close();
	}

	public Anggota edit(int id) throws Exception {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Anggota anggota = session.get(Anggota.class,id);
		return anggota;
	}

	public List<Anggota> getAllAnggota() throws Exception {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		
		//List<Anggota>listAnggota = new ArrayList<Anggota>();
		
		List<Anggota>list = session.createCriteria(Anggota.class).list();
		return list;
	}

	public void update(Anggota anggota) throws Exception {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.update(anggota);
		session.flush();
		session.close();
	}

}
