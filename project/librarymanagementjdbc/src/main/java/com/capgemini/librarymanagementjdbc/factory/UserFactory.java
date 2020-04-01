package com.capgemini.librarymanagementjdbc.factory;

import com.capgemini.librarymanagementjdbc.dao.UsersDAO;
import com.capgemini.librarymanagementjdbc.dao.UsersDAOImplementation;
import com.capgemini.librarymanagementjdbc.service.UsersService;
import com.capgemini.librarymanagementjdbc.service.UsersServiceImplementation;

public class UserFactory {
	public static UsersDAO getUsersDAO() {
		return new UsersDAOImplementation();
	}
	public static UsersService  getAdminService() {
		return new  UsersServiceImplementation();
	}
}
