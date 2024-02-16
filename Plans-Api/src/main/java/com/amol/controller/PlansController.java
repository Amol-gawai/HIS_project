package com.amol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amol.entity.RiStatePlansInfo;
import com.amol.servise.PlanServise;

@RestController
public class PlansController {
	
	@Autowired
	private PlanServise pser;
	
	@PostMapping("/addplan")
	public String sendPlan(@RequestBody RiStatePlansInfo pinfo) {
		
		RiStatePlansInfo b = pser.addPlans(pinfo);
		if(b.equals(null))
		return "plan not added";
		else
			return"not added";		
	
	}
	@GetMapping("/getplan")
	public RiStatePlansInfo getPlanInfo( @RequestBody Integer plan_id) {
		
		return pser.getPlan(plan_id);
		
	}
	@GetMapping("/getAllplans")
	public String getAllplans(){
		
		RiStatePlansInfo allPlans = (RiStatePlansInfo) pser.getAllPlan();
		
		return allPlans.toString();
		
	}

	
}
