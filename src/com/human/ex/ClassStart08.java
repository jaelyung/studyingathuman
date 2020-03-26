package com.human.ex;
class Rectangle{
	private int width=0;
	private int height=0;//�ܺο��� ������ �����ϴ� ���� �����ֱ� ���� private���� ����
	//�ѷ�
	public int border() {
		return 2*width+2*height;
	}
	//����
	public int area() {// static ->��ü�� �������� �ʰ� �ٷ� ����� �� �ִ� �޼ҵ�� ���� ��� width height�� ���� �ν��Ͻ� �ʵ带 ����� �� ����.
		return width*height;
	}
	
	public static int border(int w, int h) {
		return 2*w+2*h;
	}
	//����
	public static int area(int w, int h) {// static ->��ü�� �������� �ʰ� �ٷ� ����� �� �ִ� �޼ҵ�� ���� ��� width height�� ���� �ν��Ͻ� �ʵ带 ����� �� ����.
		return w*h;
	}
	//setter, getter
	public void setWidth(int width) {
		if(width<0) {
			this.width=0;
		}else {
			this.width=width;
		}
	}
	public int getWidth() {
		return this.width;
	}
	public void setHeight(int height) {
		if(height<0) {
			this.height=0;
		}else {
			this.height=height;
		}
	}
	public int getHeight() {
		return this.height;
	}
	
	//������
	public Rectangle() {}
	public Rectangle(int length) {
		this(length,length);//Rectangle(int width, int height)�� ȣ����
	}
	public Rectangle(int width, int height) {
		if(width<0||height<0) {
			this.width=0;
			this.height=0;
		}
		this.width=width;
		this.height=height;
	}
	
}
public class ClassStart08 {
	public static void main(String[] args) {
		//�簢�� ���̿� �ѷ� ���ϴ� ���α׷� ����
		int x=10;
		int y=20;
		
		Rectangle r1=new Rectangle(x,y);
		//r1.width=10; ->private���� �ٸ� Ŭ�������� ������ �� ����.
		//ĸ��ȭ. ���������ϸ� ������ �� ���� �ִ�.
		//private�� ������ �� �ִ� �޼ҵ���� setter getter�� �̾߱��Ѵ�.
		r1.setWidth(-10);
		
		int area=r1.area();
		int border=r1.border();
		System.out.println("���:area="+area+" border="+border);
		//������ ������� ���ʹٸ� �ν��Ͻ��޼ҵ�(��ü�� �����͸� �����ϰ� �ʹٸ�)
		//������ ������� �ʿ���ٸ� static�޼ҵ�
		
		System.out.println("����:"+Rectangle.area(10, 20));
		//������ �μ��� ���̿� �ѷ��� �޼ҵ屸��
		
		
		System.out.println(border);
		System.out.println(r1.area());
		System.out.println(r1.border());
		
		
	}
}