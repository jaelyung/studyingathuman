package com.human.ex;

public class JavaStart001 {
	//1. �޼ҵ��� ���������� �޼ҵ尡 ����Ǹ� ���ÿ� �ö󰣴�.
	//2. �޼ҵ尣 ���������� �������� �ʴ´�.
	//3. �޼ҵ尡 ����Ǹ� �޸𸮿��� �������.
	//4. �ڵ���� ���������� �ڵ���� ����Ǹ� �������.	
	
	public static int sum(int a, int b) {//�޼ҵ�� public class�ȿ� ��� ����°� main�ȿ� ������ ����
		int sum=0;
		sum=a+b;
		return sum;
		//sum=sum+1; return�ؿ� �ڵ尡 �� �� ����. ������ �ȵ�
	}
	
	public static int min(int a, int b) {
//		int min=0;
//		min=c-d;
//		return min;
		return a-b;
	}
	
	public static int mul(int a, int b) {
//		int mul=0;
//		mul=e*f;
//		return mul;
		return a*b;
	}

	public static double div(double a, double b) {
//		double div=0;
//		div=g/h;
//		return div;
		return a/b;
	}
	
	public static void hello() {
		System.out.println("�ȳ��ϼ���");
	}
	
	//�μ� ������ ��(5,2) (2,5) �� �� 14�� ��������
	public static int sumAll(int a, int b) {
		int sum=0;
		if(a>b) {
			int temp;
			temp=a;
			a=b;
			b=temp;
		}//b�� �׻� ū���� ��
		for(;a<=b;a++) {
			sum=sum+a;
		}
		return sum;
	}
		
	public static int between(int i, int j) {//��ȯ�ϴ� �۾� �ʿ�
		int sum=0;
		for(;i<=j;i++) {
			sum=sum+i;
		}
		return sum;
	}
		
	public static void main(String[] args) {
		//return�� ����, String[]�� �Ű�����
		int a=sum(1,2);//3
		int b=a+sum(2,2);//3+4=7
		System.out.println(a+b);//3+7=10
		//min mul div �Լ��� ���� ����غ���.
		
		System.out.println(min(a,b));
		System.out.println(mul(a,b));
		System.out.println(div(a,b));
		
		//���� 1. min mul div �Լ��� ���� ����غ���
		//���� 2. �Ű������� ���ϰ��� ���� �Լ��� �̿��� "�ȳ��ϼ���"��� ������ ����ϴ� �Լ� hello�� ����� �����Լ����� ����Լ��� ������ ȣ��, �ȳ��ϼ��並 ���
		hello();
		hello();
		hello();
		for(int i=0;i<3;i++) {
			hello();
		}
		//���� 3. �� ���� ���� ���� ���ϴ� �Լ�
//		int i=between(2,6);//2+3+4+5+6=20
//		System.out.println(i);
		System.out.println(between(2,6));
		a=10;
		b=12;
		System.out.println(sumAll(a,b));
	
	}

}
