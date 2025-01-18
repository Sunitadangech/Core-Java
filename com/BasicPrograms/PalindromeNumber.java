package com.BasicPrograms;
//13)WAJP to check given number is Palindrome or Not.
public class PalindromeNumber {
public static void main(String[] args) {
	int num=1221;
	int temp=num;
	int rev=0;
	while(num!=0)
	{
		int digit=num%10;
		rev=rev*10+digit;
		num=num/10;
	}
	System.out.println(rev);
	System.out.println("num:"+num);
	System.out.println(temp);
	if(temp==rev)
	{
		System.out.println("Number is Palindrome");
	}
	else
	{
		System.out.println("Number is Not Palindrome");
	}
}
}
