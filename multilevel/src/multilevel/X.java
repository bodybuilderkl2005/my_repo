package multilevel;

public class X {
	public int a;
	private int b;
	protected int c;
	X(){
		a=10;
		b=20;
		c=30;
	}
void show() {
	System.out.println("I'm in X class");
	System.out.println(" B is private varibale:"+b);
	System.out.println(" C is protected variable:"+c);
	
}
}
class Y extends X{
	void print() {
		System.out.println("I'm in Y class");
		System.out.println(" A is public varibale:"+a);
		System.out.println(" C is protected variable:"+c);
		
	}
}
class Z extends Y{
	void disp() {
		System.out.println("I'm in Z class");
		System.out.println(" A is public varibale:"+a);
		System.out.println(" C is protected variable:"+c);
		}

public static void main(String args[]) {
	X x1=new X();
	x1.show();
	Y y1=new Y();
	y1.print();
	Z z1=new Z();
	z1.disp();
	}
	
}