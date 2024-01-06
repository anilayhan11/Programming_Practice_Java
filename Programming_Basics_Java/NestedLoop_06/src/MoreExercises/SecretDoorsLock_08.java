package MoreExercises;

import java.util.Scanner;

public class SecretDoorsLock_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int limitHundreds = Integer.parseInt(scanner.nextLine());
        int limitTens = Integer.parseInt(scanner.nextLine());
        int limitOnes = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= limitHundreds; i += 2) {
            for (int j = 2; j <= limitTens; j++) {
                if (j == 4 || j == 6 || j == 8 || j == 9) {
                    continue;
                }
                for (int k = 2; k <= limitOnes; k += 2) {
                    System.out.printf("%d %d %d\n", i, j, k);
                }
            }
        }
    }
}
