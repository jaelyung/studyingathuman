package com.human.ex;

import java.util.*;
public class JavaStart19 {
	//p.10 �޴� �ý��� �ۼ�
	public static boolean checkMenuNumber(int s) {
	    if(s>4||s<1) {
	    	return false;
	    }
	    return true;
	}
	public static void menu(int a) {
		if(a==4) {
			System.out.println("���α׷��� �����մϴ�.");
		}else {
			System.out.println(a+"�� �޴��� ���õǾ����ϴ�.");
		}
	}
	
	public static void printMenu() {
		Scanner sc=new Scanner(System.in);
		int input=0;
		
		System.out.println("1.�ܹ��� \n2.ġ�����\n3.������ġ\n4.����");
		System.out.println("���ϴ� �޴��� �����Ͻÿ�:");
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
