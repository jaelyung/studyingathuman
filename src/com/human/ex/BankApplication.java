package com.human.ex;
import java.util.*;
public class BankApplication {
	private static Account[] accountArray=new Account[100];//100���� ���� ����
	private static Scanner sc=new Scanner(System.in);

	private static void createAccount() {
		System.out.println("-------");
		System.out.println("���»���");
		System.out.println("-------");
		System.out.println("���¹�ȣ: ");
		String accountNumber=sc.nextLine();
		
		System.out.println("������: ");
		String name=sc.nextLine();
		
		System.out.println("�ʱ� �Աݾ�: ");
		int money=Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<accountArray.length;i++) {
			if(accountArray[i]==null) {
				accountArray[i]=new Account(accountNumber, name, money);
				System.out.println("���: ���°� �����Ǿ����ϴ�.");
				break;
			}
		}
	}
	private static void accountList() {
		System.out.println("-------");
		System.out.println("���¸��");
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
		System.out.println("����");
		System.out.println("-------");
		System.out.println("���¹�ȣ: ");
		String accountNumber=sc.nextLine();
		System.out.println("���ݾ�: ");
		int deposit=Integer.parseInt(sc.nextLine());
		
		if(findAccount(accountNumber)==null) {
			System.out.println("�Է��� ���¹�ȣ�� ã�� ���߽��ϴ�.");
		}else {
			findAccount(accountNumber).setBalance(findAccount(accountNumber).getBalance()+deposit);
			System.out.println("���: �Ա��� �Ϸ�Ǿ����ϴ�.");
		}
	}
	private static void withdraw() {
		System.out.println("-------");
		System.out.println("���");
		System.out.println("-------");
		System.out.println("���¹�ȣ: ");
		String accountNumber=sc.nextLine();
		System.out.println("��ݾ�: ");
		int withdraw=Integer.parseInt(sc.nextLine());
		
		if(findAccount(accountNumber)==null) {
			System.out.println("�Է��� ���¹�ȣ�� ã�� ���߽��ϴ�.");
		}else {
			if(withdraw>findAccount(accountNumber).getBalance()) {
				System.out.println("�ܾ��� �����մϴ�.");
			}
			findAccount(accountNumber).setBalance(findAccount(accountNumber).getBalance()-withdraw);
			System.out.println("���: ����� �Ϸ�Ǿ����ϴ�.");
			
		}
	}
	private static Account findAccount(String accountNumber) {//Account �迭���� accountNumber�� ������ ��üã��
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
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("+--------------------------------------+");
			System.out.println("����>>");
			
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
		System.out.println("���α׷� ����");
	}

}
