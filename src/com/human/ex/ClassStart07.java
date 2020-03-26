package com.human.ex;
class Member{
	private String name="";
	private String id="";
	private String password="";
	private int age=0;
	
	public Member() {}
	public Member(String name, String id, String password, int age) {
		this.name=name;
		this.id=id;
		this.password=password;
		this.age=age;
	}
	public String getName() {
		return this.name;
	}
	public String getId() {
		return this.id;
	}
	public String getPassword() {
		return this.password;
	}
	public int getAge() {
		return this.age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setId(String id) {
		this.id=id;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void display() {
		System.out.println("ÀÌ¸§:"+name);
		System.out.println("¾ÆÀÌµð:"+id);
		System.out.println("ºñ¹Ð¹øÈ£:"+password);
		System.out.println("³ªÀÌ:"+age);
	}
}
public class ClassStart07 {
	public static void main(String[] args) {
		Member m1=new Member("È«±æµ¿", "honghong", "hong1234", 24);
		Member m2=new Member("±è¿µÈñ", "younghee", "heehee34", 55);
		Member m3=new Member("¹ÚÃ¶¼ö", "ironsue", "irony", 44);
		
		m1.display();
		m2.display();
		m3.display();
		
		System.out.println(m2.getName());
		m3.setAge(33);
		System.out.println(m3.getAge());
		
		
		
		
		
		
		
		
	}



}