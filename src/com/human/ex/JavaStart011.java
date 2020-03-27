package com.human.ex;

import java.util.*;
public class JavaStart011 {
	public static int sum(int a, int b, int c) {//매개변수의 개수가 다르면 허용
		System.out.println("int+int");
		
		
		return a+b;
	}
	public static int sum(int a, int b) {
		System.out.println("int+int");
		
		
		return a+b;
	}
	public static int sum(int a, double b) {//자료형이 다르면 허용
		System.out.println("int+double");
		
		
		return (int)(a+b);//a+b는 자료형이 달라서 에러
	}

	public static void main(String[] args) {
		//함수 overload override overloading overriding
		//overload 매개변수가 다르면 같은 이름의 함수를 만들 수 있다.
		//리턴값과는 관계가 없음
		//override 상속과 관련된 메소드 재정의
		
		int a=sum(10,20);
		System.out.println(a);
		double b=10.0;
		System.out.println(sum(a,b));
		//매개변수도 자동형변환이 되어 들어간다.
		
	}



}
