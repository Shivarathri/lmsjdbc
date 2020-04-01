package com.capgemini.javafullstack.jpqldto;

import java.util.Iterator;
import java.util.List;

import com.capgemini.javafullstack.dao.EmployeeDAO;
import com.capgemini.javafullstack.dao.EmployeeHibernateDAOImplements;

public class MyJPQLTest {
	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeHibernateDAOImplements();
		Employee emp = new Employee();
		
		                                                             // update 
	/*	emp.setId(5);
		boolean rs= dao.updateEmployeeInfo(emp);
		*/
		
		                                                             // delete
		//boolean rs = dao.deleteEmployeeInfo(6);
		
	
														
		
		                                                     	// create
		emp.setId(4);
		emp.setName("PRASHANTH");
		emp.setEmail("prashanth@gmail.com");
		emp.setPhone(987654321);
		emp.setDeptid(20);
		emp.setBoodgroup("b+");
		emp.setAge(20);
		emp.setDob("1998-09-08");
		
		boolean rs = dao.createEmployeeInfo(emp);
		System.out.println(rs);
		
		
		
		
		                                                         // retrieve all records
		
		//emp=(Employee) dao.getALLInfo();
		
		                                                         // retrieve single data
		
		//emp = dao.getEmployeeDetails(1);
	}

}
