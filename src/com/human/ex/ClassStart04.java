package com.human.ex;
class ExchangeClass{//�ٸ�Ŭ�������� �����ϰ� ������ ExchangeClass.exchangeRate1
	public static double exchangeRate1=1200;//������ü���� �Բ� �����ؾ� �� �����Ͱ� ���涧 static�� ���. 
	public double exchangeTax1=0;
	public double dollar1=0;
	public double won1=0;
	public double rDollar1=0;
	public double rWon1=0;
	public ExchangeClass() {}
	public ExchangeClass(double exchangeRate1, double exchangeTax1, double dollar1, double won1) {//���콺 ������-source-constructor using field
		this.exchangeRate1 = exchangeRate1;
		this.exchangeTax1 = exchangeTax1;
		this.dollar1 = dollar1;
		this.won1 = won1;	
	}
	public static void changeExchangeRate() {
		ExchangeClass.exchangeRate1=exchangeRate1*1.1;//ȣ���� ������ exchangeRate�� 1.1�辿 ��½�Ű�� �Լ�
	}
	public void changeExchangeRate2() {
		ExchangeClass.exchangeRate1=exchangeRate1*1.1;//ȣ���� ������ exchangeRate�� 1.1�辿 ��½�Ű�� �Լ�
	}
	//Ŭ�����ȿ� �Լ��� �־������ ���������ϱ� ���ϴ�.
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
	//1.�����ִ� �ڵ带 ����
	//2.�����ִ� �޼ҵ���� ����
	//3.������ �����
	//4.�����Ǵ� data�� static
	//5.static �޼ҵ带 �̿��ؼ� static �ʵ尪�� ����ϰ�
	
	
	
	
	
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
		ExchangeClass.changeExchangeRate();//static �޼ҵ尡 ���ٸ� ���ʿ��� ��ü�� ���� �����ؾ��Ѵ�. static�޼ҵ尡 ����Ǿ��־� �����Լ����� �������밡��
		System.out.println(ExchangeClass.exchangeRate1);
		
		(new ExchangeClass()).changeExchangeRate2();//��ü�� ���� ���¿��� �ν��Ͻ� �޼ҵ带 ȣ���ϴ� ���
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
