package day17_StringClass;

public class newStringMethods {
public static void main(String[] args) {
	
	/*
	 trim: it's used for removing the unused spaces returns a new String value
	 */
	String s1="               hello                  ";
	 s1.trim();
	 System.out.println(s1);
	 s1=s1.trim();
	 System.out.println(s1);//removed because space is unused
	 String s2="Cybertek                School";
			 s2=s2.trim();
	 System.out.println(s2);//this space is used, wan't removed
	 String s4="       Cybertek       school";
	 s4=s4.trim();
	 System.out.println(s4);
	 
	 //substring(beginning index): it creates sub value of the String from the beginning index
	 //till the last index and returns it as a New  String value
	 String str="Cybertek school";
	 str=str.substring(9);
	 System.out.println(str);
	 
	 String address="McLean, VA 22000";
	 String zip=address.substring(11);
	 System.out.println(zip);
	 
	 /* substring(beginning index, ending index): it creates the sub value of the String from
	  the beginning index till the ending index(ending index num will be excluded)
	  then returns it as a NEW String value
	 */
	 String name="Hello Cybertek school";
	 name=name.substring(6,14);//13+1 because ending index will be excluded
	 System.out.println(name);
	 
	 String fullName="Cybertek school Batch12";
	 String middleName=fullName.substring(9, 15);
	 System.out.println(middleName);
	 
	 
	 
	 
}
}
