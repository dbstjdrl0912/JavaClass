package Java2;

import java.util.Arrays;

public class ParseInt {
public static void main (String[] args) { 
	int value1 = Integer.parseInt("10") ;
	double value2 = Double.parseDouble("3.14");
	value2 = value2 +1.2;
	boolean value3 = Boolean.parseBoolean("true");
	
	System.out.println("value1 :" + value1 );
	System.out.println("value2 :" + value2);
	System.out.println("value3 :" + value3);
	}
}
