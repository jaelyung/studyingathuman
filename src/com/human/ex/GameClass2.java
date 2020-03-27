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
		System.out.println("�� ���� ȸ���� ����Ͻðڽ��ϱ�?");
		numOfMember=Integer.parseInt(sc.nextLine());
		for(int i=0;i<Member.numOfMember;i++) {
			System.out.println("ȸ����>>");
			String name=sc.nextLine();
			System.out.println("����>>");
			int age=Integer.parseInt(sc.nextLine());
			System.out.println("���̵�>>");
			String id=sc.nextLine();
			System.out.println("��й�ȣ>>");
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
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�. �ٽ� �õ����ּ���.");
					searchMember();
				}
			}else {
				System.out.println("��ϵ��� ���� ���̵��Դϴ�. �ٽ� �õ����ּ���.");
				searchMember();
			}
		}
		return returnValue;
	}
	public GameClass searchMember() {
		System.out.println("�˻��� id�� �Է�>>");
		String id=sc.nextLine();
		System.out.println("��й�ȣ�� �Է�>>");
		String password=sc.nextLine();
		GameClass returnValue=null;
		searchMember(id, password).gameDisplay();
//		for(int i=0;i<arrIndex;i++) {
//			if(arrGameClass[i].id.equals(id)) {
//				if(arrGameClass[i].password.equals(password)) {
//					returnValue=arrGameClass[i];
//				}else {
//					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�. �ٽ� �õ����ּ���.");
//					searchMember();
//				}
//			}else {
//				System.out.println("��ϵ��� ���� ���̵��Դϴ�. �ٽ� �õ����ּ���.");
//				searchMember();
//			}
//		}
		return returnValue;
	}
	public void menu() {
		int input=0;
		while(input!=-1) {
			System.out.println("1.ȸ����� 2.���ӽ��� 3.ȸ������ �˻� (���� -1)");
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
		System.out.println("���α׷��� �����մϴ�.");
	}
}

public class GameClass2 {

	public static void main(String[] args) {
	Member g1=new Member();
	g1.menu();
	//���ӽ���� ��ϵ� ȸ�� ����ŭ ī�带 �����־�� ��.->GameClass �����ʿ�.
	//����� ȸ�� �迭�� �о���� �� ����
	
	

	}
}