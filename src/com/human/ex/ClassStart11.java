package com.human.ex;
//��ǰ���� ���α׷�
//1.��ǰ���
//2.�԰�
//3.���
//4.���ֹ��޽���(ǰ���ӹ�)
//5.��ǰ�˻�
//6.��ǰ���Ȯ��

class ProductManager{
	public static java.util.Scanner sc=new java.util.Scanner(System.in);
	public int arrIndex=0;
	public Product [] arrProduct=new Product[10];
	
	public ProductManager() {}
	//1. ��ǰ���
	public void registTestData() {
		Product p1=new Product("�����", 100);
		registProduct(p1);
		Product p2=new Product("����", 100);
		registProduct(p2);
		Product p3=new Product("���찳", 100);
		registProduct(p3);
		Product p4=new Product("å", 70);
		registProduct(p4);
		Product p5=new Product("����", 90);
		registProduct(p5);
	}
	public void registProduct(Product p) {
		//arrProduct[Product.totalCount-1]=p;
		arrProduct[arrIndex++]=p;
	}
	public void registProduct() {
		//arrProduct[0]=new Product("�����", 10);�ѹ� ȣ��ɶ����� �ڵ����� �ǰ� �ؾ���.
		//[]�ּҿ����ڰ� �켱����ȴ�.
		System.out.println("��ǰ�� ��� ������");
		System.out.println("��ǰ��>>");
		String name=sc.nextLine();
		System.out.println("��ϰ���>>");
		int count=Integer.parseInt(sc.nextLine());
		arrProduct[arrIndex++]=new Product(name, count);
		//[]�ּҿ����ڰ� �켱����ȴ�.
	}
	//2. �԰�
	public void inputProduct() {
		System.out.println("�԰��� ��ǰ�� �Է�>>");
		String name=sc.nextLine();
		System.out.println("�԰��� ��ǰ�����Է�>>");
		int count=Integer.parseInt(sc.nextLine());
		Product p=searchProduct(name);
		if(p==null) {
			System.out.println("���� ��ǰ�Դϴ�.");
		}else {
			p.count=p.count+count;
		}
		p.display();
	}
	//3. ���
	public void outputProduct() {
		System.out.println("����� ��ǰ�� �Է�>>");
		String name=sc.nextLine();
		System.out.println("����� ��ǰ�����Է�>>");
		int count=Integer.parseInt(sc.nextLine());
		Product p=searchProduct(name);
		if(p==null) {
			System.out.println("���� ��ǰ�Դϴ�.");
		}else {
			p.count=p.count-count;
		}
		p.display();
	}

	//4. ��ǰ�˻�
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
		System.out.println("�˻��� ��ǰ���� �Է�>>");
		String name=sc.nextLine();
		Product returnValue=null;
		for(int i=0;i<arrIndex;i++) {
			if(arrProduct[i].name.equals(name)) {
				returnValue=arrProduct[i];
			}
		}
		return returnValue;
	}
	//5. ��ǰ��� Ȯ��
	public void displayProduct() {
		for(int i=0;i<Product.totalCount;i++) {
			arrProduct[i].display();
		}
	}
	
	public void close() {
		System.out.println("�����մϴ�.");
	}
	//6. play
	public void start() {
		int input=0;
		while(input!=-1) {
			System.out.println("1.��ǰ��� 2.�԰� 3.��� 4.��ǰ�˻� 5.��ǰ��� Ȯ�� (����� -1)");
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
//		pm.registProduct();//1�� ���
//		pm.registProduct();
//		pm.registTestData();
//		pm.displayProduct();
//		pm.inputProduct();
//		pm.outputProduct();
		
		//pm.start(); ����� �Է��� �޾Ƽ� ó���Ǵ� ���α׷� ���� 
		pm.start();
	}

}
