package com.human.ex;

import java.util.Arrays;


public class JavaStart002 {
	//���� 1. �ﰢ�� 3���� ȭ�鿡 ���
	public static void triangle1() {
		System.out.println("*\n**\n***\n****\n*****");
	}
	
	public static void triangle2() {
		System.out.println("    *\n   **\n  ***\n ****\n*****");
	}
	
	public static void triangle3() {
		System.out.println("   *   \n  ***  \n ***** \n*******");
	}
	//���� 2. ������ ����� main���� ȣ���Ͽ� ���
	public static void nametag() {
		System.out.println("\'�ȳ��ڹ�\'");
		System.out.println("�̸�:����� \n�̸���:jaelyungkim@naver.com \n��ȭ��ȣ:01012345678");
	}
	//����3. �迭�� �Ű������� ���Ͽ� �迭������ ���� �������ִ� �Լ�
	public static int arr(int a[]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		return sum;
	}
	//����4. �޷��� ����� �Լ�
	public static void calender() {
			int day=0;
			int date=0;
			int startDay=3;
			int dayNum=31;
			System.out.println("==================================================");
			System.out.println("��\t��\tȭ\t��\t��\t��\t��");
			System.out.println("==================================================");
			
			for(day=0;day<startDay;day++) {
				System.out.print("\t");
			}
			for(date=1;date<=dayNum;date++) {
				if(day==7) {
					day=0;
					System.out.println("");
				}
				day++;
				System.out.print(date+"\t");
				
			}
			System.out.println("");
	}
	//����5. 
	public static int intFunc(int a) {
		return a;
	}
	public static double doubleFunc(double a) {
		return a;
	}
	public static String stringFunc(String a) {
		return a;
	}
	public static String catFunc() {
		Cat c=new Cat();
		c.name="����";
		c.age=2;
		String str="�̸�:"+c.name+" ����:"+c.age;
		return str;
	}
	
	
	public static void main(String[] args) {
		//���� 1
		triangle1();
		triangle2();
		triangle3();
		//����2
		nametag();
		//����3
		int a[]= {1,2,3,4};
		arr(a);
		//����4
		calender();
		//����5
		System.out.println(intFunc(1));
		intFunc(1);
		System.out.println(doubleFunc(1));
		doubleFunc(1);
		System.out.println(stringFunc("java"));
		stringFunc("�ڹ�");
		System.out.println(catFunc());
		catFunc();
		
		
		
		
		
		
		
		
		
		
		
	}

}
