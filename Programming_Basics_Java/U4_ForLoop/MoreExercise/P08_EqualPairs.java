package U5_List.L1_Lab.MoreExercise;

import java.util.Scanner;

public class EqualPairs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pairsCount = Integer.parseInt(scanner.nextLine());
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int currentSum = 0;

        for (int i = 1; i <= pairsCount; i ++) {
            int number1 = Integer.parseInt(scanner.nextLine());
            int number2 = Integer.parseInt(scanner.nextLine());

            currentSum = number1 + number2;

            if (currentSum > maxSum) {
                currentSum += maxSum;
            }

        }
    }
}
