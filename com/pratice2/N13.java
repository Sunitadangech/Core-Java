package com.pratice2;

public class N13 {
	public static void main(String[] args) {
		int num=12345;
		int large=num%10;
		while(num!=0) {
			int rem=num%10;
			if(large<rem) {
				large=rem;
			}
			num=num/10;
		}
		System.out.println(large);
	}

}
