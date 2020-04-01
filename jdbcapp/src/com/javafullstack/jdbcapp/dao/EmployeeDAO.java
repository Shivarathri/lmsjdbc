package com.javafullstack.jdbcapp.dao;

import java.util.List;

import com.javafullstack.jdbcapp.dto.Employee;

public interface EmployeeDAO {
	boolean updateEmployeeInfo(Employee info);
	boolean deleteEmployeeInfo(int id);
	boolean createEmployeeInfo(Employee info);
	List<Employee> getALLInfo();
	Employee getEmployeeDetails(int id);
	
	

}
