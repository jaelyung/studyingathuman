package com.human.ex;
class Printer{
	private int numOfPapers=0;
	private boolean duplex;
	
	
	public Printer() {}
	public Printer(int numOfPapers, boolean duplex){
		this.numOfPapers=numOfPapers;
		this.duplex=duplex;
	}
	void print(int amount) {
//		if(numOfPapers-amount>=0) {
//			numOfPapers=numOfPapers-amount;
//			System.out.println(amount+"�� ����߽��ϴ�. ���� "+numOfPapers+"�� �����ֽ��ϴ�.");
//		}else if(numOfPapers==0){
//			System.out.println("������ �����ϴ�.");
//		}
//		else {
//			System.out.println("��� ����Ϸ��� ������ "+Math.abs(numOfPapers-amount)+"�� �����մϴ�. "+numOfPapers+"�常 ����մϴ�.");
//			numOfPapers=0;
//			System.out.println("������ �����ϴ�.");
//		}
//		if(numOfPapers==0){
//			System.out.println("������ �����ϴ�.");
//		}
		
			if(duplex==true) {
				if(amount%2==1) {
					amount=(amount+1)/2;
				}else {
					amount=amount/2;
				}
				if(numOfPapers>amount) {
					numOfPapers=numOfPapers-amount;
					System.out.println("������� "+amount+"�� ����߽��ϴ�. ����"+numOfPapers+"�� �����ֽ��ϴ�.");
				}else {
					System.out.println("������� ��� ����Ϸ��� ������ "+Math.abs(numOfPapers-amount)+"�� �����մϴ�. "+numOfPapers+"�常 ����մϴ�.");
					numOfPapers=0;
				}
			}else {
				if(numOfPapers>amount) {
					System.out.println("�ܸ����� "+amount+"�� ����߽��ϴ�.");
					numOfPapers=numOfPapers-amount;
				}else if(numOfPapers==0) {
					System.out.println("������ �����մϴ�.");
				}
				else {
					System.out.println("�ܸ����� ��� ����Ϸ��� ������ "+Math.abs(numOfPapers-amount)+"�� �����մϴ�. "+numOfPapers+"�常 ����մϴ�.");
					numOfPapers=0;
				}
			
			}
		

	}
	public int getNumOfPapers() {
		return this.numOfPapers;
	}
	public boolean getDuplex() {
		return this.duplex;
	}
	public void setDuplex(boolean duplex) {
		this.duplex=duplex;
	}
}
public class PrinterTest {
	public static void main(String[] args) {
		//Printer Ŭ������ �׽�Ʈ�ϴ� �ڵ�
//		Printer p=new Printer(20);
//		p.print(20);
//		p.print(10);
//		System.out.println(p.getNumOfPapers());
		Printer p=new Printer(20, true);
		p.print(55);
		System.out.println(p.getNumOfPapers());
		p.setDuplex(false);
		p.print(5);
		System.out.println(p.getNumOfPapers());
		
	}

}
