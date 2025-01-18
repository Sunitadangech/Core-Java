package pratice.com;

public class AverageEven {
	public static void main(String []args) {
		int[]arr= {1,2,3,4,5,6,7,8,9};
		int sum=0;
		int count=0;
		int average = 0;
		for(int num:arr) {
			if(num%2==0) {
				sum+=num;
				count++;
				
			}
		}
		if(count!=0) {
			average=sum/count;
		}
		System.out.println(average);
	}

}
