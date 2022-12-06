package Car3;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();

		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();
			String[][] tireInfo = { { "앞왼쪽", "앞오른쪽", "뒤왼쪽", "뒤오른쪽" }, { "15", "13", "14", "17" } };
			if (problemLocation != 0) {
				String num = tireInfo[1][problemLocation - 1];

				car.tires[problemLocation - 1] = new HankookTire(tireInfo[1][problemLocation - 1],
						Integer.parseInt(num));
//2nd
//
//			String[] loc = { "앞왼쪽", "앞오른쪽", "뒤왼쪽", "뒤오른쪽" };
//			int[] life = { 15, 13, 14, 17 };
//			if (problemLocation != 0) {
//				car.tires[problemLocation - 1] = new HankookTire(loc[problemLocation - 1], life[problemLocation - 1]);
//			}2nd
//1st
//			switch(problemLocation) {
//			case 1:
//				System.out.println("앞 왼쪽 한국타이어 교체");
//			car.tires[0] = new HankookTire("앞 왼쪽",15);
//					break;
//			case 2:
//				System.out.println("앞 오른쪽 한국타이어 교체");
//			car.tires[1] = new HankookTire("앞 오른쪽",13);
//					break;
//			case 3:
//				System.out.println("뒤 왼쪽 한국타이어 교체");
//			car.tires[2] = new HankookTire("뒤 왼쪽",14);
//					break;
//			case 4:
//				System.out.println("뒤 오른쪽 한국타이어 교체");
//			car.tires[3] = new HankookTire("뒤 오른쪽",17);
//					break;
//			} 1st
				System.out.println("------------------------");
			}
		}

	}
}
