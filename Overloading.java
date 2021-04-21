package Factorial;

public class Overloading {

	public static void main(String[] args) {

		String[] strArr = { "100", "200", "300" };

		System.out.println(concatenate(" ", "100", "200", "300"));

		System.out.println(concatenate("-", strArr));
		
		System.out.println(concatenate(",", strArr));
		
	}

	static String concatenate(String delim, String... arg) {

		String result = "";

		for (String str : arg) {

			result += str + delim;
		}

		return result;
	}

}
