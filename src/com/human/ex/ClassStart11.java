package com.human.ex;
//상품관리 프로그램
//1.상품등록
//2.입고
//3.출고
//4.재주문메시지(품절임박)
//5.상품검색
//6.상품재고확인

class ProductManager{
	public static java.util.Scanner sc=new java.util.Scanner(System.in);
	public int arrIndex=0;
	public Product [] arrProduct=new Product[10];
	
	public ProductManager() {}
	//1. 상품등록
	public void registTestData() {
		Product p1=new Product("새우깡", 100);
		registProduct(p1);
		Product p2=new Product("연필", 100);
		registProduct(p2);
		Product p3=new Product("지우개", 100);
		registProduct(p3);
		Product p4=new Product("책", 70);
		registProduct(p4);
		Product p5=new Product("볼펜", 90);
		registProduct(p5);
	}
	public void registProduct(Product p) {
		//arrProduct[Product.totalCount-1]=p;
		arrProduct[arrIndex++]=p;
	}
	public void registProduct() {
		//arrProduct[0]=new Product("새우깡", 10);한번 호출될때마다 자동으로 되게 해야함.
		//[]주소연산자가 우선실행된다.
		System.out.println("상품명 등록 페이지");
		System.out.println("상품명>>");
		String name=sc.nextLine();
		System.out.println("등록개수>>");
		int count=Integer.parseInt(sc.nextLine());
		arrProduct[arrIndex++]=new Product(name, count);
		//[]주소연산자가 우선실행된다.
	}
	//2. 입고
	public void inputProduct() {
		System.out.println("입고할 상품을 입력>>");
		String name=sc.nextLine();
		System.out.println("입고할 상품개수입력>>");
		int count=Integer.parseInt(sc.nextLine());
		Product p=searchProduct(name);
		if(p==null) {
			System.out.println("없는 상품입니다.");
		}else {
			p.count=p.count+count;
		}
		p.display();
	}
	//3. 출고
	public void outputProduct() {
		System.out.println("출고할 상품을 입력>>");
		String name=sc.nextLine();
		System.out.println("출고할 상품개수입력>>");
		int count=Integer.parseInt(sc.nextLine());
		Product p=searchProduct(name);
		if(p==null) {
			System.out.println("없는 상품입니다.");
		}else {
			p.count=p.count-count;
		}
		p.display();
	}

	//4. 상품검색
	public Product searchProduct(String name) {
		Product returnValue=null;
		for(int i=0;i<arrIndex;i++) {
			if(arrProduct[i].name.equals(name)) {
				returnValue=arrProduct[i];
			}
		}
		return returnValue;
	}
	public Product searchProduct() {
		System.out.println("검색할 상품명을 입력>>");
		String name=sc.nextLine();
		Product returnValue=null;
		for(int i=0;i<arrIndex;i++) {
			if(arrProduct[i].name.equals(name)) {
				returnValue=arrProduct[i];
			}
		}
		return returnValue;
	}
	//5. 상품재고 확인
	public void displayProduct() {
		for(int i=0;i<Product.totalCount;i++) {
			arrProduct[i].display();
		}
	}
	
	public void close() {
		System.out.println("종료합니다.");
	}
	//6. play
	public void start() {
		int input=0;
		while(input!=-1) {
			System.out.println("1.상품등록 2.입고 3.출고 4.상품검색 5.상품재고 확인 (종료는 -1)");
			input=Integer.parseInt(sc.nextLine());
			switch(input) {
			case 1:
				registProduct();
				break;
			case 2:
				inputProduct();
				break;
			case 3:
				outputProduct();
				break;
			case 4:
				searchProduct();
				break;
			case 5:
				displayProduct();
			}
		}
		close();
	}

}
public class ClassStart11 {

	public static void main(String[] args) {
		ProductManager pm=new ProductManager();
//		pm.registProduct();//1개 등록
//		pm.registProduct();
//		pm.registTestData();
//		pm.displayProduct();
//		pm.inputProduct();
//		pm.outputProduct();
		
		//pm.start(); 사용자 입력을 받아서 처리되는 프로그램 구현 
		pm.start();
	}

}
