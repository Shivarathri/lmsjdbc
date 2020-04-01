package com.javafullstack.jdbcapp.common;


import java.util.Iterator;
import java.util.List;

import com.javafullstack.jdbcapp.dao.EmployeeDAO;
import com.javafullstack.jdbcapp.dao.EmployeeDAOJDBCImplement;
import com.javafullstack.jdbcapp.dto.Employee;

public class MyFirstJDBC {

	public static void main(String[] args) {
		System.out.println("main method");
		
		//EmployeeDAOJDBCImplement dao = new EmployeeDAOJDBCImplement();
		EmployeeDAO dao = new EmployeeDAOJDBCImplement();
		//Employee emp = dao.getEmployeeDetails(2);
		
		
		System.out.println("EmployeeDA0 object creation");
		
		/*List<Employee> l =dao.getALLInfo();
		Iterator<Employee> itr = l.iterator();
		while (itr.hasNext()) {
			Employee emp = itr.next();
		
		
		System.out.println("============================================");
		System.out.println("Employee ID...."+emp.getId());
		System.out.println("Employee NAME...."+emp.getName());
		System.out.println("Employee EMAIL...."+emp.getEmail());
		System.out.println("Employee PHONE...."+emp.getPhone());
		System.out.println("Employee SALARY...."+emp.getSalary());
		System.out.println("Employee DEPTID...."+emp.getId());
		System.out.println("Employee boodGROUP...."+emp.getBoodgroup());
		System.out.println("Employee AGE...."+emp.getAge());
		System.out.println("Employee DOB...."+emp.getDob());
		
		
		System.out.println("********************************************************");
		}*/
		/*Employee ep = new Employee();
		
		ep.setName("RAVI KUMAR");
		ep.setId(3);
		boolean rs= dao.updateEmployeeInfo(ep);
		if (rs=true) {
		System.out.println("No. of rows affected "+rs);
		} else {
			System.out.println("no record updated");
		}*/

		Employee ep = new Employee();
		
		/*boolean rs= dao.deleteEmployeeInfo(3);
		
		System.out.println("Record is deleted "+rs);
		*/
		
		ep.setId(17);
		ep.setName("SHIVA");
		ep.setEmail("rahul@gmail.com");
		ep.setPhone(987654321);
		ep.setSalary(20000);
		ep.setDeptid(10);
		
		
		
		boolean rs= dao.createEmployeeInfo(ep);
		System.out.println("no of rows affected "+rs);
		
		
		
		
		
	/*	Employee ep = new Employee();
		boolean rs= dao.createEmployeeInfo(ep);
		if (rs==true) {
		System.out.println("No. of records inserted is "+rs);
		} else {
			System.out.println("no records created");
		}*/
	}

}
