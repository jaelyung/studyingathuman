package com.human.ex;
import java.util.*;
public class JavaStart007 {
	public static int[] intArrFunc(int arr[]) {
		int rArr[]=arr;
		rArr[0]=rArr[0]+1;
		
		return rArr;
	}
	
	
	public static void main(String[] args) {
		//�迭
		//int[]arr1=new int[2];
		int[]arr1= {1,1};
		int[]arr2;
		arr2=intArrFunc(arr1);
		System.out.println(arr1[0]);//arr1�� ���� �ٲ�� ����
		System.out.println(arr2[0]);
		
	}

}
