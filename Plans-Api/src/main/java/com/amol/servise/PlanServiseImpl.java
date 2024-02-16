package com.amol.servise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amol.entity.RiStatePlansInfo;
import com.amol.repo.plansRepo;
@Service
public class PlanServiseImpl implements PlanServise{

	@Autowired
	private plansRepo prepo;
	@Override
	public RiStatePlansInfo addPlans(RiStatePlansInfo plans) {
		RiStatePlansInfo bb = prepo.save(plans);
		return bb;
	}

	@Override
	public String updatePlans(RiStatePlansInfo plans) {
	
		
		return null;
	}

	@Override
	public RiStatePlansInfo getPlan(Integer plan_id) {
		
		return prepo.getById(plan_id);
	}

	@Override
	public List<RiStatePlansInfo> getAllPlan() {
		
		return prepo.findAll();
	}

	@Override
	public String deletPlan(Integer plan_id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
