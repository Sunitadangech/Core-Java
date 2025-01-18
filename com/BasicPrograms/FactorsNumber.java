package com.BasicPrograms;
//16)WAJP to identify Factors of given number.
import java.util.Scanner;
public class FactorsNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		System.out.println("Factors of given number are:");
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
			}
		}
	}

}
