package com.task.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="User")
public class User {

	private String FirstName; 
	private String LastName;
	private String EmailId;
	private String Password;
	@Column(unique = true)
	@Id
	private int EmployeeId;
	private String OrganizationName;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public String getOrganizationName() {
		return OrganizationName;
	}

	public void setOrganizationName(String organizationName) {
		OrganizationName = organizationName;
	}

	@Override
	public String toString() {
		return "User [FirstName=" + FirstName + ", LastName=" + LastName + ", EmailId=" + EmailId + ", Password="
				+ Password + ", EmployeeId=" + EmployeeId + ", OrganizationName=" + OrganizationName + "]";
	}
	
	
}
