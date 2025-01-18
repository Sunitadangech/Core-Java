package com.pratice2;

public class p6 {
	public static void main(String[] args) {
		String str="Java";
		char ch[]=new char[str.length()];
		for(int i=0;i<str.length();i++) {
			ch[i]=str.charAt(i);
		}
		System.out.println(ch.length);
	}

}
