package com.human.ex;
class Person{
	public int age=0;
	public String name="";
	public boolean isMarried=true;
	public int howManyChildren=0;
	
	public Person() {}
	public Person(int age, String name, boolean isMarried, int howManyChildren) {
		this.age=age;
		this.name=name;
		this.isMarried=isMarried;
		this.howManyChildren=howManyChildren;
	}
	public void display() {
		System.out.println("�� ����� ����:"+age);
		System.out.println("�� ����� �̸�:"+name);
		System.out.println("�� ����� ��ȥ ����:"+isMarried);
		System.out.println("�� ����� �ڳ� ��:"+howManyChildren);		
	}
}

public class ClassStart05 {

	public static void main(String[] args) {
		// 40�� James married 3children
		Person man1=new Person(40, "James", true, 3);
		man1.display();
	}

}
