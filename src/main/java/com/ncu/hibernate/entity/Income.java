package com.ncu.hibernate.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Income {
	private double salary;
	private String incomeSource1;
	private String incomeSource2;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getIncomeSource1() {
		return incomeSource1;
	}
	public void setIncomeSource1(String incomeSource1) {
		this.incomeSource1 = incomeSource1;
	}
	public String getIncomeSource2() {
		return incomeSource2;
	}
	public void setIncomeSource2(String incomeSource2) {
		this.incomeSource2 = incomeSource2;
	}
	@Override
	public String toString() {
		return "Income [salary=" + salary + ", incomeSource1=" + incomeSource1 + ", incomeSource2=" + incomeSource2
				+ "]";
	}
	public Income() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Income(double salary, String incomeSource1, String incomeSource2) {
		super();
		this.salary = salary;
		this.incomeSource1 = incomeSource1;
		this.incomeSource2 = incomeSource2;
	}
	
	
}
