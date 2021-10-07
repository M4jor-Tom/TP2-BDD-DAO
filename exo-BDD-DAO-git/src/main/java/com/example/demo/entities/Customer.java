package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue
	@Column(length = 6)
	private String custCode;

	@Column(length = 6)
	private String agentCode;

	@Column(length = 40)
	private String custName;
	@Column(length = 35)
	private String custCity;
	@Column(length = 35)
	private String workingArea;
	@Column(length = 20)
	private String custCountry;
	private Integer grade;
	@Column(length = 12, precision = 2)
	private Float openingAtm;
	@Column(length = 12, precision = 2)
	private Float receiveAtm;
	@Column(length = 12, precision = 2)
	private Float paymentAtm;
	@Column(length = 12, precision = 2)
	private Float outStandingAtm;
	@Column(length = 17)
	private String phoneNo;
	
	public Customer(
			String custCode,
			String agentCode,
			String custName,
			String custCity,
			String workingArea,
			String custCountry,
			Integer grade,
			Float openingAtm,
			Float receiveAtm,
			Float paymentAtm,
			Float outStandingAtm,
			String phoneNo
		) {
		super();
		setCustCode(custCode);
		setAgentCode(agentCode);
		setCustName(custName);
		setCustCity(custCity);
		setWorkingArea(workingArea);
		setCustCountry(custCountry);
		setGrade(grade);
		setOpeningAtm(openingAtm);
		setReceiveAtm(receiveAtm);
		setPaymentAtm(paymentAtm);
		setOutStandingAtm(outStandingAtm);
		setPhoneNo(phoneNo);
	}
	
	private String getCustCode() {
		return custCode;
	}
	
	private void setCustCode(String custCode) {
		this.custCode = custCode;
	}
	
	private String getAgentCode() {
		return agentCode;
	}
	
	private void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}
	
	private String getCustName() {
		return custName;
	}
	
	private void setCustName(String custName) {
		this.custName = custName;
	}
	
	private String getCustCity() {
		return custCity;
	}
	
	private void setCustCity(String custCity) {
		this.custCity = custCity;
	}
	
	private String getWorkingArea() {
		return workingArea;
	}
	
	private void setWorkingArea(String workingArea) {
		this.workingArea = workingArea;
	}
	
	private String getCustCountry() {
		return custCountry;
	}
	
	private void setCustCountry(String custCountry) {
		this.custCountry = custCountry;
	}
	
	private Integer getGrade() {
		return grade;
	}
	
	private void setGrade(Integer grade) {
		this.grade = grade;
	}
	
	private Float getOpeningAtm() {
		return openingAtm;
	}
	
	private void setOpeningAtm(Float openingAtm) {
		this.openingAtm = openingAtm;
	}
	
	private Float getReceiveAtm() {
		return receiveAtm;
	}
	
	private void setReceiveAtm(Float receiveAtm) {
		this.receiveAtm = receiveAtm;
	}
	
	private Float getPaymentAtm() {
		return paymentAtm;
	}
	
	private void setPaymentAtm(Float paymentAtm) {
		this.paymentAtm = paymentAtm;
	}
	
	private Float getOutStandingAtm() {
		return outStandingAtm;
	}
	
	private void setOutStandingAtm(Float outStandingAtm) {
		this.outStandingAtm = outStandingAtm;
	}
	
	private String getPhoneNo() {
		return phoneNo;
	}
	
	private void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
}