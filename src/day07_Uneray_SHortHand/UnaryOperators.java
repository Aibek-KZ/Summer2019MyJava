package day07_Uneray_SHortHand;

public class UnaryOperators {

	public static void main(String[] args) {
		/* +: Positive;
		 * -:negative
		 * ++:increment
		 * --: decrement
		 * for 
		 * +-==> -
		 * -+==> -
		 * --==> +
		 * ++==> +
		 */ 
		
		System.out.println(-(10)-10);
		
		/*  increment: increases the value by 1
		 * incements are: 1.Pre increment, 2.Post increment
		 * a pre increment: operator is placed before the variable
		 */
		int num1=100;
		System.out.println(++num1);//num1+1 or 101
		System.out.println(++num1);
		System.out.println(++num1);
		
		/* post increment: operator is placed after the variable
		 * it will pass current value first, then it will 
		 */
		int IntNum=100;
		System.out.println(IntNum++);//100 next step will +1
			
		int IntNum2=IntNum++;
		System.out.println(IntNum2);
		
		int x=100;
		int y=x++ -1; //y=100-1=99
		System.out.println(y);
		
						
		/*  decrement: decreases the value by 1
		 * pre decrement: operator placed before the variable, decreases value by 1 immidiatly
		 */
		int z=100;
		System.out.println(--z); //99
		
		//post decrement: oparator is placed after the variable
		//it will pass the current value, than decrease the value
		
		int Y=95;
		System.out.println(Y--);//95
		System.out.println(Y--);//94
		
		int T=25;
		System.out.println(++T);//26
		System.out.println(--T);//25
		
		int P=50;
		P=--P + P++ + P-- + P++;
		// pre  post  post  post
		//49  +  49  + 50  + 49==> 197
		System.out.println(P);
		
		short Snum=4;
		int R = Snum * 4 - Snum--;
		//      16   - 4 =12
		System.out.println(R);
		
		int w=1;
		w= -w-- + w++ / -w-- * --w;
		// post + post/ post * pre
		// -1   + 0   /  -1  * -1
		// -1 + 0* -1==> -1 + 0==> -1
		
		System.out.println(w);
		
		
		
		
	}
}
