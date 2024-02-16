package com.amol.servise;

import java.util.List;

import com.amol.entity.RiStatePlansInfo;


public interface PlanServise {
	
	public RiStatePlansInfo addPlans( RiStatePlansInfo plans);
	
	public String updatePlans(RiStatePlansInfo plans);
	
	public RiStatePlansInfo getPlan(Integer plan_id);
	
	public List<RiStatePlansInfo> getAllPlan();
	
	public String deletPlan(Integer plan_id);
	
	
}
