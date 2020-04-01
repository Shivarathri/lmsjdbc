package com.capgemini.springmvc.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.Data;
@Data
@Entity  
@Table(name ="EmployeePrimaryInfo")
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
	private String password;
	
}
