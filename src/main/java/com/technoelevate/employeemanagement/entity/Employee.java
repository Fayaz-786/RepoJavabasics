package com.technoelevate.employeemanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employee-primary-Info")
public class Employee {
	@Id
	@Column(name="emp-id")
	private String empId;
	@Column(name="emp_name")
	private String empName;
	@Column(name="email_id")
	private String emailId;
	@Column(name="password")
	private String password;
	

}
