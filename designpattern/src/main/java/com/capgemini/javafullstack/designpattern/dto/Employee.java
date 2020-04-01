package com.capgemini.javafullstack.designpattern.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table
public class Employee implements Serializable{
	@Id
	@Column
	private int id ;
	@Column
	private String name;
	@Column
	private String email;
	@Column (name = "mobile_no")
	private long phone;
	@Column
	private double salary;
	@Column (name="deptno")
	private int deptid;
	@Column(name = "boodgroup")
	private String bloodgroup;
	@Column
	private int age;
	@Column
	private String dob;
}
