package day23_Arrays;

public class warmUp2 {
public static void main(String[] args) {
	// write a programm that can find the unique characters from a String
	
	String str="AAABCDEEFFGHHHJKKKKLOOP";
	String unique="";
	
	for(int j=0; j<str.length(); j++) {
	int count=0; //count how many times characters is appeared
	
	  for(int i=0; i<str.length(); i++) {
		  //highest value of i: str.length()-1
		//if(str.substring(i, i+1).equals(""+str.charAt(j))) { //try to use substring instead charAt
			if(str.substring(i, i+1).equals(str.substring(j, j+1))) {
			count++;
		}
	}
	    if(count==1) {
		  unique+=""+str.charAt(j);
	  }
	}
	System.out.println(unique);
}
}
