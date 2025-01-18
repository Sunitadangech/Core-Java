package Array.com;
import java.util.Scanner;
public class sumArray {
	public static void main(String [] args) {
		int count=0;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size:");
		int size=sc.nextInt();
		int []arr=new int[size];
		System.out.println("Enter the Element:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("==========");
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
