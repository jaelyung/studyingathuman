package com.human.ex;
//Card card�� ����_Ŭ����, card�� �ʺ�_Ŭ����, card�� ���_�ν��Ͻ�, card ����_�ν��Ͻ�
//class Card{
//Ŭ���� �ȿ� ������ �͵�
//1.�ν��Ͻ� �ʵ�(����,�������)
//2.Ŭ���� �ʵ�(����,static����,��������)
//3.�ν��Ͻ� �޼ҵ�
//4.Ŭ���� �޼ҵ�
//5.������ �޼ҵ�

//1.�ν��Ͻ� �ʵ�(����,�������)
//������ �ν��Ͻ����� ���� ���� ������ ����
//2.Ŭ���� �ʵ�(����,static����,��������)
//��� �ν��Ͻ����� ���� �����ϴ� ����
//3.�ν��Ͻ� �޼ҵ�
//4.Ŭ���� �޼ҵ�
//5.������ �޼ҵ�
//}
//Card c1=new Card();//c1�� �ν��Ͻ�ȭ �Ǿ���.
//card c2=new Card();
//��ü
//�ν��Ͻ� ��ü�� ����� �� �ֵ��� �޸𸮿� �ö� ����
//Ŭ���� ���� ���α׷����� ��ü�� ������ �� ����ϴ� Ű����

//�ν��Ͻ� Ŭ������ ������ ��ü
//Ŭ���� ��ü�� ������� ������ ���� Ű����
class Card{
	public static int width=100;//Ŭ��������   static->�ν��Ͻ��� ������ �������� ��밡���ϴ�.
	public static int height=200;//Ŭ��������
	public String shape="�����̵�";//�ν��Ͻ� �ʵ�
	public String number="2";//�ν��Ͻ� �ʵ�
	//ī�忡 ���̸� �����ϴ� �Լ��� ������.
	//Ŭ���� �޼ҵ�
	public static int area() {
		return Card.height*Card.width;
	}
	//�ν��Ͻ� �޼ҵ�
	public String cardDisplay() {
		return shape+number;
	}
	public Card() {}//����Ʈ ������
	//������ �޼ҵ�
	public Card(String shape,String number) {
		this.shape=shape;
		this.number=number;
	}
	
	
}
public class ClassStart02 {

	public static void main(String[] args) {
		System.out.println(Card.area());
		//System.out.println(Card.cardDisplay());
		//c ��������-������������ �ּҰ� �������.
		//���������� ����ִ� ���� ������(�޸��ּҰ� ���� ��)
		
		Card c=new Card();
		System.out.println(c.cardDisplay());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
