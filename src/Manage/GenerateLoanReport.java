package Manage;

import java.util.ArrayList;

import book.Book;
import school.School;
import school.Student;
import school.report.GenerateGradeReport;

public class GenerateLoanReport {
	
	School school = School.getInstance();//Good University ��ü ����
	public static final String TITLE = "���� �뿩 ����Ʈ \t\t\n";
	public static final String HEADER = " �̸�  |  �й�  |�뿩������| ������ | �ݳ��� \n";
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
		ArrayList<Student> studentList = book.getStudentList();  // �� ������ �л���
		
		for(int i=0; i<studentList.size(); i++){
			Student student = studentList.get(i);
			buffer.append(student.getStudentName());
			buffer.append(" | ");
			buffer.append(student.getStudentId());
			buffer.append(" | ");
//			buffer.append(student.getMajorSubject().getSubjectName() + "\t");
			buffer.append(" | ");
			
//			getScoreGrade(student, subject.getSubjectId());  //�л��� �ش���� ���� ���
			buffer.append("\n");
			buffer.append(LINE);
		}
		
	}
	
	public void makeFooter() {
		
	}
	
	
	
	
}
