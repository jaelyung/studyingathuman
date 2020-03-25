package com.human.ex;
class Printer{
	private int numOfPapers=0;
	private boolean duplex;
	
	
	public Printer() {}
	public Printer(int numOfPapers, boolean duplex){
		this.numOfPapers=numOfPapers;
		this.duplex=duplex;
	}
	void print(int amount) {
//		if(numOfPapers-amount>=0) {
//			numOfPapers=numOfPapers-amount;
//			System.out.println(amount+"장 출력했습니다. 현재 "+numOfPapers+"장 남아있습니다.");
//		}else if(numOfPapers==0){
//			System.out.println("용지가 없습니다.");
//		}
//		else {
//			System.out.println("모두 출력하려면 용지가 "+Math.abs(numOfPapers-amount)+"매 부족합니다. "+numOfPapers+"장만 출력합니다.");
//			numOfPapers=0;
//			System.out.println("용지가 없습니다.");
//		}
//		if(numOfPapers==0){
//			System.out.println("용지가 없습니다.");
//		}
		if(numOfPapers>(Math.round(amount/2+0.5))) {
			if(duplex==true) {
				numOfPapers=numOfPapers-(int)Math.round(amount/2+0.5);
				System.out.println("양면으로 "+Math.round(amount/2+0.5)+"장 출력했습니다. 현재"+numOfPapers+"장 남아있습니다.");
			}else {
				if(numOfPapers>amount) {
					System.out.println("단면으로 "+amount+"장 출력했습니다.");
					numOfPapers=numOfPapers-amount;
				}else {
					System.out.println("단면으로 모두 출력하려면 용지가 "+Math.abs(numOfPapers-amount)+"매 부족합니다. "+numOfPapers+"장만 출력합니다.");
					numOfPapers=0;
				}
			
			}
		}

	}
	public int getNumOfPapers() {
		return this.numOfPapers;
	}
	public boolean getDuplex() {
		return this.duplex;
	}
	public void setDuplex(boolean duplex) {
		this.duplex=duplex;
	}
}
public class PrinterTest {
	public static void main(String[] args) {
		//Printer 클래스를 테스트하는 코드
//		Printer p=new Printer(20);
//		p.print(20);
//		p.print(10);
//		System.out.println(p.getNumOfPapers());
		Printer p=new Printer(20, true);
		p.print(25);
		System.out.println(p.getNumOfPapers());
		p.setDuplex(false);
		p.print(5);
		System.out.println(p.getNumOfPapers());
		
	}

}
