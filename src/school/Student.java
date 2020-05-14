package school;

import java.util.ArrayList;

import book.Book;
import util.Define;

public class Student {
	private int studentId;		//학번
	private String studentName;	//이름
	private int degree;		//학사,석사,박사
	ArrayList<Book> bookList;
	int index;
	
	public Student(){}
		
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.degree = Define.UNDERGRADUATE; //기본적으로 학부생
		
		bookList = new ArrayList<Book>();
	}



	public void addBookList(String title,String author) {
		//Book 객체를 추가하지 않고 이미 있는 Book 객체에서 이 책이 있는지 없는지 판단한 후
		//true면 bookList에 추가
//		Book book = new Book();
//		
//		book.setAuthor(author);
//		book.setTitle(title);
//		bookList.add(book);
	}
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getDegree() {
		return degree;
	}

	public void setDegree(int degree) {
		this.degree = degree;
	}

	public void showStudentInfo() {
		System.out.print(studentName + " 학생이 빌린 책 : ");
		
		for(Book book : bookList) {
			System.out.print(book.getTitle() + " ");
		}
		
		System.out.println("입니다");
	}
	
	
	
}

