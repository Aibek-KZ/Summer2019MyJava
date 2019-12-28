package day12_SwitchStatement;

public class Worm_up {

	public static void main(String[] args) {
	
		int n1=17, n2=17, n3=8;
		
		// needs to double check!!!
		
	 if (n1==n2&&n1==n3) {
		System.out.println(n1+" and"+n3+" and"+n2+" are equal");
	 }
		else if	(n1==n2&&n1!=n3) {
			System.out.println(n1+" and "+n2+" are equal");
		}
		else if (n2==n3&&n2!=n1) {
			System.out.println(n1+" and"+n3+" are equal");
		}
		else if (n1==n2) {
			System.out.println(n3+" and"+n2+" are equal");
		}
				
		else {
			System.out.println("No equal numbers");
		}
	
	// Needs to be check!!!
        //Second solution
        int x1=9, x2=9, x3=11;
     if (x1==x2 && x2==x3) {
        	System.out.println("all equal");
        }
        else if (x1==x2) {
        	System.out.println(x1+" and"+ x3+" are equal");
        }
        else if(x2==x3) {
        	System.out.println("x2 and x3 are equal");
        }
        else if (x1==x3) {
        	System.out.println("x1 and x3 are equal");
        }
        else {
        	System.out.println("none of them are equal");
        }
        
       



        // Third Solution
     // Nested if
        int A=30, B=30, C=10;
        if (A==B && B==C) {
        	System.out.println("All are equal");
        } 
        else {
        	if(A==B) {
        		System.out.println("A and B are equal");
        	}
        	else if (A==C) {
        		System.out.println("A and C are equal");
        	}
        	else if (B==C) {
        		System.out.println("B and C are equal");
        	}
        	else {
        		System.out.println("None of them are equal");
        	}
        }
        
   /* Task
    60~70=>D
    70~80=>C
    80~90=>B
    90~100=>A
    */
        int grade =99;
        if(grade >=0 && grade <= 100) {
            if(grade >= 60) {
                if(grade >= 90) {
                    System.out.println("A");
                }
                else if(grade >= 80) {
                    System.out.println("B");
                }
                else if (grade >=70 ) {
                    System.out.println("C");
                } else {
                    System.out.println("D");
                }   
            }else {
                System.out.println("Failed");
            }
        } else {
            System.out.println("Invalid Entry");
        } 

}
}