package com;

public class Student {
	private int Roll_Number;
	private String Student_Name;
	private String Address;
	private int Student_Age;
	private int Exam_Enroll_No;
	Student(int roll_Number, String student_Name, String address,
			int student_Age, int exam_Enroll_No) {
		super();
		Roll_Number = roll_Number;
		Student_Name = student_Name;
		Address = address;
		Student_Age = student_Age;
		Exam_Enroll_No = exam_Enroll_No;
	}
	public int getRoll_Number() {
		return Roll_Number;
	}
	public void setRoll_Number(int roll_Number) {
		Roll_Number = roll_Number;
	}
	public String getStudent_Name() {
		return Student_Name;
	}
	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getStudent_Age() {
		return Student_Age;
	}
	public void setStudent_Age(int student_Age) {
		Student_Age = student_Age;
	}
	public int getExam_Enroll_No() {
		return Exam_Enroll_No;
	}
	public void setExam_Enroll_No(int exam_Enroll_No) {
		Exam_Enroll_No = exam_Enroll_No;
	}
	
}
