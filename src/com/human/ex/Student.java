package com.human.ex;
//������ ã�� �����ϱ�1
public class Student {
	String name;
	
	Student(String name){
		this.name=name;
	}
	
	 Student(){
		this("no name");
		System.out.println("no argument");
		//this("no name"); ->�����ڸ� ù�ٿ� �����ؾ� ��
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
