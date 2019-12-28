package day33_ArrayList;

import java.util.ArrayList;

public class ArrayList1 {
public static void main(String[] args) {
	/*
	 ArrayList: presented in "java.util"
	          does not support primitives, we can only store objects
	          ArrayList's size is dynamic, adjusted automatically
	          ArrayList is an ordered collection of values
	          
	 decleration of ArrayList:
	      ArrayList<NonPrimitive> variableName = new ArrayList<NonPrimitive>();
prefered way: ArrayList<NonPrimitive> variableName = new ArrayList<>();

    decleration of array: 
              int[] arr = new int[5];
              
   ArrayList vs Array:
       ArrayList's size is dynamic, Array's size is fixed
       ArrayList only supports nonprimitives, Array supports all
       Array can be multi-dimensional, but ArrayList can not be multi-dimensional           
	
	 methods of ArrayList: 
	      add(object): adds objects to arrayList
	      get(index): gets the data from the arrayList
	      size(): returns the length
	 */
		
	// declaration of arraylist:
    ArrayList<String> list = new ArrayList<String>();
    ArrayList<String> list2 = new ArrayList<>();
    
    
    
// add(object):
    ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("apple");  // index: 0 ,  size: 1
        shoppingList.add("orange"); //  index: 1,  size: 2
        shoppingList.add("grape");  // index: 2,   size: 3
    
        System.out.println( shoppingList );
        
      ArrayList<String> cars=new ArrayList<>();
      cars.add("Toyota");
      cars.add("Lexus");
      cars.add("BMW");
      System.out.println(cars);
      
      cars.add(1, "Mazda");
      cars.add(0, "Honda");
       System.out.println(cars);

        ArrayList<Integer> age=new ArrayList<>();
        age.add(45);
        age.add(35);
        age.add(85);
        System.out.println(age);
        age.add(0, 65);
        System.out.println(age);
            
// add(index, object): adds the object at the given index number
            // WE CANNOT SKIP THE INDEXES
        
        //  shoppingList.add("Strawberry");
         shoppingList.add(1, "Strawberry" );
            System.out.println( shoppingList ); 
            
    //  shoppingList.add(5 , "Toyota Corolla");  // it does not skip indexes
        System.out.println( shoppingList );     
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(0,  5);  // [5]
        numbers.add(1,  10); // [5, 10]
        numbers.add(2,  15); // [5, 10, 15]
        
        numbers.add(1,  1);   // [5, 1, 10, 15]
        
        numbers.add(1, 6);  //[5, 6, 1, 10, 15]
        
        System.out.println(numbers);

//  get(index number): returns the object
        ArrayList<String> names = new ArrayList<>();
            names.add("Homayra");
            names.add("Meri");
            names.add(1, "Mikrigul");
            names.add(1, "Tabriz");
            names.add(0, "Asiya");
            
            String str1 = names.get(1); 
            System.out.println( str1 );
            
     ArrayList<Double> info = new ArrayList<>();
     info.add(33.56);
     info.add(14.25);
     info.add(0, 25.14);
        System.out.println(info);
     
     double num=info.get(2);
     System.out.println(num);
            
     ArrayList<String> bestCars = new ArrayList<>();
     bestCars.add("Lexus");
     bestCars.add("Honda");
     bestCars.add("BMW");
     bestCars.add(0, "Toyota");
     bestCars.add("Kia");
     System.out.println(bestCars);
     
     String myCar=bestCars.get(1);
            System.out.println(myCar);
            
     
   // size(): returns the length of the arrayList as int value
            int length=bestCars.size();
            System.out.println(length);
            for(int i=0; i<bestCars.size(); i++) {
            	String each = bestCars.get(i)+" ";
            	System.out.print(each);
            }
            System.out.println();
            
              for(String each : bestCars) {
            	  System.out.print(each+" ");
              }
            
            System.out.println();
            
            
    //clear(): removes all the objects from the arrayList
         ArrayList<String> students = new ArrayList<>();
         students.add("Aibek");
         students.add("Saya");
         students.add("Amina");
         students.add("Adiya");
         students.add("Alan");
            System.out.print(students+" ");
            
            System.out.println();
      students.clear();
      System.out.println(students);
      System.out.println(students.size());
            
            
    // set(index number, object): the given object will replace the object at the given
    ArrayList<String> Javengers = new ArrayList<>();   
        Javengers.add("Almaty");    
        Javengers.add("Dallas");
        Javengers.add("Austin");
        Javengers.add("Scottsdale");
        Javengers.add("Phoenix");
        System.out.print(Javengers);
        System.out.println();
        
        Javengers.set(1, "Astana");
        System.out.println(Javengers);
            
   
  //contains(object): checks if the given object is contained in the arrayList or not, returns to boolean       
        ArrayList<String> goodGuys=new ArrayList<>();
        goodGuys.add("Aibek");
        goodGuys.add("Saya");
        goodGuys.add("Amina");
        goodGuys.add("Adiya");
        goodGuys.add("Alan");
        
        boolean result=goodGuys.contains("Alan");
        System.out.println(result);
        
        
  // equals(ArrayList): checks if the two arrays are equal or not, returns to boolean       
        ArrayList<String> badGuys = new ArrayList<>();
        badGuys.add("Jon");
        badGuys.add("Max");
        badGuys.add("Hector");
        
        boolean result2 = badGuys.equals(goodGuys); //false
        System.out.println(result2);
        
        if(goodGuys.contains("Aibek") || badGuys.contains("Aibek")) {
        	System.out.println("Aibek is good guy");
        }
        
        
        //remove(int): removes the given index number
        ArrayList<Integer> lists = new ArrayList<>();
        lists.add(1);//auto-boxing index: 0
        lists.add(2);//auto-boxing index: 1
        lists.add(3);//auto-boxing index: 2
        lists.add(4);//auto-boxing index: 3
        lists.add(5);//auto-boxing index: 4
        
    lists.remove(1); //[1, 3, 4, 5] 
    System.out.println(lists);
    lists.remove(2);
    System.out.println(lists);
    System.out.println(lists.size());
        
    
    // remove(Integer): removes the first matching object, at the same time return to boolean 
    ArrayList<Integer> lists2 = new ArrayList<>();
    lists2.add(1);//auto-boxing index: 0
    lists2.add(2);//auto-boxing index: 1
    lists2.add(3);//auto-boxing index: 2
    lists2.add(4);//auto-boxing index: 3
    lists2.add(5);//auto-boxing index: 4
    
    Integer a =1;
    boolean r1=lists2.remove(a); // [2, 3, 4, 5]
    System.out.println(r1); // true
    
    ArrayList<String> city = new ArrayList<>();
    city.add("Miami");
    city.add("Miami");
    city.add("Astana");
    city.add("Istanbul");
    city.add("Almaty");
    city.add("Austin");
    
    //city.remove("Miami"); // [Miami, Astana, Istanbul, Almaty, Austin]
    System.out.println(city);
    if(city.remove("Miami")) { // [Miami, Astana, Istanbul, Almaty, Austin]
       city.remove(2);
       System.out.println(city); //[Miami, Astana, Almaty, Austin]
      }
    city.add(2, "Berlin");
    System.out.println(city); //[Miami, Astana, Berlin, Almaty, Austin]
    
    
    ArrayList<Integer> price = new ArrayList<>();
    price.add(1); // auto-boxing
    price.add(2);
    price.add(3);
    price.add(4);
    price.add(5);
    
    price.remove(Integer.parseInt("2"));// parse method returns primitive
    System.out.println(price); // [1, 2, 4, 5]  3 is removed
    
    boolean r3=price.remove(Integer.valueOf("3"));//valueOf method returns wrapper class
    System.out.println(r3); // false
    
    
    
    
}

}

