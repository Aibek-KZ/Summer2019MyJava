package day48_MethodOverRiding;

class WebDriver {
	public void get() {
		System.out.println("Opens browser");
	}
}

class ChromeDriver extends WebDriver{
	 public void get() {
		 System.out.println("Opens chrome browser");
	 }
}

class FireFoxDriver extends WebDriver{
	public void get() {
		System.out.println("Opens fireFox browser");
	}
}

public class Practice {
	
	static int num2; // 0
//	final int num3;   needs to initialize immediately
	
	public static void main(String[] args) {
		
		ChromeDriver driver1=new ChromeDriver();
		driver1.get(); //Opens chrome browser
		
		FireFoxDriver driver2=new FireFoxDriver();
		driver2.get(); //Opens fireFox browser
		
		final int num;
		num=100;
	//	num=200; final variables cannot be changed, reassign
		
		
		

		
	}

}
