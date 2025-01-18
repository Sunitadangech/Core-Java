package com.pratice2;

public class n9 {
	public static void main(String[] args) {
		int num=12345;
		int count=0;
		int rem;
		while(num!=0) {
			int num1=num%10;
			if(num1%2!=0) {
			System.out.println(num1);
			}
		 num=num/10;
		}
	}

}



