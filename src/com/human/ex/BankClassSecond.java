package com.human.ex;
import java.util.*;
public class BankClassSecond {
	 public static Scanner sc=new Scanner(System.in);
	 public static int totalCount=0;
	 public String inputString="";
	 public int deposit=0;
	 public int withdraw=0;
 
	 private String id=""; //아이디 비밀번호 계좌잔액 프라이빗
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
		System.out.println("입금할 금액을 입력>>");
		int deposit=Integer.parseInt(sc.nextLine());
		balance = balance+deposit;
		System.out.printf("%d원을 입금하셨습니다.\n", deposit);
	 }
	 public void withdraw() {
		 System.out.println("출금할 금액을 입력>>");
			int withdraw=Integer.parseInt(sc.nextLine());
		 if(balance-withdraw<0) {
			 System.out.println("잔액이 부족합니다.");
		 }else {
			 balance = balance-withdraw;
			 System.out.printf("%d원을 출금하셨습니다.\n", withdraw);
	  }  
	 }
	 public void getBalance() {
		 System.out.println("현재 계좌 잔액:"+ this.balance);
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
		 System.out.println("전체 회원수:"+BankClassSecond.totalCount);
		 System.out.println("회원 아이디:"+this.id);
		 System.out.println("회원 비밀번호:"+this.password);
		 System.out.println("회원 계좌잔액:"+this.balance);
	 }
 
	 public static void main(String[] args) {
		 BankClassSecond b1=new BankClassSecond("ho1", "ho1", 1000);
		 b1.save();
		 b1.getBalance();
	}

}