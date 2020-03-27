package com.human.ex;

import java.util.*;
public class JavaStart14 {
	public static boolean isInteger(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    return true;
	}
	public static boolean isDouble(String s) {
	    try { 
	        Double.parseDouble(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    return true;
	}
	 
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
		int r=0;//반지름
		double r1=0.0;
		int width=0;//가로
		double width1=0;//가로
		int height=0;//세로
		double height1=0;//세로
		String userInput1="";
		String userInput2="";
		System.out.println("어떤 도형의 넓이를 구하시겠습니까?");
		while(!(input==4)) {
			r=0;//반지름, 가로, 세로 값 초기화
			width=0;
			height=0;
			userInput1="";
			userInput2="";
			System.out.println("1.원의 넓이 2.사각형의 넓이 3.삼각형의 넓이 4.종료");
			input=Integer.parseInt(sc.nextLine());
			switch(input) {
			case 1://원의 넓이
				System.out.println("원의 넓이를 선택하셨습니다. 반지름 r의 값을 입력하세요.");
				userInput1=sc.nextLine();
				System.out.print("원의 넓이 : ");
				if(isInteger(userInput1)) {
					r=Integer.parseInt(userInput1);
					funcAll(r);
				}else if(isDouble(userInput1)){
					r1=Double.parseDouble(userInput1);
					funcAll(r1);
				}
				break;
			case 2://사각형의 넓이
				System.out.println("사각형의 넓이를 선택하셨습니다. 가로와 세로의 값을 입력하세요.");
				userInput1=sc.nextLine();
				userInput2=sc.nextLine();
				System.out.print("사각형의 넓이: ");
				if(isInteger(userInput1)) {
					if(isInteger(userInput2)) {//가로세로 모두정수
						width=Integer.parseInt(userInput1);
						height=Integer.parseInt(userInput2);
						funcAll(width,height);
					}else if(isDouble(userInput2)) {//가로는 정수 세로는 실수
						width=Integer.parseInt(userInput1);
						height1=Double.parseDouble(userInput2);
						funcAll(width,height1);
					}
				}else if(isDouble(userInput1)){//가로실수 세로 정수
					if(isInteger(userInput2)) {
						width1=Double.parseDouble(userInput1);
						height=Integer.parseInt(userInput2);
						funcAll(width1,height);
					}else if(isDouble(userInput2)) {//가로는 실수 세로는 실수
						width1=Double.parseDouble(userInput1);
						height1=Double.parseDouble(userInput2);
						funcAll(width1,height1);
					}
				}
				break;
			case 3://삼각형의 넓이
				System.out.println("삼각형의 넓이를 선택하셨습니다. 가로와 높이의 값을 입력하세요.");
				userInput1=sc.nextLine();
				userInput2=sc.nextLine();
				System.out.print("삼각형의 넓이: ");
				if(isInteger(userInput1)) {
					if(isInteger(userInput2)) {//가로세로 모두정수
						width=Integer.parseInt(userInput1);
						height=Integer.parseInt(userInput2);
						funcTri(width,height);
					}else if(isDouble(userInput2)) {//가로는 정수 세로는 실수
						width=Integer.parseInt(userInput1);
						height1=Double.parseDouble(userInput2);
						funcTri(width,height1);
					}
				}else if(isDouble(userInput1)){//가로실수 세로 정수
					if(isInteger(userInput2)) {
						width1=Double.parseDouble(userInput1);
						height=Integer.parseInt(userInput2);
						funcTri(width1,height);
					}else if(isDouble(userInput2)) {//가로는 실수 세로는 실수
						width1=Double.parseDouble(userInput1);
						height1=Double.parseDouble(userInput2);
						funcTri(width1,height1);
					}
				}	
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	
		//질문 반지름, 가로 세로의 값이 다 int로 초기화되어있는데 사용자가 실수를 입력할경우 생기는 에러는 어떻게 처리?
		//String으로 받아서 isInteger,isDouble 메소드를 활용해 문자열이 정수로 교환되는지, 실수로 교환되는지 확인	
	}



}
