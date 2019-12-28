package day46_SuperKeyword;

class parent {
	public parent(int a) {
		System.out.println("A");
	}
	public parent(String s) {
		System.out.println("C");
	}
	public parent(double t) {
		System.out.println("Double");
	}
}

public class Practice extends parent{
	
	public Practice() {
		super("Call");
	}
	public Practice(byte l) {
		super(10.2);
		System.out.println("Double1");
	}
public static void main(String[] args) {
	Practice obj = new Practice();
	
}
}

