package com.human.ex;
class Complex{
	public double realNumber=0.0;
	public static double fakeNumber=0.0;
	
	public String print() {
		return ""+realNumber+" + "+fakeNumber+"i";
	}
	public Complex() {}
	public Complex(double realNumber) {
		this(realNumber, 0.0);
	}
	public Complex(double realNumber, double fakeNumber) {
		this.realNumber=realNumber;
		Complex.fakeNumber=fakeNumber;
	}
}
public class complexTest {

	public static void main(String[] args) {
		Complex c1=new Complex(2.0);
		System.out.println(c1.print());
		Complex c2=new Complex(1.5, 2.5);
		System.out.println(c2.print());

	}

}
