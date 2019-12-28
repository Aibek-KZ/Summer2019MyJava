package day42_OOP_Encapsulation;

public class practiceTest {
	public static void main(String[] args) {
		
		System.out.println(practice.a);
		
		practice obj=new practice();
		System.out.println(obj.b);

	   System.out.println(obj.getc());
	   System.out.println(obj.getd());
	   System.out.println(obj.getName());
	   obj.setName("Adiya");
	   System.out.println(obj.getName());
	   
	   System.out.println(obj.getd());
	   obj.setd(700);
	   System.out.println(obj.getd());
	   
	}

}
