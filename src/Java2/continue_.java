package Java2;
//짝수 생성기
public class continue_ {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if ( i % 2 != 0)
				continue;
			
			System.out.println(i);
		}
	}

}
