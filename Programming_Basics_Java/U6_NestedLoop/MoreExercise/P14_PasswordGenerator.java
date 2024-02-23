package U5_Lists.L1_Lab.MoreExercise;

import java.util.Scanner;

public class PasswordGenerator_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (char k = 97; k < (l + 97); k++) {
                    for (char m = 97; m < (l + 97); m++) {
                        for (int o = 1; o <= n; o++) {
                            if (o > j && o > i) {
                                System.out.printf("%d%d%s%s%d ", i, j, k, m, o);
                            }
                        }
                    }
                }
            }
        }
    }
}
