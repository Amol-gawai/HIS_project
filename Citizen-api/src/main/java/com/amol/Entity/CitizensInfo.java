package com.amol.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CitizensInfo {
	
	private String c_name;
	
	@Id
	private Long c_ssn;
	
	private Integer c_phon;
	
	private String mail;
	
	private String mail_pass;
	
	private String c_gender;
	
	private Integer c_age;
	
	private Long c_Salary;

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public Long getC_ssn() {
		return c_ssn;
	}

	public void setC_ssn(Long c_ssn) {
		this.c_ssn = c_ssn;
	}

	public Integer getC_phon() {
		return c_phon;
	}

	public void setC_phon(Integer c_phon) {
		this.c_phon = c_phon;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMail_pass() {
		return mail_pass;
	}

	public void setMail_pass(String mail_pass) {
		this.mail_pass = mail_pass;
	}

	public String getC_gender() {
		return c_gender;
	}

	public void setC_gender(String c_gender) {
		this.c_gender = c_gender;
	}

	public Integer getC_age() {
		return c_age;
	}

	public void setC_age(Integer c_age) {
		this.c_age = c_age;
	}

	public Long getC_Salary() {
		return c_Salary;
	}

	public void setC_Salary(Long c_Salary) {
		this.c_Salary = c_Salary;
	}

	@Override
	public String toString() {
		return "CitizensInfo [c_name=" + c_name + ", c_ssn=" + c_ssn + ", c_phon=" + c_phon + ", mail=" + mail
				+ ", mail_pass=" + mail_pass + ", c_gender=" + c_gender + ", c_age=" + c_age + ", c_Salary=" + c_Salary
				+ "]";
	}
	
	
	
	

}
