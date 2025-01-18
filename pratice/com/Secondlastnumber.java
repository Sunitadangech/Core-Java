package pratice.com;

public class Secondlastnumber {
	public static void main(String[] args) {
		int num=12345;
		int last=num%10;
		num=num/100;
		num=num*10+last;
		System.out.println(num);
		
	}

}
