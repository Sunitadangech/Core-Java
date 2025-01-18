package com.BasicPrograms;
//21)WAJP to check whether the given numberis Strong Number or weak Number.
public class StrongNumber {
public static void main(String[] args) {
	int num=145;
	int sum=0;
	int temp=num;
	while(num!=0)
	{
		int rem=num%10;
		int factorial=1;
		for(int i=1;i<=rem;i++)
		{
			factorial=factorial*i;
		}
		sum=sum+factorial;
		num=num/10;
	}
	if(temp==sum)
	{
		System.out.println("Strong Number");
	}
	else
	{
		System.out.println("Weak Number");
	}
}
}
