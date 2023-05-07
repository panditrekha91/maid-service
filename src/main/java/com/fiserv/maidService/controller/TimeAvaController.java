package com.fiserv.maidService.controller;

import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiserv.maidService.entity.TimeAvailability;
import com.fiserv.maidService.service.TimeService;

@RestController
@RequestMapping("timeavailablity")
public class TimeAvaController {

	@Autowired
	private TimeService timeService;
	
	@PostMapping
	public String addtime(@RequestBody TimeAvailability t)
	{
		System.out.println("================="+t.getFromtime());
		t.setFromtime(LocalTime.parse(t.getFromtime().toString()));
		t.setTotime(LocalTime.parse(t.getTotime().toString()));
		timeService.addmaidtime(t);
		return "time add";
	}
	
	
	@GetMapping
	public List<TimeAvailability> gettime()
	{
		
		List<TimeAvailability> list=	timeService.getAlltime();
		return list;
				
		
	}
	
	
}
