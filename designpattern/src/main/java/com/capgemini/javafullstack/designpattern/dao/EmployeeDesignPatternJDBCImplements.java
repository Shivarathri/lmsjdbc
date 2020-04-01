package com.capgemini.javafullstack.designpattern.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.javafullstack.designpattern.dto.Employee;

public class EmployeeDesignPatternJDBCImplements implements EmployeeDAO {

	@Override
	public boolean updateEmployeeInfo(Employee info) {


		try  {

			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String dburl="jdbc:mysql://localhost:3306/cg_java";
			try (Connection conn = DriverManager.getConnection(dburl,"root","root");) {
				String query = " update employee set name = ? where id=?; ";

				try (PreparedStatement pstmt = conn.prepareStatement(query);) {
					pstmt.setString(1,info.getName());
					pstmt.setInt(2,info.getId());


					int count = pstmt.executeUpdate();
					System.out.println("No of rows affected "+count);
					if (count==0) {
						System.out.println("it is not inserted ");
						return false;
					} else {
						System.out.println("it is inserted ");
						return true;
					}
				}
			}
		}

		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		try (FileInputStream fis = new FileInputStream("db.properties")) {

			Properties p = new Properties();
			p.load(fis);

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			String dburl="jdbc:mysql://localhost:3306/cg_java";

			try (Connection conn = DriverManager.getConnection(dburl,"root","root")) {
				String query = " delete from employee  where id= ? ";

				try (PreparedStatement pstmt = conn.prepareStatement(query)) {
					pstmt.setInt(1, id);


					int count = pstmt.executeUpdate();
					System.out.println("No of rows affected "+count);
					
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean createEmployeeInfo(Employee info) {
		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance(); 


			String dburl="jdbc:mysql://localhost:3306/cg_java";

			try (Connection conn = DriverManager.getConnection(dburl,"root","root")) {

				String query = " insert into employee values (?,?,?,?.?,?,?,?,?); ";

				try (PreparedStatement pstmt = conn.prepareStatement(query)) {


					pstmt.setInt(1, info.getId());
					pstmt.setString(2, info.getName());
					pstmt.setString(3, info.getEmail());
					pstmt.setLong(4, info.getPhone());
					pstmt.setDouble(5, info.getSalary());
					pstmt.setInt(6, info.getDeptid());
					pstmt.setString(7, info.getBloodgroup());
					pstmt.setLong(8, info.getAge());
					pstmt.setString(9, info.getDob());

					int count = pstmt.executeUpdate();
					
					System.out.println("No of rows affected "+count);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		return false;
	}

	@Override
	public List<Employee> getALLInfo() {
		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance(); 


			String dburl="jdbc:mysql://localhost:3306/cg_java";

			try (Connection conn = DriverManager.getConnection(dburl,"root","root")) {


				String query = "select * from employee ";
				try (Statement stmt = conn.createStatement()) {


					try (ResultSet rs = stmt.executeQuery(query)) {
						ArrayList<Employee> al = new ArrayList<Employee>();
						while (rs.next()) {
							Employee emp = new Employee();

							emp.setId(rs.getInt("Id"));
							emp.setName(rs.getString("name"));
							emp.setEmail(rs.getString("email"));
							emp.setPhone(rs.getLong("mobile_no"));
							emp.setSalary(rs.getDouble("salary"));
							emp.setDeptid(rs.getInt("deptno"));
							emp.setBloodgroup(rs.getString("boodgroup"));
							emp.setDob(rs.getString("dob"));
							emp.setAge(rs.getInt("age"));

							al.add(emp);
						} 
						return al;
					}
				}
			}
		} catch (Exception ee) {
			// TODO Auto-generated catch block
			ee.printStackTrace();
			return null;
		}

	}

	@Override
	public Employee getEmployeeDetails(int id) {
		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance(); 


			String dburl="jdbc:mysql://localhost:3306/cg_java";

			try (Connection conn = DriverManager.getConnection(dburl,"root","root")) {


				String query = "select * from employee  where id=? ;";

				try (PreparedStatement pstmt = conn.prepareStatement(query)) {

					pstmt.setInt(1, id);

					try (ResultSet rs = pstmt.executeQuery()) {
						if (rs.next()) {
							Employee e = new Employee();

							e.setId(rs.getInt("id"));

							e.setName(rs.getString("name"));

							e.setEmail(rs.getString("email"));

							e.setAge(rs.getInt("age"));
							return e;



						} else {
							System.out.println("no record found");
							return null;
						}
					}
				}
			}
		} catch (Exception ee) {
			// TODO Auto-generated catch block
			ee.printStackTrace();
			return null;
		}

	}

}
