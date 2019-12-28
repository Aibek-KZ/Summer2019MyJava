package day46_SuperKeyword;

class Caller {
	static int i;
	int j;
	
	public static void main(String[] args) {
		
		Caller x1=new Caller();
		Caller x2=new Caller();
		x1.j=4;
		x1.i=3;
		
		x2.j=6;
		x2.i=5;
		
		System.out.println(x1.i+" "+x1.j);
		System.out.println(x2.i+" "+x2.j);

	}

}
