package com.human.ex;
import java.util.*;
public class BankClass {
	public static Scanner sc=new Scanner(System.in);
	public String inputString="";
	public int account=0;
	public int deposit=0;
	public int withdraw=0;
	//���̵�� �н�����
	public String id="";	//���̵�� ��й�ȣ�� �����̺����� ���߿� ����
	public String password="";
	
	public BankClass() {}
	public BankClass(String id, String password) {
		this.id=id;
		this.password=password;
	}

	public void save(int deposit) {
		this.account = this.account+deposit;
		System.out.printf("%d���� �Ա��ϼ̽��ϴ�.\n", deposit);
	}
	public void withdraw(int withdraw) {
		if(this.account-withdraw<0) {
			System.out.println("�ܾ��� �����մϴ�.");
		}else {
			this.account = this.account-withdraw;
		}		
	}
	public void display() {//�ŷ����� ��ȸ���?
		System.out.printf("���� ���¿� �ִ� �� �ݾ�: %d��\n", this.account);
	}
	
	public static void main(String[] args) {
	
	}

}
