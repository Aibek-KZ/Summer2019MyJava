package day43_JavaRecap;

import java.util.Arrays;

public class  InstanceBlock{
	String[] names = new String[4];
	static String info="Info";
	
	public InstanceBlock() {//constructor
		System.out.println("Constructor");
		names[0] = "Aibek";
	}
	
    {
		System.out.println("instance block");
		names[0]="Rich";
		names[1]="Welth";
		names[2]="Health";
		names[3]="Great";
	}

	public static void main(String[] args) {
		
		System.out.println("Main method");
		
		InstanceBlock obj=new InstanceBlock();
		System.out.println(Arrays.toString(obj.names));
		System.out.println(info);//static
		
	
	}
}
