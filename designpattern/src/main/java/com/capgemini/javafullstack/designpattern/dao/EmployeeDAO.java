package com.capgemini.javafullstack.designpattern.dao;

import java.util.List;

import com.capgemini.javafullstack.designpattern.dto.Employee;

public interface EmployeeDAO  {
	boolean updateEmployeeInfo(Employee info);
	boolean deleteEmployeeInfo(int id);
	boolean createEmployeeInfo(Employee info);
	List<Employee> getALLInfo();
	Employee getEmployeeDetails(int id);

}
