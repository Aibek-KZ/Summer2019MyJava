package day05_Recap;

public class primitives_reveiw {

	public static void main(String[] args) {
		
		byte bNum = 127;
		// byte range -128 to 127, can take only whole numbers
		
		short sNum = 1000; //short only takes whole numbers
		sNum = bNum;
			System.out.println(sNum);	
			
			int iNum = 24578;
			int iNum1 = sNum;
			long lNum = iNum1;
			
			System.out.println(iNum1);
		
		 float fNum = 123.44f;
		fNum = sNum;
		System.out.println(fNum);
		
		byte b = 121; short s = 4560; int i = 52000; long l = 6589000;
		float f = 2543.25f; 
		float f1 = b;
		float f2 = f1;
		
		//double takes all the whole and decimal numbers 
		
		char char1 = 'A'; // takes character, char value MUST be declared within single character
		System.out.println(char1);
		
		char char2 = 65;
		System.out.println(char2);
		
		short short9 = 'c';
		System.out.println(short9);
		
		float fnum = 'B';
		System.out.println(fnum);
		
		byte byte9 = 'D';
				System.out.println(byte9);
				
				// Practices:
				
				/* 8,  #, 8.5, 5.5f, 
				 * 128, 40000, 9>10, true , false
				 */
		
				byte bNumb = 8; short sNumb = 8; int iNumb = 8; long lNumb = 8;
				float fNumb = 8; double dNumb = 8; char cNumb = '8';
				System.out.println(cNumb);
				
				// # & @ $:
				char char7 = '#';
				char char8 = '$';
				System.out.println(char7);
				System.out.println(char8);
				
				
	}
	
}
