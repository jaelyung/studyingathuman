package com.human.ex;

import java.util.*;
public class JavaStart16 {
	//��������, static����, Ŭ��������,
	public static int total=0;//�ٸ�Ŭ���������� ����� �� �ִ�.
	public static void main(String[] args) {
		System.out.println(total);
		System.out.println(JavaStart16.total);//�ٸ� Ŭ�������� ����Ҷ�
		int i=0;
		{
			total=10;
			int i1=0;
		}
		if(true) {
			int i2=10;
		}
		for(int j=0;j<11;j++) {
			int i3=10;
			i++;
			//i1++;
			//i2++;
			//�߰�ȣ �ȿ��ִ� �������� ������� ������ �ȵ�.
		}
	}
}
