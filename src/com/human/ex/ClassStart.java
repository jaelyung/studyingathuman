package com.human.ex;
class Cat{
	public static int ageVaccination=5;
	public String name="�̸�";//�ν��Ͻ� �ʵ�
	public int age=0;
	public static void changeAgeVaccination(int ageVacc) {
		//static�޼ҵ忡���� �ν��Ͻ� �ʵ忡 ������ �� ����. ����:static�޼ҵ尡 �����ɶ� �ν��Ͻ� �ʵ忡 �ƹ��͵� �������� �ʾұ� ����.
		//static�޼ҵ忡���� static �ʵ忡 ������ �� �ִ�.
		//�ν��Ͻ� �޼ҵ忡���� static �ʵ忡 ������ �� �ִ�.
		Cat.ageVaccination=ageVacc;
	}
	public String isVaccination() {
		String returnValue="";
		if(Cat.ageVaccination<age) {
			returnValue="��������";
		}else {
			returnValue="����ڰ� �ƴ�";
		}
		
		return returnValue;
	}
	//������ �޼ҵ�->�ν��Ͻ� ������ ���� �ʱ�ȭ �ϴµ� ���
	//Ư¡ 1.���ϰ��� ����. 2.Ŭ������� �̸��� �����ϴ�.
	public Cat() {
		System.out.println("�⺻�������Լ�����");
	}
	public Cat(String name) {
		this(name,1);
	}
	public Cat(String name,int age) {
		//���� ���� ���� 1.�������� 2.�ν��Ͻ� �ʵ� 3.Ŭ���� �ʵ�
		this.name=name; //this �� ������ ������ ������������ name�� ã�� this�� ���̸� �ν��Ͻ� �ʵ忡�� ã�´�.
		this.age=age;
	}
	//���������� public default protected private
	//public ��𼭵��� ����� �� �ִ�. 1.����Ŭ���� 2.�ٸ�Ŭ���� 3.����package 4.��ӹ�����
	//private ����Ŭ���������� ����� �� �ִ�.
	//��� �޼ҵ� �ν��Ͻ� �޼ҵ�
	public void catPrint() {
		System.out.println(name+":"+age);
	}
	public void catAddAge(int a) {
		age=age+a;
	}
}
//�簢�� ���̱��ϴ� �޼ҵ带 ������ ��ü�� ����� �簢�� ���̸� ���غ���.

class Rectangle{
	private int width=0;
	private int height=0;
	//private ���� �����Ͽ� ����ڰ� ���� ������ �� ����.
	//setter ���� �����ϴ� �޼ҵ�
	public void setHeight(int height) {
		if(height<0) {
			height=0;
		}
		this.height=height;
	}
	public int getHeight() {
		return this.height;
	}
	
	public void setWidth(int width) {
		if(width<0) {
			width=0;
		}
		this.width=width;
	}
	//getter ���� �о���� �޼ҵ�
	public int getWidth() {
		return this.width;
	}
	
	public int area=0;
	public Rectangle() {}//��������
	public Rectangle(int width, int height) {
		if(width<0) {
			width=0;
		}
		if(height<0) {
			height=0;
		}
		this.width=width;
		this.height=height;
	}
	public int area() {
		return width*height;
	}
	public void rectanglePrint() {
		area=width*height;
		System.out.println(area);
	}
	public void rectangleAdd(int w, int h) {
		width=width+w;
		height=height+h;
	}
	
	
}
//������ ���� ��հ� ������ ����� �� �ִ� ��ü�� ����� ����.
class Student{
	public int kor=0;
	public int eng=0;
	public int math=0;
	public Student() {}
	public Student(int kor, int eng, int math) {
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	public int total() {
		return kor+eng+math;
	}
	public int ave() {
		return total()/3;
	}
	public void totalScore() {
		int totalScore=0;
		totalScore=kor+eng+math;
		System.out.println(totalScore);
	}
	public void average() {
		int average=0;
		average=(kor+eng+math)/3;
		System.out.println(average);
	}
}
public class ClassStart {
	public static void catPrint(Cat c) {//Cat Ŭ������ �޴´�
		System.out.println(c.name+":"+c.age);	
	}
	public static void catAddAge(Cat c, int a) {
		c.age=c.age+a;
	}
	
	public static void main(String[] args) {
		Rectangle r1=new Rectangle(3,5);
		int area=r1.area();
		System.out.println(area);
		//r1.width=-1;    ���̰� ������ ��µǴ� ������ �߻�
		r1.setWidth(-1);
		r1.setHeight(5);
		
		
		r1.rectanglePrint();
		Rectangle r2=new Rectangle(4,4);
		r2.rectangleAdd(2,3);
		r2.rectanglePrint();
		
		Student s1=new Student(80, 80, 90);
		Student s2=new Student(70, 80, 90);
		Student s3=new Student(60, 60, 90);
		System.out.println(s1.total());
		System.out.println(s1.ave());
		
		s1.totalScore();
		s1.average();
		s2.totalScore();
		s2.average();
		s3.totalScore();
		s3.average();
		//		Cat c1=new Cat(); public Cat()������ ������
//		c1.name="��1";
//		c1.age=12;
//		Cat c2=new Cat();
//		c2.name="��2";
//		c2.age=13;
//		Cat c3=new Cat();
//		c3.name="��3";
//		c3.age=1;
		
		//����� ���̰� 5�� �����̸� ���������� �ǽ�
		//1. ���� �ٲ�� 6��� ����
		//�ν��Ͻ����� ������ �� �ִ� ���� Static
		
		Cat c1=new Cat("��1",11);
		//c1.ageVaccination=6;//������->c1�� 6���� ����ǰ� ������ �������� �����ϰ� ����ȵ�
		c1.age=3;
		System.out.println(c1.isVaccination());
		System.out.println(Cat.ageVaccination);
		Cat.changeAgeVaccination(10);//�������� �ʾƵ� �̹� static�� �����Ǿ�����.
		Cat c2=new Cat("��2",12);
		System.out.println(c2.isVaccination());
		Cat c3=new Cat("��3",13);
		Cat c4=new Cat();
		Cat c5=new Cat("��5");
//		c1.catAddAge(5);
//		c1.catPrint();
//		c2.catPrint();
//		c3.catPrint();
//		c4.catPrint();
//		c5.catPrint();
		//����� ���̸� �Ű�������ŭ ������Ű�ų� ���ҽ�Ű�� �Լ��� ����� ����.
		//catAddAge
//		catAddAge(c1,3);
//		c1.catPrint();
		//�Լ��� ��� Ư�� ��ü�� ����ϴ� �Լ��� �����
//		catPrint(c1);
//		catPrint(c2);
//		catPrint(c3);
//		//���������
//		System.out.println(c1.name+":"+c1.age);
//		System.out.println(c2.name+":"+c2.age);
	}
}
