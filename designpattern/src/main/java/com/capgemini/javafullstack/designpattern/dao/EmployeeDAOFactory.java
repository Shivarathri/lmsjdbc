package com.capgemini.javafullstack.designpattern.dao;

public class EmployeeDAOFactory {
	private EmployeeDAOFactory() {}
	
	private static String dbInteractiontType = "hibernate";
	
	public static EmployeeDAO getInstance() {
		EmployeeDAO dao = null;
		if (dbInteractiontType.equals("jdbc")) {
			dao = new EmployeeDesignPatternJDBCImplements();
			
		} else  {
			dao = new EmployeeDesignPatternJPAImplements();
		}
		return dao;
	}

}
