package day50_Abstarction;
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
    // data/attributes: gender, age, color, Nickname    
    public char Gender;
    public byte Age;
    public String color;
    public String Nickname;
    
    public Animal(char Gender, byte Age, String color, String Nickname) {
        this.Gender = Gender;
        this.Age = Age;
        this.color = color;
        this.Nickname = Nickname;
    }
    
    // Actions: Speak(), Eat(), Sleep(), Drink();
    
    public abstract void Speak(String languge);
    public abstract void Eat(String food);
    public abstract void Sleep(int hour);
    public abstract void Drink(String drinks);
    
    public void getInfo() {
        System.out.println("NickName is "+Nickname);
        System.out.println("Gender is "+Gender);
        System.out.println("Color is "+color);
        System.out.println("Age is "+Age);
        System.out.println("====================================");
    }
    
    
}
