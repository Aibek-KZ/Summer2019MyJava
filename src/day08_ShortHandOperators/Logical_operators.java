package day08_ShortHandOperators;

public class Logical_operators {
	
	public static void main(String[] args) {
		/*
		 *  & : and logic ==> true && true ==>true, if both conditions are true, othervise false
		 *  ||: or logic==> true || false ==>true
		 *                  true || true ==>true
		 *                  false||false ==>false
		 *  if both conditions are False it will return False, otherwise will return true     
		 */
		
		boolean ResultA=9 ==0 && "Muhtar"=="good";
		  //         false          false ==>false
		System.out.println(ResultA);
		
		boolean ResulB = 8>5 && 7==(8-2+1);
		     //            true && true==>true
		System.out.println(ResulB);   
		
		boolean ResultC = !false !=true && !false==!(!true);
		//               true !true && true ==!false
		//               false    && true==>false
		System.out.println(ResultC);
		
		// ||:
		boolean A="Monday" =="Fun-day" || 6==6;
		//            false            ||true
         System.out.println(A);		
         
         boolean B=true||false;//true
         System.out.println(B);
         
         boolean C=!(8>5) ||!("Today" !="Friday");//false
         //       !true   || !true
         //       false   || false
         
         boolean D=true &&true || false;//true
         //         true ||false
         
         boolean E=!(7>5&&6 !=5) && (9>5 ||10>4);//false
         //         !(true && true)&& (true||true)
         //        !true    &&    true     
         //        false    &&    true
         System.out.println(E);
         
         
         
	}

}
