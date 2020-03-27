package com.human.ex;

import java.util.*;
public class JavaStart16 {
	//전역변수, static변수, 클리스변수,
	public static int total=0;//다른클래스에서도 사용할 수 있다.
	public static void main(String[] args) {
		System.out.println(total);
		System.out.println(JavaStart16.total);//다른 클래스에서 사용할때
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
			//중괄호 안에있는 변수들은 사라져서 실행이 안됨.
		}
	}
}
