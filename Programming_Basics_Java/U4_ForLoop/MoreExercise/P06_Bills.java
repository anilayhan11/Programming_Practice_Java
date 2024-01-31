package U5_List.L1_Lab.MoreExercise;

import java.util.Scanner;

public class Bills_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int monthsCount = Integer.parseInt(scanner.nextLine());
        double electricityTotal = 0.00;
        double other = 0.00;

        for (int i = 1; i <= monthsCount; i++) {
            double electricityBill = Double.parseDouble(scanner.nextLine());
            electricityTotal += electricityBill;
            other += (electricityBill + 35) * 1.20;
        }
        double waterTotal = 20 * monthsCount * 1.00;
        double internetTotal = 15 * monthsCount * 1.00;
        double billsTotal = electricityTotal + waterTotal + internetTotal + other;

        System.out.printf("Electricity: %.2f lv\n", electricityTotal);
        System.out.printf("Water: %.2f lv\n", waterTotal);
        System.out.printf("Internet: %.2f lv\n", internetTotal);
        System.out.printf("Other: %.2f lv\n", other);
        System.out.printf("Average: %.2f lv\n", billsTotal / monthsCount);

    }
}
