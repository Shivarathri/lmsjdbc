package com.capgemini.librarymanagementsystemjdbc.service;

import java.util.LinkedList;
import java.util.List;

import com.capgemini.librarymanagementsystemjdbc.dto.BookBean;
import com.capgemini.librarymanagementsystemjdbc.dto.BookIssueDetails;
import com.capgemini.librarymanagementsystemjdbc.dto.BorrowedBooks;
import com.capgemini.librarymanagementsystemjdbc.dto.RequestDetails;
import com.capgemini.librarymanagementsystemjdbc.dto.UsersBean;

public interface UsersService {
	boolean register(UsersBean user);
	UsersBean login(String email,String password);
	boolean addBook(BookBean book);
	boolean updateBook(BookBean book);
	boolean removeBook(int bId);
	LinkedList<BookBean> getBookIds();
	LinkedList<BookBean> searchBookById(int bId);
	LinkedList<BookBean> searchBookByTitle(String bookName);
	LinkedList<BookBean> searchBookByAuthor(String author);
	LinkedList<BookBean> getBooksInfo();
	boolean request(int uId, int bId);
	List<RequestDetails> showRequest();
	boolean issueBook(int bId,int uId);
	List<BorrowedBooks> borrowedBook(int uId);
	boolean returnBook(int bId, int uId);
	List<UsersBean> showUsers();
	LinkedList<BookIssueDetails> bookHistoryDetails(int uId);
	
}
