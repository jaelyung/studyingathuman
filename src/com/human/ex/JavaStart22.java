package com.human.ex;

import java.util.*;
public class JavaStart22 {	
	public static void save(int amount) {
		int sum=0;
		sum=sum+amount;
		System.out.println("지금까지의 저축액은 "+sum+"입니다.");
		printMenu();
	}
//	public static void draw(int amount) {
//		int sum=sum+amount;
//		System.out.println("지금까지의 저축액은 "+sum+"입니다.");
//		
//	}
	public static void close() {
		System.out.println("프로그램을 종료합니다.");
	}
	public static void printMenu() {
		Scanner sc=new Scanner(System.in);
		int input=0;
		
		System.out.println("얼마를 저축하시겠습니까?(종료는 -1):");
		input=Integer.parseInt(sc.nextLine());
		if(input>=0) {
			save(input);
//		}else if(input<0){
//			draw(input);
		}else if(input==-1) {
			close();
		}
	}
	
	
	public static void main(String[] args) {
		printMenu();
		
	}

	
}
