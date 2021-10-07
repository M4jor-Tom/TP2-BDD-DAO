package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AGENTS")
public class Agent {

	@Id
	@Column(length = 6, nullable = false)
	private String agentCode;

	@Column(length = 40)
	private String agentName;
	@Column(length = 35)
	private String workingArea;
	@Column(length = 10, precision = 2)
	private Float commission;
	@Column(length = 15)
	private String phoneNo;
	@Column(length = 25)
	private String country;
	
	public Agent() {
		
	}

	public Agent(String agentName, Float commission, String phoneNo, String country) {
		super();
		setAgentName(agentName);
		setCommission(commission);
		setPhoneNo(phoneNo);
		setCountry(country);
	}
	
	public String getAgentCode() {
		return agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getWorkingArea() {
		return workingArea;
	}

	public void setWorkingArea(String workingArea) {
		this.workingArea = workingArea;
	}

	public Float getCommission() {
		return commission;
	}

	public void setCommission(Float commission) {
		this.commission = commission;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}