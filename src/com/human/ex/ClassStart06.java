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
		System.out.println("주문번호:"+orderNumber);
		System.out.println("주문자 아이디:"+id);
		System.out.println("주문 날짜:"+orderDate);
		System.out.println("주문자 이름:"+orderName);
		System.out.println("주문 상품 번호:"+orderProductNumber);
		System.out.println("배송 주소:"+address);
	}
}

public class ClassStart06 {

	public static void main(String[] args) {
		Order od1=new Order("201803120001", "abc123", "2018년 3월 12일", "홍길순", "PD0345-12", "서울시 영등포구 여의도동 20번지");
		od1.display();
	}

}
