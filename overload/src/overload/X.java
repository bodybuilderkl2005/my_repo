package overload;

public class X {
	void add() {
		int a=10;
		int b=20;
		int c;
		c=a+b;
		System.out.println(c);
	}
void add(int x,int y) {
	int c;
	c=x+y;
	System.out.println(c);
	}
void add(int x,double y) {
	double c;
	c=x+y;
	System.out.println(c);
	}

public static void main(String args[]) {
	X x1=new X();
	x1.add();
	x1.add(10, 20);
	x1.add(10, 20.0);
}
}