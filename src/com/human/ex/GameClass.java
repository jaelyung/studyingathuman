package com.human.ex;

import java.util.*;

public class GameClass {
	public static int deckIndex=0;//������ ����� ī�� �ε���
	//p1
	public static int p1Deck[]=new int[10];//p1�� ī����
	public static int p1Index=0;//p1�� ī�� ����
	public static boolean p1Flag=true;//����ڰ� ī�带 ���� ������ ����
	//p2
	public static int p2Deck[]=new int[10];//p1�� ī����
	public static int p2Index=0;//p1�� ī�� ����
	public static boolean p2Flag=true;//����ڰ� ī�带 ���� ������ ����
	
	public static Scanner sc=new Scanner(System.in);
	public static Random rd=new Random();
	public static int deck[]=new int[52];//���������� ��������� �տ� public static�� ���δ�.
	
	public String name="";
	public int age=0;
	public String id="";
	public String password="";
	public GameClass() {}
	public GameClass(String name, int age, String id, String password) {
		this.name=name;
		this.age=age;
		this.id=id;
		this.password=password;
	}
	public static void playGame() {
		createDeck();
		mixDeck();
		for(int i=0;i<10;i++) {
			getP1Card();
			if(getSum(p1Deck,p1Index)>21) {
				break;
			};
			getP2Card();
			getSum(p2Deck,p2Index);
			if(getSum(p2Deck,p2Index)>21) {
				break;
			};
			if(p1Flag==false&&p2Flag==false) {
				System.out.println("�� �÷��̾ ī�� ������ �����Ͽ����ϴ�.");
				break;
			}
			gameDisplay();
		}
		System.out.println("----------------------");
		gameDisplay();
		System.out.println(whoIsWin());
	}

	public static String whoIsWin() {
		int p1=getSum(p1Deck,p1Index);
		int p2=getSum(p2Deck,p2Index);
		String playState="";
		if(p1>21) {
			playState="***p2�¸�***";
		}else if(p2>21) {
			playState="***p1�¸�***";
		}else if(p1>p2) {
			playState="***p1�¸�***";
		}else if(p1==p2) {
			playState="***���º�***";
		}else {//p1<p2
			playState="***p2�¸�***";
		}
		return playState;
	}
	public static int getSum(int[] deck, int index) {
		int sum=0;
		for(int i=0;i<index;i++) {
			int score=0;
			score=deck[i]%13+1;//A=1,2=2...J=10,Q=10,K=10
			if(score>10) {//J,Q,Kó��
				score=10;
			}
			sum=sum+score;
		}
		//A�� 11�� ó���ϴ� ���� ->21�� �Ѿ�� 1��ó��, 21�� ���� ������ 11�� ó��
		for(int i=0;i<index;i++) {
			if(deck[i]%13==0) {//p1Deck�̳� p2Deck�� A�� �ִ��� �Ǻ�
				if(sum+10<=21) {
					sum=sum+10;//ù��° for������ 1�� ���Ѱɷ� �����ϰ� 10�� �����ָ� A�� ������ 11
				}
				
			}
		}
		
		return sum;
	}	
	public static void gameDisplay() {
		System.out.println(">>ī�� ��Ȳ");
		deckDisplay(p1Deck,p1Index,"P1");
		System.out.println("p1����>>"+getSum(p1Deck,p1Index));
		deckDisplay(p2Deck,p2Index,"P2");
		System.out.println("p2����>>"+getSum(p2Deck,p2Index));
	}
	public static void deckDisplay(int deck[], int index, String title) {
		String cardShape[]= {"�����̵�","Ŭ�ι�","���̾�","��Ʈ"};
		String cardNumber[]= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		System.out.print(title+":");
		for(int i=0;i<index;i++) {
			//ī�� ��� ���� 0~3
			int cardSIndex=deck[i]/cardNumber.length;//deck�� �������� deck�� ����Ŵ.
			System.out.print(cardShape[cardSIndex]);
			//ī�� ���� ���� 0~12
			int cardNIndex=deck[i]%cardNumber.length;
			System.out.print(cardNumber[cardNIndex]);
		}
		System.out.println();
	}
	public static void deckDisplay() {
		String cardShape[]= {"�����̵�","Ŭ�ι�","���̾�","��Ʈ"};
		String cardNumber[]= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		System.out.print("p1:");
		for(int i=0;i<p1Index;i++) {
			//ī�� ��� ���� 0~3
			int cardSIndex=p1Deck[i]/cardNumber.length;
			System.out.print(cardShape[cardSIndex]);
			//ī�� ���� ���� 0~12
			int cardNIndex=p1Deck[i]%cardNumber.length;
			System.out.print(cardNumber[cardNIndex]+",");
		}
		System.out.println();
	}
	public static void getP1Card() {
		if(p1Flag) {
			System.out.println("Player1 ī�带 �ްڽ��ϱ�? 0=No, 1=Yes");
			if(sc.nextLine().equals("0")) {
				p1Flag=false;
			}
			if(p1Flag) {//ī�� �޴� �۾�
				p1Deck[p1Index]=deck[deckIndex];
				deckIndex++;
				p1Index++;
			}
		}
	}
	public static void getP2Card() {
		if(p2Flag) {
			System.out.println("Player2 ī�带 �ްڽ��ϱ�? 0=No, 1=Yes");
			if(sc.nextLine().equals("0")) {
				p2Flag=false;
			}
			if(p2Flag) {//ī�� �޴� �۾�
				p2Deck[p2Index]=deck[deckIndex];
				deckIndex++;
				p2Index++;
			}
		}
	}
	public static void mixDeck() {
		int rand;
		int temp;
		
		for(int i=0;i<10000;i++) {
			rand=rd.nextInt(52);
			temp=deck[0];
			deck[0]=deck[rand];
			deck[rand]=temp;
		}
	}
	public static void createDeck() {
		for(int i=0;i<52;i++) {
			deck[i]=i;//deck�� ���������� ������. ���������� ó��.
		}
	}
	
