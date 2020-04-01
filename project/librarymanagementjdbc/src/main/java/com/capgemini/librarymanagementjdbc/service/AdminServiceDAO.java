package com.capgemini.librarymanagementjdbc.service;

import java.util.LinkedList;
import java.util.List;

import com.capgemini.librarymanagementjdbc.dto.AdminBean;
import com.capgemini.librarymanagementjdbc.dto.BookBean;
import com.capgemini.librarymanagementjdbc.dto.RequestBean;
import com.capgemini.librarymanagementjdbc.dto.UsersBean;

public interface AdminServiceDAO {
	
	boolean addBook(BookBean book);
	BookBean searchBookTitle(String bname);
	BookBean searchBookAuthor(String bAuthor);
	BookBean searchBookType(String bookType);
	int updateBook(int bid);
	boolean removeBook(int bid);
	LinkedList<Integer> getBookIds();
	LinkedList<BookBean> getBooksInfo();
	List<UsersBean> showUsers();
	List<RequestBean> showRequests();
	boolean bookIssue(UsersBean user,BookBean book);
	boolean isBookReceived(UsersBean user,BookBean book);
	
}
