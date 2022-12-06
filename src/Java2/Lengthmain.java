package Java2;

public class Lengthmain {
	public static void main(String[] args) {

		String ssn = "123456-1234567";
		
		int length = ssn.length();
		System.out.println("length : " + length);
	if(length ==14) { 
		System.out.println("주민등록번호가 맞습니다.");
	}else { 
		 System.out.println("주민등록번호가 맞지 않습니다.");
	}
	}

}
