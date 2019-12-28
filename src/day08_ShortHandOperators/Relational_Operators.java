package day08_ShortHandOperators;

public class Relational_Operators {
	/*  Relational Operators: return boolean expression
	 *  > : greater than
	 *  >=: greater than or equal
	 *  < : less than
	 *  <=: less than or equal
	 *  ==: equal, =just assign 
	 *  !=: not equal
	 *  ! : Exclamation mark in Java means logical opposite
	 */
	
	public static void main(String[] args) {
		
		System.out.println(10>9); //
		boolean resultA=10>9;
		System.out.println(resultA);
		
		System.out.println(10>=9);//greater or equal
		boolean resultB=10>=9;
		System.out.println(resultB);
		
		boolean resultC=10<=9; //less than equal
		System.out.println(resultC);
		
		boolean resultD=1100<1200; //less than
		System.out.println(resultD);
		
		// ==
		boolean resultG= 19==19;
		System.out.println(resultG);
		
		// !
		boolean resultH=20!=20;
		System.out.println(resultH);
		
		boolean A=true==!false;
		System.out.println(A);
		
		boolean A1=!false; //true
		System.out.println(A1);
		
			boolean F1=10>9==9<10;
			//         true==true==>true
			
			System.out.println(!true==false);//false==false==> true
			
			boolean h="Batch12"=="Batch13"; //false
			
			System.out.println("batch12"=="Batch12"); // False because Java is case sensitive
			
			System.out.println("A"=="b");//false
			
			
			
	}
	
}