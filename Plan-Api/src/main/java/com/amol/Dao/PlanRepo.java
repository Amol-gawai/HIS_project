package com.amol.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amol.Entity.PlanDetails;
@Repository
public interface PlanRepo extends JpaRepository<PlanDetails,Integer>{

}
