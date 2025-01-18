package com.BasicPrograms;
//11)WAJP to identify the Average of given number.
//if(t)
//s.o.pln("Hello");

//else
//s.o.pln("end");
//s.o.pln("Me");
public class AverageNumber {
	static int num=2143124;
    static int num2=num;
    static int sum=0;
    static double avg=0;
    static int count=0;
    public static void main(String[] args) {
	while(num!=0)
	{
		int last=num%10;
		num=num/10;
		count++;
		sum=sum+last;
		avg=sum/count;
	}
	System.out.println("Number:"+num2);
	System.out.println("Sum of digits of given number:"+sum);
	System.out.println("Average of given number is:"+avg);
}

}
