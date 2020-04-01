package com.capgemini.springrest.service;

import java.util.List;

import com.capgemini.springrest.beans.EmployeePrimaryInfo;

public interface EmployeeService {
	EmployeePrimaryInfo auth(int id, String password);
	boolean updateEmployeeInfo(EmployeePrimaryInfo bean);
	boolean deleteEmployeeInfo(int id);
	boolean createEmployeeInfo(EmployeePrimaryInfo bean);
	List<EmployeePrimaryInfo> getALLInfo();
	EmployeePrimaryInfo getEmployeeDetails(int id);
}
