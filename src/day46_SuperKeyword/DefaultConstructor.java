package day46_SuperKeyword;

class B {
	public B(int a) { //default constructor
		System.out.println("super");
	}
}

public class DefaultConstructor extends B{
   //           sub              super
	public DefaultConstructor() {
		super(10);
		System.out.println("Sub");
	}
	
	public static void main(String[] args) {
		DefaultConstructor obj = new DefaultConstructor();
	}
}
