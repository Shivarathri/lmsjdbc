package com.capgemini.hibernate.onetoone;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.capgemini.hibernate.dto.EmployeePrimaryInfo;

import lombok.Data;
import lombok.ToString.Exclude;
@Data
@Entity
@Table(name ="employee_secondary_info")
public class Employee_Secondary_Info implements Serializable {
	@Id
	
	private int id;
	@Column
	private int age;
	@Column
	private String dob;
	@Column
	private String gender;
	@Column
	private String personalemail;
	@Column
	private String fathername;
	@Column
	private String mothername;
	@Column
	private String marriedstatus;
	@Column
	private String nationality;
	@Column
	private String govtid;
	@Exclude
	@MapsId
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private EmployeePrimaryInfo primary;
	
	/*
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPersonalemail() {
		return personalemail;
	}
	public void setPersonalemail(String personalemail) {
		this.personalemail = personalemail;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	public String getMarriedstatus() {
		return marriedstatus;
	}
	public void setMarriedstatus(String marriedstatus) {
		this.marriedstatus = marriedstatus;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getGovtid() {
		return govtid;
	}
	public void setGovtid(String govtid) {
		this.govtid = govtid;
	}
	
	*/
	
	

}
