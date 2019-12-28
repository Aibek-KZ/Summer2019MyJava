package MyPractice;

public class pixel4 extends phones{
	
	public pixel4(double size, double camera, int battery, double price) { 
		super(size, camera, battery, price);
	}
	public void ScreenSize(String Display) {
		this.Display=Display;
		System.out.println("Pixel' screen size is "+size+" and display is "+Display);
	}
	public void Camera(String Memory) {
		this.Memory=Memory;
		System.out.println("Pixel' camera is "+camera+" mp and memory is "+Memory);
	}
	public void Battery(String mAh) {
		this.mAh=mAh;
		System.out.println("Pixel' battery works "+battery+" hours or "+mAh+" mAh");
	}
	public void Price(String Sale) {
		this.Sale=Sale;
		System.out.println("Pixel' price is "+price+" dollars, but now discount is "+Sale);

	}
	public void getInfo() {
		System.out.println("Pixel' screen size is "+size+" and display is "+Display);
		System.out.println("Pixel' camera is "+camera+" mp and memory is "+Memory);
		System.out.println("Pixel' battery works "+battery+" hours or "+mAh+" mAh");
		System.out.println("Pixel' price is "+price+" dollars, but now discount is "+Sale);
	}
	
}
