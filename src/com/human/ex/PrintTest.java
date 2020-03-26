package com.human.ex;
class Sklass{
	static int i;
	Sklass(){
		i++;
	}
}

class Oklass{
	int i;
	Oklass(){
		i++;
	}
}

public class PrintTest {

	public static void main(String[] args) {
		new Sklass(); new Sklass(); Sklass s=new Sklass();
		new Oklass(); new Oklass(); Oklass o=new Oklass();
		System.out.printf("s.i = %d, o.i = %d", s.i, o.i);
		//출력결과 : s.i = 3, o.i = 1
		//Sklass는 static으로 설정된 i값이라 Sklass가 호출될때마다 i++을 실행한다.
		//Oklass는 각각의 객체속에서 i++가 실행된다.
	}

}
