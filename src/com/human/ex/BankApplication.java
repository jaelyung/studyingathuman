package com.human.ex;
import java.util.*;
public class BankApplication {
	private static Account[] accountArray=new Account[100];//100개의 계좌 저장
	private static Scanner sc=new Scanner(System.in);

	private static void createAccount() {
		System.out.println("-------");
		System.out.println("계좌생성");
		System.out.println("-------");
		System.out.println("계좌번호: ");
		String accountNumber=sc.nextLine();
		
		System.out.println("계좌주: ");
		String name=sc.nextLine();
		
		System.out.println("초기 입금액: ");
		int money=Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<accountArray.length;i++) {
			if(accountArray[i]==null) {
				accountArray[i]=new Account(accountNumber, name, money);
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
	}
	private static void accountList() {
		System.out.println("-------");
		System.out.println("계좌목록");
		System.out.println("-------");
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]==null) {
				break;
			}
			System.out.println(accountArray[i].getAccountNumber()+"\t"+accountArray[i].getName()+"\t"+accountArray[i].getBalance());
		}
	}
	private static void deposit() {
		System.out.println("-------");
		System.out.println("예금");
		System.out.println("-------");
		System.out.println("계좌번호: ");
		String accountNumber=sc.nextLine();
		System.out.println("예금액: ");
		int deposit=Integer.parseInt(sc.nextLine());
		
		if(findAccount(accountNumber)==null) {
			System.out.println("입력한 계좌번호를 찾지 못했습니다.");
		}else {
			findAccount(accountNumber).setBalance(findAccount(accountNumber).getBalance()+deposit);
			System.out.println("결과: 입금이 완료되었습니다.");
		}
	}
	private static void withdraw() {
		System.out.println("-------");
		System.out.println("출금");
		System.out.println("-------");
		System.out.println("계좌번호: ");
		String accountNumber=sc.nextLine();
		System.out.println("출금액: ");
		int withdraw=Integer.parseInt(sc.nextLine());
		
		if(findAccount(accountNumber)==null) {
			System.out.println("입력한 계좌번호를 찾지 못했습니다.");
		}else {
			if(withdraw>findAccount(accountNumber).getBalance()) {
				System.out.println("잔액이 부족합니다.");
			}
			findAccount(accountNumber).setBalance(findAccount(accountNumber).getBalance()-withdraw);
			System.out.println("결과: 출금이 완료되었습니다.");
			
		}
	}
	private static Account findAccount(String accountNumber) {//Account 배열에서 accountNumber가 동일한 객체찾기
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]==null) {
				break;
			}
			if(accountArray[i].getAccountNumber().equals(accountNumber)) {
				return accountArray[i];
			}
		}
		return null;
	}
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("+--------------------------------------+");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("+--------------------------------------+");
			System.out.println("선택>>");
			
			int selectNo=Integer.parseInt(sc.nextLine());
			switch(selectNo) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				run=false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
