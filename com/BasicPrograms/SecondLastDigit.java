package com.BasicPrograms;
//06)Remove Second Last Digit and print the remaining numbers from the given number.
public class SecondLastDigit {
	public static void main(String[] args) {
		int num=7819;
		int last=num%10;
		num=num/100;
		num=num*10+last;
		System.out.println(num);
	}

}
