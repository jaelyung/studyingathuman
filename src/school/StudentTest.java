package school;

public class StudentTest {

	public static void main(String[] args) {
		Student s1=new Student(1001, "Lee");
		Student s2=new Student(1002, "Kim");
		Student s3=new Student(1003, "Cho");
		
		s1.addBookList("�¹���1", "������");
		s1.addBookList("�¹���2", "������");
		s2.addBookList("����1", "�ڰ渮");
		s2.addBookList("����2", "�ڰ渮");
		s2.addBookList("����3", "�ڰ渮");
		s3.addBookList("�ظ�����1", "����.K.�Ѹ�");
		s3.addBookList("�ظ�����2", "����.K.�Ѹ�");
		s3.addBookList("�ظ�����3", "����.K.�Ѹ�");
		s3.addBookList("�ظ�����4", "����.K.�Ѹ�");
		s3.addBookList("�ظ�����5", "����.K.�Ѹ�");
		s3.addBookList("�ظ�����6", "����.K.�Ѹ�");
		
		s1.showStudentInfo();
		s2.showStudentInfo();
		s3.showStudentInfo();
		
	}
}
