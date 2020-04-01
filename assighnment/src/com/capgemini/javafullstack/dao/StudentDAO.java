package com.capgemini.javafullstack.dao;

import java.util.List;

import com.capgemini.javafullstack.dto.Student;

public interface StudentDAO {
	boolean updateStudentInfo(Student info);
	boolean deleteStudentInfo(int rollno);
	boolean createStudentInfo(Student info);
	List<Student> getAllInfo();
	Student getStudentDetails(int rollno);
	

}
