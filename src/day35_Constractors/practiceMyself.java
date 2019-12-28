package day35_Constractors;

public class practiceMyself {

	public static void main(String[] args) {
		new practiceMyself();
		new practiceMyself(50);
		new practiceMyself(25.2, 30.25);
	}
	
	
	
	public practiceMyself() {
		System.out.println("Default, no arguments");
	}
	
	public practiceMyself(int a) {
		this("Aibek");
		  
		int num=a+a;
		System.out.println("You have entered "+a+" total: "+num);
	}
	
	public practiceMyself(double a, double b) {
		System.out.println("price is "+(a+b));
	}
	
	public practiceMyself(String a) {
		System.out.println(a+" "+a+" "+a);
	}
	
}
