package day41_initializerBlocks;

public class instanceBlock {
	{
		System.out.println("instance block 1");
	}
	{
		System.out.println("instance block 2");
	}
	{
		System.out.println("instance block 3");
	}
	public instanceBlock() {
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		
		instanceBlock obj1=new instanceBlock();
	//	instanceBlock obj2=new instanceBlock();
	//	instanceBlock obj3=new instanceBlock();

		
		
	}

}
