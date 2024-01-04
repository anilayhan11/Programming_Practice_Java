package MoreExercises;

import java.util.Scanner;

public class UniquePinCodes_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limitFirst = Integer.parseInt(scanner.nextLine());
        int limitSecond = Integer.parseInt(scanner.nextLine());
        int limitThird = Integer.parseInt(scanner.nextLine());
        int secondNum = 0;

        for (int i = 2; i <= limitFirst; i += 2) {
            for (int j = 2; j <= limitSecond; j++) {
                if (j != 4 && j != 6 && j != 8 && j != 9) {
                    secondNum = j;
                } else {
                    continue;
                }
                for (int k = 2; k <= limitThird; k += 2) {
                    System.out.printf("%d %d %d\n", i, secondNum, k);
                }
            }
        }
    }
}

