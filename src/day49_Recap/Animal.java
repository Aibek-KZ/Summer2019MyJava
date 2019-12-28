package day49_Recap;

public abstract class Animal {
	public abstract void eat();	
	public abstract void sleep();
	public static void main(String[] args) {
		
	}
	
}

class Cat extends Animal{
	@Override
	public void eat() {
		System.out.println("cat eats fish");
	}
	@Override
	public void sleep() {
		System.out.println("cat sleeps 14 hours");
	}
}

class KingKong extends Animal {
	@Override
	public void eat() {
		System.out.println("KingKong eats humans");
	}
	@Override
	public void sleep() {
		System.out.println("KingKong sleeps 5 hours");
	}
}

class Test{
	public static void main(String[] args) {
		KingKong obj=new KingKong();
		obj.eat();
		obj.sleep();
		
		Cat obj2=new Cat();
		obj2.eat();
		obj2.sleep();
	}
}
