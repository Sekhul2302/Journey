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

import com.perpustakaan.model.Buku;
import com.perpustakaan.service.ServiceBuku;

@Controller
@RequestMapping("/buku")
public class BukuController {
	@Autowired
	ServiceBuku serviceBuku;
	
	@RequestMapping
	public String Model(){
		return "buku";
	}
	
	@ResponseBody
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public void save(@RequestBody Buku buku) throws Exception{
		serviceBuku.save(buku);
	}
	
	@ResponseBody
	@RequestMapping(value="/update",method=RequestMethod.PUT)
	public void update(@RequestBody Buku buku) throws Exception{
		serviceBuku.update(buku);
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	@ResponseStatus(value=HttpStatus.OK)
	public void delete(@PathVariable int id) throws Exception{
		serviceBuku.delete(id);
	}
	
	@ResponseBody
	@RequestMapping(value="/getall", method=RequestMethod.GET)
	public List<Buku>getAllBuku() throws Exception{
		return serviceBuku.getAllBuku();
	}
	
	@ResponseBody
	@RequestMapping(value="/getid", method= RequestMethod.GET)
	@ResponseStatus(value=HttpStatus.OK)
	public Buku getIdBuku(@PathVariable int id) throws Exception{
		return serviceBuku.getIdBuku(id);
	}
}