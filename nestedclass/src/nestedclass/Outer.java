package nestedclass;

public class Outer {
	int a=10;
	void test() {
		Inner in=new Inner();
		in.display();
	}

class Inner{
	int b=200;
	void display() {
		System.out.println("outer A:"+a);
		System.out.println("inner B:"+b);
		}
}
	public static void main(String args[]) {
		Outer out=new Outer();
		out.test();
	}
}
