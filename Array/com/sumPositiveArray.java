package Array.com;
import java.util.Scanner;
public class sumPositiveArray {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size:");
		int size=sc.nextInt();
		int []arr=new int[size];
		System.out.println("Enter the Element:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Main:"+returnPositiveElements(arr));
	}
		public static int returnPositiveElements(int []a) {
			int sum=0;
			for(int i=0;i<a.length;i++) {
				if(a[i]>0) {
					sum=sum+a[i];
				}
			}
			return sum;
		
		
	}

}
