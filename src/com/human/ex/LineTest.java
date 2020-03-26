package com.human.ex;
class Line{
	public int line=0;
	public Line() {}
	public Line(int line) {
		this.line=line;
	}
	public boolean isSameLine(Line l) {
		if(this.line==l.line) {
			return true;
		}else {
			return false;
		}
	}
}
public class LineTest {

	public static void main(String[] args) {
		Line a=new Line(1);
		Line b=new Line(1);
		
		System.out.println(a.isSameLine(b));
		System.out.println(a==b);

	}

}
