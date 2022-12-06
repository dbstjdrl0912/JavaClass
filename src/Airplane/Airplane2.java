package Airplane;

public class Airplane2 extends Airplane {
	public static  void main (String[] args) {
		SuperAirplane sa = new SuperAirplane();
		sa.takeoff();
		sa.fly();
		sa.flymode = SuperAirplane.SUPER;
		sa.fly();
		sa.flymode = SuperAirplane.NORMAL;
		sa.fly();
		sa.land();
	}
}
	