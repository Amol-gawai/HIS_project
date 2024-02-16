package com.amol.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amol.Dao.PlanRepo;
import com.amol.Entity.PlanDetails;
@Service
public class PlanServiceImpl implements PlanServise {

	@Autowired
	private PlanRepo planRepo;
	@Override
	public String addPlans(PlanDetails planD) {
		PlanDetails savee = planRepo.save(planD);
		if(savee !=null) {
	    	 return "plan got add successfully";
	     }
	    	 else {
	    		 return "plan not get added ";
	    	 }
	     
	}

	@Override
	public PlanDetails getPlan(Integer plan_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
