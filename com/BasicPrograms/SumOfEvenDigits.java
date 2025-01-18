package com.BasicPrograms;
//03)WAJP to Sum of even Digits in given Number.
public class SumOfEvenDigits {
	public static void main(String[] args) {
		int num=1234;
		int even=0;
		while(num!=0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
				even=even+rem;
			}
			num=num/10;
		}
		System.out.println(even);
	}

}
