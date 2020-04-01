package com.javafullstack.jdbcapp.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.javafullstack.jdbcapp.dto.Employee;

public class EmployeeDAOJDBCImplement implements EmployeeDAO {

	@Override
	public boolean updateEmployeeInfo(Employee emp) {
		Connection conn = null;
		PreparedStatement pstmt = null;


		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();  

			String dburl="jdbc:mysql://localhost:3306/cg_java";

			conn = DriverManager.getConnection(dburl,"root","root");

			String query = " update employee set name = ? where id=?; ";

			pstmt = conn.prepareStatement(query);
			pstmt.setString(1,emp.getName());
			pstmt.setInt(2,emp.getId());


			int count = pstmt.executeUpdate();
			System.out.println("No of rows affected "+count);
			if (count==0) {
				System.out.println("it is not inserted ");
				return false;
			}else {
				System.out.println("it is inserted ");
				return true;
			}

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

			} catch (SQLException e) {
				e.printStackTrace();

			}
		}
		return false;

	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		Connection conn = null;
		PreparedStatement pstmt = null;


		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();  

			String dburl="jdbc:mysql://localhost:3306/cg_java";

			conn = DriverManager.getConnection(dburl,"root","root");

			String query = " delete from employee  where id= ? ";

			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1,id);


			int count = pstmt.executeUpdate();
			System.out.println("No of rows affected "+count);
			if (count==0) {
				System.out.println("it is not inserted ");
				return false;
			}else {
				System.out.println("it is inserted ");
				return true;
			}

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

			} catch (SQLException e) {
				e.printStackTrace();

			}
		}
		return false;

	}

	@Override
	public boolean createEmployeeInfo(Employee info) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance(); 

			String dburl="jdbc:mysql://localhost:3306/cg_java";

			conn = DriverManager.getConnection(dburl,"root","root");


			String query = " insert into employee values (?,?,?,?,?,20,'b+',23,'1997-01-12') ";

			pstmt = conn.prepareStatement(query);

			pstmt.setInt(1, info.getId());
			pstmt.setString(2, info.getName());
			pstmt.setString(3, info.getEmail());
			pstmt.setLong(4, info.getPhone());
			pstmt.setDouble(5, info.getSalary());
			
			int count = pstmt.executeUpdate();
			System.out.println("No of rows affected "+count);

			if (count==0) {
				System.out.println("it is not inserted ");
				return false;
			}else {
				System.out.println("it is inserted ");
				return true;
			}

			


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


		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Employee> getALLInfo() {

		Connection conn = null;
		Statement stmt = null;

		ResultSet rs = null;


		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();  


			String dburl="jdbc:mysql://localhost:3306/cg_java";

			conn = DriverManager.getConnection(dburl,"root","root");


			String query = "select * from employee ";
			stmt = conn.createStatement();


			rs = stmt.executeQuery(query);
			ArrayList<Employee> al = new ArrayList<Employee>();
			while (rs.next()) {
				Employee e = new Employee();

				e.setId(rs.getInt("id"));
				e.setName(rs.getString("name"));
				e.setEmail(rs.getString("email"));
				e.setPhone(rs.getLong("mobile_no"));
				e.setSalary(rs.getDouble("salary"));
				e.setId(rs.getInt("id"));
				e.setBoodgroup(rs.getString("boodgroup"));
				e.setAge(rs.getInt("age"));
				e.setDob(rs.getDate("dob"));
				al.add(e);



			} 
			return al;
		} catch (Exception ee) {
			// TODO Auto-generated catch block
			ee.printStackTrace();
			return null;
		}finally {

			try {
				if (conn != null) {
					conn.close();
				}
				if (stmt!= null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();

			}
		}


	}

	@Override
	public Employee getEmployeeDetails(int id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;


		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();  


			String dburl="jdbc:mysql://localhost:3306/cg_java";

			conn = DriverManager.getConnection(dburl,"root","root");


			String query = "select * from employee where id = ? ";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				Employee e = new Employee();

				e.setId(rs.getInt("id"));
				e.setName(rs.getString("name"));
				e.setEmail(rs.getString("email"));
				e.setPhone(rs.getLong("mobile_no"));
				e.setSalary(rs.getDouble("salary"));
				e.setId(rs.getInt("id"));
				e.setBoodgroup(rs.getString("boodgroup"));
				e.setAge(rs.getInt("age"));
				e.setDob(rs.getDate("dob"));
				return e;


			} else {
				System.out.println("no record found");
				return null;
			}
		} catch (Exception ee) {
			// TODO Auto-generated catch block
			ee.printStackTrace();
			return null;
		}finally {

			try {
				if (conn != null) {
					conn.close();
				}
				if (pstmt!= null) {
					pstmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();

			}
		}


	}


}
