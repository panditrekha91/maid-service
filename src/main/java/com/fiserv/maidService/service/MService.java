package com.fiserv.maidService.service;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fiserv.maidService.entity.Maid;
import com.fiserv.maidService.repo.MaidInterface;

@Service
public class MService {

	@Autowired
	private MaidInterface obj;
	
	// Adding maid
	public Maid maidInsert(Maid m)
	{
		Maid mm=obj.save(m);		
		return m;
		
	}

	// get All Maid 
	public List<Maid> getallmaid() {

		return obj.findAll();
	}

	public String deletebyId(int maidid) {
		obj.deleteById(maidid);
		return "Maid deleted successfully" ;
	}

	public void updatemaiddata(int maidid, Maid m) {
		
		Maid mm=obj.getById(maidid);
		
		System.out.println("lets check whats giving return..."+mm);
		mm.setAddress(m.getAddress());
		mm.setMaidemail(m.getMaidemail());
		mm.setMobno(m.getMobno());
		mm.setName(m.getName());
		mm.setPassword(m.getPassword());
		mm.setWorkType(m.getWorkType());
		obj.save(mm);
		
		
	}

	public List<Maid> getbyWorkmaid(String work) {
		List<Maid> list=obj.findByWorkType(work);
		return list;
	}

}
