package day29_ReturnMethods;

public class WarmUp {
	 /*
    Warm up:
   1. write a method that can find the frequency of characters in String.
   Ex: 
       FrequencyTest("XXXYYYZZZ")
       output: X3Y3Z3
       FrequencyTest("AAABBBBBCCCC")
       output: A3B5C4
      */ 
    
   public static void main(String[] args) {
       
       String str = "aabbaaabbbcccccDDaaEEE";
       
           //    expected result:   a5b5c5D2
               // letters:  "abcd"
       
       String RemoveDup = "";  // to store the non duplicated values of the str
       for(int i=0; i < str.length(); i++) {
           if( ! RemoveDup.contains( str.substring(i, i+1)) ) {
               RemoveDup += str.substring(i, i+1);
           }
       }
       
       System.out.println(RemoveDup);
       
       //    str = "aabbaaabbbcccccDD";     RemoveDup = "abcd";
                                             //          j, j+1
                                                   
       //           (1, 2)
       //           result = a5b5c5D2
       
       String result ="";  // to store the expected result
       
       
   for(int j=0; j < RemoveDup.length(); j++) {
       int count =0;  // count the numbers of apperances
       for(int i=0; i < str.length(); i++) {
           if( str.substring(i, i+1).equals( RemoveDup.substring(j, j+1)) ) {
               count++;
           }
       }
           result += RemoveDup.substring(j, j+1) + count;
           
       }
           
           System.out.println(result);
           
           
//===============================================================          
   
           String input = "XXXYYYZZZ";
           // expected result:           "X3Y3Z3"
                   //  letters:  "XYZ"
           
           String nonDuplicates = "";  // remove the duplicates from input, and store it
                   //  "XYZ" 
           
           for(int i=0; i < input.length(); i++) {
               if( ! nonDuplicates.contains( ""+input.charAt(i) )  ) {
                   
                   nonDuplicates += ""+input.charAt(i);
                   
               }
           }
           
           System.out.println(nonDuplicates);
           
           //  input = "XXXYYYZZZ";      nonDuplicates ="XYZ";
                               //                          (0,1) ==> (j, j+1)
                                                           
           
           //          expectedResult = "X3Y3Z3"
           String expectedResult="";
           
       for(int j = 0; j<nonDuplicates.length(); j++) {
           
           int times = 0;  // count the occurence of X
           for(int i=0; i < input.length(); i++ ) {
               if( input.charAt(i)  == nonDuplicates.charAt(j)  ) {
                   // input.substring(i, i+1).equals(nonDuplicates.substring(j,j+1))
                   times++;
               }
           }
           expectedResult += ""+nonDuplicates.charAt(j) +times;
                       //  nonDuplicates.substring(j,j+1)
           
           
   }
           
           
           System.out.println(expectedResult);
          
           
           
           
            }

}
