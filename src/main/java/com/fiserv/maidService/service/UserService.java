package com.fiserv.maidService.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fiserv.maidService.entity.User;
import com.fiserv.maidService.repo.UserInterface;

@Service
public class UserService {
	
	@Autowired
	private UserInterface userInterface;

	public User insertuser(User u) {
	
	User user=	userInterface.save(u);
		return user;
	}

	public List<User> getAll() {
	
		return userInterface.findAll();
	}

	public String deleteuser(String emailid) {
		
		userInterface.deleteByemailid(emailid);
		
		return "User deleted Successfully";
	}

	public String userUpdatebyid(int id, @Valid User u)
	{
	
		User user=userInterface.getById(id);
		user.setEmailid(u.getEmailid());
		user.setPassword(u.getPassword());
		
		userInterface.save(user);
		return "user updated succussfully";
	}

}
