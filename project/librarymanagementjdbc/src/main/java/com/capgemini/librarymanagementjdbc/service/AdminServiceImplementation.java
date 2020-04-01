package com.capgemini.librarymanagementjdbc.service;

import java.util.LinkedList;
import java.util.List;

import com.capgemini.librarymanagementjdbc.dao.AdminDAO;
import com.capgemini.librarymanagementjdbc.dto.BookBean;
import com.capgemini.librarymanagementjdbc.dto.RequestBean;
import com.capgemini.librarymanagementjdbc.dto.UsersBean;
import com.capgemini.librarymanagementjdbc.factory.AdminFactory;


public class AdminServiceImplementation  implements AdminServiceDAO {
	private AdminDAO dao =  AdminFactory.getAdminDAO();

	public boolean addBook(BookBean book) {
		// TODO Auto-generated method stub
		return dao.addBook(book);
	}

	public BookBean searchBookTitle(String bname) {
		// TODO Auto-generated method stub
		return dao.searchBookTitle(bname);
	}

	public BookBean searchBookAuthor(String bAuthor) {
		// TODO Auto-generated method stub
		return dao.searchBookAuthor(bAuthor);
	}

	public BookBean searchBookType(String bookType) {
		// TODO Auto-generated method stub
		return dao.searchBookType(bookType);
	}

	public int updateBook(int bid) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean removeBook(int bid) {
		// TODO Auto-generated method stub
		return dao.removeBook(bid);
	}

	public LinkedList<Integer> getBookIds() {
		// TODO Auto-generated method stub
		return dao.getBookIds();
	}

	public LinkedList<BookBean> getBooksInfo() {
		// TODO Auto-generated method stub
		return dao.getBooksInfo();
	}

	public List<UsersBean> showUsers() {
		// TODO Auto-generated method stub
		return dao.showUsers();
	}

	public List<RequestBean> showRequests() {
		// TODO Auto-generated method stub
		return dao.showRequests();
	}

	public boolean bookIssue(UsersBean user, BookBean book) {
		// TODO Auto-generated method stub
		return dao.bookIssue(user, book);
	}

	public boolean isBookReceived(UsersBean user, BookBean book) {
		// TODO Auto-generated method stub
		return dao.isBookReceived(user, book);
	}

	
}
