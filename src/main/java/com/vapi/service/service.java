package com.vapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vapi.repo.Videorepo;
import com.vapi.entity.Videoinfo;


@Service
public class service 
{
	@Autowired
	private Videorepo videorepo;
	
	public List<Videoinfo> getall()
	{
		List<Videoinfo> video=(List<Videoinfo>)videorepo.findAll();
		return video;
	}
	
	public Optional<Videoinfo> watch(String vUrl)
	{
		return videorepo.findByvUrl(vUrl);
	}
	
	public Videoinfo uplaod(Videoinfo data )
	{
		Videoinfo Vdata=videorepo.save(data);
		return Vdata;
	}
	
	public Videoinfo editbyid(Videoinfo eddata,int id)
	{
		eddata.setvId(id);
		return videorepo.save(eddata);
	}
	
	public void deletebyid(int id)
	{
		videorepo.deleteById(id);
	}

}
