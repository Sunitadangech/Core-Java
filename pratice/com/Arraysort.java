package pratice.com;
import java.util.Arrays;
public class Arraysort {
	public static void main(String[] args) {
		int arr[]= {50,30,40,10,20};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("==========");
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("==========");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		
	}

}
