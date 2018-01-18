package com.perpustakaan.service;

import java.util.List;

import com.perpustakaan.model.Buku;


public interface ServiceBuku {
	public void save(Buku buku) throws Exception;

	public void update(Buku buku) throws Exception;

	public void delete(int id) throws Exception;

	public Buku getIdBuku(int id) throws Exception;

	public List<Buku> getAllBuku() throws Exception;
}
