package pratice.com;

public class Positivenagative {
	public static void main(String[] args) {
		int arr[]= {1,-2,-3,4,-5,6,-7,8,-9};
		int positive=0;
		int negative=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=0) {
				positive++;
			}
			else{
				negative++;
			}
		}
		System.out.println(positive);
		System.out.println(negative);
	}

}
