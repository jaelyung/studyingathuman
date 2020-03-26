package com.human.ex;
//오류를 찾아 수정하기1
public class Student {
	String name;
	
	Student(String name){
		this.name=name;
	}
	
	 Student(){
		this("no name");
		System.out.println("no argument");
		//this("no name"); ->생성자를 첫줄에 선언해야 함
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
