package stack;

public class CallMethod {

	int iv = 10;
	static int cv = 20;

	int iv2 = cv;

	// static int cv2=iv; Error
	static int cv2 = new CallMethod().iv;

	static void staticMethod() {

		System.out.println(cv);

		// System.out.println(iv); Error
		System.out.println(new CallMethod().iv);

	}

	void instanceMethod() {
		System.out.println(cv);
		System.out.println(iv);
	}

	static void staticMethod2() {

		staticMethod();
		// instanceMethod(); Error

		new CallMethod().instanceMethod();

	}

	void instanceMethod2() {

		staticMethod();
		instanceMethod();

	}
}
