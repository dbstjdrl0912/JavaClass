package Airplane;

public class SuperAirplane extends Airplane {
	public static final int NORMAL =1;
	public static final int SUPER = 2;
	
	public int flymode = NORMAL;
	
	public void fly() {
		if (flymode == SUPER) {
			System.out.println("초음속비행중...");
		}else {
			super.fly();
		}
	}
}
	