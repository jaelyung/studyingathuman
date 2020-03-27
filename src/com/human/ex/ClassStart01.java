package com.human.ex;

//우리 주변에 있는 사물을 객체로 만들어 출력하는 프로그램을 만들어보자.
//핸드폰, TV, 엘리베이터 +본인이 하나 추가.
//핸드폰 번호, 이름, 제품명 (상태) -> 인스턴스 필드
//전화걸기, 메시지 보내기, 핸드폰 정보출력 (행동,동작) -> 메소드
//메시지
//본인핸드폰번호 받는사람번호 보낼 메시지 시간 정보 출력

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
	public void call() {//전화걸기
		System.out.println(person+"로 전화를 연결합니다.");
	}
	public void message(String m) {//메시지 보내기
		System.out.println(person+"로 메시지를 전달합니다. 내용:"+m);
	}
	public void productInfo(String product) {//핸드폰 정보출력
		System.out.println(name+" 기종:"+product);
	}
}

class Tv{
	public int channel=0;
	public String broadcaster="";
	public String program="";
	
	public static void tvOn() {
		System.out.println("TV 전원을 연결합니다.");
	}
	public static void tvOff() {
		System.out.println("TV 연결을 종료합니다.");
	}
	public Tv() {}
	public Tv(int channel, String broadcaster, String program) {
		this.channel=channel;
		this.broadcaster=broadcaster;
		this.program=program;
	}
	public void channelInfo() {//현재 채널정보확인
		System.out.println("현재 채널은 "+channel+"번 "+broadcaster+"입니다.");
	}
	public void channelProgam() {
		System.out.println("현재"+broadcaster+"에서는 "+program+"이 상영중입니다.");
	}
	public void channelChange() {
		System.out.println("채널을 변경합니다.");
		channelInfo();
	}

}

class Elevator{
	public String company="";
	public int lbs=0;//정격하중
	public int m=0;//최대 행정거리
	
	public Elevator() {}
	public Elevator(String company, int lbs, int m) {
		this.company=company;
		this.lbs=lbs;
		this.m=m;
	}
	public void elevatorInfo() {
		System.out.println("-----------------");
		System.out.println(company);
		System.out.println("최대하중 "+lbs+"kg");
		System.out.println(m+"m 높이까지 운행 가능");
		System.out.println("-----------------");
	}
	public void goUp(int floor) {
		System.out.println("올라갑니다.");
		System.out.println(floor+"층으로 이동합니다.");
		System.out.println(company+"는 고객에게 편안한 이동을 위해 최선을 다하고 있습니다.");
	}
	public void goDown(int floor) {
		System.out.println("내려갑니다.");
		System.out.println(floor+"층으로 이동합니다.");
		System.out.println(company+"는 고객에게 편안한 이동을 위해 최선을 다하고 있습니다.");
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
		System.out.println("사이트 : "+site);
		System.out.println("그래픽 : "+graphicCard+"GB");
		System.out.println("메모리 : "+memory+"GB");
		System.out.println("가격 : "+price+"원");
	}
	public void graphic(int graphic) {
		System.out.println("그래픽카드를 변경합니다.");
		graphicCard=graphicCard+graphic;
		price=price+100000*graphic;
	}
	public void memory(int m) {
		System.out.println("메모리를 변경합니다.");
		memory=memory+m;
		price=price+20000*m;
	}
	public void overwatch() {
		if(graphicCard>=4&&graphicCard<8) {
			if(memory>=8) {
			System.out.println("오버워치 실행가능, 원활한 접속 어려움");
			}	
		}else if(graphicCard>=8) {
			if(memory>=8) {
				System.out.println("오버워치 실행가능, 원활한 접속 가능");
			}else {
				System.out.println("오버워치 실행가능");
			}
		}
		else {
			System.out.println("오버워치 실행 불가능");
		}
	}
	
}

public class ClassStart01 {
	
	
	public static void main(String[] args) {
		Cellphone p1=new Cellphone("홍길동","010-1234-1234");
		Cellphone p2=new Cellphone("김철수","010-5678-5678");
		p1.call();
		p2.message("안녕하세요, 휴대폰 요금안내서가 도착했습니다.");
		p1.productInfo("S10");
		
		Tv.tvOn();
		Tv t1=new Tv(9, "KBS1","뉴스9");
		Tv t2=new Tv(5, "SBS", "동물농장");
		Tv t3=new Tv(11, "MBC","나혼자 산다");
		t1.channelInfo();
		t2.channelProgam();
		t3.channelChange();
		Tv.tvOff();
		
		Elevator e1=new Elevator("오티스 엘리베이터", 4500, 600);
		e1.elevatorInfo();
		e1.goUp(3);
	
		
		Computer c1=new Computer("마루PC", 4, 8, 750000);
		c1.ComputerInfo();
		c1.overwatch();
		c1.graphic(12);
		c1.memory(8);
		c1.ComputerInfo();
		c1.overwatch();
		
		
	}

}
