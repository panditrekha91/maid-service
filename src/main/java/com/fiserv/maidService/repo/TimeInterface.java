package com.fiserv.maidService.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fiserv.maidService.entity.TimeAvailability;

@Repository
public interface TimeInterface extends JpaRepository<TimeAvailability, Integer> {

}
