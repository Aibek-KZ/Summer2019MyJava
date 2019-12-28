package day53_InterfaceContinue;

public interface Interface_VS_Abstactions {
	
	public abstract void method1();
	public abstract int method2();
	
	void method3(); //public
	void method4();
	
	public default void mm() {
		
	}
	int a = 10;
	
	public static void main(String[] args) {
		System.out.println(a);
	}
}

class Test implements Interface_VS_Abstactions{
	
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int method2() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		
	}
	
}

