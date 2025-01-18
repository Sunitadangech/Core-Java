package pratice.com;

public class Sumnumber {
	public static void main(String[] args) {
		int num=12345;
		int sum=0;
		while(num!=0) {
			int last=num%10;
			num=num/10;
			sum=sum+last;
		}
	System.out.println(sum);
	}

}
