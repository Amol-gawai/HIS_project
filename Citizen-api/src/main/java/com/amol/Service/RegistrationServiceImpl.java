package com.amol.Service;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amol.Dao.CitizenRepo;
import com.amol.Entity.CitizensInfo;

@Service
public class RegistrationServiceImpl implements CitizenServices {
	@Autowired
	private CitizenRepo Crepo;

	@Override
	public String Czenlogin(String email, String pass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String CzenForgotPassword(String mail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String CzenRegister(CitizensInfo cinfo) {
		CitizensInfo csave =Crepo.save(cinfo);
		if(csave != null)
			return "User got gegistered";
		else
			return "try one more time";
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public CitizensInfo getCitizen(Long c_ssn) {
		
		return Crepo.getById(c_ssn);
				
	}

	
}
