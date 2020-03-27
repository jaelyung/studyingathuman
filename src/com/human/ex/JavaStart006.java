package com.human.ex;
import java.util.*;
public class JavaStart006 {
	public static String stringFunc(String a) {
		String s=null;
		s=a+"하세요";
		return s;
	}
	
	public static void main(String[] args) {
		//3. 매개변수와 리턴값이 String
		String s="안녕";
		s=stringFunc(s);
		System.out.println(s);
		
		
	}

}
