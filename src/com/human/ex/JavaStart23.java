package com.human.ex;
//p.17
import java.util.*;
public class JavaStart23 {	
	public static int money=0;
	public static void save(int amount) {
		money=money+amount;
		System.out.println("지금까지의 저축액은 "+money+"입니다.");
	}
	public static void draw(int amount) {
		money=money-amount;
		if(money<0) {
			System.out.println("잔액이 부족합니다.");
		}else {
			System.out.println("지금까지의 잔액은 "+money+"입니다.");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=0;
		int save=0;
		int draw=0;
		
		while(!(input==-1)){
			System.out.println("메뉴를 선택하세요 1.저축 2.예금인출(종료는 -1):");
			input=Integer.parseInt(sc.nextLine());
			switch(input) {
			case 1:
				System.out.println("얼마를 저축하시겠습니까?");
				save=Integer.parseInt(sc.nextLine());
				save(save);
				break;
			case 2:
				System.out.println("얼마를 인출하시겠습니까?");
				draw=Integer.parseInt(sc.nextLine());
				draw(draw);
			}
			
		}
		System.out.println("프로그램을 종료합니다.");
	}

	
}
