package com.human.ex;
//class ExchangeClass{
//	public double exchangeRate1=1200;
//	public double exchangeTax1=0;
//	public double dollar1=0;
//	public double won1=0;
//	public double rDollar1=0;
//	public double rWon1=0;
//	public ExchangeClass() {}
//	public ExchangeClass(double exchangeRate1, double exchangeTax1, double dollar1, double won1) {//���콺 ������-source-constructor using field
//		this.exchangeRate1 = exchangeRate1;
//		this.exchangeTax1 = exchangeTax1;
//		this.dollar1 = dollar1;
//		this.won1 = won1;	
//	}
//	//Ŭ�����ȿ� �Լ��� �־������ ���������ϱ� ���ϴ�.
//	public double exchangeWonToDollar() {
//		this.rDollar1=this.won1/this.exchangeRate1*(1-this.exchangeTax1);
//		return this.rDollar1;
//	}
//	public double exchangeDollarToWon() {
//		this.rWon1=this.dollar1*this.exchangeRate1*(1-this.exchangeTax1);
//		return this.rWon1;
//	}
//	public void display() {
//		System.out.println("exRate:"+exchangeRate1);
//		System.out.println("exTax:"+exchangeTax1);
//		System.out.println("dollar:"+dollar1);
//		System.out.println("rDollar:"+rDollar1);
//		System.out.println("won:"+won1);
//		System.out.println("rWon:"+rWon1);
//	}
//	
//}

public class ClassStart03 {
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
		//�������� ����
		//3000�� �̻� ȯ���ѻ���� ã���ּ���?
		//ȫ�浿�� �����ʹ�?
		//30�޷� �̻� ȯ���� �������??
		
		ExchangeClass user1=new ExchangeClass(1200,0.05,20,20000);
		ExchangeClass user2=new ExchangeClass(1200,0.05,20,20000);
		ExchangeClass user3=new ExchangeClass(1200,0.05,20,20000);
		//ExchangeClass.exchangeRate1=1200;
		// ȯ�� 1200 exchangeRate
		//ȯ���� 0.05 exchangeTax
		//������ 20�޷� dollar
		//��ȭ  20000 won		
		//ȯ���ϴ� ���α׷��� �����Ͽ� ����
		//exchangeWonToDollar
		//exchangeDollarToWon
		//ȯ���� ȯ������ �ΰ���.
//		double exchangeRate1=1200,exchangeRate2=1200,exchangeRate3=1200;
//		double exchangeTax1=0.05,exchangeTax2=0.05,exchangeTax3=0.05;
//		double dollar1=20,dollar2=20,dollar3=20;
//		double won1=20000,won2=20000,won3=20000;
//		double rDollar1=0,rDollar2=0,rDollar3=0;
//		double rWon1=0,rWon2=0,rWon3=0;
		
		//exchangeWonToDollar
		//user1.rDollar1=exchangeWonToDollar(user1.won1,user1.exchangeRate1,user1.exchangeTax1);
//		user1.rDollar1=exchangeWonToDollar(user1);
//		exchangeWonToDollar(user1);
//		exchangeWonToDollar(user2);
//		exchangeWonToDollar(user3);
		user1.exchangeWonToDollar();
		user2.exchangeWonToDollar();
		user3.exchangeWonToDollar();
//		rDollar2=exchangeWonToDollar(won2,exchangeRate2,exchangeTax2);
//		rDollar3=exchangeWonToDollar(won3,exchangeRate3,exchangeTax3);
		//exchangeDollarToWon
//		exchangeDollarToWon(user1);
//		exchangeDollarToWon(user2);
//		exchangeDollarToWon(user3);
		user1.exchangeDollarToWon();
		user2.exchangeDollarToWon();
		user3.exchangeDollarToWon();
//		rWon1=exchangeDollarToWon(dollar1,exchangeRate1,exchangeTax1);
//		rWon2=exchangeDollarToWon(dollar2,exchangeRate2,exchangeTax2);
//		rWon3=exchangeDollarToWon(dollar3,exchangeRate3,exchangeTax3);
//		
		//display
//		display(user1);
//		display(user2);
//		display(user3);
		user1.display();
		user2.display();
		user3.display();
//		display("1",exchangeRate1,exchangeTax1,dollar1,rDollar1,won1,rWon1);
//		display("2",exchangeRate2,exchangeTax2,dollar2,rDollar2,won2,rWon2);
//		display("3",exchangeRate3,exchangeTax3,dollar3,rDollar3,won3,rWon3);
		
		//���� 3���� ȯ���� �Ѵٸ�? �Լ��� ����Ͽ�  user1, user2, user3
		

	}

}
