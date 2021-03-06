package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
 
@Entity
@Table(name = "PERSON")
public class Person {

	@Id
    @Column(name = "Id", nullable = false)
	@GeneratedValue
    private Long id;
 
    @Column(name = "Full_Name", length = 64, nullable = false)
    private String fullName;
 
    @Temporal(TemporalType.DATE)
    @Column(name = "Date_Of_Birth", nullable = false)
    private Date dateOfBirth;
    @Column(name = "Salary", nullable = false)
    private Float salary;

	public Person()
	{
		this("unkown", null, null);
	}
	
	public Person(String name)
	{
		this(name, null, null);
	}
 
    public Person(String fullName, Date dateOfBirth, Float salary) {
		super();
		setFullName(fullName);
		setDateOfBirth(dateOfBirth);
		setSalary(salary);
	}
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getFullName() {
        return fullName;
    }
 
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
 
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
 
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}
 
}