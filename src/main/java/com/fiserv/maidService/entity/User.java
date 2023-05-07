package com.fiserv.maidService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;

@Entity
public class User {

	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(unique=true)
	private String emailid; 
	
	private String password;
	
	

	public User() {
		super();
	}

	public User(int id, String emailid, String password) {
		super();
		this.id = id;
		this.emailid = emailid;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", emailid=" + emailid + ", password=" + password + "]";
	}
	
	
	
	
}
