package day08_ShortHandOperators;

public class QuizReveiw {
	
	public static void main(String[] args) {
		
		//Task 2
		int num=198;
		System.out.println(num%=2); //0
		
		byte ByteNum=30;
		//int INum=Inum+=ByteNum; // we must give value to local varaiables
		
		String str1="Result A"+1+2; 
		System.out.println(str1);
		
		String str2="Result A"+7*2;
		System.out.println(str2);//multiplication works first//Result A14
		
		//String str3="Result A"+7-2; will give error
		
		String str4="Result A"+8%2;//Result A0
				System.out.println(str4);
		
		System.out.println("Result A"+(1+2));//Result A3
		
		double J,K,P=10.5;//Local variables MUST be initialized before use ==true, !false
		System.out.println(P);
		
		
		
		
		
		
		
		
		
	}

}
