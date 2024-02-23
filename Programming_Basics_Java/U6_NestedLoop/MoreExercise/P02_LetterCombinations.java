package U5_Lists.L1_Lab.MoreExercise;

import java.util.Scanner;

public class LetterCombinations_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstLetter = scanner.nextLine();
        String lastLetter = scanner.nextLine();
        String missLetter = scanner.nextLine();

        char first = firstLetter.charAt(0);
        char last = lastLetter.charAt(0);
        char miss = missLetter.charAt(0);

        int count = 0;

        for (char i = first; i <= last; i++) {
            if (i == miss) {
                continue;
            }
            for (char j = first; j <= last; j++) {
                if (j == miss) {
                    continue;
                }
                for (char k = first; k <= last; k++) {
                    if (k == miss) {
                        continue;
                    }
                    count++;
                    System.out.printf("%s%s%s ", i, j, k);

                }
            }
        }
        System.out.print(count);
    }
}

