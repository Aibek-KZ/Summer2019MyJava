package day53_InterfaceContinue;

interface B {
	void method3();
}

public interface Extends_VS_Implements extends B{
	//            subtype                 supertype
	void method1();//public
	void method2();//public

}

class A implements Extends_VS_Implements {
	
	public void method1() {
		
	}

	@Override
	public void method3() {
				
	}

	@Override
	public void method2() {
		
	}
}
