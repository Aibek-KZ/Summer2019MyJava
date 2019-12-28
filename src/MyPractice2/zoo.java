package MyPractice2;

class Animal {
	
	public void Talk() {
		System.out.println("Animal is talking");
	}		
}

class Tiger extends Animal{
	
	public void Hunts() {
		System.out.println("Tiger hunts");
	}

	@Override
	public void Talk() {
		System.out.println("Tiger says roow-row");
		
	}
}

class Octopus extends Animal{
	public void Swim() {
		System.out.println("Octopus swims");
	}

	@Override
	public void Talk() {
		System.out.println("Octopus says glo-glo");
		
	}
}

 
 public class zoo{
	public static void main(String[] args) {
		
		Tiger Tiger1 = new Tiger();
		Tiger[] Tigers= {Tiger1, new Tiger()};
		
		Octopus Octopus1 = new Octopus();
		Octopus[] Octopuses= {Octopus1, new Octopus()};
		
		Animal Animal1=new Tiger();
		Animal1.Talk();
		
		Animal Animal2=new Octopus();
		Animal2.Talk();
		
		
	}
} 
