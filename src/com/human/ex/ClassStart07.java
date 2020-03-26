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
		System.out.println("�̸�:"+name);
		System.out.println("���̵�:"+id);
		System.out.println("��й�ȣ:"+password);
		System.out.println("����:"+age);
	}
}
public class ClassStart07 {
	public static void main(String[] args) {
		Member m1=new Member("ȫ�浿", "honghong", "hong1234", 24);
		Member m2=new Member("�迵��", "younghee", "heehee34", 55);
		Member m3=new Member("��ö��", "ironsue", "irony", 44);
		
		m1.display();
		m2.display();
		m3.display();
		
		System.out.println(m2.getName());
		m3.setAge(33);
		System.out.println(m3.getAge());
		
		
		
		
		
		
		
		
	}



}