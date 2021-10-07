package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ORDERS")
public class Order {

	@Id
	@Column(length = 6, nullable = false)
	private Integer ordNum;

	@Column(length = 6, nullable = false)
	private String custCode;
	@Column(length = 6, nullable = false)
	private String agentCode;

	@Column(length = 12, precision = 2, nullable = false)
	private Float ordAmount;
	@Column(length = 12, precision = 2, nullable = false)
	private Float advanceAmount;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
	private Date ordDate;
	@Column(length = 60, nullable = false)
	private String ordDescription;
	
	public Order() {
		
	}

	public Order(
			Integer ordNum,
			String custCode,
			String agentCode,
			Float ordAmount,
			Float advanceAmount,
			Date ordDate,
			String ordDescription
		) {
		super();
		setOrdNum(ordNum);
		setCustCode(custCode);
		setAgentCode(agentCode);
		setOrdAmount(ordAmount);
		setAdvanceAmount(advanceAmount);
		setOrdDate(ordDate);
		setOrdDescription(ordDescription);
	}

	private Integer getOrdNum() {
		return ordNum;
	}

	private void setOrdNum(Integer ordNum) {
		this.ordNum = ordNum;
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

	private Float getOrdAmount() {
		return ordAmount;
	}

	private void setOrdAmount(Float ordAmount) {
		this.ordAmount = ordAmount;
	}

	private Float getAdvanceAmount() {
		return advanceAmount;
	}

	private void setAdvanceAmount(Float advanceAmount) {
		this.advanceAmount = advanceAmount;
	}

	private Date getOrdDate() {
		return ordDate;
	}

	private void setOrdDate(Date ordDate) {
		this.ordDate = ordDate;
	}

	private String getOrdDescription() {
		return ordDescription;
	}

	private void setOrdDescription(String ordDescription) {
		this.ordDescription = ordDescription;
	}
}