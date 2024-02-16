package com.amol.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amol.entity.UserDetails;

public interface CitizenEntity extends JpaRepository<UserDetails,Long >{

}
