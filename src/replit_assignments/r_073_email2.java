package replit_assignments;

import java.util.Scanner;

public class r_073_email2 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String email=scan.nextLine();
	
	int name=email.indexOf("_");
	String first=email.substring(0, name);
	String ch=""+first.charAt(0);
	first=first.replace(ch, ch.toUpperCase());
	
	int name1=name+1;		
	int lname=email.indexOf("@");
	String last=email.substring(name1, lname);
	String ch2=""+last.charAt(0);
	last=last.replace(ch2, ch2.toUpperCase());
		
	int dom=email.lastIndexOf(".");
	String domain=email.substring(lname+1, dom);
	String tdomain=email.substring(dom+1);
	
	System.out.println("First name: "+first);
			System.out.println("Last name: "+last);
			System.out.println("Domain: "+domain);
			System.out.println("Top-Level Domain: "+tdomain);
}
}
