package com.perpustakaan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.perpustakaan.dao.BukuDao;
import com.perpustakaan.model.Buku;


@Service
@Transactional
public class ServiceBukuImpl implements ServiceBuku {

	@Autowired
	BukuDao bukuDao;
	
	public void save(Buku buku) throws Exception {
		// TODO Auto-generated method stub
		bukuDao.save(buku);
	}

	public void update(Buku buku) throws Exception {
		// TODO Auto-generated method stub
		bukuDao.update(buku);
	}

	public void delete(int id) throws Exception {
		// TODO Auto-generated method stub
		bukuDao.delete(id);
	}

	public Buku getIdBuku(int id) throws Exception {
		// TODO Auto-generated method stub
		return bukuDao.getIdBuku(id);
	}

	public List<Buku> getAllBuku() throws Exception {
		// TODO Auto-generated method stub
		return bukuDao.getAll();
	}

}
