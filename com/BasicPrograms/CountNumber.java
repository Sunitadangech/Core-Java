package com.BasicPrograms;
//07)WAJP to Count Number of Digit of a given number.
public class CountNumber {
	public static void main(String[] args) {
		int num=12345;
		int count=0;
		while(num!=0)
		{
			int rem=num%10;
			count++;
			num=num/10;
		}
		System.out.println(count);
	}

}
