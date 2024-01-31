// Solution with switch case + if/else.
package U5_List.L1_Lab.L2_Exercise;

import java.util.Scanner;

public class OperationsBetweenNumbers2_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        if (numTwo == 0 && (operator.equals("/") || operator.equals("%"))) {
            System.out.printf("Cannot divide %d by zero", numOne);
            return;
        }

        double result = 0.00;
        String evenOrOdd = "";

        switch (operator) {
            case "+" -> {
                result = numOne + numTwo;
                if (result % 2 == 0) {
                    evenOrOdd = "even";
                } else {
                    evenOrOdd = "odd";
                }
            }
            case "-" -> {
                result = numOne - numTwo;
                if (result % 2 == 0) {
                    evenOrOdd = "even";
                } else {
                    evenOrOdd = "odd";
                }
            }
            case "*" -> {
                result = numOne * numTwo;
                if (result % 2 == 0) {
                    evenOrOdd = "even";
                } else {
                    evenOrOdd = "odd";
                }
            }
            case "/" -> result = (numOne * 1.0) / numTwo;
            case "%" -> result = numOne % numTwo;
        }

        if (operator.equals("+") || operator.equals("-") || operator.equals("*")) {
            System.out.printf("%d %s %d = %.0f - %s", numOne, operator, numTwo, result, evenOrOdd);
        } else if (operator.equals("/")) {
            System.out.printf("%d %s %d = %.2f", numOne, operator, numTwo, result);
        } else if (operator.equals("%")) {
            System.out.printf("%d %s %d = %.0f", numOne, operator, numTwo, result);

        }
    }
}

