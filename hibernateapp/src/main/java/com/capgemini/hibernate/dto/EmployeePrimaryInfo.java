package com.capgemini.hibernate.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.capgemini.hibernate.manytomany.ProjectInfo;
import com.capgemini.hibernate.onetomany.Employee_Address_Info;
import com.capgemini.hibernate.onetomany.Employee_Educational_Info;
import com.capgemini.hibernate.onetoone.Employee_Secondary_Info;

import lombok.Data;
@Data
@Entity
@Table(name ="employee_primary_info")
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
	private String blloodgroup;
	@Column
	private double salary;
	@Column
	private int deptno;
	@Column
	private String doj;
	@Column
	private int managerid;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "primary")
	private Employee_Secondary_Info secondary;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "primary")
	private List<Employee_Address_Info> pk;
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "primary")
	private List<ProjectInfo> project;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "primary")
	private List<Employee_Educational_Info> education;
	
	
	/*
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOfficialemail() {
		return officialemail;
	}
	public void setOfficialemail(String officialemail) {
		this.officialemail = officialemail;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getBlloodgroup() {
		return blloodgroup;
	}
	public void setBlloodgroup(String blloodgroup) {
		this.blloodgroup = blloodgroup;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public int getManagerid() {
		return managerid;
	}
	public void setManagerid(int managerid) {
		this.managerid = managerid;
	}
	*/
	

}
