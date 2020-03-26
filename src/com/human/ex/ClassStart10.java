package com.human.ex;
class Product{
	public static int totalCount=0;
	public String name;
	public int count=0;
	//추가, 소진, 내용
	public void add(int count) {
		this.count=this.count+count;
	}
	public void min(int count) {
		this.count=this.count-count;
	}
	public void display() {
		System.out.println("전체 상품종류 개수:"+Product.totalCount);
		System.out.println("상품 이름:"+this.name);
		System.out.println("상품 개수:"+this.count);
		
	}
	//생성자
	public Product() {
		Product.totalCount++;
	}
	public Product(String name) {
		this(name,0);
	}
	public Product(String name, int count) {
		this();
		this.name=name;
		this.count=count;
	}
}
public class ClassStart10 {

	public static void main(String[] args) {
		// Product 클래스
		//등록한 상품개수 저장 static
		//상품명
		//재고수량
		//재고 추가
		//재고 소진
		//재고 내용
		//ProductManager클래스 상품들을 관리하는 프로그램
		Product p1=new Product("새우깡", 100);
		Product p2=new Product("연필", 100);
		Product p3=new Product("지우개", 100);
		//새우깡 4개 판매
		p1.min(4);
		//지우개 10개 입고
		p3.add(10);
		
		
		p1.display();
		p2.display();
		p3.display();
		
		Product arr[]=new Product[5];
		arr[0]=p1;
		arr[1]=p2;
		arr[2]=p3;
		arr[3]=new Product("노트", 10);
		
		//사용자 입력을 받아 해당 품목 내용을 화면에 출력하자.
		String input="연필";
		
		for(Product p:arr) {
			if(p!=null) {
				if(p.name.equals(input)) {
					p.display();
				}
			}
		}
		//재고가 20이하인 제품을 출력하는 프로그램
		for(Product p:arr) {
			if(p!=null) {
				if(p.count<=20) {
					p.display();
				}
			}
		}
	}

}
