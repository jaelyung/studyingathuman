package arrayList;

import java.util.ArrayList;

public class Student {
	int studentId;
	String studentName;
	ArrayList<Book> bookList;
	int index;
	
	public Student(){}
		
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		
		bookList = new ArrayList<Book>();
	}



	public void addBook(String title,String author) {
		Book book = new Book();
		
		book.setAuthor(author);
		book.setTitle(title);
		bookList.add(book);
	}
	
	public void showStudentInfo() {
		System.out.print(studentName + " �л��� ���� å�� : ");
		
		for(Book book : bookList) {
			System.out.print(book.getTitle() + " ");
		}
		
		System.out.println("�Դϴ�");
	}
	
	
	
}
