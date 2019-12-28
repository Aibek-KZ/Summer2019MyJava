package day37_ClassAndObject;

public class Dog {
	/*
	 Attributes/data:
            breed, size, age, color, name ...
    actions:
        eat, sleep, bark, play ...
	 */

	String Breed;
	String Size;
	byte Age;
	String Color;
	String Name;
	char Gender;
	String Food;
	String Toy;
	
	public void getInfo() {
		System.out.println(Breed+" Name is "+Name+", "+Size+" "+Age+" years old, "+Color+" Gender is "+Gender);
	}
	
	public void eat() {
		System.out.println(Name+" is eating "+Food);
	}
	
	public void play() {
		System.out.println(Breed+" is playing with "+Toy);
	}
}
