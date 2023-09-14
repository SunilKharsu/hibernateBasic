package com.ncu.hibernate.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
	private String localityName;
	private String streetName;
	private String district;
	private String state;
	private String pinCode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getLocalityName() {
		return localityName;
	}
	public void setLocalityName(String localityName) {
		this.localityName = localityName;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public Address(String localityName, String streetName, String district, String state, String pinCode) {
		super();
		this.localityName = localityName;
		this.streetName = streetName;
		this.district = district;
		this.state = state;
		this.pinCode = pinCode;
	}

}
