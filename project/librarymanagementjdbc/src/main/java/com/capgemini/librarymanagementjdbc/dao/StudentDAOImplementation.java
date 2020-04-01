package com.capgemini.librarymanagementjdbc.dao;

import java.util.LinkedList;
import java.util.List;

import com.capgemini.librarymanagementjdbc.dto.BookBean;
import com.capgemini.librarymanagementjdbc.dto.RequestBean;
import com.capgemini.librarymanagementjdbc.dto.UsersBean;

public class StudentDAOImplementation implements StudentDAO {

	@Override
	public BookBean searchBookTitle(String bname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookBean searchBookAuthor(String bAuthor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookBean searchBookType(String bookType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LinkedList<Integer> getBookIds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LinkedList<BookBean> getBooksInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RequestBean bookRequest(UsersBean user, BookBean book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RequestBean bookReturn(UsersBean user, BookBean book) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
