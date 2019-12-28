package day45_Protected_Default;

import day45_Inheritance.Protected_VS_Default;

public class Test extends Protected_VS_Default{
	public static void main(String[] args) {
		
		//Protected_VS_Default obj = new Protected_VS_Default();
		//obj.printHello(); protected access modifier is not visible outside the package
		//obj.printHola(); default access modifier is not visible outside the package
		//System.out.println(obj.name); protected access modifier
		//System.out.println(obj.ID); protected access modifier
		
		Test obj = new Test();
		System.out.println(obj.name);
		//System.out.println(obj.ID); default
		obj.printHello();
	
		
		
	}

}
