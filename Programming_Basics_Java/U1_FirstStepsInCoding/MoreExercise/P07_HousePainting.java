package U5_Lists.L1_Lab.MoreExercise;

import java.util.Scanner;

public class HousePainting_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double greenArea = (x * x * 2) + (x * y * 2) - (1.2 * 2) - (1.5 * 1.5 * 2);
        double redArea = (x * h) + (x * y * 2);

        double greenPaint = greenArea / 3.4;
        double redPaint = redArea / 4.3;

        System.out.printf("%.2f%n", greenPaint);
        System.out.printf("%.2f", redPaint);
    }
}
