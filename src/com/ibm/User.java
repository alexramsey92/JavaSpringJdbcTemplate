package com.ibm;

public class User {
	
	// defines the user class and corresponding data fields in the database
	// varchar
	public String emailAddress;
	// varchar
	public String password;
	// char 1 fixed width
	public String activeFlag;
	// char 6 fixed width
	public String userRole;
	
	// setters and getters for the fields
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	
	
	
}
