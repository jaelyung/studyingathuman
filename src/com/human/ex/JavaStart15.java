package com.human.ex;

import java.util.*;
public class JavaStart15 {
	
	public static void main(String[] args) {
		//369����  3���� ������ ������ �ڼ�, 10�� ������� ����
		for(int i=1;i<100;i++) {
			if(i%10==0) {
				System.out.print(" ���� ");
				continue;
			}
			if(i>10&&i/10%10%3==0) {
				System.out.print(" ¦ ");
			}
			
			if(i%10%3==0) {
				System.out.print(" ¦ ");
			}else if(i>10&&i/10%10%3==0){
				
			}else {
				System.out.print(" "+i+" ");
			}
		}	
	}
}
