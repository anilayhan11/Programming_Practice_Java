package U5_Lists.L1_Lab.L2_Exercise;

import java.util.Scanner;

public class SpecialNumbers_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int myNumber = Integer.parseInt(scanner.nextLine());

        for (int currentNumber = 1111; currentNumber <= 9999; currentNumber++) {

            boolean isSpecial = true;
            String textNumber = String.valueOf(currentNumber);

            for (int position = 0; position < textNumber.length(); position++) {

                int digit = Integer.parseInt(String.valueOf(textNumber.charAt(position)));

                if (digit == 0) {
                    isSpecial = false;
                    break;
                }

                if (myNumber % digit != 0) {
                    isSpecial = false;
                    break;
                }
            }

            if (isSpecial) {
                System.out.print(currentNumber + " ");

            }
        }
    }
}
