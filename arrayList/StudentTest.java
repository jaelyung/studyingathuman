package arrayList;

public class StudentTest {

	public static void main(String[] args) {
		Student s1=new Student(1001, "Lee");
		Student s2=new Student(1002, "Kim");
		Student s3=new Student(1003, "Cho");
		
		s1.addBook("�¹���1", "������");
		s1.addBook("�¹���2", "������");
		s2.addBook("����1", "�ڰ渮");
		s2.addBook("����2", "�ڰ渮");
		s2.addBook("����3", "�ڰ渮");
		s3.addBook("�ظ�����1", "����.K.�Ѹ�");
		s3.addBook("�ظ�����2", "����.K.�Ѹ�");
		s3.addBook("�ظ�����3", "����.K.�Ѹ�");
		s3.addBook("�ظ�����4", "����.K.�Ѹ�");
		s3.addBook("�ظ�����5", "����.K.�Ѹ�");
		s3.addBook("�ظ�����6", "����.K.�Ѹ�");
		
		s1.showStudentInfo();
		s2.showStudentInfo();
		s3.showStudentInfo();
		
	}
}
