package com.capgemini.javafullstack.dao;

import java.util.List;

import com.capgemini.javafullstack.jpqldto.Employee;

public interface EmployeeDAO {
	boolean updateEmployeeInfo(Employee info);
	boolean deleteEmployeeInfo(int id);
	boolean createEmployeeInfo(Employee info);
	List<Employee> getALLInfo();
	Employee getEmployeeDetails(int id);

}
