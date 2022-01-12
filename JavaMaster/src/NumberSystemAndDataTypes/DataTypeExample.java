package NumberSystemAndDataTypes;

public class DataTypeExample {

	public static void main(String[] args) {

		// part - 1

		byte b = 10;
		short sh = 20;
		int in = 30;
		long ln = 40;

		// b=sh;
		// b=in;
		// b=ln;

		sh = b;
		// sh=in;
		// sh=ln;

		in = b;
		in = sh;
		// in=ln;

		ln = b;
		ln = sh;
		ln = in;

		// part 2

		b = 10;
		b = 127;
		b = (byte) 128;
		System.out.println(b);

		// part3

		in = 1000000000;
//		in=10000000000;
		ln = 10000000000L;
		System.out.println(ln);

		// part 4
		sh = 32000;

		// part 5
//		float f = 5.5;
		float f = 5.5f;
		System.out.println(f);

		double db = 6.5;

		// part 6

		in = (int) f;
		System.out.println(in);

		f = in;
		System.out.println(f);

		// part7
		boolean bit = true;
//		bit=1;
//		bit=0;
		if (bit) {
			System.out.println("Hello");
		} else {
			System.out.println("Bye");
		}
		bit = false;
		if (bit) {
			System.out.println("Hello");
		} else {
			System.out.println("Bye");
		}

		// part 8
		char ch = 'a';
		ch = 99;
		System.out.println(ch);

//		ch = 64093;
//		System.out.println(ch);

//		ch=ch+2;
		ch = (char) (ch + 2);
		System.out.println(ch);

		// part 9

	}

}
