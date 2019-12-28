package MyPractice;

public class iphone11 extends phones{
		
	public iphone11(double size, double camera, int battery, double price) {
		super(size, camera, battery, price);
	}
	
	public void ScreenSize(String Display) {
		this.Display=Display;
		System.out.println("Iphone' screen size is "+size+" and display is "+Display);
	}
	public void Camera(String Memory) {
		this.Memory=Memory;
		System.out.println("Iphone' camera is "+camera+" mp and memory is "+Memory);
	}
	public void Battery(String mAh) {
		this.mAh=mAh;
		System.out.println("Iphone' battery works "+battery+" hours or "+mAh+" mAh");
	}
	public void Price(String Sale) {
		this.Sale=Sale;
		System.out.println("Iphone' price is "+price+" dollars, but now discount is "+Sale);

	}
	public void getInfo() {
		System.out.println("Iphone' screen size is "+size+" and display is "+Display);
		System.out.println("Iphone' camera is "+camera+" mp and memory is "+Memory);
		System.out.println("Iphone' battery works "+battery+" hours or "+mAh+" mAh");
		System.out.println("Iphone' price is "+price+" dollars, but now discount is "+Sale);
	}
	
}
