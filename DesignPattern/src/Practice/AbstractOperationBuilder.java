package Practice;

public abstract class AbstractOperationBuilder {

	protected StringBuffer result = new StringBuffer();

	private int firstNum;
	private int secondNum;

	public AbstractOperationBuilder(int firstNum, int secondNum) {

		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}

	public abstract int operate(int firstNum, int secondNum);

	public abstract void buildOperator();

	public final void buildFirstNumber() {

		result.append(firstNum);
	}

	public final void buildSecondNumber() {

		result.append(secondNum);
	}

	public final void buildAnswer() {

		int answer = operate(firstNum, secondNum);

		result.append("=" + answer);

	}

	public final StringBuffer getResult() {

		return result;
	}
}
