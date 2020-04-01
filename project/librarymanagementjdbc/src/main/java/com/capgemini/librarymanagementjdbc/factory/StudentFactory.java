package com.capgemini.librarymanagementjdbc.factory;

import com.capgemini.librarymanagementjdbc.dao.StudentDAO;
import com.capgemini.librarymanagementjdbc.dao.StudentDAOImplementation;
import com.capgemini.librarymanagementjdbc.service.UsersService;
import com.capgemini.librarymanagementjdbc.service.UsersServiceImplementation;


public class StudentFactory {
	public static StudentDAO getStudentDAO() {
		return new StudentDAOImplementation();
	}
	public static UsersService getUsersService() {
		return new  UsersServiceImplementation();


	}
}
