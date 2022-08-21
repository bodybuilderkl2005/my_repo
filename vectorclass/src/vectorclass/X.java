package vectorclass;
import java.util.*;
public class X {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.addElement(1);
		v.addElement(2);
		v.addElement("Bapuji");
		v.addElement("Polytechnic");
		v.addElement("Dvg");
		System.out.println("Vector:"+v);
		int len=v.size();
		System.out.println("before Add:"+len);
		v.addElement("Karanatakaaa");
		len=v.size();
		System.out.println("After add:"+len);
		System.out.println("Vector:"+v);
	}

}
