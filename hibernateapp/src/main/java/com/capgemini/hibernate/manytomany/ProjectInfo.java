package com.capgemini.hibernate.manytomany;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.capgemini.hibernate.dto.EmployeePrimaryInfo;

import lombok.Data;
import lombok.ToString.Exclude;
@Data
@Entity
@Table(name = "project_info")
public class ProjectInfo implements Serializable {
	@Id
	@Column
	private int pid;
	@Column
	private String pname;
	@Column
	private String startdate;
	@Column
	private String enddate;
	@Column
	private String technology;
	
	@Exclude
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name ="project_employee",joinColumns = @JoinColumn(name="pid"),inverseJoinColumns = @JoinColumn(name="id"))
	private List<EmployeePrimaryInfo> primary;
	
	

}
