package wapper;

import java.io.*;
public class X {

	public static void main(String[] args) throws IOException {
		DataInputStream d= new DataInputStream(System.in);
		System.out.println("Enter Principle amount:");
		String s=d.readLine();
		Double p=Double.parseDouble(s);
		System.out.println("Enter Time in Years");
		s=d.readLine();
		Float t=Float.parseFloat(s);
		System.out.println("Enter rate of interst");
		s=d.readLine();
		int r=Integer.parseInt(s);
		double is=(p*t*r)/100;
		System.out.println("Simple Interset is:"+is);
		
	}

}
