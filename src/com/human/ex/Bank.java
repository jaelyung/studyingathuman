package com.human.ex;
import java.util.*;
public class Bank {
	public static Scanner sc=new Scanner(System.in);
	public int arrIndex=0;
	public int numOfMember=0;
	public BankClass [] arrBankClass=new BankClass[100];//100���� ȸ���� ������ �� �ִ� ����
	
	public Bank() {}
	//1.ȸ�����
	public void registMember(BankClass b) {
		arrBankClass[arrIndex++]=b;//BankClass�� ��ü�迭�� �߰�
	}
	public void registMember() {
		System.out.println("***ȸ����� ������***");
		System.out.println("�� ���� ȸ���� ����Ͻðڽ��ϱ�?");
		numOfMember=Integer.parseInt(sc.nextLine());
		System.out.println(numOfMember+"���� ȸ���� ����մϴ�.");
		for(int i=0;i<numOfMember;i++) {
			System.out.println("����� ���̵� �Է�>>");//���̵� �ߺ��˻� ���߿� ����
			String id=sc.nextLine();
			System.out.println("��й�ȣ ���>>");
			String password=sc.nextLine();
			arrBankClass[arrIndex++]=new BankClass(id, password);
			System.out.println((i+1)+"��° ȸ����� �Ϸ�");
		}
	}	
	//2.�����̿�
	//2-1.�α���
	//2-2.�޴�����
	public void menuOfBank() {
		System.out.println("���̵� �Է�>>");
		String id=sc.nextLine();
		System.out.println("��й�ȣ �Է�>>");
		String password=sc.nextLine();
		BankClass b=searchMember(id, password);
		
		int input=0;
		while(input!=4) {//0�� �ƴҶ� ����
			System.out.println("1:�Ա�, 2:���, 3:��ȸ, 4:����");
			input=Integer.parseInt(sc.nextLine());
			switch(input) {
			case 1:
				System.out.println("�Ա��� �ݾ��� �Է�>>");
				int deposit = Integer.parseInt(sc.nextLine());
				b.save(deposit);
				b.display();
				break;
			case 2:
				System.out.println("����� �ݾ��� �Է�>>");
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
	//2-3.�Ա�
//	public void save() {
//		
//		BankClass b=searchMember(id, password);
//		if(b==null) {
//			menuOfBank();
//		}else {
//			b.account = b.account+deposit;
//			System.out.printf("%d���� �Ա��ϼ̽��ϴ�.\n", deposit);
//		}
//		b.display();
//	}
	//2-4.���
//	public void withdraw() {
//		System.out.println("����� �ݾ��� �Է�>>");
////		int withdraw=Integer.parseInt(sc.nextLine());
//		BankClass b=searchMember(id, password);
//		if(b==null) {
//			menuOfBank();
//		}else {
//			b.account = b.account-withdraw;
//			System.out.printf("%d���� ����ϼ̽��ϴ�.\n", withdraw);
//		}
//		b.display();
//	}
	//2-5.��ȸ
//	public void account() {
//		searchMember(id, password).display();
//	}
	//3.ȸ���˻�
	public BankClass searchMember(String id,String password) {
		BankClass returnValue=null;
		for(int i=0;i<arrIndex;i++) {
			if(arrBankClass[i].id.equals(id)){
				if(arrBankClass[i].password.equals(password)) {
					returnValue=arrBankClass[i];
				}else {
					System.out.println("��й�ȣ�� �ٸ��ϴ�.");
					searchMember();
				}	
			}else {
				System.out.println("��ϵ��� ���� ���̵� �Դϴ�.");
				startMenu();
			}
		}
		return returnValue;
	}
	public BankClass searchMember() {
		System.out.println("���̵� �Է�>>");
		String id=sc.nextLine();
		System.out.println("��й�ȣ �Է�>>");
		String password=sc.nextLine();
		BankClass returnValue=null;
		searchMember(id, password);
		return returnValue;
	}
	//4.�޴�
	public void startMenu() {
		int input=0;
		while(input!=-1) {
			System.out.println("1:ȸ�����, 2:�����̿�, 3:ȸ����ȸ, (-1:����)");
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
		//����1-> ȸ��2���̻� ��Ͻ� �۵�����
		//����2-> ȸ��1���̻� ��Ͻ� ���� �Ա� ��� ��ȸ �� ��. ��� startMenu���� ȸ����ȸ�� �ȵ�.

	}

}
