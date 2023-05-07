package com.fiserv.maidService.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fiserv.maidService.entity.User;

@Repository
public interface UserInterface extends JpaRepository<User,Integer> {

	@Transactional
	@Modifying
	@Query(value = "delete FROM User u WHERE u.emailid= :emailid") // SQL
	public void deleteByemailid(@Param("emailid") String emailid);
	
	
	
	
	
	
	

}
