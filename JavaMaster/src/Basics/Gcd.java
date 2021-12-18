package Basics;

public class Gcd {

	public static void main(String[] args) {
		int n1 = 60;
		int n2 = 36;
		int rem = 0;
		while (n1 % n2 != 0) {
			rem = n1 % n2;
			n1 = n2;
			n2 = rem;
		}
		System.out.println(rem);

	}

}
