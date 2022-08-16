package com.secondassessment;

import javax.persistence.*;

@Entity

public class Employeedetails {
	@Id
	
	//@GeneratedValue(strategy=GenerationType.AUTO)

	private int empno;
	private String name;
	private String designation;
	private double salary;
	

	public Employeedetails() {
		super();
		this.empno = empno;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
