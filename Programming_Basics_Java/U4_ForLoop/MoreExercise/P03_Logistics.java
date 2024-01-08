package MoreExercise;

import java.util.Scanner;

public class Logistics_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cargo = Integer.parseInt(scanner.nextLine());
        double minibusPrice = 0.00;
        double truckPrice = 0.00;
        double trainPrice = 0.00;
        int minibusTons = 0;
        int truckTons = 0;
        int trainTons = 0;
        int totalTons = 0;

        for (int i = 1; i <= cargo; i++) {
            int tons = Integer.parseInt(scanner.nextLine());
            totalTons += tons;

            if (tons <= 3) {
                minibusTons += tons;
                minibusPrice += tons * 200;
            } else if (tons <= 11) {
                truckTons += tons;
                truckPrice += tons * 175;
            } else {
                trainTons += tons;
                trainPrice += tons * 120;
            }
        }
        double totalPrice = minibusPrice + truckPrice + trainPrice;
        System.out.printf("%.2f\n", totalPrice / totalTons);
        System.out.printf("%.2f%%\n", minibusTons * 1.00 / totalTons * 100);
        System.out.printf("%.2f%%\n", truckTons * 1.00 / totalTons * 100);
        System.out.printf("%.2f%%\n", trainTons * 1.00 / totalTons * 100);
    }
}
