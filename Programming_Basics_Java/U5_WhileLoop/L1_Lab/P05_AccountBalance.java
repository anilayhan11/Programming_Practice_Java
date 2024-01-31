package U5_List.L1_Lab;

import java.util.Scanner;

public class AccountBalance_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double sum = 0.00;
        double increase = 0.00;

        while (!input.equals("NoMoreMoney")) {
            increase = Double.parseDouble(input);

            if (increase < 0.00) {
                break;
            }
            System.out.printf("Increase: %.2f\n", increase);
            sum += increase;

            input = scanner.nextLine();
        }

        if (increase < 0) {
            System.out.println("Invalid operation!");
        }
        System.out.printf("Total: %.2f\n", sum);
    }
}