package com.fiserv.maidService.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalTime;

@Entity
public class TimeAvailability {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int tid;
	
	//@JsonFormat(pattern="HH:mm:ss")
	private LocalTime fromtime;
	
	//@JsonFormat(pattern="HH:mm:ss")
	private LocalTime totime;
	
	private boolean available;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Maid maid;
	
	
	
	public TimeAvailability() {
		super();
	}

	public TimeAvailability(int tid, LocalTime fromtime, LocalTime totime, boolean available, Maid maid) {
		super();
		this.tid = tid;
		this.fromtime = fromtime;
		this.totime = totime;
		this.available = available;
		this.maid = maid;
	}
	
	

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public LocalTime getFromtime() {
		return fromtime;
	}

	public void setFromtime(LocalTime fromtime) {
		this.fromtime = fromtime;
	}

	public LocalTime getTotime() {
		return totime;
	}

	public void setTotime(LocalTime totime) {
		this.totime = totime;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public Maid getMaid() {
		return maid;
	}

	public void setMaid(Maid maid) {
		this.maid = maid;
	}

	
	
	
	
	
	
	
	
}
