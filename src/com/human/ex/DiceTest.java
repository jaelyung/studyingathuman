package com.human.ex;
class Dice{
	public int face=0;
	public Dice() {}
	public int roll() {
		this.face = (int) (Math.random() * 6) +1;
		return this.face;
	}
}
public class DiceTest {

	public static void main(String[] args) {
		Dice d=new Dice();
		System.out.println("주사위의 숫자 : "+ d.roll());
	}

}
