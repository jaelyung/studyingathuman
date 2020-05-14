package school;

import java.util.ArrayList;

import book.Book;
import util.Define;

public class Student {
	private int studentId;		//�й�
	private String studentName;	//�̸�
	private int degree;		//�л�,����,�ڻ�
	ArrayList<Book> bookList;
	int index;
	
	public Student(){}
		
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.degree = Define.UNDERGRADUATE; //�⺻������ �кλ�
		
		bookList = new ArrayList<Book>();
	}



	public void addBookList(String title,String author) {
		//Book ��ü�� �߰����� �ʰ� �̹� �ִ� Book ��ü���� �� å�� �ִ��� ������ �Ǵ��� ��
		//true�� bookList�� �߰�
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
		System.out.print(studentName + " �л��� ���� å : ");
		
		for(Book book : bookList) {
			System.out.print(book.getTitle() + " ");
		}
		
		System.out.println("�Դϴ�");
	}
	
	
	
}

