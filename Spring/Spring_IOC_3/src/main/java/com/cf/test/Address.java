package com.cf.test;

public class Address {
	private String city;
	private String state;
	private String postalcode;

	public Address(String city, String state, String postalcode) {
		this.city = city;
		this.state = state;
		this.postalcode = postalcode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", postalcode="
				+ postalcode + "]";
	}

}