package com.human.ex;
class Triangle{
	private double width=0;
	private double height=0;
	public Triangle() {	}
	public Triangle(double width, double height) {
		if(width<0||height<0) {
			this.width=0;
			this.height=0;
		}
		this.width=width;
		this.height=height;
	}
	public double findArea() {
		return width*height/2;
	}
	public boolean isSameArea(Triangle t) {
		if(this.findArea()==t.findArea()) {
			return true;
		}else {
			return false;
		}
	}
	public double getWidth() {
		return this.width;
	}
	public double getHeight() {
		return this.height;
	}
	public void setWidth(double width) {
		if(width<0) {
			this.width=0;
		}else {
			this.width=width;
		}
	}
	public void setHeight(double height) {
		if(height<0) {
			this.height=0;
		}else {
			this.height=height;
		}
	}
}

public class TriangleTest {

	public static void main(String[] args) {
		Triangle t1=new Triangle(10.0, 5.0);
		Triangle t2=new Triangle(5.0, 10.0);
		Triangle t3=new Triangle(8.0, 8.0);
		
		System.out.println(t1.findArea());
		System.out.println(t2.findArea());
		System.out.println(t3.findArea());
		System.out.println(t1.isSameArea(t2));
		System.out.println(t1.isSameArea(t3));
	}

}
