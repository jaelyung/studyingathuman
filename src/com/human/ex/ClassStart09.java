package com.human.ex;
class Circle{//원의 넓이와 둘레를 구하는 클래스
	private static double pi=3.14;
	public static void changePi(double pi) {
		Circle.pi=pi;
	}
	
	
	public double r=0;
	public Circle() {}
	public Circle(double r) {
		this.r=r;
	}
	public double border() {
		return 2*pi*r;//원래는 2*Circle.pi*Circle.r
	}
	public double area() {
		return 2*pi*r*r;
	}
}
public class ClassStart09 {
	public static void main(String[] args) {
		double r1=5;
		Circle c1=new Circle(r1);
		c1.area();
		c1.border();
		double r2=6;
		Circle c2=new Circle(r2);
		c2.area();
		c2.border();
		double r3=7;
		Circle c3=new Circle(r3);
		c3.area();
		c3.border();
		
		//프로그램 중간에 PI값을 3.141592 바꾸는 데 public double pi로 설정되어있으면 일일이 다 바꿔주고 함수를 재실행해야한다.
//		c1.pi=3.141592;
//		c1.area();
//		c1.border();
//		c2.pi=3.141592;
//		c2.area();
//		c2.border();
//		c3.pi=3.141592;
//		c3.area();
//		c3.border();
		//변경하고 실행하고 변경하고 실행하고... ->pi를 static으로 바꿔준다.
		//Circle.pi=3.141592; public 일때 가능
		Circle.changePi(3.141592);//private일때 setter함수 changePi를 이용해 pi값을 바꿔준다.
		System.out.println(c1.area());
		System.out.println(c1.border());
		System.out.println(c2.area());
		System.out.println(c2.border());
		System.out.println(c3.area());
		System.out.println(c3.border());
		
	}
}