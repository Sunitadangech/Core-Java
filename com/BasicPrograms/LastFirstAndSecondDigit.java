package com.BasicPrograms;
//05)Extract Last First And Second Digit from given number.
public class LastFirstAndSecondDigit {
	public static void main(String[] args) {
		int num=12345;
		int rem=num%10;
		System.out.println("Last First Digit:"+rem);
		num=num/10;
		rem=num%10;
		System.out.println("Last Second Digit:"+rem);
	}

}
