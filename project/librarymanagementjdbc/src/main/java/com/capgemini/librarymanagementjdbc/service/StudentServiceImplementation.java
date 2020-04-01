package com.capgemini.librarymanagementjdbc.service;

import java.util.LinkedList;

import com.capgemini.librarymanagementjdbc.dao.StudentDAO;
import com.capgemini.librarymanagementjdbc.dto.BookBean;
import com.capgemini.librarymanagementjdbc.dto.RequestBean;
import com.capgemini.librarymanagementjdbc.dto.UsersBean;
import com.capgemini.librarymanagementjdbc.factory.StudentFactory;

public class StudentServiceImplementation implements StudentServiceDAO {
	private StudentDAO dao = StudentFactory.getStudentDAO();
	
	@Override
	public BookBean searchBookTitle(String bname) {
		// TODO Auto-generated method stub
		return dao.searchBookTitle(bname);
	}

	@Override
	public BookBean searchBookAuthor(String bAuthor) {
		// TODO Auto-generated method stub
		return dao.searchBookAuthor(bAuthor);
	}

	@Override
	public BookBean searchBookType(String bookType) {
		// TODO Auto-generated method stub
		return dao.searchBookType(bookType);
	}

	@Override
	public LinkedList<Integer> getBookIds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LinkedList<BookBean> getBooksInfo() {
		// TODO Auto-generated method stub
		return dao.getBooksInfo();
	}

	@Override
	public RequestBean bookRequest(UsersBean user, BookBean book) {
		// TODO Auto-generated method stub
		return dao.bookRequest(user, book);
	}

	@Override
	public RequestBean bookReturn(UsersBean user, BookBean book) {
		// TODO Auto-generated method stub
		return dao.bookReturn(user, book);
	}
	

}
