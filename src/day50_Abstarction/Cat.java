package day50_Abstarction;

public class Cat extends Animal{
        
    public Cat(char Gender, byte Age, String color, String Nickname) {
        super(Gender, Age, color, Nickname );
    }
    // Cat mycat = new Cat(Gender, Age, color, Nickname);
    
    public void Speak(String languge) {
        System.out.println(Nickname+" speask "+languge+" Language");
    }
    @Override
    public void Eat(String food) {
        System.out.println(Nickname+" eats "+food);
    }
    @Override
    public void Sleep(int hour) {
        System.out.println(Nickname+" sleeps "+hour+" hours");
    }
    @Override
    public void Drink(String drinks) {
        System.out.println(Nickname+" drinks "+drinks);
    }
    
    
    
    
    
}
