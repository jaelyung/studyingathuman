package com.human.ex;
//p.17
import java.util.*;
public class JavaStart23 {	
	public static int money=0;
	public static void save(int amount) {
		money=money+amount;
		System.out.println("���ݱ����� ������� "+money+"�Դϴ�.");
	}
	public static void draw(int amount) {
		money=money-amount;
		if(money<0) {
			System.out.println("�ܾ��� �����մϴ�.");
		}else {
			System.out.println("���ݱ����� �ܾ��� "+money+"�Դϴ�.");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=0;
		int save=0;
		int draw=0;
		
		while(!(input==-1)){
			System.out.println("�޴��� �����ϼ��� 1.���� 2.��������(����� -1):");
			input=Integer.parseInt(sc.nextLine());
			switch(input) {
			case 1:
				System.out.println("�󸶸� �����Ͻðڽ��ϱ�?");
				save=Integer.parseInt(sc.nextLine());
				save(save);
				break;
			case 2:
				System.out.println("�󸶸� �����Ͻðڽ��ϱ�?");
				draw=Integer.parseInt(sc.nextLine());
				draw(draw);
			}
			
		}
		System.out.println("���α׷��� �����մϴ�.");
	}

	
}
