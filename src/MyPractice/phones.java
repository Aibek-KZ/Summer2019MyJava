package MyPractice;

public abstract class phones {
	double size;
	double camera;
	int battery;
	double price;
	String Display;
	String Memory;
	String mAh;
	String Sale;
	
	public phones(double size, double camera, int battery, double price) {
		this.size=size;
		this.camera=camera;
		this.battery=battery;
		this.price=price;
	}
	
	public abstract void ScreenSize(String Display);	
	public abstract void Camera(String Memory);	
	public abstract void Battery(String mAh);
	public abstract void Price(String Sale);
	public abstract void getInfo();

}
