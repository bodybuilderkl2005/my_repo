package aa;

public class X {
	int a,b;
	X()
	{
		a=10;
		b=20;
	}
X(int x,int y){
	a=x;
	b=y;
}
void show() {
	System.out.println("A=:"+a);
	System.out.println("B=:"+b);
	}

public static void main(String args[]) {
	System.out.println("Default");
	X x1=new X();
	x1.show();
	System.out.println("Paramater");
	X x2=new X(100,200);
	x2.show();
	
}
}