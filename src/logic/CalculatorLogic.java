package logic;

public class CalculatorLogic {
	
	double result;
	
	public CalculatorLogic() {
	}
	
	public double calculateAnswer(double number1, double number2, char operator) {
		switch(operator) {
			case '+':
				this.result = number1 + number2;
				break;
			case '-':
				this.result = number1 - number2;
				break;
			case '*':
				this.result = number1 * number2;
				break;
			case '/':
				this.result = number1 / number2;
				break;
			default:
				this.result = 0.0;
		}
		return result;
	}

}
