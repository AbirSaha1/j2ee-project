CREATE TABLE tbl_Student_1625579 (Roll_Number NUMBER(4) PRIMARY KEY , Student_Name VARCHAR2(25), Address varchar2(25), Student_Age number(2), Exam_Enroll_No number(4) REFERENCES tbl_Exam_Result_1625579(Exam_Enroll_No) );

CREATE TABLE tbl_Exam_Result_1625579(Exam_Enroll_No number(4) Primary KEY, Maths_Score number(3) ,Science_Score number(3), English_Score number(3), Grade char(1));




SELECT STUDENT_NAME FROM TBL_STUDENT_1625579 s LEFT OUTER JOIN TBL_EXAM_RESULT_1625579 a ON a.EXAM_ENROLL_NO = s.EXAM_ENROLL_NO WHERE a.GRADE = 'B';


SELECT STUDENT_NAME FROM TBL_STUDENT_1625579 s LEFT OUTER JOIN TBL_EXAM_RESULT_1625579 a ON a.EXAM_ENROLL_NO = s.EXAM_ENROLL_NO WHERE 
(a.maths_score + a.science_score+ a.english_score) > 200;


SELECT (maths_score + science_score+ english_score) AS total_score FROM TBL_EXAM_RESULT_1625579 WHERE (maths_score + science_score+ english_score) > 200;