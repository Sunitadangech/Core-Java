package pratice1;

public class StringtoArray {
	public static void main(String []args) {
		String s1="Java";
		char[] ch=new char[s1.length()];
		for(int i=0;i<s1.length();i++) {
		ch[i]=s1.charAt(i);
		}
		System.out.println(ch.length);
		
	}

}
