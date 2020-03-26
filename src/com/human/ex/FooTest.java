package com.human.ex;
//오류를 찾아 수정하기2
public class FooTest {
	public static void main(String[] args) {
		show();
	}
//	public void show() {
//		System.out.println("show");
//	}->static 메소드가 아니어서 main메소드 안에서 show함수를 읽어올 수 없다.
	//수정
	public static void show() {
		System.out.println("show");
	}

}
