package com.amol.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.amol.binding.SsaRequest;
import com.amol.entity.UserDetails;
@Service
public interface AppService {
	
	public String checkRIssn(SsaRequest ssaReq);
	
	public UserDetails getCreateApp(SsaRequest ssaReq);
	
	public List<UserDetails> getAllApp();
 
}
