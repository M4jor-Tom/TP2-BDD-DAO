package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class Customer {

	@Id
	@Column(length = 6, nullable = false)
	private String custCode;

	@ManyToOne
	@JoinColumn(unique = false, nullable = false, updatable = true)
	private Agent agent;

	@Column(length = 40, nullable = false)
	private String custName;
	@Column(length = 35)
	private String custCity;
	@Column(length = 35, nullable = false)
	private String workingArea;
	@Column(length = 20, nullable = false)
	private String custCountry;
	private Integer grade;
	@Column(name = "OPENING_AMT", length = 12, precision = 2, nullable = false)
	private Float openingAtm;
	@Column(name = "RECEIVE_AMT", length = 12, precision = 2, nullable = false)
	private Float receiveAtm;
	@Column(name = "PAYMENT_AMT", length = 12, precision = 2, nullable = false)
	private Float paymentAtm;
	@Column(name = "OUTSTANDING_AMT", length = 12, precision = 2, nullable = false)
	private Float outStandingAtm;
	@Column(length = 17, nullable = false)
	private String phoneNo;
	
	public Customer() {
		
	}
	
	public Customer(
			String custCode,
			Agent agent,
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
		setAgent(agent);
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
	
	public String getCustCode() {
		return custCode;
	}
	
	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}
	
	public Agent getAgent() {
		return agent;
	}
	
	public void setAgent(Agent agent) {
		this.agent = agent;
	}
	
	public String getCustName() {
		return custName;
	}
	
	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	public String getCustCity() {
		return custCity;
	}
	
	public void setCustCity(String custCity) {
		this.custCity = custCity;
	}
	
	public String getWorkingArea() {
		return workingArea;
	}
	
	public void setWorkingArea(String workingArea) {
		this.workingArea = workingArea;
	}
	
	public String getCustCountry() {
		return custCountry;
	}
	
	public void setCustCountry(String custCountry) {
		this.custCountry = custCountry;
	}
	
	public Integer getGrade() {
		return grade;
	}
	
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	
	public Float getOpeningAtm() {
		return openingAtm;
	}
	
	public void setOpeningAtm(Float openingAtm) {
		this.openingAtm = openingAtm;
	}
	
	public Float getReceiveAtm() {
		return receiveAtm;
	}
	
	public void setReceiveAtm(Float receiveAtm) {
		this.receiveAtm = receiveAtm;
	}
	
	public Float getPaymentAtm() {
		return paymentAtm;
	}
	
	public void setPaymentAtm(Float paymentAtm) {
		this.paymentAtm = paymentAtm;
	}
	
	public Float getOutStandingAtm() {
		return outStandingAtm;
	}
	
	public void setOutStandingAtm(Float outStandingAtm) {
		this.outStandingAtm = outStandingAtm;
	}
	
	public String getPhoneNo() {
		return phoneNo;
	}
	
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
}