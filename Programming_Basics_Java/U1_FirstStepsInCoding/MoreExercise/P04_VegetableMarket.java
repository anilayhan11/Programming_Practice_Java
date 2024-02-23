package U5_Lists.L1_Lab.MoreExercise;

// Градинар продавал реколтата от градината си на зеленчуковата борса.
// Продава зеленчуци за N лева на килограм и плодове за M лева за килограм.
// Напишете програма, която да пресмята приходите от реколтата в евро ( ако приемем, че едно евро е равно на 1.94лв).

import java.util.Scanner;

public class VegetableMarket_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        double m = Double.parseDouble(scanner.nextLine());
        double kgn = Double.parseDouble(scanner.nextLine());
        double kgm = Double.parseDouble(scanner.nextLine());
        double incomeInEuro = ((n * kgn) + (m * kgm)) / 1.94;

        System.out.printf("%.2f", incomeInEuro);

    }
}
