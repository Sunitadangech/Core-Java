package BasicProgram;
import java.util.Scanner;
public class extractLastDigit {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value:");
		int num=sc.nextInt();
		int res=returnLastDigit(num);
		System.out.println(res);
	}
	public static int returnLastDigit(int num) {
		num=num%10;
		return num;
	}

}
