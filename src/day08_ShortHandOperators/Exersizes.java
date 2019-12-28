package day08_ShortHandOperators;

public class Exersizes {
	
	public static void main(String[] args) {
		int a = 25, b = 27;
		boolean result = a >= b;
		System.out.println(result);
		
		int apples=20;
		int oranges=30;
		int pears=30;
		boolean comp=apples<oranges||oranges>=pears;
		System.out.println("compare result is "+comp);//true||true==>true
		
		String OutsideWeather;//false
		int Degree;
		OutsideWeather="Shinny";
		Degree=70;
		boolean comp2=(!(OutsideWeather=="Rainy"||Degree==70));
		//             !(false||true)==>!true==>false
		System.out.println(comp2);
		
		int z=2;
		boolean res= ++z==2|| --z==2 && --z==2;
		//            false|| true && fasle==> false 
		System.out.println(res);
		
		boolean x=true, v=true;
		int y=20;
		x=(y!=10)||(v=false);
		// true || false==> true
		System.out.println(x);
		
				
		
		
	}

}
