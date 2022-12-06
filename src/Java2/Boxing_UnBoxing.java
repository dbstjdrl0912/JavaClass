package Java2;

import java.util.Arrays;

public class Boxing_UnBoxing {
	public static void main(String[] args) {
//	Integer obj1 = new Integer("100");
//	Integer obj2 = new Integer("200");
//	Integer obj3 = Integer.valueOf("300");
//	
//	int value1 = obj1.intValue();
//	int value2 = obj2.intValue();
//	int value3 = obj3.intValue();
//	
//	System.out.println(value1);
//	System.out.println(value2);
//	System.out.println(value3);
	
		Integer obj = 100;
		System.out.println("value : " + obj.intValue());
		
		int value =obj;
		System.out.println("value : " + value);
		
		int result = obj +100;
		System.out.println("result : " +result);
	
	
	}
}
