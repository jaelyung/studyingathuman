package com.human.ex;
class Order{
	public String orderNumber="";
	public String id="";
	public String orderDate="";
	public String orderName="";
	public String orderProductNumber="";
	public String address="";
	
	public Order() {}
	public Order(String orderNumber, String id, String orderDate, String orderName, String orderProductNumber, String address) {
		this.orderNumber=orderNumber;
		this.id=id;
		this.orderDate=orderDate;
		this.orderName=orderName;
		this.orderProductNumber=orderProductNumber;
		this.address=address;
	}
	public void display() {
		System.out.println("�ֹ���ȣ:"+orderNumber);
		System.out.println("�ֹ��� ���̵�:"+id);
		System.out.println("�ֹ� ��¥:"+orderDate);
		System.out.println("�ֹ��� �̸�:"+orderName);
		System.out.println("�ֹ� ��ǰ ��ȣ:"+orderProductNumber);
		System.out.println("��� �ּ�:"+address);
	}
}

public class ClassStart06 {

	public static void main(String[] args) {
		Order od1=new Order("201803120001", "abc123", "2018�� 3�� 12��", "ȫ���", "PD0345-12", "����� �������� ���ǵ��� 20����");
		od1.display();
	}

}
