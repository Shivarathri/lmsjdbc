package com.capgemini.springmvc.factory;

import com.capgemini.springmvc.dao.EmployeeDAO;
import com.capgemini.springmvc.dao.EmployeeDAOImple;
import com.capgemini.springmvc.service.EmployeeService;
import com.capgemini.springmvc.service.EmployeeServiceImple;

public class EmployeeFactory {
	public static EmployeeDAO getEmployeeDAO() {
		return new EmployeeDAOImple();
	}
	public static EmployeeService getEmployeeService() {
		return new EmployeeServiceImple();
	}
}
