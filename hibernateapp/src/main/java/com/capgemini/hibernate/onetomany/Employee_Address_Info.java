package com.capgemini.hibernate.onetomany;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.capgemini.hibernate.dto.EmployeePrimaryInfo;

import lombok.Data;
import lombok.ToString.Exclude;
@Data
@Entity
@Table(name ="employee_address_info")
public class Employee_Address_Info implements Serializable {
	@EmbeddedId
	private Employee_Address_PK addresspk;
	
	@Column
	private String houseno;
	@Column
	private String address1;
	@Column
	private String address2;
	@Column
	private String landmark;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private int pincode;
	@Exclude
	@MapsId("id")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private EmployeePrimaryInfo primary;
	

}
