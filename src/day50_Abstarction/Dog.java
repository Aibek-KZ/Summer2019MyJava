package day50_Abstarction;

public class Dog extends Animal{
	
	public Dog(char Gender, byte Age, String color, String Nickname) {
		super(Gender, Age, color, Nickname);
	} 
	public void Speak(String languge) {
		System.out.println(Nickname+" is speaking "+languge);
	}
    public void Eat(String food) {
    	System.out.println(Nickname+" is eating "+ food);
    }
    public void Sleep(int hour) {
    	System.out.println(Nickname+" sleeps "+hour+" hours");
    }
    public void Drink(String drinks) {
    	System.out.println(Nickname+" drinks "+drinks);
    }

}