	public static void main(String[] args) {
		playGame();
//		createDeck();
//		mixDeck();
//		for(int i=0;i<10;i++) {
//			getP1Card();
//			if(getSum(p1Deck,p1Index)>21) {
//				break;
//			};
//			getP2Card();
//			getSum(p2Deck,p2Index);
//			if(getSum(p2Deck,p2Index)>21) {
//				break;
//			};
//			if(p1Flag==false&&p2Flag==false) {
//				System.out.println("�� �÷��̾ ī�� ������ �����Ͽ����ϴ�.");
//				break;
//			}
//			gameDisplay();
//		}
//		System.out.println("----------------------");
//		gameDisplay();
//		System.out.println(whoIsWin());
		
		
//		int deck[]=new int[52]; ->��������ó��	
		//deckDisplay();
//		deckDisplay(p1Deck,p1Index,"p1");
//		System.out.println();
//		deckDisplay(p2Deck,p2Index,"p2");
//		System.out.println();
//		deckDisplay(deck,52,"deck");
//		//deckDisplay() deck������ �迭�� ���
//		String cardShape[]= {"�����̵�","Ŭ�ι�","���̾�","��Ʈ"};
//		String cardNumber[]= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
//		System.out.print("p1:");
//		for(int i=0;i<p1Index;i++) {
//			//ī�� ��� ���� 0~3
//			int cardSIndex=p1Deck[i]/cardNumber.length;
//			System.out.print(cardShape[cardSIndex]);
//			//ī�� ���� ���� 0~12
//			int cardNIndex=p1Deck[i]/cardNumber.length;
//			System.out.print(cardNumber[cardNIndex]+",");
//		}
		
		//ī�� �ޱ� getP1Card
//		int deckIndex=0;//������ ����� ī�� �ε���
//		int p1Deck[]=new int[10];//p1�� ī����
//		int p1Index=0;//p1�� ī�� ����
//		boolean p1Flag=true;//����ڰ� ī�带 ���� ������ ����
//		Scanner sc=new Scanner(System.in);
//		
//		if(p1Flag) {
//			System.out.println("ī�带 �ްڽ��ϱ�? 0=No, 1=Yes");
//			if(sc.nextLine().equals("0")) {
//				p1Flag=false;
//			}
//			if(p1Flag) {//ī�� �޴� �۾�
//				p1Deck[p1Index]=deck[deckIndex];
//				deckIndex++;
//				p1Index++;
//			}

		//ī�����
//		for(int i=0;i<52;i++) {
//			deck[i]=i;
//		}
		//ī�弯��
//		Random rd=new Random();
//		int rand;
//		int temp;
//		for(int i=0;i<10000;i++) {
//			rand=rd.nextInt(52);
//			temp=deck[0];
//			deck[0]=deck[rand];
//			deck[rand]=temp;
//		}
		

	}

}
