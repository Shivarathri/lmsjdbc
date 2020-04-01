package com.capgemini.hibernate.onetomany;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.capgemini.hibernate.dto.EmployeePrimaryInfo;

import lombok.Data;
import lombok.ToString.Exclude;
@Data
@Entity
@Table (name ="employee_educational_info")

public class Employee_Educational_Info implements Serializable { 
	@EmbeddedId
	private Employee_Educational_PK educationpk;
	@Column
	private String degree;
	@Column
	private String yop;
	@Column
	private String stream;
	@Column
	private String clgname;
	@Column
	private String universityname;
	@Column
	private double percentage;
	@Exclude
	@MapsId("id")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private EmployeePrimaryInfo primary;
}
