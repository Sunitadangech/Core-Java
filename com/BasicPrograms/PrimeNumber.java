package com.BasicPrograms;
//18)WAJP to check the given Number is Prime or Not.
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(num+" is a prime number");
		}
		else
		{
			System.out.println(num+" is a not prime number");
		}
	}

}
