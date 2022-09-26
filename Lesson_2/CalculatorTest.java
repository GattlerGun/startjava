import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		String userAnswer = "yes";
		Scanner scan = new Scanner(System.in);
		Calculator calc = new Calculator();
		while(!userAnswer.equals("no")) {
			switch(userAnswer) {
				case "yes":
					System.out.println("Введите первое число: ");
					int num1 = scan.nextInt();
					calc.setNum1(num1);
					System.out.println("Введите второе число: ");
					int num2 = scan.nextInt();
					calc.setNum2(num2);
					System.out.println("Введите математическую операцию(+, -, /, *, ^, %):");
					char sign = scan.next().charAt(0);
					calc.setSign(sign);
					int result = calc.calculate();
					System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
				default:
					System.out.println("Хотите продолжить вычисления? [yes/no]:");
					userAnswer = scan.next();
			}
		}
		scan.close();
	}
}