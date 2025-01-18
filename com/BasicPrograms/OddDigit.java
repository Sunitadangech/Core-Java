package com.BasicPrograms;
//10)WAJP to print Odd Digit from the given number.
public class OddDigit {
	public static void main(String[] args) {
		int num=2143124;
		int count=0;
		int rem;
		while(num!=0)
		{
			int num1=num%10;
			if(num1%2!=0)
			{
				System.out.println(num1);
			}
			num=num/10;
		}
	}

}
