package com.amol.Service;

import com.amol.Entity.CitizensInfo;

public interface CitizenServices {
	
	public String Czenlogin(String email,String pass);
	
	public String CzenForgotPassword(String mail);
	
	public String CzenRegister(CitizensInfo cinfo);
	
	public CitizensInfo getCitizen(Long c_ssn);
	
}
