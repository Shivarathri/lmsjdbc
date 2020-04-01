package com.javafullstack.jdbcapp.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment1 {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			String dburl = "jdbc:mysql://localhost:3306/cg_java";

			conn = DriverManager.getConnection(dburl,"root","root");

			String query = "update employee set name = 'CHITTY' where id = 7";

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



