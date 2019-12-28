package day12_SwitchStatement;

public class Switch_Statements {

	public static void main(String[] args) {
		
		/*
		 *  break==> closing statement==>exits the switch statement
		 Switch statement does the similar thing like a multi branch statement
		 Case order does not matter
		 Switch 
		    switch(Expression) {
		       case CaseValue:
		                statements1
		                statements2
		                break
		       default:
		           statement      
		           break   
		    }
		 
		 */
		int score=1;
		if (score==1) { ///must give boolean expression
			System.out.println("1");
		}
		else if (score==2) {
			System.out.println("2");
		} else {
			System.out.println("Invalid number");
		}
		
		switch (score) { //MUST give an Expression: data
		    case 1:
		    	System.out.println("1");
		        break;
		    
		    case 2:
		    	System.out.println("2");
		    	break;
		   
		    default: 
		    	System.out.println("Invalid number");
		    	break;
		}
		
		String str="Java";
		
		switch (str) {
		
		      case "C#":
		    	  System.out.println("C# programming lamguage");
		         // break;
		      case "Python":
		    	  System.out.println("Python programming lamguage");
		    	  //break;
		      default:
					System.out.println("Invalid");
					 // break;
		}
		
		
		char grade='C';
		switch(grade) {
		
		default:
			System.out.println("Failed");
			break;
		case 'B':
			System.out.println("Passed with B");
			break;
		case 'C':
			System.out.println("Passed with A");
			break;
		}
		
		
	}
}
