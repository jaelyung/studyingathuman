package com.human.ex;

import java.util.*;
public class JavaStart011 {
	public static int sum(int a, int b, int c) {//�Ű������� ������ �ٸ��� ���
		System.out.println("int+int");
		
		
		return a+b;
	}
	public static int sum(int a, int b) {
		System.out.println("int+int");
		
		
		return a+b;
	}
	public static int sum(int a, double b) {//�ڷ����� �ٸ��� ���
		System.out.println("int+double");
		
		
		return (int)(a+b);//a+b�� �ڷ����� �޶� ����
	}

	public static void main(String[] args) {
		//�Լ� overload override overloading overriding
		//overload �Ű������� �ٸ��� ���� �̸��� �Լ��� ���� �� �ִ�.
		//���ϰ����� ���谡 ����
		//override ��Ӱ� ���õ� �޼ҵ� ������
		
		int a=sum(10,20);
		System.out.println(a);
		double b=10.0;
		System.out.println(sum(a,b));
		//�Ű������� �ڵ�����ȯ�� �Ǿ� ����.
		
	}



}
