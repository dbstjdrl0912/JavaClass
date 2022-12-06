package Integer_String;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "200";//a100 이면 인티져- 문자열을 인트 로 변경
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		int result = value1 +value2;
		System.out.println(data1 + "+" +data2 + "=" + result);
	}
}
