package Basics;

/*

* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 



*/
public class Pattern6 {

	public static void main(String[] args) {

		int n = 5;
		int rows = 2 * n - 1;

		for (int i = 0; i < rows; i++) {
			if (i < n) {
				for (int j = 0; j <= i; j++) {
					System.out.print("* ");
				}
			} else {
				for (int j = 0; j < rows - i; j++) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}

	}

}
