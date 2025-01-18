package com.BasicPrograms;
//20)WAJP to check the given number is perfect number or not.
import java.util.Scanner;
public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==num)
		{
			System.out.println(num+" is Perfect Number");
		}
		else
		{
			System.out.println(num+" is not Perfect Number");
		}
	}

}
