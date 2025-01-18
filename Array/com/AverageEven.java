package Array.com;
public class AverageEven {
	public static void main(String []args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int count=0;
		int avg=0;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				sum=sum+arr[i];
				count++;
			}
		}
		avg=sum/count;
		System.out.println(avg);
	}

}
