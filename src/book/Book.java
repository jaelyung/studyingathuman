package book;

import java.util.ArrayList;

import school.Student;

public abstract class Book {
	protected String title;		//å�̸�
	protected String author;	//����
	protected String subject;	//�з�
	protected String bookId;	//å ������ȣ
	protected boolean loaned; 	//true �뿩��, false �뿩����
	
	//���� ��û�� �л� ����Ʈ
	//register() �޼��带 ȣ���ϸ� ����Ʈ�� �߰� ��
	//����å�� ��� �������� ���
	//���????
	//���� ��¥, �ݳ� ��¥ ����??
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
	
	public void setBookId(String bookId) {//���� �ĺ��� �ߺ� üũ�ʿ�
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
