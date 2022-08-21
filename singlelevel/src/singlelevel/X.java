package singlelevel;

public class X {
	int a;
	X(){
		a=10;
	}
void show() {
	System.out.println("base class:"+a);
}
}
class Y extends X{
	int b;
	Y(){
		b=200;
	}
void show() {
	System.out.println("Derived class:"+b);
}
}
 class S{
	public static void main(String args[]) {
		Y y1=new Y();
		y1.show();
		X x1=new X();
		x1.show();
	}
}