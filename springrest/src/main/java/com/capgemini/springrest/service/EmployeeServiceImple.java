package com.capgemini.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.springrest.beans.EmployeePrimaryInfo;
import com.capgemini.springrest.dao.EmployeeDAO;
@Service
public class EmployeeServiceImple implements EmployeeService {
	@Autowired
	private EmployeeDAO dao;
	@Override
	public EmployeePrimaryInfo auth(int id, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeePrimaryInfo bean) {
		
		return dao.updateEmployeeInfo(bean);
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		
		return dao.deleteEmployeeInfo(id);
	}

	@Override
	public boolean createEmployeeInfo(EmployeePrimaryInfo bean) {
		
		return dao.createEmployeeInfo(bean);
	}

	@Override
	public List<EmployeePrimaryInfo> getALLInfo() {
		
		return dao.getALLInfo();
	}

	@Override
	public EmployeePrimaryInfo getEmployeeDetails(int id) {
		
		return dao.getEmployeeDetails(id);
	}

}
