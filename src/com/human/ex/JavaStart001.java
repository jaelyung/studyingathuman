package com.human.ex;

public class JavaStart001 {
	//1. 메소드의 지역변수는 메소드가 실행되면 스택에 올라간다.
	//2. 메소드간 지역변수는 공유되지 않는다.
	//3. 메소드가 종료되면 메모리에서 사라진다.
	//4. 코드블럭의 지역변수는 코드블럭이 종료되면 사라진다.	
	
	public static int sum(int a, int b) {//메소드는 public class안에 계속 만드는것 main안에 넣으면 에러
		int sum=0;
		sum=a+b;
		return sum;
		//sum=sum+1; return밑에 코드가 올 수 없다. 실행이 안됨
	}
	
	public static int min(int a, int b) {
//		int min=0;
//		min=c-d;
//		return min;
		return a-b;
	}
	
	public static int mul(int a, int b) {
//		int mul=0;
//		mul=e*f;
//		return mul;
		return a*b;
	}

	public static double div(double a, double b) {
//		double div=0;
//		div=g/h;
//		return div;
		return a/b;
	}
	
	public static void hello() {
		System.out.println("안녕하세요");
	}
	
	//두수 사이의 합(5,2) (2,5) 둘 다 14가 나오도록
	public static int sumAll(int a, int b) {
		int sum=0;
		if(a>b) {
			int temp;
			temp=a;
			a=b;
			b=temp;
		}//b가 항상 큰수가 됨
		for(;a<=b;a++) {
			sum=sum+a;
		}
		return sum;
	}
		
	public static int between(int i, int j) {//교환하는 작업 필요
		int sum=0;
		for(;i<=j;i++) {
			sum=sum+i;
		}
		return sum;
	}
		
	public static void main(String[] args) {
		//return값 없음, String[]이 매개변수
		int a=sum(1,2);//3
		int b=a+sum(2,2);//3+4=7
		System.out.println(a+b);//3+7=10
		//min mul div 함수를 만들어서 사용해보자.
		
		System.out.println(min(a,b));
		System.out.println(mul(a,b));
		System.out.println(div(a,b));
		
		//문제 1. min mul div 함수를 만들어서 사용해보자
		//문제 2. 매개변수와 리턴값이 없는 함수를 이용해 "안녕하세요"라는 내용을 출력하는 함수 hello를 만들고 메임함수에서 헬로함수를 여러번 호출, 안녕하세요를 출력
		hello();
		hello();
		hello();
		for(int i=0;i<3;i++) {
			hello();
		}
		//문제 3. 두 사이 수의 합을 구하는 함수
//		int i=between(2,6);//2+3+4+5+6=20
//		System.out.println(i);
		System.out.println(between(2,6));
		a=10;
		b=12;
		System.out.println(sumAll(a,b));
	
	}

}
