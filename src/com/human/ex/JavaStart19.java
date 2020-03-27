package com.human.ex;

import java.util.*;
public class JavaStart19 {
	//p.10 메뉴 시스템 작성
	public static boolean checkMenuNumber(int s) {
	    if(s>4||s<1) {
	    	return false;
	    }
	    return true;
	}
	public static void menu(int a) {
		if(a==4) {
			System.out.println("프로그램을 종료합니다.");
		}else {
			System.out.println(a+"번 메뉴가 선택되었습니다.");
		}
	}
	
	public static void printMenu() {
		Scanner sc=new Scanner(System.in);
		int input=0;
		
		System.out.println("1.햄버거 \n2.치즈버거\n3.샌드위치\n4.종료");
		System.out.println("원하는 메뉴를 선택하시오:");
		input=Integer.parseInt(sc.nextLine());
		if(checkMenuNumber(input)) {
			
		}else {
			printMenu();
		}
		menu(input);
	}
	
	public static void main(String[] args) {
		printMenu();
		
		
	}

	
}
