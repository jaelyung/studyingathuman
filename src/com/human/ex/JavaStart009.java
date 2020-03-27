package com.human.ex;

import java.util.*;
//class Cat{
//	 String name;
//	 int age;
//}
public class JavaStart009 {
	public static Cat catFunc(Cat c) {
		Cat rValue=new Cat();//new Cat을 설정하지 않고 Cat rValue=c; 로 설정하면 cat1,cat2 출력값이 11로 같아진다.
		rValue.age=c.age;
		rValue.age=rValue.age+1;
		
		return rValue;
	}
	
	public static void main(String[] args) {
		//Cat객체
		Cat cat1=new Cat();
		cat1.name="go1";
		cat1.age=10;
		Cat cat2;
		cat2=catFunc(cat1);
		System.out.println(cat1.age);
		System.out.println(cat2.age);
	}

}
