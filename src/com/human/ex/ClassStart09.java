package com.human.ex;
class Circle{//���� ���̿� �ѷ��� ���ϴ� Ŭ����
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
		return 2*pi*r;//������ 2*Circle.pi*Circle.r
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
		
		//���α׷� �߰��� PI���� 3.141592 �ٲٴ� �� public double pi�� �����Ǿ������� ������ �� �ٲ��ְ� �Լ��� ������ؾ��Ѵ�.
//		c1.pi=3.141592;
//		c1.area();
//		c1.border();
//		c2.pi=3.141592;
//		c2.area();
//		c2.border();
//		c3.pi=3.141592;
//		c3.area();
//		c3.border();
		//�����ϰ� �����ϰ� �����ϰ� �����ϰ�... ->pi�� static���� �ٲ��ش�.
		//Circle.pi=3.141592; public �϶� ����
		Circle.changePi(3.141592);//private�϶� setter�Լ� changePi�� �̿��� pi���� �ٲ��ش�.
		System.out.println(c1.area());
		System.out.println(c1.border());
		System.out.println(c2.area());
		System.out.println(c2.border());
		System.out.println(c3.area());
		System.out.println(c3.border());
		
	}
}