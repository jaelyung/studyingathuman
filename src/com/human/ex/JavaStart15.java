package com.human.ex;

import java.util.*;
public class JavaStart15 {
	
	public static void main(String[] args) {
		//369게임  3으로 끝나는 수에서 박수, 10의 배수에서 만세
		for(int i=1;i<100;i++) {
			if(i%10==0) {
				System.out.print(" 만세 ");
				continue;
			}
			if(i>10&&i/10%10%3==0) {
				System.out.print(" 짝 ");
			}
			
			if(i%10%3==0) {
				System.out.print(" 짝 ");
			}else if(i>10&&i/10%10%3==0){
				
			}else {
				System.out.print(" "+i+" ");
			}
		}	
	}
}
