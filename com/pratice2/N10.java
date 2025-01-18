package com.pratice2;

public class N10 {
	static int num=1324536;
	static int num1=num;
	static int count=0;
	static int sum=0;
	static double avg=0;
	public static void main(String[] args) {
		while(num!=0) {
			int last=num%10;
			num=num/10;
			count++;
			sum=sum+last;
			avg=sum/count;
		}
		System.out.println(num1);
		System.out.println(sum);
		System.out.println(avg);
	}

}





