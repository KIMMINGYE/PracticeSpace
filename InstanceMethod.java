package stack;

class MyData {
	long a, b; //인스턴수 변수

	long add() {
		return a + b;
	}

	long substract() {
		return a - b;
	}

	long multiply() {
		return a * b;
	}

	double divide() {
		return a / b;
	}

	static long add(long a, long b) {
		return a + b;      //지역변수
	}

	static long substract(long a, long b) {
		return a - b;
	}

	static long multiply(long a, long b) {
		return a * b;
	}

	static double divide(double a, double b) {
		return a / b;
	}
}

public class InstanceMethod {

	public static void main(String[] args) {

		System.out.println(MyData.add(200L, 100L));

		System.out.println(MyData.substract(200L, 100L));

		System.out.println(MyData.multiply(200L, 100L));

		System.out.println(MyData.divide(200.0, 100.0));

		MyData md = new MyData();
		
		md.a=200L;
		md.b=100L;
		
		System.out.println(md.add());

		System.out.println(md.substract());

		System.out.println(md.multiply());

		System.out.println(md.divide());
		
	}

}
