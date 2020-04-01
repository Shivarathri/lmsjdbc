package com.capgemini.springmvc.dao;

import java.util.List;

import com.capgemini.springmvc.bean.EmployeePrimaryInfo;

public interface EmployeeDAO {
	EmployeePrimaryInfo auth(int id, String password);
	boolean updateEmployeeInfo(EmployeePrimaryInfo bean);
	boolean deleteEmployeeInfo(int id);
	boolean createEmployeeInfo(EmployeePrimaryInfo bean);
	List<EmployeePrimaryInfo> getALLInfo();
	EmployeePrimaryInfo getEmployeeDetails(int id);
}
