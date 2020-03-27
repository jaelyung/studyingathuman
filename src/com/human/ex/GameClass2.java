package com.human.ex;
import java.util.*;
class Member{
	public static Scanner sc=new Scanner(System.in);
	public String name="";
	public int age=0;
	public String id="";
	public String password="";
	public static int numOfMember=0;
	public int arrIndex=0;
	public GameClass [] arrGameClass=new GameClass[100];
	
	public Member() {
	}
	public Member(String name, int age, String id, String password) {
		this.name=name;
		this.age=age;
		this.id=id;
		this.password=password;
	}
	public void registMember(GameClass member) {
		arrGameClass[arrIndex]=member;
	}
	public void registMember() {
		System.out.println("몇 명의 회원을 등록하시겠습니까?");
		numOfMember=Integer.parseInt(sc.nextLine());
		for(int i=0;i<Member.numOfMember;i++) {
			System.out.println("회원명>>");
			String name=sc.nextLine();
			System.out.println("나이>>");
			int age=Integer.parseInt(sc.nextLine());
			System.out.println("아이디>>");
			String id=sc.nextLine();
			System.out.println("비밀번호>>");
			String password=sc.nextLine();
			arrGameClass[arrIndex++]=new GameClass(name, age, id, password);
		}	
	}
	public void gamePlay() {
		GameClass.playGame();
	}
	public GameClass searchMember(String id, String password) {
		GameClass returnValue=null;
		for(int i=0;i<arrIndex;i++) {
			if(arrGameClass[i].id.equals(id)) {
				if(arrGameClass[i].password.equals(password)) {
					returnValue=arrGameClass[i];
				}else {
					System.out.println("비밀번호가 틀렸습니다. 다시 시도해주세요.");
					searchMember();
				}
			}else {
				System.out.println("등록되지 않은 아이디입니다. 다시 시도해주세요.");
				searchMember();
			}
		}
		return returnValue;
	}
	public GameClass searchMember() {
		System.out.println("검색할 id를 입력>>");
		String id=sc.nextLine();
		System.out.println("비밀번호를 입력>>");
		String password=sc.nextLine();
		GameClass returnValue=null;
		searchMember(id, password).gameDisplay();
//		for(int i=0;i<arrIndex;i++) {
//			if(arrGameClass[i].id.equals(id)) {
//				if(arrGameClass[i].password.equals(password)) {
//					returnValue=arrGameClass[i];
//				}else {
//					System.out.println("비밀번호가 틀렸습니다. 다시 시도해주세요.");
//					searchMember();
//				}
//			}else {
//				System.out.println("등록되지 않은 아이디입니다. 다시 시도해주세요.");
//				searchMember();
//			}
//		}
		return returnValue;
	}
	public void menu() {
		int input=0;
		while(input!=-1) {
			System.out.println("1.회원등록 2.게임실행 3.회원점수 검색 (종료 -1)");
			input=Integer.parseInt(sc.nextLine());
			switch(input) {
			case 1:
				registMember();
				break;
			case 2:
				gamePlay();
				break;
			case 3:
				searchMember();
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
}

public class GameClass2 {

	public static void main(String[] args) {
	Member g1=new Member();
	g1.menu();
	//게임실행시 등록된 회원 수만큼 카드를 나눠주어야 함.->GameClass 수정필요.
	//등록한 회원 배열을 읽어오는 것 오류
	
	

	}
}