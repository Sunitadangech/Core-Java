package com.BasicPrograms;
//14)WAJP to identify Largest Digit from the given number.
import java.util.Scanner;
public class LargestNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		//int num1=1376;
		int large=num%10;
		num=num/10;
		while(num!=0)
		{
			int rem=num%10;
			if(large<rem)
			{
				large=rem;
			}
			num=num/10;
		}
		System.out.println("Largest Digit is:"+large);
	}

}
