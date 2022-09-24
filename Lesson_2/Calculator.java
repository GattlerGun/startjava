public class Calculator {
	
	private int num1;
	private int num2;
	private int result;
	private char sign;

	public int getNum1() {
		return num1;
	}

	public void setNum1 (int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2 (int num2) {
		this.num2 = num2;
	}

	public int getResult() {
		return result;
	}

	public void setResult (int result) {
		this.result = result;
	}

	public char getSign() {
		return sign;
	}

	public void setSign (char sign) {
		this.sign = sign;
	}

	public int calculation(char sign, int num1, int num2) {
		switch(sign) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			case '^':
				result = 1;
				for(int i = 0; i < num2; i++) {
					result *= num1;
					}
				break;
			case '%':
				result = num1 % num2;
				break;
			default:
				 System.out.println("Такой операции в калькуляторе не реализовано");
				 break;
		}
		return result;
	}
}