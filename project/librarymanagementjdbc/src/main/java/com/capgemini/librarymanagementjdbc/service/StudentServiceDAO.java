package com.capgemini.librarymanagementjdbc.service;

import java.util.LinkedList;

import com.capgemini.librarymanagementjdbc.dto.BookBean;
import com.capgemini.librarymanagementjdbc.dto.RequestBean;
import com.capgemini.librarymanagementjdbc.dto.UsersBean;

public interface StudentServiceDAO {

	BookBean searchBookTitle(String bname);
	BookBean searchBookAuthor(String bAuthor);
	BookBean searchBookType(String bookType);
	LinkedList<Integer> getBookIds();
	LinkedList<BookBean> getBooksInfo();
	public RequestBean bookRequest(UsersBean user, BookBean book);
	public RequestBean bookReturn(UsersBean user, BookBean book);
}
