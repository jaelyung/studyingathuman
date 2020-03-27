package com.human.ex;
class Cat{
	public static int ageVaccination=5;
	public String name="이름";//인스턴스 필드
	public int age=0;
	public static void changeAgeVaccination(int ageVacc) {
		//static메소드에서는 인스턴스 필드에 접근할 수 없다. 이유:static메소드가 생성될때 인스턴스 필드에 아무것도 생성되지 않았기 때문.
		//static메소드에서는 static 필드에 접근할 수 있다.
		//인스턴스 메소드에서는 static 필드에 접근할 수 있다.
		Cat.ageVaccination=ageVacc;
	}
	public String isVaccination() {
		String returnValue="";
		if(Cat.ageVaccination<age) {
			returnValue="예방접종";
		}else {
			returnValue="대상자가 아님";
		}
		
		return returnValue;
	}
	//생성자 메소드->인스턴스 변수의 값을 초기화 하는데 사용
	//특징 1.리턴값이 없다. 2.클래스명과 이름이 동일하다.
	public Cat() {
		System.out.println("기본생성자함수실행");
	}
	public Cat(String name) {
		this(name,1);
	}
	public Cat(String name,int age) {
		//변수 접근 순서 1.지역변수 2.인스턴스 필드 3.클래스 필드
		this.name=name; //this 를 붙이지 않으면 지역변수에서 name을 찾고 this를 붙이면 인스턴스 필드에서 찾는다.
		this.age=age;
	}
	//접근제한자 public default protected private
	//public 어디서든지 사용할 수 있다. 1.같은클래스 2.다른클래스 3.같은package 4.상속받은곳
	//private 같은클래스에서만 사용할 수 있다.
	//멤버 메소드 인스턴스 메소드
	public void catPrint() {
		System.out.println(name+":"+age);
	}
	public void catAddAge(int a) {
		age=age+a;
	}
}
//사각형 넓이구하는 메소드를 포함한 객체를 만들어 사각형 넓이를 구해보자.

class Rectangle{
	private int width=0;
	private int height=0;
	//private 으로 설정하여 사용자가 값을 변경할 수 없다.
	//setter 값을 세팅하는 메소드
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
	//getter 값을 읽어오는 메소드
	public int getWidth() {
		return this.width;
	}
	
	public int area=0;
	public Rectangle() {}//에러방지
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
//국영수 과목 평균과 총점을 출력할 수 있는 객체를 만들어 보자.
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
	public static void catPrint(Cat c) {//Cat 클래스를 받는다
		System.out.println(c.name+":"+c.age);	
	}
	public static void catAddAge(Cat c, int a) {
		c.age=c.age+a;
	}
	
	public static void main(String[] args) {
		Rectangle r1=new Rectangle(3,5);
		int area=r1.area();
		System.out.println(area);
		//r1.width=-1;    넓이가 음수로 출력되는 문제가 발생
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
		//		Cat c1=new Cat(); public Cat()때문에 에러남
//		c1.name="고1";
//		c1.age=12;
//		Cat c2=new Cat();
//		c2.name="고2";
//		c2.age=13;
//		Cat c3=new Cat();
//		c3.name="고3";
//		c3.age=1;
		
		//고양이 나이가 5살 이하이면 예방접종을 실시
		//1. 법이 바뀌면 6살로 변경
		//인스턴스들이 공유할 수 있는 변수 Static
		
		Cat c1=new Cat("고1",11);
		//c1.ageVaccination=6;//문제점->c1만 6으로 변경되고 나머지 변수들은 동일하게 적용안됨
		c1.age=3;
		System.out.println(c1.isVaccination());
		System.out.println(Cat.ageVaccination);
		Cat.changeAgeVaccination(10);//선언하지 않아도 이미 static에 설정되어있음.
		Cat c2=new Cat("고2",12);
		System.out.println(c2.isVaccination());
		Cat c3=new Cat("고3",13);
		Cat c4=new Cat();
		Cat c5=new Cat("고5");
//		c1.catAddAge(5);
//		c1.catPrint();
//		c2.catPrint();
//		c3.catPrint();
//		c4.catPrint();
//		c5.catPrint();
		//고양이 나이를 매개변수만큼 증가시키거나 감소시키는 함수를 만들어 보자.
		//catAddAge
//		catAddAge(c1,3);
//		c1.catPrint();
		//함수적 방식 특정 개체를 출력하는 함수를 만든다
//		catPrint(c1);
//		catPrint(c2);
//		catPrint(c3);
//		//절차적방식
//		System.out.println(c1.name+":"+c1.age);
//		System.out.println(c2.name+":"+c2.age);
	}
}
