package pratice.com;

public class Averagearray {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int avg=0;
		int sum=0;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			count++;
		}
		avg=sum/count;
		System.out.println(avg);
	}

}

