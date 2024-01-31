package U5_List.L1_Lab.MoreExercise;

import java.util.Scanner;

public class Harvest_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = Integer.parseInt(scanner.nextLine());
        double Y = Double.parseDouble(scanner.nextLine());
        int Z = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double actualWineLiters = (X * 0.40) * Y / 2.5;

        if (Z <= actualWineLiters) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(actualWineLiters));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(actualWineLiters - Z), Math.ceil((actualWineLiters - Z) / workers));
        } else
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(Z - actualWineLiters));
    }
}
