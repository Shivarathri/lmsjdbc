package com.javafullstack.jdbcapp.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrepareUpdate {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();  

			String dburl="jdbc:mysql://localhost:3306/cg_java";
			
			conn = DriverManager.getConnection(dburl,"root","root");
		
			String query = " update  employee set name = ? where id=? ";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, args[0]);
			pstmt.setInt(2, Integer.parseInt(args[1]));
			
			
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
