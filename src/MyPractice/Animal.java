package MyPractice;
/*
WarmUp:
    create an Animal abstract class
            data/attributes: gender, age, color, name
            create one constructor that can set the gender, name, color and age
            Actions: Speak(), Eat(), Sleep(), Drink();
        create sub classes of the Animal and override those actions:
                    dog: Speak()    ==> woof
                         Sleep()    ==> 8 hours
                         Eat()      ==> KFC
                         Drinks()   ==> Milk Shake
                    Cat: Speak()    ==> meow
                         Sleep()    ==> 14 hours
                         Eat()      ==> m&m
                         Drinks()   ==> Hot chocolate
                    cow: Speak()    ==> moo
                         Sleep()    ==> 5 hours
                         Eat()      ==> grace
                         Drinks()   ==> Coffee with sugar
        create  zoo class and store some of those animals' objects
 */
public abstract class Animal {
	public Animal(String gender, int age, String color, String name) {
		
	}
	
	public abstract void Speak(); 
	public abstract void Eat();
	public abstract void Sleep();
	public abstract void Drink();
	
	public static void main(String[] args) {
	//	Animal obj=new Animal("male", 5, "white", "Arlan");
	}
}

