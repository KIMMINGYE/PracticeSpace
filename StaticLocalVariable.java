package prac;

public class StaticLocalVariable {

	static int num = 0;

	public static void main(String[] args) {

		int count = 0;

		while (count < 5) {

			test();

			count++;
		}

	}
	
	// static 변수는 고정기억영역에 할당되므로 지역변수와 달리 값이 계속 유지 반면에 지역변수는 함수가 호출될때마다 초기화됨

	static void test() {

		int a = 0;

		System.out.printf("num=%d,a=%d\n", num, a);

		num++;
		a++;

	}

}
