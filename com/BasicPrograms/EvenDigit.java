package com.BasicPrograms;
//09)WAJP to print even digit from the given number.
public class EvenDigit {
public static void main(String[] args) {
	int num=2143124;
	int count=0;
	while(num!=0)
	{
		int num1=num%10;
		if(num1%2==0)
		{
			System.out.println(num1);
		}
		num=num/10;
	}
}
}
