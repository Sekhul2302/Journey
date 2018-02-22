package com.perpustakaan.dao;

import java.util.List;

import com.perpustakaan.model.PeminjamanItem;

public interface PeminjamanItemDao {
	public void save(PeminjamanItem peminjamanItem)throws Exception;
	
	public void update(PeminjamanItem peminjamanItem)throws Exception;
	
	public void delete(int id)throws Exception;
	
	public List<PeminjamanItem>getAll()throws Exception;
	
	public PeminjamanItem edit (int id)throws Exception;
}
