package com.human.ex;
class ExchangeClass{//다른클래스에서 접근하고 싶으면 ExchangeClass.exchangeRate1
	public static double exchangeRate1=1200;//여러객체들이 함께 공유해야 될 데이터가 생길때 static을 사용. 
	public double exchangeTax1=0;
	public double dollar1=0;
	public double won1=0;
	public double rDollar1=0;
	public double rWon1=0;
	public ExchangeClass() {}
	public ExchangeClass(double exchangeRate1, double exchangeTax1, double dollar1, double won1) {//마우스 오른쪽-source-constructor using field
		this.exchangeRate1 = exchangeRate1;
		this.exchangeTax1 = exchangeTax1;
		this.dollar1 = dollar1;
		this.won1 = won1;	
	}
	public static void changeExchangeRate() {
		ExchangeClass.exchangeRate1=exchangeRate1*1.1;//호출할 때마다 exchangeRate를 1.1배씩 상승시키는 함수
	}
	public void changeExchangeRate2() {
		ExchangeClass.exchangeRate1=exchangeRate1*1.1;//호출할 때마다 exchangeRate를 1.1배씩 상승시키는 함수
	}
	//클래스안에 함수를 넣어놓으면 유지보수하기 편리하다.
	public double exchangeWonToDollar() {
		this.rDollar1=this.won1/this.exchangeRate1*(1-this.exchangeTax1);
		return this.rDollar1;
	}
	public double exchangeDollarToWon() {
		this.rWon1=this.dollar1*this.exchangeRate1*(1-this.exchangeTax1);
		return this.rWon1;
	}
	public void display() {
		System.out.println("exRate:"+exchangeRate1);
		System.out.println("exTax:"+exchangeTax1);
		System.out.println("dollar:"+dollar1);
		System.out.println("rDollar:"+rDollar1);
		System.out.println("won:"+won1);
		System.out.println("rWon:"+rWon1);
	}
	
}

public class ClassStart04 {
	//1.관련있는 코드를 묶고
	//2.관련있는 메소드들을 묶고
	//3.생성자 만들고
	//4.공유되는 data를 static
	//5.static 메소드를 이용해서 static 필드값을 사용하고
	
	
	
	
	
//	public static double exchangeWonToDollar(ExchangeClass ec) {
//		ec.rDollar1=ec.won1/ec.exchangeRate1*(1-ec.exchangeTax1);
//		return ec.rDollar1;
//	}
//	public static double exchangeDollarToWon(ExchangeClass ec) {
//		ec.rWon1=ec.dollar1*ec.exchangeRate1*(1-ec.exchangeTax1);
//		return ec.rWon1;
//	}
//	public static void display(ExchangeClass ec) {
//		System.out.println("exRate:"+ec.exchangeRate1);
//		System.out.println("exTax:"+ec.exchangeTax1);
//		System.out.println("dollar:"+ec.dollar1);
//		System.out.println("rDollar:"+ec.rDollar1);
//		System.out.println("won:"+ec.won1);
//		System.out.println("rWon:"+ec.rWon1);
//	}
	public static void main(String[] args) {
		//ExchangeClass.exchangeRate1=100;
		
		System.out.println(ExchangeClass.exchangeRate1);
		ExchangeClass.changeExchangeRate();//static 메소드가 없다면 불필요한 객체를 만들어서 수정해야한다. static메소드가 선언되어있어 메인함수에서 직접적용가능
		System.out.println(ExchangeClass.exchangeRate1);
		
		(new ExchangeClass()).changeExchangeRate2();//객체가 없는 상태에서 인스턴스 메소드를 호출하는 방법
		System.out.println(ExchangeClass.exchangeRate1);
		
//		ExchangeClass user1=new ExchangeClass(1200,0.05,20,20000);
//		ExchangeClass user2=new ExchangeClass(1200,0.05,20,20000);
//		ExchangeClass user3=new ExchangeClass(1200,0.05,20,20000);
//		//exchangeWonToDollar
//		user1.exchangeWonToDollar();
//		user2.exchangeWonToDollar();
//		user3.exchangeWonToDollar();
//		//exchangeDollarToWon
//		user1.exchangeDollarToWon();
//		user2.exchangeDollarToWon();
//		user3.exchangeDollarToWon();
//		//display
//		user1.display();
//		user2.display();
//		user3.display();


	}

}
