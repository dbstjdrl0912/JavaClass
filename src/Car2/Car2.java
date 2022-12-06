package Car2;

import java.util.Scanner;

public class Car2 {
	public static void main(String[] args) {

		Car myCar = new Car();

		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		myCar.setSpeed(-20);
		
		
		int speed = myCar.getSpeed();
		System.out.println("현재 속도 : " + speed);
		
		myCar.setSpeed(40);
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		if (!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("현재 속도 : " + myCar.getSpeed());
	}

}
