package day28_Java_Recap;

public class warmUp_mine {
public static void main(String[] args) {
	
	SumOfNumbers(45, 87, 128);
	GreaterNumber(248, 241.5);
	Age(1986);
	DivideWithoutOperator(100, 9);
	DuplicateValues("mycarcar");
	MaxArray(45);
	UniqeCharacters("car is car car is fun");
	ReverseText("Java is Fun");
	MergeString("aaaaa", "bbbbb");
}
	
	public static void SumOfNumbers(int num1, int num2, int num3) {
		/*
	Write a method that calculates the sum of 3 numbers
    Ex: sum(10, 20, 30) ==> 60
    */
		System.out.println("Sum of "+num1+" and "+num2+" and "+num3+" is "+(num1+num2+num3));
	} 
	
    
	public static void GreaterNumber(double n1, double n2) {
    	/*
    	  Write a method that shows the grater number from 2 numbers
            Ex: GreaterNum(10, 20) ==> 20
    	 */
    	if(n1>n2) {
    		System.out.println(n1+" is greater than "+n2);
    	} else if(n2>n1) {
    		System.out.println(n2+" is bigger than "+n1);
    	} else {
    		System.out.println(n1+" and "+n2+" are equal");
    	}
    	
    }
	
	public static void Age(int year) {
		/*
		  Write a method that accepts birthyear and displays the age in the console.   
           Ex: calculateAge(2000) -- > 18
		 */
		System.out.println("Your age is "+(2019-year)); 
	}
	
	public static void DivideWithoutOperator(int num1, int num2) {//10,5
		/*
		 Create a method that can divide two numbers without using division operators.
		 */
		int count=0;
		for(int i=num1; i>=0; i--) {
		   if(num1>=num2) {
			count++;
			num1=num1-num2;
		}}
		System.out.println("Division is "+count);
	} 
	
	public static void DuplicateValues(String text) {
		/*
		Write a method that check if a string is build out of the same letters 
     as another string.
      */
		String result="";
		   for(int i=0; i<text.length(); i++) {
			   if(!result.contains(text.substring(i, i+1))) {
				   //              (""+s1.charAt(i))
				   result+=text.substring(i, i+1);
			   }
		   }
		System.out.println("duplicated values "+result);
    	
	}	    
	
	/*
	 Write a method that returns max value out of array of integers.
     DO NOT use sort method
     Ex: int[] arr = {2,3,4};      max(arr) -> 4
	 */
	public static void MaxArray(int arr1) {
		int max=-999999999;
		int[] arr= {25,88,65,99,74,56};
		   for(int i=0; i<arr.length; i++) {
		    	if(arr[i]>max) {
		    		max=arr[i];
		    	}
		    }
	   System.out.println("Maximum number is "+max);
	}
	/*
	write a method that can find the unique characters from the String
    Ex:         unique("AAABBBCCCDEF") ==> "DEF";
	*/
	public static void UniqeCharacters(String test) {
		String temp = "";
        for (int i = 0; i < test.length(); i++){
           if (temp.indexOf(test.charAt(i)) == - 1){
              temp = temp + test.charAt(i);
        }
     }

   System.out.println(temp + " ");
		}
	
	/*   
	write a method that can reverse the a String
    Ex: Reverse("ABC") ==> CBA
	*/
	public static void ReverseText(String text) {
		for(int i=text.length()-1; i>=0; i--) {
		    System.out.print(text.substring(i, i+1));
		    System.out.println();
	   }
	}
	/*
	 Write a method mergeStrings that will return the strings merged, one letter at a time, starting with one.   Please note one and two can be of different lengths. Please look at below examples:
     mergeStrings(s1,s2) ==> "1a2b3c4d5e"
     mergeStrings("wooden", "spoon") ==> "wsopoodoenn"
     mergeStrings("java", "selenium") ==> "jsaevlaenium"
	 */
	public static void MergeString(String str1, String str2) {
	String merge="";
	
	for(int i=0; i<str1.length() || i<str2.length(); i++) {
	  if(i<str1.length()) {
		merge+=str1.substring(i, i+1);	
	  }
	  if(i<str2.length()) {
		merge+=str2.substring(i, i+1);
	  }
	}		
	System.out.println(merge);
	}
	
	
	
	
	}
	
   /* 	
 1. 
2. write a method that gets a string and returns the word count of that string.
example:
wordCount("foo bar") ==> 2
wordCount("one two three") ==> 3
wordCount("bla") ==> 1
3. write a method that gets a string and an int, what it dose is limit the inputted string to a cretin number of characters.
example:
limit("abcd",2) ==> "ab"
4. write a method gets two strings and prints the longest one
    longest("muhtar", "Cybertek Batch12") ==> Cybertek Batch12
5. write a method that can merge two arrays into one
example:
    int arr1[] = {1,2,3};
    int arr2[] ={4,5,6};
    mergeOne(arr1, arr2); ==> [1,2,3,4,5,6]
	 */
	



