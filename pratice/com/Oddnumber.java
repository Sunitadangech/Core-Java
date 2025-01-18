package pratice.com;

public class Oddnumber {
	public static void main(String[] args) {
		int num=12345;
		int count=0;
		while(num!=0) {
			int num1=num%10;
			if(num%2!=0) {
				System.out.println(num1);
			}
			num=num/10;
		}
	}

}
