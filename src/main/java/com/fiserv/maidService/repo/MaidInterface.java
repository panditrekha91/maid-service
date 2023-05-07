package com.fiserv.maidService.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fiserv.maidService.entity.Maid;

@Repository
public interface MaidInterface extends JpaRepository<Maid, Integer>{

	public List<Maid> findByWorkType(String workType);
}
