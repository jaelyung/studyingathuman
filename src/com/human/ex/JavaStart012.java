package com.human.ex;

import java.util.*;
public class JavaStart012 {
	public static void funcAll(int a, int b) {
		System.out.println("int+int");
		System.out.println(a+b);
	}
	public static void funcAll(double a, double b) {
		System.out.println("double+double");
		System.out.println(a+b);	
	}
	public static void funcAll(int a, double b) {
		System.out.println("int+double");
		System.out.println(a+b);		
	}
	public static void funcAll(String a, int b) {
		System.out.println("String+int");
		System.out.println(a+b);		
	}
	public static void funcAll(String a, double b) {
		System.out.println("String+double");
		System.out.println(a+b);		
	}
	public static void funcAll(String a, String b) {
		System.out.println("String+String");
		System.out.println(a+b);		
	}
	
	public static void main(String[] args) {
		//funcAll이란 함수만들기. 매개변수2개 자료형 int, double, string 3개로 오버로드할때 가질 수 있는 메소드. return-> void
		int a1=3;
		int a2=5;
		double d1=10.2;
		double d2=15.3;
		String s1="hello";
		String s2="world";
		funcAll(a1,a2);
		funcAll(a1,d1);
		funcAll(s1,a1);
		funcAll(s1,d2);
		funcAll(s1,s2);
		funcAll(d1,d2);
		
		
	}



}
