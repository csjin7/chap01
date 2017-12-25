package chap01;

public class StringEqualsEx {

	public static void main(String[] args) {
		int[] arr = new int[3];
		for(int i=0;i<arr.length;i++) {
			System.out.println(" arr[" + i + "] = " + arr[i] );
		}
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(" arr[" + i + "] = " + arr[i] );
		}
		
		String[] str = new String[3];
		for(int i=0;i<str.length;i++) {
			System.out.println(" str[" + i + "] = " + str[i] );
		}
		
		str[0] = "10a";
		str[1] = "20b";
		str[2] = "30c";
		
		for(int i=0;i<str.length;i++) {
			System.out.println(" str[" + i + "] = " + str[i] );
		}

		
		
	}

	public static int add(int[] scores) {
		int sum = 0;
		
		for (int i=0; i < scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	} 

}
