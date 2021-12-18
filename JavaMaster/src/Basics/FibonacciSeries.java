package Basics;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 8;

		int a = 0;
		int b = 1;

		int sum = a + b;

		for (int i = 2; i <= n; i++) {
			sum = a + b;
			a = b;
			b = sum;
		}
		System.out.println(sum);

	}

}
