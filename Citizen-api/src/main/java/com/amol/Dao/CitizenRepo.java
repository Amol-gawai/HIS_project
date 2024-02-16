package com.amol.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amol.Entity.CitizensInfo;
@Repository
public interface CitizenRepo extends JpaRepository<CitizensInfo,Long>{

}
