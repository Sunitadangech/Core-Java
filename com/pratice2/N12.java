package com.pratice2;

public class N12 {
	public static void main(String[] args) {
		int num=121;
		int temp=num;
		int reverse=0;
		while(num!=0) {
			int digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
		}
		//System.out.println(num);
		System.out.println(reverse);
		//System.out.println(num);
		//System.out.println(temp);
		
		if(temp==reverse) {
			System.out.println("This is Palindrome number");
		}
		else {
			System.out.println("This is not palindrome number");
		}
	}

}
