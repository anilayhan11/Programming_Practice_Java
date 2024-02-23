package U5_Lists.L1_Lab.MoreExercise;

import java.util.Scanner;

public class FootballLeague_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        int fansTotal = Integer.parseInt(scanner.nextLine());

        int fansA = 0;
        int fansB = 0;
        int fansV = 0;
        int fansG = 0;

        for (int i = 1; i <= fansTotal; i++) {
            String sector = scanner.nextLine();

            switch (sector) {
                case "A":
                    fansA++;
                    break;
                case "B":
                    fansB++;
                    break;
                case "V":
                    fansV++;
                    break;
                case "G":
                    fansG++;
                    break;
            }
        }
        System.out.printf("%.2f%%\n", fansA * 1.00 / fansTotal * 100);
        System.out.printf("%.2f%%\n", fansB * 1.00 / fansTotal * 100);
        System.out.printf("%.2f%%\n", fansV * 1.00 / fansTotal * 100);
        System.out.printf("%.2f%%\n", fansG * 1.00 / fansTotal * 100);
        System.out.printf("%.2f%%\n", fansTotal * 1.00 / stadiumCapacity * 100);
    }
}
