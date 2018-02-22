package com.perpustakaan.dao;

import java.util.List;

import com.perpustakaan.model.Peminjaman;

public interface PeminjamanDao {
	public void save(Peminjaman peminjaman) throws Exception;
	
	public void delete(int id) throws Exception;
	
	public List<Peminjaman>getAll()throws Exception;
	
	public void update(Peminjaman peminjaman) throws Exception;
	
	public Peminjaman getId(int id) throws Exception;
}
