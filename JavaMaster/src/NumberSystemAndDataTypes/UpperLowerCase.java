package NumberSystemAndDataTypes;

import java.util.Scanner;

public class UpperLowerCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		System.out.println(ch);

		if (ch >= 65 && ch <= 90) {
			ch = (char) ((char) ch + 32);
		}

		if (ch >= 97 && ch <= 122) {
			ch = (char) ((char) ch - 32);
		}

		System.out.println(ch);

	}

}
