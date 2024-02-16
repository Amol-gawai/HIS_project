package com.amol.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class RiStatePlansInfo {
	@Id
	private Integer plan_id; 
	
	private String plan_name; 
	
	private Date  plan_start; 
	
	private Date  plan_end; 
	
	private String paln_statuse ;
	
	public Integer getPlan_id() {
		return plan_id;
	}
	public void setPlan_id(Integer plan_id) {
		this.plan_id = plan_id;
	}
	public String getPlan_name() {
		return plan_name;
	}
	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}
	public Date getPlan_start() {
		return plan_start;
	}
	public void setPlan_start(Date plan_start) {
		this.plan_start = plan_start;
	}
	public Date getPlan_end() {
		return plan_end;
	}
	public void setPlan_end(Date plan_end) {
		this.plan_end = plan_end;
	}
	public String getPaln_statuse() {
		return paln_statuse;
	}
	public void setPaln_statuse(String paln_statuse) {
		this.paln_statuse = paln_statuse;
	}
	@Override
	public String toString() {
		return "RiStatePlansInfo [plan_id=" + plan_id + ", plan_name=" + plan_name + ", plan_start=" + plan_start
				+ ", plan_end=" + plan_end + ", paln_statuse=" + paln_statuse + "]";
	} 
 
	
}
