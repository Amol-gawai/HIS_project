package com.amol.controller;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amol.binding.SsaRequest;
import com.amol.entity.UserDetails;
import com.amol.service.AppService;

@RestController
public class AppController {
	@Autowired
	private AppService appSer;
	
	@PostMapping("/sendApp")
	public String creatApp(@RequestBody SsaRequest sr)
	{
		return appSer.checkRIssn(sr);
		
	}
	@GetMapping("/getAll")
	public List<UserDetails> getAllApp() {
		List<UserDetails> allApp = appSer.getAllApp();
		
		return allApp;
		
	}
	
	
	

}