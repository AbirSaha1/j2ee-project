package com;

import java.sql.*;
import java.util.ArrayList;

public class ResultMngmtDAO {
	
	public static Connection getCon(){
		Connection con = null;
		final String url = "jdbc:oracle:thin:@INGNRGPILPHP01:1521:ORCLILP";
		final String user = "aja132core";
		final String password = "aja132core";
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			 con = DriverManager.getConnection(url, user, password);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException f){
			f.printStackTrace();
		}
		return con;
	}
	public static void closeConnection(){
		try {
			if(getCon() != null || getCon().isClosed() == false){
				getCon().close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public int addStudent(Student student){
		String query = "insert into tbl_Student_1625579 values(? , ? , ? , ? , ? )";
		int val = 0;
		if(student != null){
			try{
				PreparedStatement pst = getCon().prepareStatement(query);
				pst.setInt(1, student.getRoll_Number());
				pst.setString(2, student.getStudent_Name());
				pst.setString(3, student.getAddress());
				pst.setInt(4, student.getStudent_Age());
				pst.setInt(5, student.getExam_Enroll_No());
				val = pst.executeUpdate();	
				pst.close();
				closeConnection();
			}catch(SQLException f){
				f.printStackTrace();
			}
		}
		return val;
		
	}
	public  int addResult(ExamResult result){
		String query = "insert into tbl_Exam_Result_1625579 values(? , ? , ? , ? , ? )";
		int val = 0;
		if(result != null){
			try{
				PreparedStatement pst = getCon().prepareStatement(query);
				pst.setInt(1, result.getExam_Enroll_no());
				pst.setInt(2, result.getMaths_Score());
				pst.setInt(3, result.getScience_Score());
				pst.setInt(4, result.getEnglish_Score());
				pst.setString(5, String.valueOf(result.getGrade()));
				val = pst.executeUpdate();
				pst.close();
				closeConnection();
			}catch(SQLException f){
				f.printStackTrace();
			}
		}
		return val;
	}
	
	public ArrayList<String> getStudentsnameInCity(String City){
		ArrayList<String> studentName = new ArrayList<String>();
		String query = "select Student_Name from tbl_Student_1625579 where Address = ? ";
 		if(City != null){
			try{
				PreparedStatement pst = getCon().prepareStatement(query);
				pst.setString(1, City);
				ResultSet rs = pst.executeQuery();
				if(rs != null){
					while(rs.next()){
						String a = rs.getString(1);
						studentName.add(a);
					}
				}
				rs.close();
				pst.close();
				closeConnection();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
 		return studentName;
	}
	
	public ArrayList<String> getStudentNameHavingGrade(char grade){
		ArrayList<String> studentName = new ArrayList<String>();
		String query = "SELECT STUDENT_NAME FROM TBL_STUDENT_1625579 s LEFT OUTER JOIN TBL_EXAM_RESULT_1625579 a ON a.EXAM_ENROLL_NO = s.EXAM_ENROLL_NO WHERE a.GRADE = ?";
			try{
				PreparedStatement pst = getCon().prepareStatement(query);
				pst.setString(1, String.valueOf(grade).toUpperCase());
				ResultSet rs = pst.executeQuery();
				if(rs != null){
					while(rs.next()){
						String a = rs.getString(1);
						studentName.add(a);
					}
				}
				rs.close();
				pst.close();
				closeConnection();

			}catch(SQLException e){
				e.printStackTrace();
			}catch(NullPointerException f){
				f.printStackTrace();
			}
 		return studentName;
	}
	
	public ArrayList<String> getStudentNameHavingTotalMarksGreaterThen(int marks) {
		ArrayList<String> studentNames = new ArrayList<String>();
		String query = "SELECT STUDENT_NAME FROM TBL_STUDENT_1625579 s LEFT OUTER JOIN TBL_EXAM_RESULT_1625579 a ON a.EXAM_ENROLL_NO = s.EXAM_ENROLL_NO WHERE (a.maths_score + a.science_score+ a.english_score) > ?";
		if(marks != 0){
			try{
				PreparedStatement pst = getCon().prepareStatement(query);
				pst.setInt(1,marks);
				ResultSet rs = pst.executeQuery();
				if(!rs.equals(null)){
					while(rs.next()){
						String a = rs.getString(1);
						studentNames.add(a);
					}
				}
				rs.close();
				pst.close();
				closeConnection();
				
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
 		return studentNames;
	}
}
