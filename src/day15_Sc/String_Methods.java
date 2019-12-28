package day15_Sc;

public class String_Methods {
	public static void main(String[] args) {
		
		String str="Cybertek";// has own index numbers
		//index number:01234567
		// charAt(index):
		System.out.println(str.charAt(7));
		char ch=str.charAt(4);
		System.out.println(ch);
		
		String str2="Mu htar";
		//index num: 0123456
		System.out.println(str2.charAt(3));
		
		//length(): returns the total number of characters as an int value
		String name="Donald J Trump";
		int n=name.length(); //just for counting characters
		System.out.println(name.length());//14
		
		//concat(): it takes a String and concats it to the String variable,
		//and then returns a NEW String value
		String s1="Cybertek";
		s1.concat(" School"); //attempt to modify String s1
		System.out.println(s1);// Cybertek,  String is immutable
		s1=s1.concat(" School");
		System.out.println(s1);
		
		//toUpperCase(): converts to upper case
		s1=s1.toUpperCase();
		System.out.println(s1);
		String N="cybertek";
		N=N.toUpperCase();
		System.out.println(N);
		
		//toLowerCase(): converts to lower case
		N=N.toLowerCase();
		String C="hello";
		System.out.println(N);
		C=C.toUpperCase();
		System.out.println(C);
		C=C.toLowerCase();
		System.out.println(C);
		System.out.println(C+N);
		
		/* 
		 charAt(index), length(), concate(Str), toUpperCase(), toLowerCase
		 */
		String a="Batch 12 Javengers";
	//index num   0123456789.....
		char ch1=a.charAt(14); //charAt() methods extract a specific character for and 
		//return it as a char value
		System.out.println(ch1);
		
		//length() method returns the total number of character in the string as an int value
		int length=a.length();
        System.out.println(length);	
        
        String b="Cybertek, ";
        b=b.concat("Batch 12 Javengers");
        System.out.println(b);
        
        //concat() method concats the value to the variable and then returns a New String value
	
        String d="book";
        System.out.println(d.toUpperCase());//BOOK)
        		
	
	}

}
