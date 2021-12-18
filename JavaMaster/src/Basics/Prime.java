package Basics;

public class Prime {

	public static void main(String[] args) {
		int n = 10;

		boolean flag = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				flag = false;
				break;
			}
		}

		if (flag == true) {
			System.out.println("number is prime");
		} else {
			System.out.println("number is not prime");
		}

	}

}
