package MyPractice;

public class phonesCall {
	public static void main(String[] args) {
		
		iphone11 obj=new iphone11(6.5, 12.4, 15, 1100);
		obj.Battery("18000");
		obj.Camera("16 GB");
		obj.Price("10%");
		obj.ScreenSize("Smooth Display ");
		obj.getInfo();
		System.out.println("*******************************************");
		
		samsung11 obj2 = new samsung11(8.4, 16.5, 16, 850);
		obj2.getInfo();
		System.out.println("*********************************************");
		
		pixel4 obj3 = new pixel4(5.7, 12.0, 16, 899);
		obj3.getInfo();
	}

}
