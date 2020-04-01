package com.javafullstack.jdbcapp.common;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcProperties {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
		FileInputStream fis = new FileInputStream("db.properties");
		Properties p = new Properties();
		p.load(fis);

			//1.load the "driver"
			/*
			 *Driver driver = new Driver();          //(1 st approach)
			 *DriverManager.registerDriver(driver);
			 */
			Class.forName("com.mysql.jdbc.Driver").newInstance();  // (2nd approach)

			//2.get the "db connection" via "driver"
			String dburl="jdbc:mysql://localhost:3306/cg_java";
			//String dburl="jdbc:mysql://localhost:3306/cg_java","root","root";
			//conn = DriverManager.getConnection(dburl);
			conn = DriverManager.getConnection(dburl,"root","root");
			
			//3.issue the "sql query" via "connection"
			String query = "select * from employee";
			stmt = conn.createStatement();

			//4.process the "results" returned by "sql queries"
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				long phone = rs.getLong("mobile_no");
				double salary = rs.getDouble("salary");
				int deptid = rs.getInt("id");
				String bloodgroup = rs.getString("boodgroup");
				int age = rs.getInt("age");
				Date dob = rs.getDate("dob");

				System.out.println("***************************************");

				System.out.println("Employee ID.. "+id);
				System.out.println("Employee NAME...  "+name);
				System.out.println("Employee EMAIL...  "+email);
				System.out.println("Employee PHONE ... "+phone);
				System.out.println("Employee SALARY...  "+salary);
				System.out.println("Employee DEPTID...  "+deptid);
				System.out.println("Employee BLOODGROUP..  "+bloodgroup);
				System.out.println("Employee AGE...  "+age);
				System.out.println("Employee DOB...  "+dob);
				System.out.println("***************************************");




			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//5.close all jdbc objects
			try {
				if (conn != null) {
					conn.close();
				}
				if (stmt!= null) {
					stmt.close();
				}
				if (rs != null) {
					stmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();

			}
		}

	}

}
