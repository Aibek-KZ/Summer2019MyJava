package day58_Exceptions;

import java.io.FileInputStream;
import java.util.Properties;

public class practice {
	public static void main(String[] args) {
		waitt(1);
		practice obj = new practice();
		obj.name();
		
		System.out.println(getData("Name", "C:\\Users\\Aibek\\Desktop\\Data.properties"));
	}
	
	public static void waitt(double seconds) {
		try {
		Thread.sleep((long)(seconds*1000));
		System.out.println("checked exception");
		}catch(Exception e) {
			System.out.println("unchecked exeption");
		}
	}
	
	public void name() {
		try {
			
		}catch(Exception e) {
		int[] number = {1,2,3,4,5};		
		System.out.println(number[6]);
		} finally {
			System.out.println("finally");
		}
	}
	
	public static String getData(String Key, String Path) {
		String Data="";
		Properties property = new Properties();
		try {
		FileInputStream file = new FileInputStream(Path);
		property.load(file);
		}catch(Exception e) {
			
		}
		Data=property.getProperty(Key);
		return property.getProperty(Key);
				
	}

}
