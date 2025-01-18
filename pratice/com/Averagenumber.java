package pratice.com;

public class Averagenumber {
	public static void main(String[] args) {
		int num=12345;
		int avg=0;
		int sum=0;
		int count=0;
		while(num!=0) {
			int last=num%10;
			num=num/10;
			count++;
			sum=sum+last;
			avg=sum/count;
		}
		System.out.println("avg "+avg);
//		System.out.println("sum "+sum);
//		System.out.println("num "+num);
	}

}
