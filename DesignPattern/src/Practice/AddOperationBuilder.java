package Practice;

public class AddOperationBuilder extends AbstractOperationBuilder {

	public AddOperationBuilder(int firstNum, int secondNum) {
		super(firstNum, secondNum);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int operate(int firstNum, int secondNum) {
		// TODO Auto-generated method stub
		return firstNum + secondNum;
	}

	@Override
	public void buildOperator() {

		result.append("+");

	}

}
