package Car;

public class SportsCar extends Car {
	public void speedUp() {
		speed += 10;
	}

	public void stop() {
		System.out.println("SportsCar 를 멈춤");
		speed = 0;
	}
}
