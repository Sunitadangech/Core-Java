package pratice.com;

public class Sumelement {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int sum=0;
		//int count=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
