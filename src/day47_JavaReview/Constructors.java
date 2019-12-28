package day47_JavaReview;

class Mehmet{
	public Mehmet() {
		System.out.println("Mehmet");
	}
}

class Rasul extends Mehmet{
	public Rasul() {
		System.out.println("Rasul");
	}
}

class Victoria extends Rasul{
	public Victoria() {
		System.out.println("Victoria");
	}
}

public class Constructors {
	public static void main(String[] args) {

//		Rasul obj = new Rasul();
		Victoria obj1 = new Victoria();
		
	}

}
