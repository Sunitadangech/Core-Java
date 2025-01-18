package com.BasicPrograms;
//08)Sum Of Digits in given number. 
public class SumOfDigit {
	static int num=2143124;
	static int Sum=0;
	public static void main(String[] args) {
		while(num!=0) {
			int last=num%10;
			num=num/10;
			Sum=Sum+last;
		}
		System.out.println(Sum);
	}

}
