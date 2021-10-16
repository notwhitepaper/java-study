package test;

public class TernaryCondition {
	// 삼항 조건 연산자(조건 ? A : B )
	public static void main(String[] args) {
		System.out.println(true ? "yes" : "no");

		int[] values = { 34, 765, 234, 23, 12 };
		int max = 0;
		for (int x : values) {
			max = x > max ? x : max;

		}
		System.out.println(max);
	}
}
