package com.mlb.common.form;

import org.hibernate.validator.constraints.NotEmpty;

public class RegistrationForm {
	@NotEmpty(message="You must select a user role.")
	private String user_role;
	@NotEmpty(message="Company / Team Name my not be blank.")
	private String company;
	@NotEmpty(message="Required field.")
	private String firstname;
	@NotEmpty(message="Required field.")
	private String lastname;
	@NotEmpty(message="Required field.")
	private String address1;
	private String address2;
	@NotEmpty(message="Required field.")
	private String city;
	private String state;
	private String country;
	private String postalcode;
	private String phone;
	private String mobile;
	private String fax;
	@NotEmpty(message="Required field.")
	private String email;
	@NotEmpty(message="Required field.")
	private String confirmemail;
	private String altemail;
	@NotEmpty(message="Required field.")
	private String secret;
	@NotEmpty(message="Required field.")
	private String secretanswer;
	public String getUser_role() {
		return user_role;
	}
	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getConfirmemail() {
		return confirmemail;
	}
	public void setConfirmemail(String confirmemail) {
		this.confirmemail = confirmemail;
	}
	public String getAltemail() {
		return altemail;
	}
	public void setAltemail(String altemail) {
		this.altemail = altemail;
	}
	public String getSecret() {
		return secret;
	}
	public void setSecret(String secret) {
		this.secret = secret;
	}
	public String getSecretanswer() {
		return secretanswer;
	}
	public void setSecretanswer(String secretanswer) {
		this.secretanswer = secretanswer;
	}
	
}
