package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ORDERS")
public class Order {

	@Id
	@Column(length = 6, nullable = false)
	private Integer ordNum;

	@ManyToOne
	@JoinColumn(unique = false, nullable = false, updatable = true)
	private Customer customer;
	@ManyToOne
	@JoinColumn(unique = false, nullable = false, updatable = true)
	private Agent agent;

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
			Customer customer,
			Agent agent,
			Float ordAmount,
			Float advanceAmount,
			Date ordDate,
			String ordDescription
		) {
		super();
		setCustomer(customer);
		setAgent(agent);
		setOrdAmount(ordAmount);
		setAdvanceAmount(advanceAmount);
		setOrdDate(ordDate);
		setOrdDescription(ordDescription);
	}

	public Integer getOrdNum() {
		return ordNum;
	}

	public void setOrdNum(Integer ordNum) {
		this.ordNum = ordNum;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public Float getOrdAmount() {
		return ordAmount;
	}

	public void setOrdAmount(Float ordAmount) {
		this.ordAmount = ordAmount;
	}

	public Float getAdvanceAmount() {
		return advanceAmount;
	}

	public void setAdvanceAmount(Float advanceAmount) {
		this.advanceAmount = advanceAmount;
	}

	public Date getOrdDate() {
		return ordDate;
	}

	public void setOrdDate(Date ordDate) {
		this.ordDate = ordDate;
	}

	public String getOrdDescription() {
		return ordDescription;
	}

	public void setOrdDescription(String ordDescription) {
		this.ordDescription = ordDescription;
	}
}