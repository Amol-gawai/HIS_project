package com.amol.binding;

public class SsaResponse {
	private Long citizen_ssn;

	private String state_name;
	
	private String plan_name;

	public String getPlan_name() {
		return plan_name;
	}

	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}

	public Long getCitizen_ssn() {
		return citizen_ssn;
	}

	public void setCitizen_ssn(Long citizen_ssn) {
		this.citizen_ssn = citizen_ssn;
	}

	public String getState_name() {
		return state_name;
	}

	public void setState_name(String state_name) {
		this.state_name = state_name;
	}

	@Override
	public String toString() {
		return "SsaResponse [citizen_ssn=" + citizen_ssn + ", state_name=" + state_name + ", plan_name=" + plan_name
				+ "]";
	}

	

}
