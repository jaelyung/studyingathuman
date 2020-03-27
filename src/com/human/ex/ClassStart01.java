package com.human.ex;

//�츮 �ֺ��� �ִ� �繰�� ��ü�� ����� ����ϴ� ���α׷��� ������.
//�ڵ���, TV, ���������� +������ �ϳ� �߰�.
//�ڵ��� ��ȣ, �̸�, ��ǰ�� (����) -> �ν��Ͻ� �ʵ�
//��ȭ�ɱ�, �޽��� ������, �ڵ��� ������� (�ൿ,����) -> �޼ҵ�
//�޽���
//�����ڵ�����ȣ �޴»����ȣ ���� �޽��� �ð� ���� ���

class Cellphone{
	public String phoneNumber="";
	public String name="";
	public String person="";

	public Cellphone() {}
	public Cellphone(String name, String phoneNumber) {
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.person=name+":"+phoneNumber;	
	}
	public void call() {//��ȭ�ɱ�
		System.out.println(person+"�� ��ȭ�� �����մϴ�.");
	}
	public void message(String m) {//�޽��� ������
		System.out.println(person+"�� �޽����� �����մϴ�. ����:"+m);
	}
	public void productInfo(String product) {//�ڵ��� �������
		System.out.println(name+" ����:"+product);
	}
}

class Tv{
	public int channel=0;
	public String broadcaster="";
	public String program="";
	
	public static void tvOn() {
		System.out.println("TV ������ �����մϴ�.");
	}
	public static void tvOff() {
		System.out.println("TV ������ �����մϴ�.");
	}
	public Tv() {}
	public Tv(int channel, String broadcaster, String program) {
		this.channel=channel;
		this.broadcaster=broadcaster;
		this.program=program;
	}
	public void channelInfo() {//���� ä������Ȯ��
		System.out.println("���� ä���� "+channel+"�� "+broadcaster+"�Դϴ�.");
	}
	public void channelProgam() {
		System.out.println("����"+broadcaster+"������ "+program+"�� �����Դϴ�.");
	}
	public void channelChange() {
		System.out.println("ä���� �����մϴ�.");
		channelInfo();
	}

}

class Elevator{
	public String company="";
	public int lbs=0;//��������
	public int m=0;//�ִ� �����Ÿ�
	
	public Elevator() {}
	public Elevator(String company, int lbs, int m) {
		this.company=company;
		this.lbs=lbs;
		this.m=m;
	}
	public void elevatorInfo() {
		System.out.println("-----------------");
		System.out.println(company);
		System.out.println("�ִ����� "+lbs+"kg");
		System.out.println(m+"m ���̱��� ���� ����");
		System.out.println("-----------------");
	}
	public void goUp(int floor) {
		System.out.println("�ö󰩴ϴ�.");
		System.out.println(floor+"������ �̵��մϴ�.");
		System.out.println(company+"�� ������ ����� �̵��� ���� �ּ��� ���ϰ� �ֽ��ϴ�.");
	}
	public void goDown(int floor) {
		System.out.println("�������ϴ�.");
		System.out.println(floor+"������ �̵��մϴ�.");
		System.out.println(company+"�� ������ ����� �̵��� ���� �ּ��� ���ϰ� �ֽ��ϴ�.");
	}
}
class Computer{
	public String site="";
	public int graphicCard=0;
	public int memory=0;
	public int price=0;
	
	public Computer() {	}
	public Computer(String site, int graphicCard, int memory, int price) {
		this.site=site;
		this.graphicCard=graphicCard;
		this.memory=memory;
		this.price=price;
	}
	public void ComputerInfo() {
		System.out.println("����Ʈ : "+site);
		System.out.println("�׷��� : "+graphicCard+"GB");
		System.out.println("�޸� : "+memory+"GB");
		System.out.println("���� : "+price+"��");
	}
	public void graphic(int graphic) {
		System.out.println("�׷���ī�带 �����մϴ�.");
		graphicCard=graphicCard+graphic;
		price=price+100000*graphic;
	}
	public void memory(int m) {
		System.out.println("�޸𸮸� �����մϴ�.");
		memory=memory+m;
		price=price+20000*m;
	}
	public void overwatch() {
		if(graphicCard>=4&&graphicCard<8) {
			if(memory>=8) {
			System.out.println("������ġ ���డ��, ��Ȱ�� ���� �����");
			}	
		}else if(graphicCard>=8) {
			if(memory>=8) {
				System.out.println("������ġ ���డ��, ��Ȱ�� ���� ����");
			}else {
				System.out.println("������ġ ���డ��");
			}
		}
		else {
			System.out.println("������ġ ���� �Ұ���");
		}
	}
	
}

public class ClassStart01 {
	
	
	public static void main(String[] args) {
		Cellphone p1=new Cellphone("ȫ�浿","010-1234-1234");
		Cellphone p2=new Cellphone("��ö��","010-5678-5678");
		p1.call();
		p2.message("�ȳ��ϼ���, �޴��� ��ݾȳ����� �����߽��ϴ�.");
		p1.productInfo("S10");
		
		Tv.tvOn();
		Tv t1=new Tv(9, "KBS1","����9");
		Tv t2=new Tv(5, "SBS", "��������");
		Tv t3=new Tv(11, "MBC","��ȥ�� ���");
		t1.channelInfo();
		t2.channelProgam();
		t3.channelChange();
		Tv.tvOff();
		
		Elevator e1=new Elevator("��Ƽ�� ����������", 4500, 600);
		e1.elevatorInfo();
		e1.goUp(3);
	
		
		Computer c1=new Computer("����PC", 4, 8, 750000);
		c1.ComputerInfo();
		c1.overwatch();
		c1.graphic(12);
		c1.memory(8);
		c1.ComputerInfo();
		c1.overwatch();
		
		
	}

}
