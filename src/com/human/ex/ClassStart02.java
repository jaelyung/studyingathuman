package com.human.ex;


public class ClassStart02 {

	public static void main(String[] args) {
		// 환율 1200 exchangeRate
		//환전세 0.05 exchangeTax
		//소지금 20달러 dollar
		//원화  20000 won		
		//환전하는 프로그램을 구현하여 보자
		//exchangeWonToDollar
		//exchangeDollarToWon
		//환전시 환전세가 부과됨.
		
		
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
		
		//만약 3명이 환전을 한다면? 1,2,3 번호를 매김
		

	}

}
