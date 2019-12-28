package day05_Recap;

public class Concatenation {

	/* String: represents the sequences of characters, used for string text
	 * String values are surrendered by a double quote
	 * 
	 * Concatination, combining, linking things togather
	 * We can concate any value to String
	 */	
	public static void main(String[] args) {
	
		String str = "any text goes here";
		System.out.println(str);
		
		String str2 = "1";
		System.out.println(str2);
		
		String Hello = "Hello World!! ";
				System.out.println(Hello);
				
				String myName = "Cybertek" + " School";
				System.out.println(myName);
				String Year = "This is " + 2019;
				System.out.println(Year);
				
				String name = "Adiya ";
				String lastname = "Dauletkeldi ";
				System.out.println("About me: " + name + lastname + Hello);
				
				String newstr = "100" + 10;
				System.out.println(newstr);// 10010
				System.out.println(1+2+3); //6
				System.out.println("1" + 2 +3); //123
				// System.out.println("1"+1-3);// "11"-3 error
				System.out.println("Batch 12"+1+2); //Batch 1212
				System.out.println(2-1+1+"4"); //1+1+"4"=> 24
				System.out.println("Batch 12"+(1+2)); //Batch 123
				System.out.println(1+"123"+4+5); //112345
				System.out.println("123"+(4+5));//1239
				System.out.println(1+("1"+2));//112
				System.out.println("Batch"+3+(9+2+1));//Batch312
				System.out.println(4+3-(9+3));//-5
				System.out.println("hello");
				
	}
	
	
}
