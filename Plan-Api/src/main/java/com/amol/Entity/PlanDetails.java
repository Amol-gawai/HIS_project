package com.amol.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Plans_Details")
public class PlanDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer plan_id;

	private String Plan_name;

	private String plan_status;

	private String plan_start;

	private String plan_end;

	public String getPlan_name() {
		return Plan_name;
	}

	public void setPlan_name(String plan_name) {
		Plan_name = plan_name;
	}

	public Integer getPlan_id() {
		return plan_id;
	}

	public void setPlan_id(Integer plan_id) {
		this.plan_id = plan_id;
	}

	public String getPlan_status() {
		return plan_status;
	}

	public void setPlan_status(String plan_status) {
		this.plan_status = plan_status;
	}

	public String getPlan_start() {
		return plan_start;
	}

	public void setPlan_start(String plan_start) {
		this.plan_start = plan_start;
	}

	public String getPlan_end() {
		return plan_end;
	}

	public void setPlan_end(String plan_end) {
		this.plan_end = plan_end;
	}

	@Override
	public String toString() {
		return "PlanDetails [Plan_name=" + Plan_name + ", plan_id=" + plan_id + ", plan_status=" + plan_status
				+ ", plan_start=" + plan_start + ", plan_end=" + plan_end + "]";
	}

}
