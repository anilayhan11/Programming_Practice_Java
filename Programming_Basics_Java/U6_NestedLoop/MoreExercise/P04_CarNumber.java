package MoreExercise;

import java.util.Scanner;

public class CarNumber_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int last = Integer.parseInt(scanner.nextLine());

        for (int i = first; i <= last; i++) {
            for (int j = first; j <= last; j++) {
                for (int k = first; k <= last; k++) {
                    for (int l = first; l <= last; l++) {
                        if (i % 2 == 0 && l % 2 != 0 || l % 2 == 0 && i % 2 != 0) {
                            if ((j + k) % 2 == 0) {
                                if (i > l) {
                                    System.out.printf("%d%d%d%d ", i, j, k, l);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
