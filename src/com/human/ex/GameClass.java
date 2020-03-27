package com.human.ex;

import java.util.*;

public class GameClass {
	public static int deckIndex=0;//다음에 사용할 카드 인덱스
	//p1
	public static int p1Deck[]=new int[10];//p1의 카드목록
	public static int p1Index=0;//p1의 카드 순서
	public static boolean p1Flag=true;//사용자가 카드를 받을 것인지 결정
	//p2
	public static int p2Deck[]=new int[10];//p1의 카드목록
	public static int p2Index=0;//p1의 카드 순서
	public static boolean p2Flag=true;//사용자가 카드를 받을 것인지 결정
	
	public static Scanner sc=new Scanner(System.in);
	public static Random rd=new Random();
	public static int deck[]=new int[52];//전역변수를 쓰고싶으면 앞에 public static을 붙인다.
	
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
				System.out.println("두 플레이어가 카드 수령을 중지하였습니다.");
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
			playState="***p2승리***";
		}else if(p2>21) {
			playState="***p1승리***";
		}else if(p1>p2) {
			playState="***p1승리***";
		}else if(p1==p2) {
			playState="***무승부***";
		}else {//p1<p2
			playState="***p2승리***";
		}
		return playState;
	}
	public static int getSum(int[] deck, int index) {
		int sum=0;
		for(int i=0;i<index;i++) {
			int score=0;
			score=deck[i]%13+1;//A=1,2=2...J=10,Q=10,K=10
			if(score>10) {//J,Q,K처리
				score=10;
			}
			sum=sum+score;
		}
		//A를 11로 처리하는 기준 ->21을 넘어가면 1점처리, 21을 넘지 않으면 11점 처리
		for(int i=0;i<index;i++) {
			if(deck[i]%13==0) {//p1Deck이나 p2Deck에 A가 있는지 판별
				if(sum+10<=21) {
					sum=sum+10;//첫번째 for문에서 1점 더한걸로 생각하고 10만 더해주면 A의 점수는 11
				}
				
			}
		}
		
		return sum;
	}	
	public static void gameDisplay() {
		System.out.println(">>카드 현황");
		deckDisplay(p1Deck,p1Index,"P1");
		System.out.println("p1총점>>"+getSum(p1Deck,p1Index));
		deckDisplay(p2Deck,p2Index,"P2");
		System.out.println("p2총점>>"+getSum(p2Deck,p2Index));
	}
	public static void deckDisplay(int deck[], int index, String title) {
		String cardShape[]= {"스페이드","클로버","다이아","하트"};
		String cardNumber[]= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		System.out.print(title+":");
		for(int i=0;i<index;i++) {
			//카드 모양 종류 0~3
			int cardSIndex=deck[i]/cardNumber.length;//deck은 지역변수 deck을 가리킴.
			System.out.print(cardShape[cardSIndex]);
			//카드 숫자 종류 0~12
			int cardNIndex=deck[i]%cardNumber.length;
			System.out.print(cardNumber[cardNIndex]);
		}
		System.out.println();
	}
	public static void deckDisplay() {
		String cardShape[]= {"스페이드","클로버","다이아","하트"};
		String cardNumber[]= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		System.out.print("p1:");
		for(int i=0;i<p1Index;i++) {
			//카드 모양 종류 0~3
			int cardSIndex=p1Deck[i]/cardNumber.length;
			System.out.print(cardShape[cardSIndex]);
			//카드 숫자 종류 0~12
			int cardNIndex=p1Deck[i]%cardNumber.length;
			System.out.print(cardNumber[cardNIndex]+",");
		}
		System.out.println();
	}
	public static void getP1Card() {
		if(p1Flag) {
			System.out.println("Player1 카드를 받겠습니까? 0=No, 1=Yes");
			if(sc.nextLine().equals("0")) {
				p1Flag=false;
			}
			if(p1Flag) {//카드 받는 작업
				p1Deck[p1Index]=deck[deckIndex];
				deckIndex++;
				p1Index++;
			}
		}
	}
	public static void getP2Card() {
		if(p2Flag) {
			System.out.println("Player2 카드를 받겠습니까? 0=No, 1=Yes");
			if(sc.nextLine().equals("0")) {
				p2Flag=false;
			}
			if(p2Flag) {//카드 받는 작업
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
			deck[i]=i;//deck이 지역변수라서 에러남. 전역변수로 처리.
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
//				System.out.println("두 플레이어가 카드 수령을 중지하였습니다.");
//				break;
//			}
//			gameDisplay();
//		}
//		System.out.println("----------------------");
//		gameDisplay();
//		System.out.println(whoIsWin());
		
		
//		int deck[]=new int[52]; ->전역변수처리	
		//deckDisplay();
//		deckDisplay(p1Deck,p1Index,"p1");
//		System.out.println();
//		deckDisplay(p2Deck,p2Index,"p2");
//		System.out.println();
//		deckDisplay(deck,52,"deck");
//		//deckDisplay() deck형태의 배열을 출력
//		String cardShape[]= {"스페이드","클로버","다이아","하트"};
//		String cardNumber[]= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
//		System.out.print("p1:");
//		for(int i=0;i<p1Index;i++) {
//			//카드 모양 종류 0~3
//			int cardSIndex=p1Deck[i]/cardNumber.length;
//			System.out.print(cardShape[cardSIndex]);
//			//카드 숫자 종류 0~12
//			int cardNIndex=p1Deck[i]/cardNumber.length;
//			System.out.print(cardNumber[cardNIndex]+",");
//		}
		
		//카드 받기 getP1Card
//		int deckIndex=0;//다음에 사용할 카드 인덱스
//		int p1Deck[]=new int[10];//p1의 카드목록
//		int p1Index=0;//p1의 카드 순서
//		boolean p1Flag=true;//사용자가 카드를 받을 것인지 결정
//		Scanner sc=new Scanner(System.in);
//		
//		if(p1Flag) {
//			System.out.println("카드를 받겠습니까? 0=No, 1=Yes");
//			if(sc.nextLine().equals("0")) {
//				p1Flag=false;
//			}
//			if(p1Flag) {//카드 받는 작업
//				p1Deck[p1Index]=deck[deckIndex];
//				deckIndex++;
//				p1Index++;
//			}

		//카드생성
//		for(int i=0;i<52;i++) {
//			deck[i]=i;
//		}
		//카드섞기
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
