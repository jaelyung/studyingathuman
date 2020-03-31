package com.human.ex;
import java.util.*;
public class BankClassSecond {
	 public static Scanner sc=new Scanner(System.in);
	 public static int totalCount=0;
	 public String inputString="";
	 public int deposit=0;
	 public int withdraw=0;
 
	 private String id=""; //���̵� ��й�ȣ �����ܾ� �����̺�
	 private String password="";
	 private int balance=0;
	
	 public BankClassSecond() {
		 BankClassSecond.totalCount++;
	 }
	 public BankClassSecond(String id) {
		 this(id, "");
	 }
	 public BankClassSecond(String id, String password) {
		 this(id, password,0);
	 }
	 public BankClassSecond(String id, String password, int balance) {
		this();
		this.id=id;
		this.password=password;
		this.balance=balance;
		}
	
	 public void save() {
		System.out.println("�Ա��� �ݾ��� �Է�>>");
		int deposit=Integer.parseInt(sc.nextLine());
		balance = balance+deposit;
		System.out.printf("%d���� �Ա��ϼ̽��ϴ�.\n", deposit);
	 }
	 public void withdraw() {
		 System.out.println("����� �ݾ��� �Է�>>");
			int withdraw=Integer.parseInt(sc.nextLine());
		 if(balance-withdraw<0) {
			 System.out.println("�ܾ��� �����մϴ�.");
		 }else {
			 balance = balance-withdraw;
			 System.out.printf("%d���� ����ϼ̽��ϴ�.\n", withdraw);
	  }  
	 }
	 public void getBalance() {
		 System.out.println("���� ���� �ܾ�:"+ this.balance);
	 }
	 public String getId() {
		 return this.id;
	 }
	 public String getPassword() {
		 return this.password;
	 }
	 public void setIdPassword(String id, String password) {
		 this.id=id;
		 this.password=password;
	 }
	 public void displayMember() {
		 System.out.println("��ü ȸ����:"+BankClassSecond.totalCount);
		 System.out.println("ȸ�� ���̵�:"+this.id);
		 System.out.println("ȸ�� ��й�ȣ:"+this.password);
		 System.out.println("ȸ�� �����ܾ�:"+this.balance);
	 }
 
	 public static void main(String[] args) {
		 BankClassSecond b1=new BankClassSecond("ho1", "ho1", 1000);
		 b1.save();
		 b1.getBalance();
	}

}