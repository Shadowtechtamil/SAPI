package com.vapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vapi.entity.Videoinfo;
import com.vapi.service.service;

@CrossOrigin(origins = "https://shadowtech.vercel.app/")
@RestController
public class Controller 
{
	@Autowired
	private service ser;

	@GetMapping("/info")
	public List<Videoinfo> viewall()
	{
		List<Videoinfo> test=ser.getall();
		return test;
	}
	@GetMapping("/watch/{vUrl}")
	public Optional<Videoinfo> watch(@PathVariable("vUrl") String vUrl)
	{
		return ser.watch(vUrl);
	}
	
	@PostMapping("/upload")
	public Videoinfo uploadVideo(@RequestBody Videoinfo videodata)
	{
		 Videoinfo data=ser.uplaod(videodata);
		 return data;
	}
	
	@PutMapping("/update/{vId}")
	public Videoinfo update(@RequestBody Videoinfo eddata,@PathVariable("vId") int id)
	{
		Videoinfo uddata=ser.editbyid(eddata, id);
		return uddata;
	}
	@DeleteMapping("/delete/{vId}")
	public void deletebyid(@PathVariable("vId") int id)
	{
		ser.deletebyid(id);
	}
	
	
}
