package pratice.com;

public class Countnumber1 {
	public static void main(String[] args) {
		int num=12345;
		int count=0;
		while(num!=0) {
			int rem=num%10;
			count++;
			num=num/10;
		}
		System.out.println(count);
	}

}
