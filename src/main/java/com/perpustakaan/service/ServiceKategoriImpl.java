package com.perpustakaan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.perpustakaan.dao.KategoriDao;
import com.perpustakaan.model.Kategori;

@Service
@Transactional
public class ServiceKategoriImpl implements ServiceKategori {
	
	@Autowired
	private KategoriDao kategoriDao;
	
	public void save(Kategori kategori) throws Exception {
		// TODO Auto-generated method stub
		kategoriDao.save(kategori);
	}

	public void update(Kategori kategori) throws Exception {
		// TODO Auto-generated method stub
		kategoriDao.update(kategori);
	}

	public void delete(int id) throws Exception {
		// TODO Auto-generated method stub
		kategoriDao.delete(id);
	}

	public List<Kategori> getAll() throws Exception {
		// TODO Auto-generated method stub
		return kategoriDao.getAll();
	}

	public Kategori getId(int id) throws Exception {
		// TODO Auto-generated method stub
		return kategoriDao.getId(id);
	}

}
