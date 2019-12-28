package javaAssignments;
import java.util.Scanner;
public class Numbers_ternary {

	public static void main(String[] args) {
		String text="";
		Scanner number=new Scanner(System.in);
		System.out.println("Enter a number between 0 to 9 ");
        int num=number.nextInt();
        
       text=(num==0)? "You have entered zero"
		  :(num==1)? "You have entered one"
			:(num==2)? "You have entered two"
				:(num==3)? "You have entered three"
				:(num==4)? "You have entered four"
				:(num==5)? "You have entered five"
				:(num==6)? "You have entered six"
						:(num==7)? "You have entered seven"
								:(num==8)? "You have entered eight"
										:(num==9)? "You have entered nine"
												:"Invalid number";
                   System.out.println(text);
				}
}
