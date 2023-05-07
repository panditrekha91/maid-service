package com.fiserv.maidService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fiserv.maidService.entity.TimeAvailability;
import com.fiserv.maidService.repo.TimeInterface;

@Service
public class TimeService {

	@Autowired
	private TimeInterface obj;
	
	public void addmaidtime(TimeAvailability t) 
	{
		
		obj.save(t);
	}

	public List<TimeAvailability> getAlltime() {
		List<TimeAvailability> l=	obj.findAll();
		return l;
	}

}
