package pratice.com;

public class HighestElement {
	public static void main(String []args) {
		int[]arr= {4,5,3,6,2,7,8};
		int highest=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>highest) {
				highest=arr[i];
			}
		}
		System.out.println(highest);
	}

}
