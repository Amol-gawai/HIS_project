package com.amol.Service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.amol.Entity.PlanDetails;

@Service

public interface PlanServise {
	
	public String addPlans(PlanDetails planD);
	
	public PlanDetails getPlan(Integer plan_id);
	
}
