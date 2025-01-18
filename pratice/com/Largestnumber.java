package pratice.com;

public class Largestnumber {
	public static void main(String[] args) {
		int num=12345;
		int num1=num%10;
		num=num/10;
		while(num!=0) {
			int rem=num%10;
			if(num1<rem) {
				num1=rem;
			}
			num=num/10;
		}
		System.out.println(num1);
	}

}
