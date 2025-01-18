package com.pratice2;

public class N11 {
	public static void main(String[] args) {
		int num=12345;
		int reverse=0;
		while(num!=0) {
			int num1=num%10;
			reverse=reverse*10+num1;
			num=num/10;
		}
		System.out.println(reverse);
	}

}
