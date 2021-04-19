package Factorial;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter!");
		int num = sc.nextInt();

		System.out.println(Factorial(num));

		recur(num);

	}

	public static int Factorial(int num) {

		if (num > 0) {

			return num * Factorial(num - 1);
		} else {

			return 1;
		}
	}

	public static void recur(int num) {
		if (num > 0) {
			recur(num - 1);
			System.out.println(num);
			recur(num - 2);
		}
	}

}
