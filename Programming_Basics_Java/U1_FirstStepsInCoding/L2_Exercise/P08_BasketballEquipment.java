package U5_Lists.L1_Lab.L2_Exercise;

import java.util.Scanner;

public class BasketballEquipment_08 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int yearlyFee = Integer.parseInt(scanner.nextLine());

            double sneakers = yearlyFee - (yearlyFee * 0.4);
            double clothing = sneakers - (sneakers * 0.2);
            double ball = clothing / 4;
            double accessories = ball / 5;
            double totalExpenses = yearlyFee + sneakers + clothing + ball+ accessories;

            System.out.println(totalExpenses);
        }
    }
