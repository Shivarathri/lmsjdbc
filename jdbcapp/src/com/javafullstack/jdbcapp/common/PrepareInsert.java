package com.javafullstack.jdbcapp.common;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrepareInsert {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			
			Class.forName("com.mysql.jdbc.Driver").newInstance(); 

			String dburl="jdbc:mysql://localhost:3306/cg_java";
			
			conn = DriverManager.getConnection(dburl,"root","root");
			
			
			String query = " insert into employee values (?,?,?,?,?,?,?,?,?,?) ";
			
			pstmt = conn.prepareStatement(query);
			
			pstmt.setInt(1, Integer.parseInt(args[0]));
			pstmt.setString(2, args[1]);
			pstmt.setString(3, args[2]);
			pstmt.setLong(4,Long.parseLong(args[3]));
			pstmt.setDouble(5, Double.parseDouble(args[4]));
			pstmt.setInt(6, Integer.parseInt(args[5]));
			pstmt.setString(7, args[6]);
			pstmt.setInt(8, Integer.parseInt(args[7]));
			pstmt.setDate(9,Date.valueOf( args[8]));
			pstmt.setString(10,args[9]);
			
			


			int count = pstmt.executeUpdate();
			System.out.println("No of rows affected "+count);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
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
