package com.BasicPrograms;
//19)WAJP to print Sum Of Factors Of a given Number.
public class SumOfFactors {
	public static void main(String[] args) {
		int num=6;
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

}
