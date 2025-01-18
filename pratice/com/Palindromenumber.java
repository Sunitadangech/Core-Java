package pratice.com;

public class Palindromenumber {
	public static void main(String[] args) {
		int num=1221;
		int temp=num;
		int reverse=0;
		while(num!=0) {
			int digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
		}
		System.out.println(reverse);
		System.out.println("num:"+num);
		System.out.println(temp);
	      if(temp==reverse) {
	     	System.out.println("Palindrome");
	     }
	     else {
		   System.out.println("Not palindrome");
	     }
    }

}
