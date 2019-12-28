package day39_DecimalFormatterClass;

import java.text.DecimalFormat;

public class FormattingDecimals {
	public static void main(String[] args) {
		
		DecimalFormat format = new DecimalFormat(".000");
		
		double b = 23.465412313215464;
		
	//format(double): formats the decimals and returns string value
		String num1=format.format(b);//string
		System.out.println(num1);
		
		double c = 45.25685647;
		System.out.println(format.format(c));
		c=Double.parseDouble(format.format(c));
		System.out.println(c+1);
		
	}

}
