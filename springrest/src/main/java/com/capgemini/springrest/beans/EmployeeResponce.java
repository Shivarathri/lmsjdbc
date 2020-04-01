package com.capgemini.springrest.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class EmployeeResponce {
	private boolean error;
	private String message;
	private EmployeePrimaryInfo employeeInfo;
	private List<EmployeePrimaryInfo> employeeList;
}
