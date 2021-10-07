package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Agent {

	@Id
	@GeneratedValue
	private String agentCode;

	private String agentName;
	private Float commission;
	private String phoneNo;
	private String country;

	public Agent(String agentCode, String agentName, Float commission, String phoneNo, String country) {
		super();
		setAgentCode(agentCode);
		setAgentName(agentName);
		setCommission(commission);
		setPhoneNo(phoneNo);
		setCountry(country);
	}
	
	private String getAgentCode() {
		return agentCode;
	}

	private void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	private String getAgentName() {
		return agentName;
	}

	private void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	private Float getCommission() {
		return commission;
	}

	private void setCommission(Float commission) {
		this.commission = commission;
	}

	private String getPhoneNo() {
		return phoneNo;
	}

	private void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	private String getCountry() {
		return country;
	}

	private void setCountry(String country) {
		this.country = country;
	}
}