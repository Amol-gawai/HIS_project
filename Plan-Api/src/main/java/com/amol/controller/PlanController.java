package com.amol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amol.Entity.PlanDetails;
import com.amol.Service.PlanServise;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class PlanController {
	@Autowired
	private PlanServise planS;
	
	@PostMapping("/addPlan")
	public String addPlan(@RequestBody PlanDetails planD) {
		     return planS.addPlans(planD);
		     
	
	}
}
