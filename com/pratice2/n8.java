package com.pratice2;

public class n8 {
	public static void main(String[] args) {
		int num=123456;
		int count=0;
		while(num!=0) {
			int num1=num%10;
			if(num%2==0) {
				System.out.println(num1);
			}
			num=num/10;
		}
		
	}
}
