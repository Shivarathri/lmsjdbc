package com.javafullstack.jdbcapp.common;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrepareDelete {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();  

			String dburl="jdbc:mysql://localhost:3306/cg_java";
			
			conn = DriverManager.getConnection(dburl,"root","root");
		
			String query = " delete  from employee where id=? ";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			
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
