package com;

import java.util.ArrayList;

public class Test {

	public static void main (String[] args){
		Student s1 = new Student(1, "Pushpalata", "Ahmedabad", 18, 1231);
		Student s2 = new Student(2, "Nishant", "Gandhinagar", 19, 1232);
		Student s3 = new Student(3, "Shubham", "Ahmedabad", 18, 1233);
		Student s4 = new Student(4, "Surbhi", "Baroda" ,19 ,1234);
		
		ExamResult r1 = new ExamResult(1231, 85, 75, 70, 'B');
		ExamResult r2 = new ExamResult(1232, 75, 60, 50, 'C');
		ExamResult r3 = new ExamResult(1233, 65, 95, 40, 'C' );
		ExamResult r4 = new ExamResult(1234, 95, 90, 90, 'A');
		
		ResultMngmtDAO rm = new ResultMngmtDAO();
		System.out.println(rm.addResult(r1));
		System.out.println(rm.addResult(r2));
		System.out.println(rm.addResult(r3));
		System.out.println(rm.addResult(r4));
		System.out.println(rm.addStudent(s1));
		System.out.println(rm.addStudent(s2));
		System.out.println(rm.addStudent(s3));
		System.out.println(rm.addStudent(s4));
		System.out.println(rm.addResult(null));
		ArrayList<String> a = rm.getStudentNameHavingGrade('c');
		for(String s : a){
			System.out.println("grade More than -> " +s);
		}
		ArrayList<String> b = rm.getStudentNameHavingTotalMarksGreaterThen(500);
		for(String s : b){
			System.out.println("having total marks greater than -> " +s);
		}
		
		ArrayList<String> c = rm.getStudentsnameInCity("Ahmedabad");
		for(String s : c){
			System.out.println("City ->"+s);
		}
		
	}
}
