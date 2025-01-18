package com.pratice2;

public class n7 {
	static int num=12345;
	static int sum=0;
	public static void main(String[] args) {
		while(num!=0) {
			int num1=num%10;
			num=num/10;
			sum=sum+num1;
		}
		System.out.println(sum);
	}

}


