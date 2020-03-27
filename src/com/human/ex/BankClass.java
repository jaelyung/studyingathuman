package com.human.ex;
import java.util.*;
public class BankClass {
	public static Scanner sc=new Scanner(System.in);
	public static String inputString="";
	public static int account=0;
	public static int deposit=0;
	public static int withdraw=0;

	public static void chooseMenu() {
		System.out.println("1:입금, 2:출금, 3:조회, 4:종료");
		inputString=sc.nextLine();
	}
	public static void save() {
		System.out.println("입금을 선택하셨습니다. \t입금할 금액을 입력하세요.");
		deposit = Integer.parseInt(sc.nextLine());
		account = account+deposit;
		System.out.printf("%d원을 입금하셨습니다.\n", deposit);
		System.out.println("현재 잔액은 "+account+"원 입니다.");
	}
	public static void withdraw() {
		System.out.println("출금을 선택하셨습니다. \t출금할 금액을 입력하세요.");
		withdraw = Integer.parseInt(sc.nextLine());
		if(account-withdraw<0) {
			System.out.println("잔액이 부족합니다.");
		}else {
			System.out.printf("%d원을 출금하셨습니다.\n", withdraw);
			account = account-withdraw;
			System.out.println("현재 잔액은 "+account+"원 입니다.");
		}		
	}
	public static void account() {
		System.out.printf("조회를 선택하셨습니다. \t현재 계좌에 있는 총 금액은 %d원입니다.\n", account);
	}
	public static void wrongNumber() {
		System.out.println("잘못된 입력입니다.");
	}
	public static void close() {
		System.out.println("프로그램을 종료합니다.");
	}
	public static void menu() {
		while(!inputString.equals("4")) {//0이 아닐때 동작
			chooseMenu();
			switch(inputString) {
			case "1":
				save();
				break;
			case "2":
				withdraw();
				break;
			case "3":
				account();
				break;
			case "4":
				break;
			default:
				wrongNumber();
			}
		}
		close();
	}
	
	public static void main(String[] args) {
		menu();
	}

}
