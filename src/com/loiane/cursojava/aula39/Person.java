package com.loiane.cursojava.aula39;

public class Person {

	private String name;
	private String address;
	private String telephone;
	private String mobilePhone;
	private String vat;
	protected String visibility; // this property will be visible for all package members

	public Person() {
	}

	public Person(String name, String address, String telephone) {
		super();
		this.name = name;
		this.address = address;
		this.telephone = telephone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getVAT() {
		return vat;
	}

	public void setVAT(String vat) {
		this.vat = vat;
	}
	
	
	//Added on class40
	public String getAddresslabel() {
		return this.getAddress();
	}

}
