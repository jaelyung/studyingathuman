package com.human.ex;

import java.util.*;
public class JavaStart013 {
	public static void funcAll(int a) {//���� ����
		System.out.println(a*a*3.14);
	}
	public static void funcAll(double a) {//���� ����
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
		//�޴��� ������� ���̸� ���Ұ����� ����ڿ��� ����. ���� ����, �簢���� ����, �ﰢ���� ���̸� ���ϴ� �Լ��� �̿��� ���� ���̸� ���ϴ� �Լ��� ������.
		Scanner sc=new Scanner(System.in);
		int input=0;
		double r=0;//������
		double width=0;//����
		double height=0;//����
		System.out.println("� ������ ���̸� ���Ͻðڽ��ϱ�?");
		while(!(input==4)) {
			r=0;//������, ����, ���� �� �ʱ�ȭ
			width=0;
			height=0;
			System.out.println("1.���� ���� 2.�簢���� ���� 3.�ﰢ���� ���� 4.����");
			input=Integer.parseInt(sc.nextLine());
			switch(input) {
			case 1://���� ����
				System.out.println("���� ���̸� �����ϼ̽��ϴ�. ������ r�� ���� �Է��ϼ���.");
				r=Double.parseDouble(sc.nextLine());
				System.out.print("���� ���� : ");
				funcAll(r);
				break;
			case 2://�簢���� ����
				System.out.println("�簢���� ���̸� �����ϼ̽��ϴ�. ���ο� ������ ���� �Է��ϼ���.");
				width=Double.parseDouble(sc.nextLine());
				height=Double.parseDouble(sc.nextLine());
				System.out.print("�簢���� ����: ");
				funcAll(width, height);
				break;
			case 3://�ﰢ���� ����
				System.out.println("�ﰢ���� ���̸� �����ϼ̽��ϴ�. ���ο� ������ ���� �Է��ϼ���.");
				width=Double.parseDouble(sc.nextLine());
				height=Double.parseDouble(sc.nextLine());
				System.out.print("�ﰢ���� ����: ");
				funcTri(width, height);
				break;
			}
		}
		System.out.println("���α׷��� �����մϴ�.");
	
			
	}
}
