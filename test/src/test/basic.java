package test;

import java.util.Scanner;

class basic {

	public static void main(String[] args) {

		int num1, num2;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number:");

		/*
		 * We are using data type double so that user can enter integer as well as
		 * floating point value
		 */
		num1 = scanner.nextInt();
		System.out.print("Enter second number:");
		num2 = scanner.nextInt();

		System.out.print("Enter an operator (+, -, *, /): ");
		char operator = scanner.next().charAt(0);

		scanner.close();
		int output;
		calculator t = new calculator();
		switch (operator) {
		case '+':

			output = t.add(num1, num2);
			break;

		case '-':

			output = t.sub(num1, num2);
			break;

		case '*':

			output = t.mul(num1, num2);
			break;

		case '/':

			output = t.div(num1, num2);
			break;

		/*
		 * If user enters any other operator or char apart from +, -, * and /, then
		 * display an error message to user
		 * 
		 */
		default:
			System.out.printf("You have entered wrong operator");
			return;
		}

		System.out.println(num1 + " " + operator + " " + num2 + ": " + output);
	}
}