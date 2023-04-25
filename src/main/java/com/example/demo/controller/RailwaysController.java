package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.RAILWAYS.Railways;
import com.example.demo.service.RailwayService;

@RestController
public class RailwaysController {

	@Autowired
	RailwayService railwayServices;
	
	@GetMapping("fetch")
	public List<Railways> getAllDetails(){
		return railwayServices.getAlldetails();
	}
	
	@GetMapping("fetch/{id}")
	public Railways getcar(@PathVariable("id") int id){
		return railwayServices.getRailways(id);
	}
	
	@PutMapping("update")
	public Railways updatecar(@RequestBody Railways d) {
		return railwayServices.updateRailways(d);
	}
	
	@PostMapping("save")
	public Railways savecar(@RequestBody Railways d) {
		return railwayServices.saveRailways(d);
	}
	
	@DeleteMapping("delete/{id}")
	public void deletecar(@PathVariable("id") int id) {
		railwayServices.deleteRailways (id);
	}
}
