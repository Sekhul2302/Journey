package com.perpustakaan.dao;

import java.util.List;

import com.perpustakaan.model.Kategori;

public interface KategoriDao {
	public void save(Kategori kategori) throws Exception;

	public void update(Kategori kategori) throws Exception;

	public void delete(int id) throws Exception;

	public List<Kategori> getAll() throws Exception;

	public Kategori getId(int id) throws Exception;
}
