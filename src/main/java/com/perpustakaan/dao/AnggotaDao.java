package com.perpustakaan.dao;

import java.util.List;

import com.perpustakaan.model.Anggota;

public interface AnggotaDao {
	/*<dao sekhul>*/
	public void save(Anggota anggota)throws Exception;
	
	public void delete(int id) throws Exception;
	
	public Anggota edit(int id) throws Exception;
	
	public List<Anggota>getAllAnggota() throws Exception;
	
	public void update (Anggota anggota)throws Exception;
}
