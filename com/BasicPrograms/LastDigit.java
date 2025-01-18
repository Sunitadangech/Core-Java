package com.BasicPrograms;
//01)Extract last digit from the given number using Scanner class.
import java.util.Scanner;

public class LastDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		num=num%10;
		System.out.println(num);
	}

}
