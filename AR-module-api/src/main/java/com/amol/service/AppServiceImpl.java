package com.amol.service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.amol.binding.SsaRequest;
import com.amol.binding.SsaResponse;
import com.amol.entity.UserDetails;
import com.amol.repo.CitizenEntity;
import com.amol.utils.AppNoGeneration;

@Service
public class AppServiceImpl implements AppService{
	@Autowired
	private CitizenEntity crepo;
	@Autowired
	private AppNoGeneration appgen;
	@Autowired
	private AppNoGeneration appno;

	@Override
	public UserDetails getCreateApp(SsaRequest ssaReq) {
		
		ssaReq.getCitzen_ssn();
	
		return null;
	}

	@Override
	public List<UserDetails> getAllApp() {
		
		return crepo.findAll();
	}

	@Override
	public String checkRIssn(SsaRequest sr) {
		
			
				RestTemplate rt=new RestTemplate();
			  ResponseEntity<SsaResponse> rpe = rt.postForEntity("http://localhost:9090/Citizen",sr, SsaResponse.class);
				SsaResponse body = rpe.getBody();
				
				if(body!=null) {
					if(body.getState_name().equalsIgnoreCase("Rhode Island")) {
						UserDetails ce=new UserDetails();
						Integer num = appno.generate(0, 9);
						ce.setAppnumber(num);
						ce.setFull_name(sr.getCitzen_name());
						ce.setDob(sr.getCitzen_dob());
						ce.setPlan_name(sr.getPlan_name());
						ce.setSsn(sr.getCitzen_ssn());
						UserDetails save = crepo.save(ce);
						return save.toString();
					}
				}
				return new UserDetails().toString();
			}
	}
	
	

	
	

	
