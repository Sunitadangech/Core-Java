package com.pratice2;

public class N14 {
	public static void main(String[] args) {
		int num=12345;
		int small=num%10;
		while(num!=0) {
			int rem=num%10;
			if(small>rem) {
				small=rem;
			}
			num=num/10;
		}
		System.out.println(small);
	}

}
