package chap01;

public class ForEx {
	public static void main(String [] args) {
		
	if(args.length != 2) {
		System.out.println(" 파라메터 2개이상 입력 바람");
		System.exit(0);
	}
	
	String strNum1 = args[0];
	String strNum2 = args[1];
	
	int num1 = Integer.parseInt(strNum1);
	int num2 = Integer.parseInt(strNum2);
	
	int sum = num1 + num2;
	
	System.out.println("num1 " +  num1 + " + " + "num2 : " + num2 + " = " + sum);
	
	
	
	}
}