package com.capgemini.hibernate.onetomany;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;
@Data
@Embeddable
public class Employee_Address_PK implements Serializable {
	
	private int id;
	
	private String addrsstype;

}
