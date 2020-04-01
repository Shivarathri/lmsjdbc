package com.capgemini.javafullstack.controller;

import java.util.List;

import com.capgemini.javafullstack.designpattern.dao.EmployeeDAO;
import com.capgemini.javafullstack.designpattern.dao.EmployeeDesignPatternJPAImplements;
import com.capgemini.javafullstack.designpattern.dto.Employee;

public class TestEmployeeJPA {
	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDesignPatternJPAImplements();
		// UPDATE
		
		/*	Employee emp = new Employee();
		emp.setId(4);
		
		boolean rs = dao.updateEmployeeInfo(emp);
		if (rs==false) {
			System.out.println("it is not updated");

		}else {
			System.out.println("it is updated");

		}
	*/	
		//DELETE
					
		/*		boolean rs= dao.deleteEmployeeInfo(22);

				System.out.println("Record is deleted "+rs);
				
				*/
		
		//CREATE
	/*	
		Employee emp = new Employee();
		emp.setId(2);
		emp.setName("RAVITEJA");
		emp.setEmail("raviteja@gmail.com");
		emp.setPhone(987654321);
		emp.setSalary(21000.0);
		emp.setDeptid(20);
		emp.setBloodgroup("b+ve");
		emp.setAge(23);
		emp.setDob("1998-07-13");

		boolean rs = dao.createEmployeeInfo(emp);
	*/
		//get all records 
	/*	
		List<Employee> list =dao.getALLInfo();
		
			for (Employee e : list) {
			System.out.println("============================================");
			System.out.println("ID...."+e.getId());
			System.out.println("NAME...."+e.getName());
			System.out.println("EMAIL...."+e.getEmail());
			System.out.println("MOBILE NO....."+e.getPhone());
			System.out.println("salary...."+e.getSalary());
			System.out.println("DEPTNO....."+e.getDeptid());
			System.out.println("BLOODGROUP....."+e.getBloodgroup());
			System.out.println("AGE...."+e.getAge());
			System.out.println("DOB....."+e.getDob());
		
		}
		*/
			//GET ONE RECORD
			Employee e = dao.getEmployeeDetails(10);
			System.out.println("ID...."+e.getId());
			System.out.println("NAME...."+e.getName());
			System.out.println("EMAIL...."+e.getEmail());
			System.out.println("MOBILE NO....."+e.getPhone());
			System.out.println("salary...."+e.getSalary());
			System.out.println("DEPTNO....."+e.getDeptid());
			System.out.println("BLOODGROUP....."+e.getBloodgroup());
			System.out.println("AGE...."+e.getAge());
			System.out.println("DOB....."+e.getDob());
	}

}
