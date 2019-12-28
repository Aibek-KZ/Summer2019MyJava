package day14_scanner;

public class Ternary {
	public static void main(String[] args) {
		
		/*
		 if(condition) ==> (Condition)?
		 else          ==> :
		 else if(Condition) ==>:(Condition)?
		 
		 in ternary's body we can give a single value
		 () is not required in ternary
		 
		*/
		int num=0;
    	 if (true) {
		     num=100;
		 } else {
			 num=50;
		 }
		 		 
		int n=(true)? 100 : 50; //ternary returns a value
		int y=(false)? 100 :50;
		
		System.out.println(num);
		System.out.println(n);
		System.out.println(y);
		
		String Schoolname="";
		boolean Batch12=true;
		if(Batch12) {
			Schoolname="Cybertek";
					} else {
						Schoolname="Invalid";
					}
		
		System.out.println(Batch12 ? "Cybertek" : "Invalid");
		
		String BestSchool=(Batch12? "Cybertek" : "Invalid");
		System.out.println(BestSchool);
		
	double interestRate=0;
	boolean GoodCredit=true;
	interestRate=(GoodCredit==true) ? 0.5 : 0.9; 
	System.out.println(interestRate);
	
	byte grade=60;
	boolean Passed=grade>=60 ? true : false;
	
	char FinalGrade='A';
	String Group="";
	if (FinalGrade=='A') {
		Group="Early bird";
	}else if(FinalGrade=='B') {
		Group="Group1";
	}else {
		Group="Group2";
	}
	
	Group=(FinalGrade=='A')? "Early bird" : (FinalGrade=='B')? "Group1" : "Group2";
	System.out.println(Group);
	
	Group=(FinalGrade=='A')? "Early bird" 
		 : (FinalGrade=='B')? "Group1"
				 :(FinalGrade=='C')? "Group2"
						 : "Group3";
	System.out.println(Group);
	
	
	int score=98;
	char Finals=' ';
	
	Finals=(score<=100&&score>=90)? 'A' 
			: (score<=89&&score>=80)? 'B'
					:(score<=79&&score>=70)? 'C'
							:(score<=69&&score>=60)? 'D'
									:(score<=59&&score>=0)? 'F'
											:' ';
	System.out.println("You make "+Finals);
		
	
	int n1=100000, n2=300, n3=2500;
	int max=(n1>n2 && n1>n3)? n1
			:(n2>n1 && n2>n3)? n2
					:n3;
	System.out.println(max);
							
	
	}

}
