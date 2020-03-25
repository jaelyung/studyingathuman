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
		System.out.println("이 사람의 나이:"+age);
		System.out.println("이 사람의 이름:"+name);
		System.out.println("이 사람의 결혼 여부:"+isMarried);
		System.out.println("이 사람의 자녀 수:"+howManyChildren);		
	}
}

public class ClassStart05 {

	public static void main(String[] args) {
		// 40살 James married 3children
		Person man1=new Person(40, "James", true, 3);
		man1.display();
	}

}
