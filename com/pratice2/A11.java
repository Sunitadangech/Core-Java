package com.pratice2;

public class A11 {
	public static void main(String[] args) {
		int arr[]= {1,-2,3,-4,5,-6,7,8,-9};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);
	}

}
