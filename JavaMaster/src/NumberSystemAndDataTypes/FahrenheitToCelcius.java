package NumberSystemAndDataTypes;

public class FahrenheitToCelcius {

	public static void main(String[] args) {
		for (int i = 0; i <= 300; i = i + 20) {
			System.out.println(i + " " + (int) ((5.0 / 9) * (i - 32)));
		}

	}

}
