package day45_Inheritance;

public class notes {
/*
 10/29/2019
Topic:  
        1. default access modifier
        2. Multiple classes
        3. OOP Inheritance  
package: day45_Inheritance
Access modifiers: public, private, default, and protected
    public access modifier: visible at everywhere 
    private access modifier: only visible within the class
    default access modifier: only visible to the classes that are in the same package
                            not visible outside the package
            if we don't give public, private or protected keywords, then the default access modifier will be given by default
                        ex: package A
                            public class a{
                                int num =100;
                            }
                            package B
                            public class b{
                            //  num is not visible in this class, because those two classes are located in two different packages 
                            }
    protected access modifier: only visible to the classes that are in the same package. 
                but it can be inheritable to the classes outside the package
                Not visible but inheritable
Multiple classes: we can have multiple classes in a java file
            
            there can only be one public class, and the public class' name MUST match with the java file' name
            other classes we are creating MUST have default access modifiers
            one public class in per java file
Inheritance: used for building relationships between classes, it build super and sub relationships between classes
            easiest way to get rich
            
            we use "extends" keyword to build super and sub relationships between classes
 
            public  class   A    extends    B
                            sub           super 
            sub class (A): it's also called child class, sub class can inherit the visible or protected features from the super class
            
                features that have public or protected access modifiers: can be inherited any any where, even outside the package.
                features that have default access modifier:  can only be inherited to the classes that are in the same package with
                features that have private access modifier can never be inherited
            super class (B): it's also called parent class, super class cannot inherit any feature from the sub class
            one class can only extend one class, but one class can be extended by multiple classes
            one super class can have multiple sub classes
 
benifit of inheritance :
                1. reusability 
                2. easy to maintain
POM: page object module

java Review: 
            Encapsulation.    (done)
            protected vs Default. (done)
            Inheritance.  
OOP Encapsulation: hiding the data
                1. private access modifier
                2. getter/setters
    private: only visible within the class
    getter (read only): instance method, return-type of this instance
     method MUST match with the private instance variable
                access modifier should be public
default: not visible outside the package
protected: not visible outside the package, but it can be inherited outside package
    
 
 */
}
