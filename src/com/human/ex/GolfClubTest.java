package com.human.ex;
class GolfClub{
	public static String clubNumber=7+"�� ���̾�";
	public GolfClub() {}
	public GolfClub(int clubNumber) {
		this.clubNumber=clubNumber+"�� ���̾�";
	}
	public GolfClub(String clubNumber) {
		this.clubNumber=clubNumber;
	}
	public void print() {
		System.out.println(clubNumber+"�Դϴ�.");
	}
	
	
}
public class GolfClubTest {

	public static void main(String[] args) {
		GolfClub g1=new GolfClub();
		g1.print();
		
		GolfClub g2=new GolfClub(8);
		g2.print();
		
		GolfClub g3=new GolfClub("����");
		g3.print();

	}

}
