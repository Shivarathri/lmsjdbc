package com.capgemini.librarymanagementjdbc.factory;

import com.capgemini.librarymanagementjdbc.dao.AdminDAO;
import com.capgemini.librarymanagementjdbc.dao.AdminDAOImplementation;
import com.capgemini.librarymanagementjdbc.service.AdminServiceDAO;
import com.capgemini.librarymanagementjdbc.service.AdminServiceImplementation;

public class AdminFactory {
	public static AdminDAO getAdminDAO() {
		return new AdminDAOImplementation();
	}
	public static AdminServiceDAO getAdminServiceDAO() {
		return new AdminServiceImplementation();
	}
	

}
