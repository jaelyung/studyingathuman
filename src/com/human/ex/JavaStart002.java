package com.human.ex;

import java.util.Arrays;


public class JavaStart002 {
	//문제 1. 삼각형 3개를 화면에 출력
	public static void triangle1() {
		System.out.println("*\n**\n***\n****\n*****");
	}
	
	public static void triangle2() {
		System.out.println("    *\n   **\n  ***\n ****\n*****");
	}
	
	public static void triangle3() {
		System.out.println("   *   \n  ***  \n ***** \n*******");
	}
	//문제 2. 명함을 만들고 main에서 호출하여 출력
	public static void nametag() {
		System.out.println("\'안녕자바\'");
		System.out.println("이름:김재령 \n이메일:jaelyungkim@naver.com \n전화번호:01012345678");
	}
	//문제3. 배열을 매개변수로 합하여 배열내용의 합을 리턴해주는 함수
	public static int arr(int a[]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		return sum;
	}
	//문제4. 달력을 만드는 함수
	public static void calender() {
			int day=0;
			int date=0;
			int startDay=3;
			int dayNum=31;
			System.out.println("==================================================");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
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
	//문제5. 
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
		c.name="레몬";
		c.age=2;
		String str="이름:"+c.name+" 나이:"+c.age;
		return str;
	}
	
	
	public static void main(String[] args) {
		//문제 1
		triangle1();
		triangle2();
		triangle3();
		//문제2
		nametag();
		//문제3
		int a[]= {1,2,3,4};
		arr(a);
		//문제4
		calender();
		//문제5
		System.out.println(intFunc(1));
		intFunc(1);
		System.out.println(doubleFunc(1));
		doubleFunc(1);
		System.out.println(stringFunc("java"));
		stringFunc("자바");
		System.out.println(catFunc());
		catFunc();
		
		
		
		
		
		
		
		
		
		
		
	}

}
