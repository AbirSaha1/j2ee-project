package com;

public class ExamResult {
	private int Exam_Enroll_no;
	private int Maths_Score;
	private int Science_Score;
	private int English_Score;
	private char Grade;
	ExamResult(int exam_Enroll_no, int maths_Score, int science_Score,
			int english_Score, char grade) {
		super();
		Exam_Enroll_no = exam_Enroll_no;
		Maths_Score = maths_Score;
		Science_Score = science_Score;
		English_Score = english_Score;
		Grade = grade;
	}
	public int getExam_Enroll_no() {
		return Exam_Enroll_no;
	}
	public void setExam_Enroll_no(int exam_Enroll_no) {
		Exam_Enroll_no = exam_Enroll_no;
	}
	public int getMaths_Score() {
		return Maths_Score;
	}
	public void setMaths_Score(int maths_Score) {
		Maths_Score = maths_Score;
	}
	public int getScience_Score() {
		return Science_Score;
	}
	public void setScience_Score(int science_Score) {
		Science_Score = science_Score;
	}
	public int getEnglish_Score() {
		return English_Score;
	}
	public void setEnglish_Score(int english_Score) {
		English_Score = english_Score;
	}
	public char getGrade() {
		return Grade;
	}
	public void setGrade(char grade) {
		Grade = grade;
	}
	
}
