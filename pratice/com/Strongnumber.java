package pratice.com;

public class Strongnumber {
	public static void main(String[] args) {
		int num=135;
		int sum=0;
		int temp=num;
		while(num!=0) {
			int rem=num%10;
			int fact=1;
			for(int i=1;i<=rem;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("Strong number");
		}
		else {
			System.out.println("Weak number");
		}
	}

}
