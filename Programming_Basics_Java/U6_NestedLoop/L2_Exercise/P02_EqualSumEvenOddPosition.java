package U5_Lists.L1_Lab.L2_Exercise;

import java.util.Scanner;

public class EqualSumEvenOddPosition_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        for (int currentNumber = firstNumber; currentNumber <= secondNumber; currentNumber++) {

            String textNumber = currentNumber + "";
            //String second = String.valueOf(currentNumber);
            //String third = Integer.toString(currentNumber);

            int evenPositionSum = 0;
            int oddPositionSum = 0;

            for (int position = 0; position < textNumber.length(); position++) {

                int currentDigit = Integer.parseInt(String.valueOf(textNumber.charAt(position)));
                if (position % 2 == 0) {
                    evenPositionSum += currentDigit;
                } else {
                    oddPositionSum += currentDigit;
                }
            }

            if (evenPositionSum == oddPositionSum) {
                System.out.print(currentNumber + " ");
            }
        }
    }
}
