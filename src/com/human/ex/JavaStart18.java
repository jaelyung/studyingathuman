package com.human.ex;

import java.util.*;
public class JavaStart18 {
	//p.9 �ϳ��� ���ڸ� �Է¹޾� ������ ���
	public static void multiTable(int a) {
		for(int i=1;i<10;i++) {
			System.out.println(a+"*"+i+"="+(a*i));
		}
	}
	
	public static void main(String[] args) {
		//p.9 �ϳ��� ���ڸ� �Է¹޾� ������ ���
		Scanner sc=new Scanner(System.in);
		int input=0;
			
		System.out.println("�ϳ��� ���ڸ� �Է��ϼ���:");
		input=Integer.parseInt(sc.nextLine());
		multiTable(input);
		
		
	}

	
}
