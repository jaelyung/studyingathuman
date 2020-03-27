package com.human.ex;

import java.util.*;
public class JavaStart14 {
	public static boolean isInteger(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    return true;
	}
	public static boolean isDouble(String s) {
	    try { 
	        Double.parseDouble(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    return true;
	}
	 
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
		int r=0;//������
		double r1=0.0;
		int width=0;//����
		double width1=0;//����
		int height=0;//����
		double height1=0;//����
		String userInput1="";
		String userInput2="";
		System.out.println("� ������ ���̸� ���Ͻðڽ��ϱ�?");
		while(!(input==4)) {
			r=0;//������, ����, ���� �� �ʱ�ȭ
			width=0;
			height=0;
			userInput1="";
			userInput2="";
			System.out.println("1.���� ���� 2.�簢���� ���� 3.�ﰢ���� ���� 4.����");
			input=Integer.parseInt(sc.nextLine());
			switch(input) {
			case 1://���� ����
				System.out.println("���� ���̸� �����ϼ̽��ϴ�. ������ r�� ���� �Է��ϼ���.");
				userInput1=sc.nextLine();
				System.out.print("���� ���� : ");
				if(isInteger(userInput1)) {
					r=Integer.parseInt(userInput1);
					funcAll(r);
				}else if(isDouble(userInput1)){
					r1=Double.parseDouble(userInput1);
					funcAll(r1);
				}
				break;
			case 2://�簢���� ����
				System.out.println("�簢���� ���̸� �����ϼ̽��ϴ�. ���ο� ������ ���� �Է��ϼ���.");
				userInput1=sc.nextLine();
				userInput2=sc.nextLine();
				System.out.print("�簢���� ����: ");
				if(isInteger(userInput1)) {
					if(isInteger(userInput2)) {//���μ��� �������
						width=Integer.parseInt(userInput1);
						height=Integer.parseInt(userInput2);
						funcAll(width,height);
					}else if(isDouble(userInput2)) {//���δ� ���� ���δ� �Ǽ�
						width=Integer.parseInt(userInput1);
						height1=Double.parseDouble(userInput2);
						funcAll(width,height1);
					}
				}else if(isDouble(userInput1)){//���νǼ� ���� ����
					if(isInteger(userInput2)) {
						width1=Double.parseDouble(userInput1);
						height=Integer.parseInt(userInput2);
						funcAll(width1,height);
					}else if(isDouble(userInput2)) {//���δ� �Ǽ� ���δ� �Ǽ�
						width1=Double.parseDouble(userInput1);
						height1=Double.parseDouble(userInput2);
						funcAll(width1,height1);
					}
				}
				break;
			case 3://�ﰢ���� ����
				System.out.println("�ﰢ���� ���̸� �����ϼ̽��ϴ�. ���ο� ������ ���� �Է��ϼ���.");
				userInput1=sc.nextLine();
				userInput2=sc.nextLine();
				System.out.print("�ﰢ���� ����: ");
				if(isInteger(userInput1)) {
					if(isInteger(userInput2)) {//���μ��� �������
						width=Integer.parseInt(userInput1);
						height=Integer.parseInt(userInput2);
						funcTri(width,height);
					}else if(isDouble(userInput2)) {//���δ� ���� ���δ� �Ǽ�
						width=Integer.parseInt(userInput1);
						height1=Double.parseDouble(userInput2);
						funcTri(width,height1);
					}
				}else if(isDouble(userInput1)){//���νǼ� ���� ����
					if(isInteger(userInput2)) {
						width1=Double.parseDouble(userInput1);
						height=Integer.parseInt(userInput2);
						funcTri(width1,height);
					}else if(isDouble(userInput2)) {//���δ� �Ǽ� ���δ� �Ǽ�
						width1=Double.parseDouble(userInput1);
						height1=Double.parseDouble(userInput2);
						funcTri(width1,height1);
					}
				}	
				break;
			}
		}
		System.out.println("���α׷��� �����մϴ�.");
	
		//���� ������, ���� ������ ���� �� int�� �ʱ�ȭ�Ǿ��ִµ� ����ڰ� �Ǽ��� �Է��Ұ�� ����� ������ ��� ó��?
		//String���� �޾Ƽ� isInteger,isDouble �޼ҵ带 Ȱ���� ���ڿ��� ������ ��ȯ�Ǵ���, �Ǽ��� ��ȯ�Ǵ��� Ȯ��	
	}



}
