package book;

import java.util.ArrayList;

import school.Student;

public abstract class Book {
	protected String title;		//책이름
	protected String author;	//저자
	protected String subject;	//분류
	protected String bookId;	//책 고유번호
	protected boolean loaned; 	//true 대여중, false 대여가능
	
	//대출 신청한 학생 리스트
	//register() 메서드를 호출하면 리스트에 추가 됨
	//같은책이 재고가 여러권일 경우
	//재고????
	//대출 날짜, 반납 날짜 설정??
	private ArrayList<Student> studentList = new ArrayList<Student>();
	
	public Book() {}
	public Book(String bookId) {
		this.bookId=bookId;
	}
	public Book(String title, String author) {
		this.title=title;
		this.author=author;
	}
	public Book(String bookId, String title, String author) {
		this.bookId=bookId;
		this.title=title;
		this.author=author;
	}
	
	public boolean equals(String bookId) {
		if(this.bookId.equals(bookId)) {
			return true;
		}else {
			return false;
		}
	}
	
	public abstract int getLateFees(int days);
	
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getBookId() {
		return bookId;
	}
	
	public void setBookId(String bookId) {//유일 식별자 중복 체크필요
		this.bookId = bookId;
	}
	
	public boolean isLoaned() {
		return loaned;
	}
	
	public void setLoaned(boolean loaned) {
		this.loaned=loaned;
	}
	
	public ArrayList<Student> getStudentList() {
		return studentList;
	}
	
	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	
	public void register(Student student) {
		studentList.add(student);
	}
	
	public void showBookInfo() {
		System.out.println(title+","+author);
	}
}
