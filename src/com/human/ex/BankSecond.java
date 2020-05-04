package com.human.ex;
import java.util.*;
public class BankSecond {
	public static Scanner sc=new Scanner(System.in);
	public int arrIndex=0;
	public int numOfMember=0;
	public static BankClassSecond [] arrBankClass=new BankClassSecond[100];//100명의 회원을 저장할 수 있는 공간
 
	public BankSecond() {}
	//1.회원등록
 	public void registMember(BankClassSecond b) {
 		arrBankClass[arrIndex++]=b;//BankClass의 객체배열에 추가
 	}
 	public void registMember() {
 		System.out.println("사용할 아이디 입력>>");//아이디 중복검사 나중에 변경
 		String id=sc.nextLine();
 		System.out.println("비밀번호 등록>>");
 		String password=sc.nextLine();
 		System.out.println("초기 입금할 금액>>");
 		int money=Integer.parseInt(sc.nextLine());
 		for(int i=0;i<arrBankClass.length;i++) {
 			if(arrBankClass[i]==null) {
 				arrBankClass[arrIndex++]=new BankClassSecond(id, password, money);
 				System.out.println("계좌가 생성되었습니다.");
 				break;
 			}
 			
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
	 		searchMember(id, password);
 		int input=0;
 		while(input!=4) {//0이 아닐때 동작
 			System.out.println("1:입금, 2:출금, 3:조회, 4:종료");
 			input=Integer.parseInt(sc.nextLine());
 			switch(input) {
 			case 1:
 		 		searchMember(id, password).save();
 		 		
 				break;
 			case 2: 				
 				searchMember(id, password).withdraw();
 				break;
 			case 3:
 				searchMember(id, password).getBalance();
 				break;
 			case 4:
 				break;    
 			}
 		}  
 	}

 //3.회원검색
 	public BankClassSecond searchMember(String id,String password) {
 		for(int i=0;i<arrBankClass.length;i++) {
 			if(arrBankClass[i]==null) {
 				break;
 			}
 			if(arrBankClass[i].getId().equals(id)){
 				if(arrBankClass[i].getPassword().equals(password)) {
 					return arrBankClass[i];
 				}
 			}
 		}
 		return null;
 	}
 	public BankClassSecond searchMember() {
 		System.out.println("아이디 입력>>");
 		String id=sc.nextLine();
 		System.out.println("비밀번호 입력>>");
 		String password=sc.nextLine();
 		BankClassSecond returnValue=null;
 		searchMember(id, password);
 		return returnValue;
 	}
 	public void displayMemberAll() {
 		for(int i=0;i<BankClassSecond.totalCount;i++) {
 			if(arrBankClass[i] == null) {
 				break;
 			}
 			arrBankClass[i].displayMember();
 		}
 	}
 //4.메뉴
 	public void startMenu() {
 		int input=0;
 		while(input!=-1) {
 			System.out.println("1:회원등록, 2:은행이용, 3:회원조회, 4:모든 회원 조회 (-1:종료)");
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
 				displayMemberAll();
 				break;
   
    
 			}
 		}
  
   
 	} 
 
 	public static void main(String[] args) {
 		BankSecond b1=new BankSecond();
 		b1.startMenu();
  //에러1-> 회원2명이상 등록 후에 은행이용버튼을 누르면 등록되지 않은 아이디입니다 가 출력됨.
  //         모든회원조회에는 전체 회원수, 아이디, 비밀번호 조회 됨.
  //에러2-> 회원1명이상 등록시 은행 입금 출금 조회 다 됨. 2번째 등록부터 안됨.

 }

}
