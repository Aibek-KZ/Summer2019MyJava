package InterviewQuestions;

public class Frequency_of_Characters {
	
//	 Write a return method that can find the frequency of characters
//   Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
	
	//solution 1:
	    public static String FrequencyOfChars(String str) {		
		String nonDup="";
		 for(int i=0; i < str.length(); i++) {
	       	if(!nonDup.contains(""+str.charAt(i))) {
		    nonDup+=""+str.charAt(i);
		 }
		}
		String expectedResult="";

		for(int j=0; j<nonDup.length(); j++) {
		int count = 0;
		      for(int i=0; i < str.length(); i++) {
		           if(str.charAt(i) == nonDup.charAt(j)) {
		              count++;
		         }
		}
		      expectedResult+=nonDup.charAt(j)+""+count;
		}		      
			return expectedResult;
		}
		
		//solution 2:
		public  static  String  FrequencyOfChars2(String str) {
		String expectedResult = "";
		int j=0;
			while( j < str.length()) {
			int count = 0;
			    for(int i=0; i < str.length(); i++) {
			        if(str.charAt(i) == str.charAt(j)) {
			count++;
			    }
			}
			    expectedResult +=str.charAt(j)+"" + count;
			    str = str.replace(""+str.charAt(j) ,  "" ); 
		 }
			return expectedResult;
		}
		
		public static void main(String[] args) {
			System.out.println(FrequencyOfChars("AAABBCDD"));
			System.out.println(FrequencyOfChars2("AAABBCDD"));
		}
}

