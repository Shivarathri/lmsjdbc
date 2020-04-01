package com.capgemini.librarymanagementjdbc.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

import com.capgemini.librarymanagementjdbc.dto.AdminBean;
import com.capgemini.librarymanagementjdbc.dto.BookBean;
import com.capgemini.librarymanagementjdbc.dto.RequestBean;
import com.capgemini.librarymanagementjdbc.dto.UsersBean;

public class AdminDAOImplementation  implements AdminDAO {

	@Override
	public boolean addBook(BookBean book) {
		try(FileInputStream	fin = new FileInputStream("dburl.properties")){

			Properties pro = new Properties();
			pro.load(fin);

			Class.forName(pro.getProperty("path")).newInstance();
			try(Connection conn = DriverManager.getConnection(pro.getProperty("dburl"), pro)){
				String query = pro.getProperty("add_book");
				try(PreparedStatement pstmt = conn.prepareStatement(query)){
					pstmt.setString(1, book.getBname());
					pstmt.setInt(2, book.getBid());
					pstmt.setString(3, book.getBauthor());
					pstmt.setString(4, book.getCategory());
					pstmt.setString(5, book.getPublishername());
					int count = pstmt.executeUpdate();
				}
			}

		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public BookBean searchBookTitle(String bname) {
		BookBean bean = new BookBean();
		try(FileInputStream	fin = new FileInputStream("dburl.properties")){

			Properties pro = new Properties();
			pro.load(fin);

			Class.forName(pro.getProperty("path")).newInstance();
			try(Connection conn = DriverManager.getConnection(pro.getProperty("dburl"), pro)){
				String query = pro.getProperty("search_book_name");
				try(PreparedStatement pstmt = conn.prepareStatement(query)){
					pstmt.setString(1, bname);
					ResultSet rs = pstmt.executeQuery();
					if(rs.next()) {	
						bean.setBid(rs.getInt("bid"));
						bean.setBname(rs.getString("bname"));
						bean.setBauthor(rs.getString("author"));
						bean.setCategory(rs.getString("category"));
						bean.setPublishername(rs.getString("publishername"));
						return bean;
					} else {
						System.out.println("book not found");
					}
				}
			}

		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public BookBean searchBookAuthor(String bAuthor) {
		BookBean bean = new BookBean();
		try(FileInputStream	fin = new FileInputStream("dburl.properties")){

			Properties pro = new Properties();
			pro.load(fin);

			Class.forName(pro.getProperty("path")).newInstance();
			try(Connection conn = DriverManager.getConnection(pro.getProperty("dburl"), pro)){
				String query = pro.getProperty("search_book_author");
				try(PreparedStatement pstmt = conn.prepareStatement(query)){
					pstmt.setString(1, bAuthor);
					ResultSet rs = pstmt.executeQuery();
					if(rs.next()) {	
						bean.setBid(rs.getInt("bid"));
						bean.setBname(rs.getString("bname"));
						bean.setBauthor(rs.getString("author"));
						bean.setCategory(rs.getString("category"));
						bean.setPublishername(rs.getString("publishername"));
						return bean;
					} else {
						System.out.println("book not found");
					}
				}
			}

		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public BookBean searchBookType(String bookType) {
		BookBean bean = new BookBean();
		try(FileInputStream	fin = new FileInputStream("dburl.properties")){

			Properties pro = new Properties();
			pro.load(fin);

			Class.forName(pro.getProperty("path")).newInstance();
			try(Connection conn = DriverManager.getConnection(pro.getProperty("dburl"), pro)){
				String query = pro.getProperty("search_book_id");
				try(PreparedStatement pstmt = conn.prepareStatement(query)){
					pstmt.setString(1, bookType);
					ResultSet rs = pstmt.executeQuery();
					if(rs.next()) {	
						bean.setBid(rs.getInt("bid"));
						bean.setBname(rs.getString("bname"));
						bean.setBauthor(rs.getString("author"));
						bean.setCategory(rs.getString("category"));
						bean.setPublishername(rs.getString("publishername"));
						return bean;
					} else {
						System.out.println("book not found");
					}
				}
			}

		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int updateBook(int bid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean removeBook(int bid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public LinkedList<Integer> getBookIds() {
		try(FileInputStream	fin = new FileInputStream("dburl.properties")){

			Properties pro = new Properties();
			pro.load(fin);
			List<Integer> list = new LinkedList<Integer>();
			Class.forName(pro.getProperty("path")).newInstance();
			try(Connection conn = DriverManager.getConnection(pro.getProperty("dburl"), pro)){
				String query = pro.getProperty("get_bookId");
				try(Statement stmt = conn.createStatement()){
					ResultSet rs = stmt.executeQuery(query);
					while(rs.next()) {
						BookBean bean = new BookBean();
						bean.setBid(rs.getInt("bid"));		
					}
					
				}
			}

		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public LinkedList<BookBean> getBooksInfo() {
		try(FileInputStream	fin = new FileInputStream("dburl.properties")){

			Properties pro = new Properties();
			pro.load(fin);
			LinkedList<BookBean> li = new LinkedList<BookBean>();
			Class.forName(pro.getProperty("path")).newInstance();
			try(Connection conn = DriverManager.getConnection(pro.getProperty("dburl"), pro)){
				String query = pro.getProperty("get_allBook");
				try(Statement stmt = conn.createStatement()){	
					ResultSet rs = stmt.executeQuery(query);
					while(rs.next()) {	
						BookBean bean = new BookBean();
						bean.setBid(rs.getInt("bid"));
						bean.setBname(rs.getString("bname"));
						bean.setBauthor(rs.getString("author"));
						bean.setCategory(rs.getString("category"));
						bean.setPublishername(rs.getString("publishername"));
						li.add(bean);
					}
					return li;
				}
			}

		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<UsersBean> showUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RequestBean> showRequests() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean bookIssue(UsersBean user, BookBean book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isBookReceived(UsersBean user, BookBean book) {
		// TODO Auto-generated method stub
		return false;
	}

	

	

}
