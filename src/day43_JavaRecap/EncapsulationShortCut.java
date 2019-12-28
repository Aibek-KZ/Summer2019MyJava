package day43_JavaRecap;

public class EncapsulationShortCut {

	/*
	 shortcuts for getter and setter:
	 1. declare private data
	 2. right click --> source--> Generate getters and setters
	 3. select the instance variables you wanna generate
	 4Click generate button   
	 */
	private int age=10;
	private int id=10;
	private int number=10;
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	

	
	
}
