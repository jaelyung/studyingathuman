package school;

import java.util.ArrayList;

import book.Book;

public class School {

	private static School instance = new School();
	
	private static String SCHOOL_NAME = "Good University";
	private ArrayList<Student> studentList = new ArrayList<Student>();
	private ArrayList<Book> bookList = new ArrayList<Book>();
	
	
	private School() {}
	
	public static School getInstance() {
		if(instance == null) {
			instance = new School();
		}
		return instance;
	}
	
	public ArrayList<Student> getStudentList(){
		return studentList;
	}
	
	public void addStudent(Student student) {
		studentList.add(student);
	}
	
	public void addBook(Book book) {
		bookList.add(book);
	}
	
	public ArrayList<Book> getBookList(){
		return bookList;
	}
	
	public void setBookList(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}

	
}
