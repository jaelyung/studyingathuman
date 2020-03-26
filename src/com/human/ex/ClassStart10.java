package com.human.ex;
class Product{
	public static int totalCount=0;
	public String name;
	public int count=0;
	//�߰�, ����, ����
	public void add(int count) {
		this.count=this.count+count;
	}
	public void min(int count) {
		this.count=this.count-count;
	}
	public void display() {
		System.out.println("��ü ��ǰ���� ����:"+Product.totalCount);
		System.out.println("��ǰ �̸�:"+this.name);
		System.out.println("��ǰ ����:"+this.count);
		
	}
	//������
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
		// Product Ŭ����
		//����� ��ǰ���� ���� static
		//��ǰ��
		//������
		//��� �߰�
		//��� ����
		//��� ����
		//ProductManagerŬ���� ��ǰ���� �����ϴ� ���α׷�
		Product p1=new Product("�����", 100);
		Product p2=new Product("����", 100);
		Product p3=new Product("���찳", 100);
		//����� 4�� �Ǹ�
		p1.min(4);
		//���찳 10�� �԰�
		p3.add(10);
		
		
		p1.display();
		p2.display();
		p3.display();
		
		Product arr[]=new Product[5];
		arr[0]=p1;
		arr[1]=p2;
		arr[2]=p3;
		arr[3]=new Product("��Ʈ", 10);
		
		//����� �Է��� �޾� �ش� ǰ�� ������ ȭ�鿡 �������.
		String input="����";
		
		for(Product p:arr) {
			if(p!=null) {
				if(p.name.equals(input)) {
					p.display();
				}
			}
		}
		//��� 20������ ��ǰ�� ����ϴ� ���α׷�
		for(Product p:arr) {
			if(p!=null) {
				if(p.count<=20) {
					p.display();
				}
			}
		}
	}

}
