package com.javafullstack.jdbcapp.common;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class Assignment2 {
	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;



		try {
			FileInputStream fis = new FileInputStream("db1.properties");

			Properties p = new Properties();

			p.load(fis);

			Class.forName("com.mysql.jdbc.Driver").newInstance();


			String dburl=p.getProperty("dburl");

			conn = DriverManager.getConnection(dburl,"root","root");

			String query=p.getProperty("query");
			stmt = conn.createStatement();

			int res = stmt.executeUpdate(query);

			System.out.println("No of rows affected  "+res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {

			try {
				if (conn != null) {
					conn.close();
				}
				if (stmt!= null) {
					stmt.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();

			}
		}

	}
}
