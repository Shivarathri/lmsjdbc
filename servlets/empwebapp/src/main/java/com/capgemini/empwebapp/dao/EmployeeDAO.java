package com.capgemini.empwebapp.dao;



import java.util.List;

import com.capgemini.empwebapp.dto.EmployeeBeen;

public interface EmployeeDAO {
	boolean register(EmployeeBeen bean);
	List<EmployeeBeen> search(String name);
	boolean changePassword(int id, String password);
	EmployeeBeen auth(String email, String password);
}
