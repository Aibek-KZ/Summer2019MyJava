package day50_Abstarction;

public class Zoo {
    
    public static void main(String[] args) {
        Cat  Cleo  =  new  Cat('F', (byte)5 , "White & Black", "Cleo");
    //  System.out.println( "Name is "+ Cleo.Nickname );  //Cleo
    //  System.out.println("Gender is "+Cleo.Gender );
    //  System.out.println( "Color is "+Cleo.color );
    //  System.out.println("Age is "+Cleo.Age);
        
        System.out.println("====================================");
        Cleo.getInfo();
        
        Cat misha = new Cat('F', (byte)6, "White & Grey", "misha");
            misha.getInfo();
            misha.Sleep(15);
            misha.Eat("chicken");
            misha.Drink("milk");
            misha.Speak("meow");
            
        Dog pongo = new Dog('M', (byte)8, "Grey&Brown", "Pongo");
        pongo.getInfo();
        pongo.Speak("Ukrainian");
        pongo.Eat("beef");
        pongo.Drink("water");
        pongo.Sleep(8);
        System.out.println("**************************************************");
        
        Dog Tuzik=new Dog('M', (byte)12, "Black", "Tuzik");
        Tuzik.getInfo();
        Tuzik.Speak("Kazakh");
        Tuzik.Eat("Kebab");
        Tuzik.Drink("redbull");
        Tuzik.Sleep(6); 
        
        System.out.println("****************************************************");
        
        Dog[] dog= {pongo, Tuzik};
        Cat[] cat= {misha, Cleo};
        
        dog[1].getInfo();
        dog[0].getInfo();
        
    }
}





