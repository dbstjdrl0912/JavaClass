package Java2;
public class Switch_1 {
	public static void main(String[] args) {
		int num = (int)(Math.random()*6)+1;
		//math random - 0.0=<1.0 사이의 실수값을 랜덤으로 발생시키는 기능
		
		switch(num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		case 6:
			System.out.println("6번이 나왔습니다.");
			break;
		}

	}

}
