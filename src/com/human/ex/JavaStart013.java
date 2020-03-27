package com.human.ex;

import java.util.*;
public class JavaStart013 {
	public static void funcAll(int a) {//원의 넓이
		System.out.println(a*a*3.14);
	}
	public static void funcAll(double a) {//원의 넓이
		System.out.println(a*a*3.14);
	}
	public static void funcAll(int a, int b) {
		System.out.println(a*b);	
	}
	public static void funcAll(int a, double b) {
		System.out.println(a*b);	
	}
	public static void funcAll(double a, double b) {
		System.out.println(a*b);	
	}
	public static void funcTri(int a, int b) {
		System.out.println(a*b/2);	
	}
	public static void funcTri(int a, double b) {
		System.out.println(a*b/2);	
	}
	public static void funcTri(double a, double b) {
		System.out.println(a*b/2);	
	}
	
	public static void main(String[] args) {
		//메뉴에 어떤도형의 넓이를 구할것인지 사용자에게 묻기. 원의 넓이, 사각형의 넓이, 삼각형의 넓이를 구하는 함수를 이용해 원의 넓이를 구하는 함수를 만들어보자.
		Scanner sc=new Scanner(System.in);
		int input=0;
		double r=0;//반지름
		double width=0;//가로
		double height=0;//세로
		System.out.println("어떤 도형의 넓이를 구하시겠습니까?");
		while(!(input==4)) {
			r=0;//반지름, 가로, 세로 값 초기화
			width=0;
			height=0;
			System.out.println("1.원의 넓이 2.사각형의 넓이 3.삼각형의 넓이 4.종료");
			input=Integer.parseInt(sc.nextLine());
			switch(input) {
			case 1://원의 넓이
				System.out.println("원의 넓이를 선택하셨습니다. 반지름 r의 값을 입력하세요.");
				r=Double.parseDouble(sc.nextLine());
				System.out.print("원의 넓이 : ");
				funcAll(r);
				break;
			case 2://사각형의 넓이
				System.out.println("사각형의 넓이를 선택하셨습니다. 가로와 세로의 값을 입력하세요.");
				width=Double.parseDouble(sc.nextLine());
				height=Double.parseDouble(sc.nextLine());
				System.out.print("사각형의 넓이: ");
				funcAll(width, height);
				break;
			case 3://삼각형의 넓이
				System.out.println("삼각형의 넓이를 선택하셨습니다. 가로와 높이의 값을 입력하세요.");
				width=Double.parseDouble(sc.nextLine());
				height=Double.parseDouble(sc.nextLine());
				System.out.print("삼각형의 넓이: ");
				funcTri(width, height);
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	
			
	}
}
