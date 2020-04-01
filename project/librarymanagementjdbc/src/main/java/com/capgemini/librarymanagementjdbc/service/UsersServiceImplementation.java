package com.capgemini.librarymanagementjdbc.service;

import com.capgemini.librarymanagementjdbc.dao.UsersDAO;
import com.capgemini.librarymanagementjdbc.dto.UsersBean;
import com.capgemini.librarymanagementjdbc.factory.UserFactory;

public class UsersServiceImplementation implements UsersService {

	UsersDAO dao = UserFactory.getUsersDAO();

	@Override
	public boolean register(UsersBean info) {
		// TODO Auto-generated method stub
		return dao.register(info);
	}

	@Override
	public UsersBean auth(String email, String password) {
		// TODO Auto-generated method stub
		return dao.auth(email, password);
	}


}
