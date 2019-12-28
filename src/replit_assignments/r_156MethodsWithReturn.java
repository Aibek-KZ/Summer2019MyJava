package replit_assignments;

public class r_156MethodsWithReturn {
  /*
  Create a method that gets an array of strings and a string, the method returns an int.
  It counts how many times a string appears in the array and returns the count.
    for example (pseudo code):
            some_array = ["a","foo","bar","foo","bla"]
            some_string = "foo"
            count_appearance(some_array ,some_string )
   will return 2 because some_array  has 2 appearances of "foo" string.         
  */
	public static int count_appearance(String[] arr, String t) {
		int count=0;
		for(int i=0; i<arr.length; i++) {
	    	if(arr[i].equals(t)) {
	    		count++;
	    	}
	    }
		System.out.println(count);
		return count;
	  } //end  count_appearance
	
	public static void main(String[] args) {
        String t="apple";
        String[] arr= {"apple", "melon", "pech", "apple", "apple"};
		count_appearance(arr, t);
	}
}
