package com.capgemini.empwebapp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@SuppressWarnings("serial")
@Data
@Entity
@Table(name="employee1")
public class EmployeeBeen implements Serializable {
	@Id
	@GeneratedValue
	private int id;
	@Column(unique = true)
	private String name;
	@Column
	private String email;
	@Column
	private String password;

}
