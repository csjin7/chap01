package chap01;

public class AdvancedFor {
	public static void main(String[] args) {
		int[] scores = {10,20,30,40,90};
		
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		
		System.out.println(sum);
	}
}
