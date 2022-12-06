package Calculator;

public class Computer2 {
	public static void main(String[] args) {
	int r = 10;
	
	Calculator	 Calculator = new Calculator();
	System.out.println("원면적 : "+ Calculator.areaCircle(r));
	System.out.println();
	
	Computer	computer = new Computer();
	System.out.println("원면적 : " + computer.areaCircle(r));
	}

}
