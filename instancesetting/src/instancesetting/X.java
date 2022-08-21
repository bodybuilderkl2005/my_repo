
package instancesetting;

public class X {
	int a,b;
	void test(int x,int y) {
	a=x;
	b=y;
	}
void show() {
	System.out.println("Value of a:"+a);
	System.out.println("Value of b:"+b);	
	}
}
class A{
	public static void main(String args[]) {
		X x1=new X();
		x1.test(10,200);
		x1.show();
	}
}