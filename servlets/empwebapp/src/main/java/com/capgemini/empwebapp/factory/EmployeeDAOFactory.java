package com.capgemini.empwebapp.factory;

import com.capgemini.empwebapp.dao.EmployeeDAO;
import com.capgemini.empwebapp.dao.EmployeeDAOImplements;

public class EmployeeDAOFactory {
	private EmployeeDAOFactory() {}
	
	public static EmployeeDAO getEmployeeDAO() {
		return new EmployeeDAOImplements();
	}

}
