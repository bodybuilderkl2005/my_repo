package strbufferclass;

public class X {
	public static void main(String args[]) {
		StringBuffer sb=new StringBuffer("Welcome to mnit");
		System.out.println("Length=:"+sb.length());
		sb.setCharAt(8, '2');
		sb.setCharAt(9, '2');
		System.out.println("String length is:"+sb);
		sb.deleteCharAt(0);
		sb.deleteCharAt(0);
		sb.deleteCharAt(0);
		System.out.println("String length is:"+sb);
	}

}
