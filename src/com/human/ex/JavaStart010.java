package com.human.ex;

import java.util.*;
//class Cat{
//	 String name;
//	 int age;
//}
public class JavaStart010 {
public static Cat[] catArrFunc(Cat[] arr) {
//	Cat[] rArr=arr; 분리된 두 배열을 만들려면 이렇게 쓰면 안됨.
	Cat[] rArr=new Cat[2];
//	rArr=arr; 마찬가지로 분리 안됨. 일일이 복사해줘야함.
//	rArr[0]=arr[0];
//	rArr[1]=arr[1]; 역시나 안됨.
	rArr[0]=new Cat();
	rArr[0].name=arr[0].name;
	rArr[0].age=arr[0].age;
	rArr[1]=new Cat();
	rArr[1].name=arr[1].name;
	rArr[1].age=arr[1].age;
	rArr[1].name="멍멍";
	rArr[1].age=6;
	return rArr;
}
	
	public static void main(String[] args) {
		//Cat 배열
		Cat []cArr1=new Cat[2];
		Cat []cArr2;
		
		cArr1[0]=new Cat();
		cArr1[0].name="고1";
		cArr1[0].age=15;
		
		cArr1[1]=new Cat();
		cArr1[1].name="고2";
		cArr1[1].age=16;
		
		cArr2=catArrFunc(cArr1);
		
//		cArr2=cArr1;
//		cArr2[1].age=6;
		System.out.println(cArr1[1].age);
		System.out.println(cArr1[1].name);
		System.out.println(cArr2[1].age);
		System.out.println(cArr2[1].name);
		
	}



}
