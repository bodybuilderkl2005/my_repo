package stringclass;
import java.io.*;
public class X {
	public static void main(String args[]) throws IOException {
		DataInputStream d= new DataInputStream(System.in);
		System.out.println("Enter First String=");
		String s1=d.readLine();
		System.out.println("Enter Second String=");
		String s2=d.readLine();
		System.out.println("trim=:"+s1.trim());
		System.out.println("Lower Case="+s1.toLowerCase());
		System.out.println("Upper Case=:"+s1.toUpperCase());
		System.out.println("Length=:"+s1.length());
		System.out.println("Enter First String=:"+s1);
		System.out.println("Enter Second String=:"+s2);
		if (s1.compareTo(s2)==0) 
		{
			System.out.println("Both String are Same");
		}
		else {
			System.out.println("Both are not Same");
		}
		System.out.println("After Contact=:"+s1.concat(s2));
	}

}
