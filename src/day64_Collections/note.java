package day64_Collections;

public class note {
/*
12/16/2019
Topics: Queue Interface
        Iterable
Package Name: day64_Collections
Collection (I): extended by List(I), Set(I), Queue(I)
List(I): does have index numbers, takes duplicated values
Set(I): does not have index numbers, does not take duplicates
Queue(I): does not have index numbers, does accept duplicates
        
        implemented by PriorityQueue(C)
        extended by Deque(I)
        Deque(I) is implemented by ArrayDeque(C), LinkedList(C)
        LinkedList(C) is implementing both List(I) & Deque(I)
        sorts in ascending order when there is no duplication
        Queue(I): 
                poll(): FIFO ==> First In First Out
                    return the first object as same data type,
                    at the same time it removes the first object from the Queue
        Deque(I):
            addFirst(object): adds the given object to the starting point of the Deque
            addLast(object): adds the given object to the very end of the Deque
            removeFirst(): removes the first object from Deque
            removeLast(): removes the last object from Deque
            getfirst(): retrives the first object from the Deque
            getLast(): retrives the last object from the Deque
Iterable(I): extended by root interface interface collection
    
    we can apply Iterator(I) to the classes or interfaces that are sub type of Iterable
    Iterator(I):  
        1. allows us to get access to each objects of the collection type
        2. allows us to remove objects from a collection type 
        The ONLY legit way to remove data elements from a collection-type
        iterator(): iterates the collection, and returns Iterator
        hasNext(): check if there are enough elements that can be iterated
                    returns boolean expression
        next(): if hasNext() is true, it retrieves the current iteration from the collection type
        remove(): removes current element of the iteration from the collection type
 */
}
