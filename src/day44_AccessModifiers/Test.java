package day44_AccessModifiers;
import static day44_AccessModifiers.Testdata.*;
//import static day44_AccessModifiers.Testdata.ID;// ID or * can import all variables
//import static day44_AccessModifiers.Testdata.Name;//access without using class name
//              packagename  classname.staticName
public class Test {
	
	public static void main(String[] args) {
		
		System.out.println(Testdata.Name);
		System.out.println(Name);
		System.out.println(ID);
		System.out.println(Salary);
		System.out.println(SchoolName);
		
		System.out.println(age);//only accessible inside the package
		System.out.println(cash);
		
		defaultAccessModifier obj = new defaultAccessModifier();
		System.out.println(obj.namePublic);
		System.out.println(obj.nameDefault);
	//	System.out.println(obj.namePrivate); private is not visible
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
