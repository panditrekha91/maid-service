package com.fiserv.maidService.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

@Entity
public class Maid {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int maidid;
	
	@NotBlank(message = "username shouldn't be null")
	private String name;
	
	@NotBlank(message = "address shouldn't be null")
	private String address;
	
	@NotBlank(message = "address shouldn't be null")
	private String mobno;
	
	@Column(unique=true)
	private String maidemail;
	
	private String password;
	
	@NotBlank(message = "worktype shouldn't be null")
	private String workType;
	
	@OneToMany(mappedBy ="maid" ,cascade = CascadeType.ALL)
	private Set<TimeAvailability> timea;
	
	

	public Maid() {
		super();
	}

	

	public Maid(int maidid, @NotBlank(message = "username shouldn't be null") String name,
			@NotBlank(message = "address shouldn't be null") String address,
			@NotBlank(message = "address shouldn't be null") String mobno, String maidemail, String password,
			@NotBlank(message = "worktype shouldn't be null") String workType) {
		super();
		this.maidid = maidid;
		this.name = name;
		this.address = address;
		this.mobno = mobno;
		this.maidemail = maidemail;
		this.password = password;
		this.workType = workType;
	}



	public int getMaidid() {
		return maidid;
	}

	public void setMaidid(int maidid) {
		this.maidid = maidid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobno() {
		return mobno;
	}

	public void setMobno(String mobno) {
		this.mobno = mobno;
	}

	public String getMaidemail() {
		return maidemail;
	}

	public void setMaidemail(String maidemail) {
		this.maidemail = maidemail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

	public String getWorkType() {
		return workType;
	}

	public void setWorkType(String workType) {
		this.workType = workType;
	}

	@Override
	public String toString() {
		return "Maid [maidid=" + maidid + ", name=" + name + ", address=" + address + ", mobno=" + mobno
				+ ", maidemail=" + maidemail + ", password=" + password + "]";
	}
	
	
	
	
	
	
	
	
}
