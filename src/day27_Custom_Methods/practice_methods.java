package day27_Custom_Methods;

public class practice_methods {

public static void main(String[] args) {
	
	RemoveDuplicates("breadjambread");
}
	//Remove Duplicates from the string
	public static void RemoveDuplicates(String str) {
		
		String result="";
		
		for(int i=0; i<str.length(); i++) {
			if(!result.contains(str.substring(i, i+1))) {
				result+=str.substring(i, i+1);
			}
		}
		System.out.println(result);
	}
	
}
