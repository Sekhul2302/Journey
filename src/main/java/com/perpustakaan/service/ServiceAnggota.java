package com.perpustakaan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.perpustakaan.dao.AnggotaDao;
import com.perpustakaan.model.Anggota;

@Service
@Transactional
public class ServiceAnggota {
	@Autowired
	private AnggotaDao anggotaDao;
	
	public void save(Anggota anggota) throws Exception{
		anggotaDao.save(anggota);
	}
	
	public List<Anggota>getAllAnggota() throws Exception{
		return anggotaDao.getAllAnggota();
	}
	
	public void delete(int id) throws Exception{
		anggotaDao.delete(id);
	}
	
	public Anggota getIdAnggota(int id) throws Exception{
		return anggotaDao.edit(id);
	}
	
	public void update(Anggota anggota) throws Exception{
		anggotaDao.update(anggota);
	}
}
