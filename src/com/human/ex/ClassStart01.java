package com.human.ex;
import java.util.*;
class Exchange{
	public static double exchangeRate=1200;
	public static double exchangeTax=0.05;
	public double dollar=0;
	public double won=0;
	public double rDollar=0;
	public double rWon=0;
	public String user="";
	public static Scanner sc=new Scanner(System.in);
	
	public Exchange() {}
	public Exchange(String user, double exchangeRate, double exchangeTax, double dollar, double won) {
		this.exchangeRate=exchangeRate;
		this.exchangeTax=exchangeTax;
		this.dollar=dollar;
		this.won=won;
	}
	public void exchangeRateTax() {
		System.out.println("현재 환율:"+exchangeRate);
		System.out.println("환전세:"+exchangeTax*100+"%");
	}
	public void exchangeWonToDollar() {
		if(won>0) {
			rDollar=won/exchangeRate*(1-exchangeTax);
			exchangeRateTax();
			String str=String.format("***총 환전된 금액:$%.1f***", rDollar);
			System.out.println(str);
			System.out.println("-----------------------------------");
		}
	}
	public void exchangeDollarToWon() {
		if(dollar>0) {
			rWon=1200*dollar*(1-exchangeTax);
			exchangeRateTax();
			String str2=String.format("***총 환전된 금액:%.0f***", rWon);
			System.out.println(str2);
			System.out.println("-----------------------------------");
		}
	}
	public void display(Exchange ec) {
		
	}
}
public class ClassStart01 {

	public static void main(String[] args) {
		// 환율 1200 exchangeRate
		//환전세 0.05 exchangeTax
		//소지금 20달러 dollar
		//원화  20000 won		
		//환전하는 프로그램을 구현하여 보자
		//exchangeWonToDollar
		//exchangeDollarToWon
		//환전시 환전세가 부과됨.
		Exchange ex1=new Exchange("1",1200,0.05,20,20000);
		Exchange ex2=new Exchange("2",1200,0.05,0,15000);
		Exchange ex3=new Exchange("3",1200,0.05,10,0);
		
		ex1.exchangeWonToDollar();
	}

}
