package assignment;

public class CalculatorSwitchCase {

	public static void main(String[] args) {

		int num1 = 100;
		int num2 = 200;
		char operation = '%';
		switch (operation) {
		case '+':
			int addition = num1 + num2;
			System.out.println("The addition of " + num1 + " & " + num2 + " =" + addition);
			break;
		case '-':
			int Substraction = num1 - num2;
			System.out.println("The addition of " + num1 + " & " + num2 + " =" + Substraction);
			break;
		case '*':
			int multiplication = num1 + num2;

			System.out.println("The multiplication of " + num1 + " & " + num2 + " =" + multiplication);
			break;
		case '/':
			int division = num1 / num2;
			System.out.println("The division of " + num1 + " & " + num2 + " =" + division);
			break;
		case '%':
			int remainder = num1 % num2;
			System.out.println("The remainder of " + num1 + " & " + num2 + " =" + remainder);
			break;
		default:
			System.out.print("Unknown operation");
		}
	}

}
