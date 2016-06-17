/**
 * 
 */
package controller;

/**
 * @date : 2016. 6. 14.
 * @author : 한상호
 * @file : Calc.java
 * @story :
 */
public class Calc {
	public String execute(int inputNum1, String opcode, int inputNum2) {
		int num1 = inputNum1;
		String op = opcode;
		int num2 = inputNum2;
		int numResult = 0;
		switch (op) {
		case "+":
			op = "+";
			numResult = num1 + num2;
			break;
		case "-":
			op = "-";
			numResult = num1 - num2;
			break;
		case "*":
			op = "*";
			numResult = num1 * num2;
			break;
		case "/":
			op = "/";
			numResult = num1 / num2;
			break;
		case "%":
			op = "%";
			numResult = num1 % num2;
			break;
		default:
			System.out.println("1~5까지만 입력바랍니다");
			break;
		}
		return num1 + op + num2 + "=" + numResult;
	}
}
