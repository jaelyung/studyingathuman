package Manage;

import java.util.ArrayList;

import book.Book;
import school.School;
import school.Student;
import school.report.GenerateGradeReport;

public class GenerateLoanReport {
	
	School school = School.getInstance();//Good University 객체 생성
	public static final String TITLE = "도서 대여 리스트 \t\t\n";
	public static final String HEADER = " 이름  |  학번  |대여도서명| 대출일 | 반납일 \n";
	public static final String LINE = "--------------------------------------------\n";
	private StringBuffer buffer = new StringBuffer();
	
	public String getReport() {
		ArrayList<Student> studentList = school.getStudentList();
		for( Student student : studentList) {
			makeHeader(student);
			makeBody(student);
			makeFooter();
		}
		return buffer.toString();
	}

	public void makeHeader(Student student) {
		buffer.append(GenerateLoanReport.LINE);
		buffer.append("\t" + student.getStudentName());
		buffer.append(GenerateLoanReport.TITLE );
		buffer.append(GenerateLoanReport.HEADER );
		buffer.append(GenerateLoanReport.LINE);		
	}
	
	public void makeBody(Book book) {
		ArrayList<Student> studentList = book.getStudentList();  // 각 과목의 학생들
		
		for(int i=0; i<studentList.size(); i++){
			Student student = studentList.get(i);
			buffer.append(student.getStudentName());
			buffer.append(" | ");
			buffer.append(student.getStudentId());
			buffer.append(" | ");
//			buffer.append(student.getMajorSubject().getSubjectName() + "\t");
			buffer.append(" | ");
			
//			getScoreGrade(student, subject.getSubjectId());  //학생별 해당과목 학점 계산
			buffer.append("\n");
			buffer.append(LINE);
		}
		
	}
	
	public void makeFooter() {
		
	}
	
	
	
	
}
