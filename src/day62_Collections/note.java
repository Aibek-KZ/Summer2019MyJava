package day62_Collections;

public class note {
	public static void main(String[] args) {
		
	}
/*
Data Structures: In order to manage data efficiently and in organized manner, we need 
                 data structure
        --Array
        --Collections Framework
        --Maps
        
Array: Collection of Data (same data type)
       size is fixed
       index numbers
       can be multi-dimensional
       supports primitives and objects
       can have duplicates
       
Collections Framework: consists of multiple interfaces, each interfaces has multiple 
                       implementations 
Interfaces in Collection Framework:
              1. Iterable
              2. Collection
              3. List
              4. Set
              5. SortedSet
              6. Queue
              7. Deque
  all those interfaces presented in java.util packeges
  only supports objects
              
Iterable (I): root interface, supertype of all the interfaces in collections framework

Collection (I): extended by three interfaces: List(I), Queue(I), Set(I)

List (I): implemented by ArrayList(C), LinkedList(C), Vector(C)
          has index numbers, dynamic sized, accepts duplicates
          List<Integer> list1 = new ArrayList<>();
          List<String> list2 = new LinkedList<>();
          List<Double> list3 = new Vector<>();
          List<Integer> list4 = new Stack<>();
          
   ArrayList: Array based class, internally uses the array
   
   LinkedList: Each objects are doublly linked 
     doublly linked: adding&removing ( add(), remove() ) data are faster   
                     Retrieving data ( get() ) is slower    
                     Is not array based class
                     
   Vector: is synchronized, only prefered in multi-threads
         advantage:    thread safe in multi-thread environment
         disadvantage: more slower                 
         has a child class "Stack"
         stack synchronized, has pop() method or LIFO==>Last in First Out
                                             removes last object from the stack
   
                
      Synchronized keyword: used to achive==>Thread safe in multi-thread environment
      multi-thread: multiple threads try to get access to same recourses   
      
         
Set (I): does not take duplicates, does not have index numbers
         implemented by HashSet(C), LinkedHashSet(C)
         extended by SortedSet(I)
         SortedSet is implemented by TreeSet(C)
         
         Set<Integer> st1 = new HashSet<>();
         Set<Integer> st2 = new LinkedHashSet<>();
         Set<Integer> st3 = new SortedSet<>();
         
    HashSet: HashSet does not keep the objects order as it is   
    LinkedHashSet: does keeps the order as it is
    
    SortedSet(I): sorts the objects in ascending order 
         
 */
}
