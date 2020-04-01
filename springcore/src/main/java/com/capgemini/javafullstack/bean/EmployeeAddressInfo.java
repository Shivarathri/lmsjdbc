package com.capgemini.javafullstack.bean;

public class EmployeeAddressInfo {
	private int aid;
	private String city;
	private String addressType;

	public EmployeeAddressInfo() {
		System.out.println("Defalut Constructor");
	}

	public EmployeeAddressInfo(int aid, String city, String addressType) {

		this.aid = aid;
		this.city = city;
		this.addressType = addressType;
	}
	public void address() {
		System.out.println("Id---"+aid+"City----"+city+"AddressType---"+addressType);
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddreesType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

}
