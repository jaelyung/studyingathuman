package com.human.ex;

import java.util.*;
public class JavaStart22 {	
	public static void save(int amount) {
		int sum=0;
		sum=sum+amount;
		System.out.println("���ݱ����� ������� "+sum+"�Դϴ�.");
		printMenu();
	}
//	public static void draw(int amount) {
//		int sum=sum+amount;
//		System.out.println("���ݱ����� ������� "+sum+"�Դϴ�.");
//		
//	}
	public static void close() {
		System.out.println("���α׷��� �����մϴ�.");
	}
	public static void printMenu() {
		Scanner sc=new Scanner(System.in);
		int input=0;
		
		System.out.println("�󸶸� �����Ͻðڽ��ϱ�?(����� -1):");
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
