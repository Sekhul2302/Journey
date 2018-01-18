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

import com.perpustakaan.model.Anggota;
import com.perpustakaan.service.ServiceAnggota;

@Controller

@RequestMapping("/anggota")
public class AnggotaController {
	@Autowired
	ServiceAnggota serviceAnggota;	
	
	@RequestMapping
	public String index(){
		return "anggota";	
	}
	
	
	@ResponseBody
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public void save(@RequestBody Anggota anggota) throws Exception{
		serviceAnggota.save(anggota);
	}
	
	@ResponseBody
	@RequestMapping(value="/getall", method=RequestMethod.GET)
	@ResponseStatus(value=HttpStatus.OK)
	public List<Anggota>getAll() throws Exception{
		return serviceAnggota.getAllAnggota();
	}
	
	@ResponseBody
	@RequestMapping(value="/update",method=RequestMethod.PUT)
	public void update(@RequestBody Anggota anggota) throws Exception{
		serviceAnggota.update(anggota);
	}
	
	@ResponseBody
	@RequestMapping(value="/getbyid/{id}",method=RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public Anggota getById(@PathVariable int id) throws Exception{
		return serviceAnggota.getIdAnggota(id);
	}
	
	@ResponseBody
	@RequestMapping(value="/delete/{id}")
	public void delete(@PathVariable int id) throws Exception{
		serviceAnggota.delete(id);
	}
	
	
}
