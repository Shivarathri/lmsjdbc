package com.capgemini.javafullstack.dto;

import java.util.Iterator;
import java.util.List;

import com.capgemini.javafullstack.dao.StudentDAO;
import com.capgemini.javafullstack.dao.StudentDAOJDBCImplemetation;

public class MyStudentTest {

	public static void main(String[] args) {
		StudentDAO dao = new StudentDAOJDBCImplemetation();
		Student s = new Student();
		/*
		 * 
		 *  // update operation 
		 *  
		s.setName("RAVI KUMAR");
		s.setRollno(3);
		boolean rs= dao.updateStudentInfo(s);
		if (rs=true) {
			System.out.println("No. of rows affected "+rs);
		} else {
			System.out.println("no record updated");
		}

		 */		
		/*  //delete operation

		boolean rs= dao.deleteStudentInfo(1);

		System.out.println("Record is deleted "+rs);
		 */
		
		

		// create operation 
		
	/*	s.setRollno(17);
		s.setName("SHIVA");
		s.setEmail("rahul@gmail.com");
		s.setAge(25);
		
		dao.createStudentInfo(s);
		*/
	//	System.out.println("no of rows affected "+rs);
		
		// getting all the information

		/*	List<Student> l =dao.getAllInfo();
		Iterator<Student> itr = l.iterator();
		while (itr.hasNext()) {
			Student st = itr.next();


		System.out.println("============================================");
		
		\* System.out.println("ID...."+st.getRollno());
		System.out.println("Student NAME...."+st.getName());
		System.out.println("Student EMAIL...."+st.getEmail());
		System.out.println("Student AGE...."+st.getAge());
		 */

		
		// getting information with id
		
		
		Student st = dao.getStudentDetails(2);
		System.out.println("Student Rollno...."+st.getRollno());
		System.out.println("Student NAME...."+st.getName());
		System.out.println("Student EMAIL...."+st.getEmail());
		System.out.println("Student AGE...."+st.getAge());
		
 	

	}

}


