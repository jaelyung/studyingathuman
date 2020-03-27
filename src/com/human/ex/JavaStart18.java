package com.human.ex;

import java.util.*;
public class JavaStart18 {
	//p.9 하나의 숫자를 입력받아 구구단 출력
	public static void multiTable(int a) {
		for(int i=1;i<10;i++) {
			System.out.println(a+"*"+i+"="+(a*i));
		}
	}
	
	public static void main(String[] args) {
		//p.9 하나의 숫자를 입력받아 구구단 출력
		Scanner sc=new Scanner(System.in);
		int input=0;
			
		System.out.println("하나의 숫자를 입력하세요:");
		input=Integer.parseInt(sc.nextLine());
		multiTable(input);
		
		
	}

	
}
