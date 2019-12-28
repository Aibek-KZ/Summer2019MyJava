package day42_OOP_Encapsulation;

public class practice {
	
	public static int a=10;
	public int b=20;
	
	private String c="Great";
	private int d=100;
	private String Name="Amina";
	
	public void setd(int d) {
		this.d=d;
	}
	
	
	
	
	
	
	public void setName(String Name) {
		this.Name=Name;
	}
	
	public String getName() {
		return Name; 
	}
	public String getc() {
		return c;
	}
	public int getd() {
		return d;
	}
	
	
	
	static {
		System.out.println("static block");
	}
	
	{
		System.out.println("instance block");
	}

}
