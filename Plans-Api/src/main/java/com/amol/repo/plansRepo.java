package com.amol.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amol.entity.RiStatePlansInfo;
@Repository
public interface plansRepo extends JpaRepository<RiStatePlansInfo,Integer> {
	

}
