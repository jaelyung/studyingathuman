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
			System.out.println("���α׷��� �����մϴ�.");
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
		System.out.println("***** ������ ���� *****");
		System.out.println("1.���簢�� \n2.��");
		System.out.println("*******************");
		System.out.println("���̸� ���Ϸ��� ������ �����ϼ���(����:3):");
		input=Integer.parseInt(sc.nextLine());
		if(checkMenuNumber(input)) {
			
		}else {
			System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���.");
			printMenu();
		}
		menu(input);
	}
	public static void square() {
		Scanner sc=new Scanner(System.in);
		int input=0;
		
		System.out.println("���簢�� �� ���� ���̸� �Է��ϼ���:");
		input=Integer.parseInt(sc.nextLine());
		System.out.println("���簢���� ����:"+input*input);
	}
	public static void circle() {
		Scanner sc=new Scanner(System.in);
		int input=0;
		
		System.out.println("�� �������� ���̸� �Է��ϼ���:");
		input=Integer.parseInt(sc.nextLine());
		System.out.println("���� ����:"+input*input*3.14);
	}
	
	public static void main(String[] args) {
		printMenu();
		
		
	}

	
}
