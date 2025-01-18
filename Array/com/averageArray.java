package Array.com;
import java.util.Scanner;
public class averageArray {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size:");
		int size=sc.nextInt();
		int [] arr=new int [size];
		System.out.println("Enter the Element:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Main:"+returnAvg(arr));
	}
	
	public static int returnAvg(int[]a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		int avg=sum/a.length;
		return avg;
	}

}
