package com.human.ex;
class Util{
	public double findPi() {
		return 3.14;
	}
}
public class MathTest {

	public static void main(String[] args) {
		//Util u; ->new Util();을 하지 않아서 저장할 공간이 생성 안됨. null 값만을 가짐.
		Util u=new Util();
		System.out.println(u.findPi());

	}

}
