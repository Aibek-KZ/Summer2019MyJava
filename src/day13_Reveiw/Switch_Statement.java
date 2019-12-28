package day13_Reveiw;

public class Switch_Statement {

	public static void main(String[] args) {
		
		/* switch ststements expression MUST be evaluate to a single value (either caracters
		 digits, or text), therefore 4 data types are not accepted:
		 double
		 float
		 long
		 boolean= tue, false
		 
		 switch (expression) {
		     case caseValue:
		          statement1;
		          statement2;
		          break;
		          
		     case caseValue:
		          statement1;
		          statement2;
		          break;
		       
		     default:
		           stetement1;     
		 }
		 
		 */
		
		int num=7;
		switch(num) {
		     case 5:
			      System.out.println("Friday");
			      break;
		     case 7:
		    	 System.out.println("Sunday");
		    	 break;// case closed, it's used for exiting switch ststement after the case is executed
		      default:
		    	  System.out.println("Invalid entry");
		    	  break;
		      case 1:
		    	  System.out.println("Monday");
		    	  break;
		}
		
		String days="Tuesda";
		switch (days) {
		default:
			System.out.println("Invalid ");
			break;
		case "Monday":
			System.out.println("Monday is fun day");
			break;
		case "Tuesday":
			System.out.println("Tuesday is great day");
			break;
		case "Wednesday":
			System.out.println("Wednesday is off day");
			break;
		
		}
		long N1=10;//10L
		//switch (N1) { } doesn;t work
		
		float N2=100;//100.0f
		//switch (N2) { };
		
		double N3=10;
		//switch(N3) { };
		
		boolean N4=true;//9<8
		//switch(N4) { }
		
		char ch='A';
		switch(ch) { }
		
		// or logic: there is no direct way to use or logic
		// 
		char grade='B';
		if(grade=='A'||grade=='B') {
			System.out.println("Passed");
		} else System.out.println("Failes");
		
		switch(grade) {
		case 'A':
		case 'B':
			System.out.println("Passed1");
			break;
		default:
			System.out.println("Fails1");
		}
		
		
		String Brow ="Opera";
		switch(Brow) {
		case "Opera":
		case "Chrome":
		case "FireFox":
			System.out.println("Internet browsers");
			break;
		default: 
		     System.out.println("Not internet browser");		
		}
		
		String US="US";
		switch(US) {
		case "US":
		case "USA":
		case "America":
			System.out.println("American");
			break;
			default:
				System.out.println("Not American");
		
		}
		
	}
}
