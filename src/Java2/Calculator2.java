package Java2;

public class Calculator2 {
	double areaRectangle (double wdith) {
		return wdith * wdith;
	}
	double areaRectangle(double width, double height) {
		return width* height;
	} 
	public static void main(String[]args) {
		Calculator2 myCalc = new Calculator2();
		double result1 = myCalc.areaRectangle(4.0);
				double result2 = myCalc.areaRectangle(4.0,6.0);
				
				System.out.println(result1);
				System.out.println(result2);
	}
}
