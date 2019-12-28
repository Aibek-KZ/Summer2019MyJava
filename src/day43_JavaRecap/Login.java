package day43_JavaRecap;

public class Login {
	public static void main(String[] args) {
		
		Credentials obj = new Credentials();
		obj.username="Saya";
		obj.password="Data";
				System.out.println(obj.username);
		System.out.println(obj.password);
	
	
	//	System.out.println(obj.Username); private data
	//	System.out.println(obj.Password); private data
		System.out.println(obj.getUsername());
		System.out.println(obj.getPassword());
		
		Credentials obj1 = new Credentials();
		System.out.println(obj1.getUsername());
		System.out.println(obj1.getPassword());
		
		
		//modify:
		obj.setUsername("Amina");
		obj.setPassword("Akosh");
		System.out.println(obj.getUsername());
		System.out.println(obj.getPassword());

		
		
	}

}
