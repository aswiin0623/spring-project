package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.RAILWAYS.Railways;
import com.example.demo.repositary.Railwayrepositary;


@Service
public class RailwayService {

	@Autowired
	Railwayrepositary repo;

	public List<Railways> getAlldetails()
	{
		List<Railways>list=repo.findAll();
		return list;
	}

	public Railways saveRailways(Railways s) {
		
		Railways obj=repo.save(s);
		return obj;
	}
	public Railways updateRailways(Railways s) {
		
		Railways obj=repo.save(s);
		return obj;
	}
	public void deleteRailways(int register)
	{
		repo.deleteById(register);
	}
	public Railways getRailways(int register) {
		Railways s=repo.findById(register).get();
		return s;
		
	}
	
}
