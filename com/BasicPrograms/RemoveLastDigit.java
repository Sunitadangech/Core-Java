package com.BasicPrograms;
//04)WAJP to remove last digit from the given number.
import java.util.Scanner;
public class RemoveLastDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int num=sc.nextInt();
		num=num/10;
		System.out.println(num);
	}

}
