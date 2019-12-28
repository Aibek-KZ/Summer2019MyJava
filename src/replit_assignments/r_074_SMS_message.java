package replit_assignments;
import java.util.Scanner;
public class r_074_SMS_message {
	public static void main(String[] args) {
		/*Sender:<Mike Smith>. From Number:[202-123-3456]. 
		  Message:{I love programing and problem solving}
		 */
		Scanner scan = new Scanner(System.in);
	    String message = scan.nextLine();
	    String sender;
	    String phoneNumber;
	    String messageBody;
	    
	    int senderIndex1=message.indexOf('<');
	    int senderIndex2=message.indexOf('>');
	    sender=message.substring(senderIndex1+1, senderIndex2);
	    System.out.println("Sender: "+sender);
	    
	    int phoneIndex1=message.indexOf('[');
	    int phoneIndex2=message.lastIndexOf(']');
	    phoneNumber=message.substring(phoneIndex1+1, phoneIndex2);
	    System.out.println("Phone number: "+phoneNumber);
	    
	    int body1=message.indexOf('{');
	    int body2=message.lastIndexOf('}');
	    messageBody=message.substring(body1+1, body2);
	    System.out.println("Message body: "+messageBody);
	}
}
