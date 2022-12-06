package Java2;

import java.util.Scanner;

public class if_test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		sc.close();
		
		if (x>= 4.0 && y >= 4.0) {
			System.out.println("A");
		}
		else if (x >= 3.0 && y >= 3.0) {
			System.out.println("B");
		}
		else {
			System.out.println("C");
		}
	}
}
