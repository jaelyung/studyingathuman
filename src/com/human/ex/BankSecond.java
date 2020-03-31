package com.human.ex;
import java.util.*;
public class BankSecond {
	public static Scanner sc=new Scanner(System.in);
	public int arrIndex=0;
	public int numOfMember=0;
	public static BankClassSecond [] arrBankClass=new BankClassSecond[100];//100���� ȸ���� ������ �� �ִ� ����
 
	public BankSecond() {}
	//1.ȸ�����
 	public void registMember(BankClassSecond b) {
 		arrBankClass[arrIndex++]=b;//BankClass�� ��ü�迭�� �߰�
 	}
 	public void registMember() {
 		System.out.println("����� ���̵� �Է�>>");//���̵� �ߺ��˻� ���߿� ����
 		String id=sc.nextLine();
 		System.out.println("��й�ȣ ���>>");
 		String password=sc.nextLine();
 		System.out.println("�ʱ� �Ա��� �ݾ�>>");
 		int money=Integer.parseInt(sc.nextLine());
 		for(int i=0;i<arrBankClass.length;i++) {
 			if(arrBankClass[i]==null) {
 				arrBankClass[arrIndex++]=new BankClassSecond(id, password, money);
 				System.out.println("���°� �����Ǿ����ϴ�.");
 				break;
 			}
 			
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
	 		searchMember(id, password);
 		int input=0;
 		while(input!=4) {//0�� �ƴҶ� ����
 			System.out.println("1:�Ա�, 2:���, 3:��ȸ, 4:����");
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
 //2-3.�Ա�
// public void save() {
//  
//  BankClass b=searchMember(id, password);
//  if(b==null) {
//   menuOfBank();
//  }else {
//   b.account = b.account+deposit;
//   System.out.printf("%d���� �Ա��ϼ̽��ϴ�.\n", deposit);
//  }
//  b.display();
// }
 //2-4.���
// public void withdraw() {
//  System.out.println("����� �ݾ��� �Է�>>");
////  int withdraw=Integer.parseInt(sc.nextLine());
//  BankClass b=searchMember(id, password);
//  if(b==null) {
//   menuOfBank();
//  }else {
//   b.account = b.account-withdraw;
//   System.out.printf("%d���� ����ϼ̽��ϴ�.\n", withdraw);
//  }
//  b.display();
// }
 //2-5.��ȸ
// public void account() {
//  searchMember(id, password).display();
// }
 //3.ȸ���˻�
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
 		System.out.println("���̵� �Է�>>");
 		String id=sc.nextLine();
 		System.out.println("��й�ȣ �Է�>>");
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
 //4.�޴�
 	public void startMenu() {
 		int input=0;
 		while(input!=-1) {
 			System.out.println("1:ȸ�����, 2:�����̿�, 3:ȸ����ȸ, 4:��� ȸ�� ��ȸ (-1:����)");
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
  //����1-> ȸ��2���̻� ��� �Ŀ� �����̿��ư�� ������ ��ϵ��� ���� ���̵��Դϴ� �� ��µ�.
  //         ���ȸ����ȸ���� ��ü ȸ����, ���̵�, ��й�ȣ ��ȸ ��.
  //����2-> ȸ��1���̻� ��Ͻ� ���� �Ա� ��� ��ȸ �� ��. 2��° ��Ϻ��� �ȵ�.

 }

}