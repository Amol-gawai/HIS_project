package com.amol.binding;

public class SsaRequest {
	private String citzen_name;

	private String citzen_dob;

	private Long citzen_ssn;
	
	private String plan_name;

	public String getPlan_name() {
		return plan_name;
	}

	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}

	public String getCitzen_name() {
		return citzen_name;
	}

	public void setCitzen_name(String citzen_name) {
		this.citzen_name = citzen_name;
	}

	public String getCitzen_dob() {
		return citzen_dob;
	}

	public void setCitzen_dob(String citzen_dob) {
		this.citzen_dob = citzen_dob;
	}

	public Long getCitzen_ssn() {
		return citzen_ssn;
	}

	public void setCitzen_ssn(Long citzen_ssn) {
		this.citzen_ssn = citzen_ssn;
	}

	@Override
	public String toString() {
		return "SsaRequest [citzen_name=" + citzen_name + ", citzen_dob=" + citzen_dob + ", citzen_ssn=" + citzen_ssn
				+ ", plan_name=" + plan_name + "]";
	}

	

}
