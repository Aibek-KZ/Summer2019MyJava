package InterviewQuestions;

public class RemoveDuplicates {
/*
 Write a return method that can remove the duplicated values from String
 Ex:  removeDup("AAABBBCCC")  ==> ABC
 */
	
	//	Solution 1:
			public static  String  removeDup( String  str) {				
			String result = "";			
			    for (int i = 0; i < str.length(); i++)			    	
			        if (!result.contains("" + str.charAt(i)))	//A		        	
			        result += "" + str.charAt(i);
			    return result;
			}			
			
			public static void main(String[] args) {				
				System.out.println(removeDup("AAABBBCCCCDD"));
			}
		}


