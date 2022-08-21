package subclass;

public class X {
	int a;
	X(){
		a=10;
	}
}
class Y extends X{
	int b;
	Y(){
		b=200;
	}
void show() {
	System.out.println("Base Class:"+a);
	System.out.println("Derived Class:"+b);
	}
public static void main(String args[]) {
	Y y1=new Y();
	y1.show();
}
}