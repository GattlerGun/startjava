import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		String userAnswer = "yes";
		boolean isYes = true;
		Scanner scan = new Scanner(System.in);
		Calculator calc = new Calculator();
		while(isYes) {
			if(userAnswer.equals("yes")){
				System.out.println(userAnswer);
				System.out.println("Введите первое число: ");
				calc.setNum1(scan.nextInt());
				int num1 = calc.getNum1();
				System.out.println("Введите второе число: ");
				calc.setNum2(scan.nextInt());
				int num2 = calc.getNum2();
				System.out.println("Введите математическую операцию(+, -, /, *, ^, %):");
				calc.setSign(scan.next().charAt(0));
				char sign = calc.getSign();
				if((num1 >= 0) && (num2 >= 0)) {
					int result = calc.calculation(sign, num1, num2);
					System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
				} else {
					System.out.println("только положительные числа!");
				}
				System.out.println("Хотите продолжить вычисления? [yes/no]:");
				userAnswer = scan.next();
			} else if(userAnswer.equals("no")) {
				isYes = false;
			} else {
				System.out.println("Хотите продолжить вычисления? [yes/no]:");
				userAnswer = scan.next();
			}
		}
		scan.close();
	}
}