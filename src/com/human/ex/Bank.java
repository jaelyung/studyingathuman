package com.human.ex;
import java.util.*;
public class Bank {
	public static Scanner sc=new Scanner(System.in);
	public int arrIndex=0;
	public int numOfMember=0;
	public BankClass [] arrBankClass=new BankClass[100];//100명의 회원을 저장할 수 있는 공간
	
	public Bank() {}
	//1.회원등록
	public void registMember(BankClass b) {
		arrBankClass[arrIndex++]=b;//BankClass의 객체배열에 추가
	}
	public void registMember() {
		System.out.println("***회원등록 페이지***");
		System.out.println("몇 명의 회원을 등록하시겠습니까?");
		numOfMember=Integer.parseInt(sc.nextLine());
		System.out.println(numOfMember+"명의 회원을 등록합니다.");
		for(int i=0;i<numOfMember;i++) {
			System.out.println("사용할 아이디 입력>>");//아이디 중복검사 나중에 변경
			String id=sc.nextLine();
			System.out.println("비밀번호 등록>>");
			String password=sc.nextLine();
			arrBankClass[arrIndex++]=new BankClass(id, password);
			System.out.println((i+1)+"번째 회원등록 완료");
		}
	}	
	//2.은행이용
	//2-1.로그인
	//2-2.메뉴선택
	public void menuOfBank() {
		System.out.println("아이디 입력>>");
		String id=sc.nextLine();
		System.out.println("비밀번호 입력>>");
		String password=sc.nextLine();
		BankClass b=searchMember(id, password);
		
		int input=0;
		while(input!=4) {//0이 아닐때 동작
			System.out.println("1:입금, 2:출금, 3:조회, 4:종료");
			input=Integer.parseInt(sc.nextLine());
			switch(input) {
			case 1:
				System.out.println("입금할 금액을 입력>>");
				int deposit = Integer.parseInt(sc.nextLine());
				b.save(deposit);
				b.display();
				break;
			case 2:
				System.out.println("출금할 금액을 입력>>");
				int withdraw=Integer.parseInt(sc.nextLine());
				b.withdraw(withdraw);
				b.display();
				break;
			case 3:
				b.display();
				break;
			case 4:
				break;
			default:
				
			}
		}		
	}
	//2-3.입금
//	public void save() {
//		
//		BankClass b=searchMember(id, password);
//		if(b==null) {
//			menuOfBank();
//		}else {
//			b.account = b.account+deposit;
//			System.out.printf("%d원을 입금하셨습니다.\n", deposit);
//		}
//		b.display();
//	}
	//2-4.출금
//	public void withdraw() {
//		System.out.println("출금할 금액을 입력>>");
////		int withdraw=Integer.parseInt(sc.nextLine());
//		BankClass b=searchMember(id, password);
//		if(b==null) {
//			menuOfBank();
//		}else {
//			b.account = b.account-withdraw;
//			System.out.printf("%d원을 출금하셨습니다.\n", withdraw);
//		}
//		b.display();
//	}
	//2-5.조회
//	public void account() {
//		searchMember(id, password).display();
//	}
	//3.회원검색
	public BankClass searchMember(String id,String password) {
		BankClass returnValue=null;
		for(int i=0;i<arrIndex;i++) {
			if(arrBankClass[i].id.equals(id)){
				if(arrBankClass[i].password.equals(password)) {
					returnValue=arrBankClass[i];
				}else {
					System.out.println("비밀번호가 다릅니다.");
					searchMember();
				}	
			}else {
				System.out.println("등록되지 않은 아이디 입니다.");
				startMenu();
			}
		}
		return returnValue;
	}
	public BankClass searchMember() {
		System.out.println("아이디 입력>>");
		String id=sc.nextLine();
		System.out.println("비밀번호 입력>>");
		String password=sc.nextLine();
		BankClass returnValue=null;
		searchMember(id, password);
		return returnValue;
	}
	//4.메뉴
	public void startMenu() {
		int input=0;
		while(input!=-1) {
			System.out.println("1:회원등록, 2:은행이용, 3:회원조회, (-1:종료)");
			input=Integer.parseInt(sc.nextLine());
			switch(input) {
			case 1:
				registMember();
				break;
			case 2:
				menuOfBank();
				break;
			case 3:
				searchMember();
				break;
			case 4:
				break;
			default:
				
			}
		}
		
			
	}	
	
	public static void main(String[] args) {
		Bank b1=new Bank();
		b1.startMenu();
		//에러1-> 회원2명이상 등록시 작동안함
		//에러2-> 회원1명이상 등록시 은행 입금 출금 조회 다 됨. 대신 startMenu에서 회원조회가 안됨.

	}

}
