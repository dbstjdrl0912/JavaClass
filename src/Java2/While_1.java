package Java2;
public class While_1 {
	public static void main(String[] args) {
	int i = 1;
	
	while (i <= 10 ) {
		System.out.println(i);
		i++;
		
		if(i == 5 ) {
			break;
		}
	}
	}

}
//while 에 true 넣을시 무한생성
//i++ 을 없애면 무한1 재생