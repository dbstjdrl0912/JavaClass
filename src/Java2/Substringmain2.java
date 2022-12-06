package Java2;

public class Substringmain2 {
	public static void main(String[] args) {

		String ssn = "870913-1234567";
			
		String firstNum = ssn.substring(0,2); // 앞에는 인덱스 번호  뒤에는 시작하는 배열부터 출력하고싶은 배열
		String secondNum = ssn.substring(7,9);
		
		System.out.println("firstNum = " + firstNum);
		System.out.println("secondNum = " + secondNum);
		
	}
	}


