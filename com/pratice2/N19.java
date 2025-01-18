package com.pratice2;

public class N19 {
	public static void main(String[] args) {
		int num=50;
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(sum==num) {
			System.out.println(num+" This is a perfect number");
		}
		else {
		System.out.println(num+" This is not a perfect number");
		}
	}

}
