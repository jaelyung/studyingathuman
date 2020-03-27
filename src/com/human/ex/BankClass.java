package com.human.ex;
import java.util.*;
public class BankClass {
	public static Scanner sc=new Scanner(System.in);
	public static String inputString="";
	public static int account=0;
	public static int deposit=0;
	public static int withdraw=0;

	public static void chooseMenu() {
		System.out.println("1:�Ա�, 2:���, 3:��ȸ, 4:����");
		inputString=sc.nextLine();
	}
	public static void save() {
		System.out.println("�Ա��� �����ϼ̽��ϴ�. \t�Ա��� �ݾ��� �Է��ϼ���.");
		deposit = Integer.parseInt(sc.nextLine());
		account = account+deposit;
		System.out.printf("%d���� �Ա��ϼ̽��ϴ�.\n", deposit);
		System.out.println("���� �ܾ��� "+account+"�� �Դϴ�.");
	}
	public static void withdraw() {
		System.out.println("����� �����ϼ̽��ϴ�. \t����� �ݾ��� �Է��ϼ���.");
		withdraw = Integer.parseInt(sc.nextLine());
		if(account-withdraw<0) {
			System.out.println("�ܾ��� �����մϴ�.");
		}else {
			System.out.printf("%d���� ����ϼ̽��ϴ�.\n", withdraw);
			account = account-withdraw;
			System.out.println("���� �ܾ��� "+account+"�� �Դϴ�.");
		}		
	}
	public static void account() {
		System.out.printf("��ȸ�� �����ϼ̽��ϴ�. \t���� ���¿� �ִ� �� �ݾ��� %d���Դϴ�.\n", account);
	}
	public static void wrongNumber() {
		System.out.println("�߸��� �Է��Դϴ�.");
	}
	public static void close() {
		System.out.println("���α׷��� �����մϴ�.");
	}
	public static void menu() {
		while(!inputString.equals("4")) {//0�� �ƴҶ� ����
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
