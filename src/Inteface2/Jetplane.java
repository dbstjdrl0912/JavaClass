package Inteface2;

public class Jetplane extends Plane implements Flyable , Soundable {
	
	public void sound() {
		System.out.println("제트기 소리 : 슈우우웅");
	}
	public void fly() {
		System.out.println("제트기가 날라갑니다.");
	}

}
