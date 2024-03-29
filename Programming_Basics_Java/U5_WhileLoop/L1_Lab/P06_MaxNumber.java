package U5_Lists.L1_Lab;

import java.util.Scanner;

public class MaxNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int maxNumber = Integer.MIN_VALUE;

        while (!input.equals("Stop")) {
            int number = Integer.parseInt(input);

            if(maxNumber < number) {
                maxNumber = number;
            }

            input = scanner.nextLine();
        }

        System.out.println(maxNumber);
    }
}
