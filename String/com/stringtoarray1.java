package String.com;

public class stringtoarray1 {
	public static void main(String []args) {
		String s="Java";
		char []ch=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			ch[i]=s.charAt(i);
		}
		System.out.println(ch.length);
	}

}
