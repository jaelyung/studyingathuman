package com.human.ex;
class GolfClub{
	public static String clubNumber=7+"번 아이언";
	public GolfClub() {}
	public GolfClub(int clubNumber) {
		this.clubNumber=clubNumber+"번 아이언";
	}
	public GolfClub(String clubNumber) {
		this.clubNumber=clubNumber;
	}
	public void print() {
		System.out.println(clubNumber+"입니다.");
	}
	
	
}
public class GolfClubTest {

	public static void main(String[] args) {
		GolfClub g1=new GolfClub();
		g1.print();
		
		GolfClub g2=new GolfClub(8);
		g2.print();
		
		GolfClub g3=new GolfClub("퍼터");
		g3.print();

	}

}
