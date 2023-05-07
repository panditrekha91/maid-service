package com.fiserv.maidService.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiserv.maidService.entity.Maid;
import com.fiserv.maidService.service.MService;


@RestController
@RequestMapping("/maid")
public class MainController {

	@Autowired
	private MService mservice;
	
	@PostMapping
	public ResponseEntity<Maid> insertmaid(@Valid @RequestBody Maid m)

	{
		Maid mm=mservice.maidInsert(m);
		return new ResponseEntity<>(mm, HttpStatus.CREATED);
		
	}
	
	@GetMapping
	public ResponseEntity<List<Maid>> getAll()
	{
		List<Maid> m=mservice.getallmaid();
		return ResponseEntity.ok(m);	
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteMaid(@PathVariable("id") int maidid)
	{
		return mservice.deletebyId(maidid);
	}
	
	@PutMapping("/update/{id}")
	public String updatemaid(@PathVariable("id") int maidid, @RequestBody Maid m)
	{
		mservice.updatemaiddata(maidid,m);
	return "Your data updated successfully";	
	}
	
	// find by work
	@GetMapping("/getbywork/{workType}")
	public List<Maid> getByWork(@PathVariable("workType")String workType)
	{
		List<Maid> l=mservice.getbyWorkmaid(workType);
		return l;
	}
	
}
