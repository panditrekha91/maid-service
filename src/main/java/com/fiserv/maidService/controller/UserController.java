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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fiserv.maidService.entity.User;
import com.fiserv.maidService.repo.UserInterface;
import com.fiserv.maidService.service.UserService;

@RestController
public class UserController {
	
	
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/adduser")
	public ResponseEntity<User> insert(@Valid @RequestBody User u)
	{
		
		return new ResponseEntity<>(userService.insertuser(u), HttpStatus.CREATED);
		
	}
	
	@GetMapping("/displayuser")
	public ResponseEntity<List<User>> displayAllUser()
	{
		List<User> u=userService.getAll();
		if(!(u.isEmpty()))
		{
		return  ResponseEntity.ok(u);
		}
		else {
			return ResponseEntity.noContent().build();    // not found status return 
		}
		
	}

		@DeleteMapping("/delete")
		public String deletebyUsername(@RequestParam String emailid)
		{
			String s=userService.deleteuser(emailid);
			return s;
		
	}

	
}
