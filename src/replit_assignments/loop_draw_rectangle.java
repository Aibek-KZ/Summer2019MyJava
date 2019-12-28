package replit_assignments;

import java.util.Scanner;

public class loop_draw_rectangle {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    
    String rect ="****\n";
    for(int i=1; i<=n; i++)
    {
       rect +="*  *\n";
    }
    rect +="****";
    System.out.println(rect);
}
}
