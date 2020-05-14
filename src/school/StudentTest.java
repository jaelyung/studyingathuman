package school;

public class StudentTest {

	public static void main(String[] args) {
		Student s1=new Student(1001, "Lee");
		Student s2=new Student(1002, "Kim");
		Student s3=new Student(1003, "Cho");
		
		s1.addBookList("태백산맥1", "조정래");
		s1.addBookList("태백산맥2", "조정래");
		s2.addBookList("토지1", "박경리");
		s2.addBookList("토지2", "박경리");
		s2.addBookList("토지3", "박경리");
		s3.addBookList("해리포터1", "조앤.K.롤링");
		s3.addBookList("해리포터2", "조앤.K.롤링");
		s3.addBookList("해리포터3", "조앤.K.롤링");
		s3.addBookList("해리포터4", "조앤.K.롤링");
		s3.addBookList("해리포터5", "조앤.K.롤링");
		s3.addBookList("해리포터6", "조앤.K.롤링");
		
		s1.showStudentInfo();
		s2.showStudentInfo();
		s3.showStudentInfo();
		
	}
}
