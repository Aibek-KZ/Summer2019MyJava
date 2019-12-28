package day41_initializerBlocks;

public class staticBlock {
	
	public staticBlock() {
		System.out.println("Constructor");
	}
	
	static {
		System.out.println("static block 1");
	//	System.out.println("static block B");
	}
	
	public static void main(String[] args) {
		
		staticBlock obj1=new staticBlock();
		staticBlock obj2=new staticBlock();
		staticBlock obj3=new staticBlock();
		staticBlock obj4=new staticBlock();

		System.out.println("Main method");
	}
	static {
		System.out.println("static block 2");
	}
	static {
		System.out.println("static block 3");
	}
	

	}


