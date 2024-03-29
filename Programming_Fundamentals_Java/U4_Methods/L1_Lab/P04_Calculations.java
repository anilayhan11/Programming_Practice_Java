//Solution with void method;
package U4_Methods.L1_Lab;

import java.util.Scanner;

public class P04_Calculations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String operation = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        switch (operation) {
            case "add":
                add(num1, num2);
                break;
            case "multiply":
                multiply(num1, num2);
                break;
            case "subtract":
                subtract(num1, num2);
                break;
            case "divide":
                divide(num1, num2);
                break;
        }
    }

    private static void add(int a, int b) {
        System.out.println(a + b);
    }

    private static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    private static void subtract(int a, int b) {
        System.out.println(a - b);
    }

    private static void divide(int a, int b) {
        System.out.println(a / b);
    }
}