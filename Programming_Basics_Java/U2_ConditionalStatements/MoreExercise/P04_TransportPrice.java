package U5_Lists.L1_Lab.MoreExercise;

import java.util.Scanner;

public class TransportPrice_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int km = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();

        double price;

        if (km < 20 && time.equals("day")) {
            price = km * 0.79 + 0.70;
        } else if (km < 20 && time.equals("night")) {
            price = km * 0.90 + 0.70;
        } else if (km < 100) {
            price = km * 0.09;
        } else {
            price = km * 0.06;
        }

        System.out.printf("%.2f", price);
    }
}
