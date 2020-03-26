package com.human.ex;
class Rectangle{
	private int width=0;
	private int height=0;//외부에서 음수로 설정하는 것을 막아주기 위해 private으로 설정
	//둘레
	public int border() {
		return 2*width+2*height;
	}
	//넓이
	public int area() {// static ->객체를 생성하지 않고 바로 사용할 수 있는 메소드로 변경 대신 width height와 같은 인스턴스 필드를 사용할 수 없다.
		return width*height;
	}
	
	public static int border(int w, int h) {
		return 2*w+2*h;
	}
	//넓이
	public static int area(int w, int h) {// static ->객체를 생성하지 않고 바로 사용할 수 있는 메소드로 변경 대신 width height와 같은 인스턴스 필드를 사용할 수 없다.
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
	
	//생성자
	public Rectangle() {}
	public Rectangle(int length) {
		this(length,length);//Rectangle(int width, int height)를 호출함
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
		//사각형 넓이와 둘레 구하는 프로그램 구현
		int x=10;
		int y=20;
		
		Rectangle r1=new Rectangle(x,y);
		//r1.width=10; ->private여서 다른 클래스에서 접근할 수 없다.
		//캡슐화. 직접접근하면 음수가 들어갈 수도 있다.
		//private를 구현할 수 있는 메소드들을 setter getter라 이야기한다.
		r1.setWidth(-10);
		
		int area=r1.area();
		int border=r1.border();
		System.out.println("출력:area="+area+" border="+border);
		//과거의 계산결과를 얻고싶다면 인스턴스메소드(객체에 데이터를 저장하고 싶다면)
		//과거의 계산결과가 필요없다면 static메소드
		
		System.out.println("넓이:"+Rectangle.area(10, 20));
		//간단히 두수의 넓이와 둘레는 메소드구현
		
		
		System.out.println(border);
		System.out.println(r1.area());
		System.out.println(r1.border());
		
		
	}
}