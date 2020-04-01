package com.capgemini.librarymanagementjdbc.dao;

import com.capgemini.librarymanagementjdbc.dto.UsersBean;

public interface UsersDAO {

	boolean register (UsersBean info);
	UsersBean auth(String email,String password);
}
