package Practice;

public class Client {

	public static void main(String[] args) {

		int firstNum = 100;
		int secondNum = 20;

		AbstractOperationBuilder[] operationBuilders = new AbstractOperationBuilder[2];

		operationBuilders[0] = new AddOperationBuilder(firstNum, secondNum);

		operationBuilders[1] = new SubstractOperationBuilder(firstNum, secondNum);

		for (int i = 0; i < operationBuilders.length; i++) {

			OperationDirector operationDirector = new OperationDirector(operationBuilders[i]);

			operationDirector.construct();
		}

	}

}
