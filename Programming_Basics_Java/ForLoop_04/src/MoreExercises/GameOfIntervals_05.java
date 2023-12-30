package MoreExercises;

import java.util.Scanner;

public class GameOfIntervals_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int moves = Integer.parseInt(scanner.nextLine());
        double result = 0.00;
        int category1 = 0;
        int category2 = 0;
        int category3 = 0;
        int category4 = 0;
        int category5 = 0;
        int category6 = 0;

        for (int i = 1; i <= moves; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number >= 0 && number <= 9) {
                category1++;
                result += number * 0.20;
            } else if (number >= 10 && number <= 19) {
                category2++;
                result += number * 0.30;
            } else if (number >= 20 && number <= 29) {
                category3++;
                result += number * 0.40;
            } else if (number >= 30 && number <= 39) {
                category4++;
                result += 50;
            } else if (number >= 40 && number <= 50) {
                category5++;
                result += 100;
            } else {
                category6++;
                result /= 2;
            }
        }

        System.out.printf("%.2f\n", result);
        System.out.printf("From 0 to 9: %.2f%%\n", category1 * 1.00 / moves * 100);
        System.out.printf("From 10 to 19: %.2f%%\n", category2 * 1.00 / moves * 100);
        System.out.printf("From 20 to 29: %.2f%%\n", category3 * 1.00 / moves * 100);
        System.out.printf("From 30 to 39: %.2f%%\n", category4 * 1.00 / moves * 100);
        System.out.printf("From 40 to 50: %.2f%%\n", category5 * 1.00 / moves * 100);
        System.out.printf("Invalid numbers: %.2f%%\n", category6 * 1.00 / moves * 100);

    }
}
