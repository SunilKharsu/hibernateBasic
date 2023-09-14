package com.ncu.hibernate.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cust_id", length = 10)
	private int customId;
	
	@Column(name = "customer_name", nullable = false, length = 50)
	private String customerNameString;
	
	@Column(name = "customer_email", unique = false)
	private String customerEmail;
	
	@Column(name = "customer_phone")
	private String customerPhone;
	
	@Embedded
	private Address address;
	
	@Embedded
	private Income income;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer( String customerNameString, String customerEmail, String customerPhone,
			Address address, Income income) {
		super();
		
		this.customerNameString = customerNameString;
		this.customerEmail = customerEmail;
		this.customerPhone = customerPhone;
		this.address = address;
		this.income = income;
	}

	@Override
	public String toString() {
		return "Customer [customId=" + customId + ", customerNameString=" + customerNameString + ", customerEmail="
				+ customerEmail + ", customerPhone=" + customerPhone + ", address=" + address + ", income=" + income
				+ "]";
	}

	

	public String getCustomerNameString() {
		return customerNameString;
	}

	public void setCustomerNameString(String customerNameString) {
		this.customerNameString = customerNameString;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Income getIncome() {
		return income;
	}

	public void setIncome(Income income) {
		this.income = income;
	}
	
	

}
