package MoreExercises;

import java.util.Scanner;

public class PrimePairs_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startFirstPair = Integer.parseInt(scanner.nextLine());
        int startSecondPair = Integer.parseInt(scanner.nextLine());
        int diffFirstPair = Integer.parseInt(scanner.nextLine());
        int diffSecondPair = Integer.parseInt(scanner.nextLine());
        int endFirstPair = startFirstPair + diffFirstPair;
        int endSecondPair = startSecondPair + diffSecondPair;

        for (int i = startFirstPair; i <= endFirstPair; i++) {
            for (int j = startSecondPair; j <= endSecondPair; j++) {

                //Prime number check
                boolean isPrime1 = true;
                for (int k = 2; k <= j / 2; k++) {
                    if ( j % k == 0) {
                        isPrime1 = false;
                    }
                }
                boolean isPrime2 = true;
                for (int l = 2; l <= i / 2; l++) {
                    if (i % l == 0) {
                        isPrime2 = false;
                    }
                }
                if (isPrime1 && isPrime2) {
                    System.out.printf("%d%d\n", i, j);
                }
            }
        }
    }
}
