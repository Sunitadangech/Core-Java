package pratice.com;

public class Perfectnumber {
	public static void main(String[] args) {
		int num=6;
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(sum==num) {
			System.out.println(num+" Perfect number");
		}
		else {
			System.out.println(num+" Is not perfect number");
		}
	}

}
