package com.capgemini.springrest.beans;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;
@Data
@Entity  
@Table(name ="EmployeePrimaryInfo")
@JsonRootName("employeeInfo")
public class EmployeePrimaryInfo implements Serializable {
	@Id
	@Column
	
	private int id;
	@Column
	private String name;
	@Column
	private String officialemail;
	@Column
	private long mobileno;
	@Column
	private String designation;
	@Column
	private String bloodgroup;
	@Column
	private double salary;
	@Column
	private int deptno;
	@Column
	private String doj;
	@Column
	private int managerid;
	@Column
	//@JsonIgnore
	private String password;
	
}
