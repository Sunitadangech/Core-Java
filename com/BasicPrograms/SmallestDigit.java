package com.BasicPrograms;
//15)WAJP to identify Smallest Digit from the given number.
public class SmallestDigit {
public static void main(String[] args) {
	int num=3289;
	int small=num%10;
	num=num/10;
	while(num!=0)
	{
		int rem=num%10;
		if(small>rem)
		{
			small=rem;
		}
		num=num/10;
	}
	System.out.println("Smallest Digit is:"+small);
}
}
