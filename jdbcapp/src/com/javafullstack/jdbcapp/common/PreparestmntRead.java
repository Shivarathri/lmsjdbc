package com.javafullstack.jdbcapp.common;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparestmntRead {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			
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
			String query = " select * from employee where id=? and name = ? ";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			pstmt.setString(2, args[1]);
			rs = pstmt.executeQuery();
			

			//4.process the "results" returned by "sql queries"
			
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
				if (pstmt!= null) {
					pstmt.close();
				}
				if (rs != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();

			}
		}

		
		
		
	}

}
