package com.human.ex;


public class ClassStart02 {

	public static void main(String[] args) {
		// ȯ�� 1200 exchangeRate
		//ȯ���� 0.05 exchangeTax
		//������ 20�޷� dollar
		//��ȭ  20000 won		
		//ȯ���ϴ� ���α׷��� �����Ͽ� ����
		//exchangeWonToDollar
		//exchangeDollarToWon
		//ȯ���� ȯ������ �ΰ���.
		
		
		double exchangeRate=1200;
		double exchangeTax=0.05;
		double dollar=20;
		double won=20000;
		double rDollar=0;
		double rWon=0;
		
		//exchangeWonToDollar
		rDollar=won/exchangeRate*(1-exchangeTax);
		
		//exchangeDollarToWon
		rWon=dollar*exchangeRate*(1-exchangeTax);
		
		System.out.println("exRate:"+exchangeRate);
		System.out.println("exTax:"+exchangeTax);
		System.out.println("dollar:"+dollar);
		System.out.println("rDollar:"+rDollar);
		System.out.println("won:"+won);
		System.out.println("rWon:"+rWon);
		
		//���� 3���� ȯ���� �Ѵٸ�? 1,2,3 ��ȣ�� �ű�
		

	}

}
