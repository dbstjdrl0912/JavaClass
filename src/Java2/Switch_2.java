package Java2;
public class Switch_2 {
	public static void main(String[] args) {
/*		0.0<= Math.random() < 1.0
		0.0<= M*4 < 4.0
		0<= (int)(M*4) < 4
		8<= (int)(M*4)+8 <12
		8.9.10.11*/
	int time= (int) (Math.random()*4)+8;
			System.out.println("현재시간 : " + time);
		switch (time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 봅니다.");
		default:
			System.out.println("외근을 나갑니다.");
		}
	}
}
