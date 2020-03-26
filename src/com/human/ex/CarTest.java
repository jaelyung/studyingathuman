package com.human.ex;
class Car{
	public String color="";
	private static int numOfCar=0;
	private static int numOfRedCar=0;
	
	public Car() {}
	public Car(String color) {
		this.color=color;
		numOfCar++;
		if(color.equals("RED")) {
			numOfRedCar++;
		}
	}
	public static int getNumOfCar() {
		return numOfCar;
	}
	public static int getNumOfRedCar() {
		return numOfRedCar;
	}
	
}
public class CarTest {

	public static void main(String[] args) {
		Car c1=new Car("red");
		Car c2=new Car("blue");
		Car c3=new Car("RED");
		
		System.out.printf("�ڵ��� �� : %d, ������ �ڵ��� �� : %d", Car.getNumOfCar(), Car.getNumOfRedCar());

	}

}
