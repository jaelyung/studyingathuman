package com.human.ex;

import java.util.*;
public class JavaStart21 {
	//p.12 1~100까지의 짝수/홀수의 값	
	public static void evenNumber() {
		int sum=0;
		for(int i=1;i<101;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
	
	public static void oddNumber() {
		int sum=0;
		for(int i=1;i<101;i++) {
			if(i%2==1) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		System.out.print("1~100까지의 짝수의 합 : ");
		evenNumber();
		System.out.print("1~100까지의 홀수의 합 : ");
		oddNumber();
		
	}

	
}
