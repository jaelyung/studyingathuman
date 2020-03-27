package com.human.ex;
import java.util.*;
public class BankClass {
	public static Scanner sc=new Scanner(System.in);
	public String inputString="";
	public int account=0;
	public int deposit=0;
	public int withdraw=0;
	//아이디와 패스워드
	public String id="";	//아이디와 비밀번호를 프라이빗으로 나중에 변경
	public String password="";
	
	public BankClass() {}
	public BankClass(String id, String password) {
		this.id=id;
		this.password=password;
	}

	public void save(int deposit) {
		this.account = this.account+deposit;
		System.out.printf("%d원을 입금하셨습니다.\n", deposit);
	}
	public void withdraw(int withdraw) {
		if(this.account-withdraw<0) {
			System.out.println("잔액이 부족합니다.");
		}else {
			this.account = this.account-withdraw;
		}		
	}
	public void display() {//거래내역 조회라면?
		System.out.printf("현재 계좌에 있는 총 금액: %d원\n", this.account);
	}
	
	public static void main(String[] args) {
	
	}

}
