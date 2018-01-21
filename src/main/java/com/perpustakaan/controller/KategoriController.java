package com.perpustakaan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.perpustakaan.model.Kategori;
import com.perpustakaan.service.ServiceKategori;

@Controller
@RequestMapping("/kategori")

public class KategoriController {
	
	@Autowired
	private ServiceKategori serviceKategori;
	
	@RequestMapping
	public String index(){
		return "kategori";
	}
	
	@ResponseStatus
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public void save(@RequestBody Kategori kategori) throws Exception{
		serviceKategori.save(kategori);
	}
	
	@ResponseStatus
	@RequestMapping(value="/update", method = RequestMethod.PUT)
	public void update(@RequestBody Kategori kategori) throws Exception{
		serviceKategori.update(kategori);
	}
	
	@RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(value=HttpStatus.OK)
	public void delete(@PathVariable int id) throws Exception{
		serviceKategori.delete(id);
	}
	
	@ResponseBody
	@RequestMapping(value="/getall", method= RequestMethod.GET)
	@ResponseStatus(value=HttpStatus.OK)
	public List<Kategori>getAll() throws Exception{
		return serviceKategori.getAll();
	}
	
	@ResponseBody
	@RequestMapping(value="/getid/{id}", method=RequestMethod.GET)
	@ResponseStatus(value=HttpStatus.OK)
	public Kategori getId(@PathVariable int id) throws Exception{
		return serviceKategori.getId(id);
	}
}
