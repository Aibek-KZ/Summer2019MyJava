package day55_Polimorphism;

import java.util.ArrayList;
import java.util.Arrays;

abstract class Animals{
     public abstract void Talk();
     abstract void Sleep(); 
}
class Mammals extends Animals{
	@Override
	public void Talk() {
		System.out.println("Mammals can say \"row-row\"");		
	}
	@Override
	void Sleep() {
		System.out.println("Mammals sleeps 7 hours");		
	}	
	public void Jump() {
		System.out.println("Mammals jumps 3 meters");
	}
}
class Birds extends Animals{

	@Override
	public void Talk() {
		System.out.println("Birds can say \"SS-S-SS\"");		
	}
	@Override
	void Sleep() {
        System.out.println("Birds sleeps 5 hours"); 		
	}	
	void fly() {
		System.out.println("Birds can fly");
	}
}

public class zoo {
	public static void main(String[] args) {
			
	Animals Tiger = new Mammals();
    Animals Wolf = new Mammals();
    Animals Fox = new Mammals();
    
    Animals Crow = new Birds();
    Animals Goose = new Birds();
    Animals Turkey = new Birds();
    
    Animals[] mammals = {Tiger, Wolf, Fox};
    Animals[] birds = {Crow, Goose, Turkey};
    
    ArrayList<Animals> mammal = new ArrayList<>(Arrays.asList(mammals));
    ArrayList<Animals> bird = new ArrayList<Animals>(Arrays.asList(birds));
    
	
	}
}
