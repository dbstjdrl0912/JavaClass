package Java2;

public class IfExam {
	public static void main(String[] args) {
		int num = 2;
	
	if(num > 5 )	{
		System.out.println("A");
	} else if(num > 7) {
		System.out.println("C");
	} else {
		System.out.println("D");
	}
	//위에서 true가 나올시 한문장은 건너띄어버림
	System.out.println("B");
}
}