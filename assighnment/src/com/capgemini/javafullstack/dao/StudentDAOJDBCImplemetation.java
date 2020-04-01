package com.capgemini.javafullstack.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.javafullstack.dto.Student;

public class StudentDAOJDBCImplemetation implements StudentDAO {

	@Override
	public boolean updateStudentInfo(Student s) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try (FileInputStream fis = new FileInputStream("db.properties")) {



			Properties p = new Properties();
			p.load(fis);
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String dburl="jdbc:mysql://localhost:3306/cg_java";
			conn = DriverManager.getConnection(dburl,"root","root");
			String query = " update student set name = ? where rollno=?; ";

			pstmt = conn.prepareStatement(query);
			pstmt.setString(1,s.getName());
			pstmt.setInt(2,s.getRollno());


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

		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteStudentInfo(int id) {



		try (FileInputStream fis = new FileInputStream("db.properties")) {



			Properties p = new Properties();
			p.load(fis);

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			String dburl="jdbc:mysql://localhost:3306/cg_java";

			try (Connection conn = DriverManager.getConnection(dburl,"root","root")) {
				String query = " delete from student  where rollno= ? ";

				try (PreparedStatement pstmt = conn.prepareStatement(query)) {
					pstmt.setInt(1, id);


					int count = pstmt.executeUpdate();
					System.out.println("No of rows affected "+count);
					if (count==0) {
						System.out.println("it is not deleted ");
						return false;
					}else {
						System.out.println("it is deleted");
						return true;
					}
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean createStudentInfo(Student info) {
		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance(); 


			String dburl="jdbc:mysql://localhost:3306/cg_java";

			try (Connection conn = DriverManager.getConnection(dburl,"root","root")) {

				String query = " insert into student values (?,?,?,?) ";

				try (PreparedStatement pstmt = conn.prepareStatement(query)) {


					pstmt.setInt(1, info.getRollno());
					pstmt.setString(2, info.getName());
					pstmt.setString(3, info.getEmail());
					pstmt.setLong(4, info.getAge());

					int count = pstmt.executeUpdate();
					System.out.println("No of rows affected "+count);

					if (count==0) {
						System.out.println("it is not inserted ");
						return false;
					}else {
						System.out.println("it is inserted ");
						return true;
					}
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	
	return false;
}

@Override
public List<Student> getAllInfo() {

	try {

		Class.forName("com.mysql.jdbc.Driver").newInstance(); 


		String dburl="jdbc:mysql://localhost:3306/cg_java";

		try (Connection conn = DriverManager.getConnection(dburl,"root","root")) {


			String query = "select * from student ";
			try (Statement stmt = conn.createStatement()) {


				try (ResultSet rs = stmt.executeQuery(query)) {
					ArrayList<Student> al = new ArrayList<Student>();
					while (rs.next()) {
						Student s = new Student();

						s.setRollno(rs.getInt("rollno"));

						s.setName(rs.getString("name"));

						s.setEmail(rs.getString("email"));

						s.setAge(rs.getInt("age"));

						al.add(s);
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
public Student getStudentDetails(int rollno) {
	try {

		Class.forName("com.mysql.jdbc.Driver").newInstance(); 


		String dburl="jdbc:mysql://localhost:3306/cg_java";

		try (Connection conn = DriverManager.getConnection(dburl,"root","root")) {


			String query = "select * from student  where rollno=? ;";

			try (PreparedStatement pstmt = conn.prepareStatement(query)) {

				pstmt.setInt(1, rollno);

				try (ResultSet rs = pstmt.executeQuery()) {
					if (rs.next()) {
						Student e = new Student();

						e.setRollno(rs.getInt("rollno"));

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
