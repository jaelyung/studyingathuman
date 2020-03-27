package com.human.ex;

import java.util.*;
public class JavaStart20 {
	//p.11
	public static boolean checkMenuNumber(int a) {
	    if(!(a==1||a==2||a==3)) {
	    	return false;
	    }
	    return true;
	}
	public static void menu(int a) {
		if(a==3) {
			System.out.println("프로그램을 종료합니다.");
		}else if(a==1){
			square();
			printMenu();
		}else if(a==2) {
			circle();
			printMenu();
		}
		
	}
	public static void printMenu() {
		Scanner sc=new Scanner(System.in);
		int input=0;
		System.out.println();
		System.out.println("***** 도형의 넓이 *****");
		System.out.println("1.정사각형 \n2.원");
		System.out.println("*******************");
		System.out.println("넓이를 구하려는 도형을 선택하세요(종료:3):");
		input=Integer.parseInt(sc.nextLine());
		if(checkMenuNumber(input)) {
			
		}else {
			System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			printMenu();
		}
		menu(input);
	}
	public static void square() {
		Scanner sc=new Scanner(System.in);
		int input=0;
		
		System.out.println("정사각형 한 변의 길이를 입력하세요:");
		input=Integer.parseInt(sc.nextLine());
		System.out.println("정사각형의 넓이:"+input*input);
	}
	public static void circle() {
		Scanner sc=new Scanner(System.in);
		int input=0;
		
		System.out.println("원 반지름의 길이를 입력하세요:");
		input=Integer.parseInt(sc.nextLine());
		System.out.println("원의 넓이:"+input*input*3.14);
	}
	
	public static void main(String[] args) {
		printMenu();
		
		
	}

	
}
