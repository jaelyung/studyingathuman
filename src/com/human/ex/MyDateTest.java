package com.human.ex;
class MyDate{
	private int day=0;
	private int month=0;
	private int year=0;
	public int getDay() {
		return this.day;
	}
	public int getMonth() {
		return this.month;
	}
	public int getYear() {
		return this.year;
	}
	public void setDay(int day) {
		this.day=day;
	}
	public void setMonth(int month) {
		this.month=month;
	}
	public void setYear(int year) {
		this.year=year;
	}
	public MyDate(int day, int month, int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public boolean isValid() {
		if(year>1900&&year<2200) {
			if(month>0&&month<=12) {
				switch(month) {
				case 1:
					if(day>0&&day<=31) {
						System.out.println("유효한 날짜입니다.");
						return true;
					
					}else {
						System.out.println("유효하지 않은 날짜 입니다.");
						return false;
					}
				case 2:
					if(day>0&&day<=28) {
						System.out.println("유효한 날짜입니다.");
						return true;
					
					}else {
						System.out.println("유효하지 않은 날짜 입니다.");
						return false;
					}
				case 3:
					if(day>0&&day<=31) {
						System.out.println("유효한 날짜입니다.");
						return true;
					
					}else {
						System.out.println("유효하지 않은 날짜 입니다.");
						return false;
					}
				case 4:
					if(day>0&&day<=30) {
						System.out.println("유효한 날짜입니다.");
						return true;
					
					}else {
						System.out.println("유효하지 않은 날짜 입니다.");
						return false;
					}
				case 5:
					if(day>0&&day<=31) {
						System.out.println("유효한 날짜입니다.");
						return true;
					
					}else {
						System.out.println("유효하지 않은 날짜 입니다.");
						return false;
					}
				case 6:
					if(day>0&&day<=30) {
						System.out.println("유효한 날짜입니다.");
						return true;
					
					}else {
						System.out.println("유효하지 않은 날짜 입니다.");
						return false;
					}
				case 7:
					if(day>0&&day<=31) {
						System.out.println("유효한 날짜입니다.");
						return true;
					
					}else {
						System.out.println("유효하지 않은 날짜 입니다.");
						return false;
					}
				case 8:
					if(day>0&&day<=31) {
						System.out.println("유효한 날짜입니다.");
						return true;
					
					}else {
						System.out.println("유효하지 않은 날짜 입니다.");
						return false;
					}
				case 9:
					if(day>0&&day<=30) {
						System.out.println("유효한 날짜입니다.");
						return true;
					
					}else {
						System.out.println("유효하지 않은 날짜 입니다.");
						return false;
					}
				case 10:
					if(day>0&&day<=31) {
						System.out.println("유효한 날짜입니다.");
						return true;
					
					}else {
						System.out.println("유효하지 않은 날짜 입니다.");
						return false;
					}
				case 11:
					if(day>0&&day<=30) {
						System.out.println("유효한 날짜입니다.");
						return true;
					
					}else {
						System.out.println("유효하지 않은 날짜 입니다.");
						return false;
					}
				case 12:
					if(day>0&&day<=31) {
						System.out.println("유효한 날짜입니다.");
						return true;
					
					}else {
						System.out.println("유효하지 않은 날짜 입니다.");
						return false;
					}
				}
			}else {
				System.out.println("유효하지 않은 날짜 입니다.");
				return false;
			}
		}
		System.out.println("유효하지 않은 날짜 입니다.");
		return false;
	}
}
public class MyDateTest {

	public static void main(String[] args) {
		MyDate date1=new MyDate(30, 2, 2000);
		System.out.println(date1.isValid());
		MyDate date2=new MyDate(2, 10, 2006);
		System.out.println(date2.isValid());

	}

}
