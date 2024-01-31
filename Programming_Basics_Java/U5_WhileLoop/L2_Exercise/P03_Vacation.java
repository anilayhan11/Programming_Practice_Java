package U5_List.L1_Lab.L2_Exercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());

        int consecutiveSpends = 0;
        int totalDays = 0;

        while (currentMoney < neededMoney) {

            String action = scanner.nextLine();
            double moneyAmount = Double.parseDouble(scanner.nextLine());
            totalDays++;

            switch (action) {
                case "spend":
                    currentMoney -= moneyAmount;

                    if (currentMoney < 0) {
                        currentMoney = 0;
                    }
                    consecutiveSpends++;
                    break;
                case "save":
                    currentMoney += moneyAmount;
                    consecutiveSpends = 0;
                    break;
            }
            if (consecutiveSpends == 5) {

                System.out.println("You can't save the money.");
                System.out.println(totalDays);
                return;
            }
        }
        System.out.printf("You saved the money for %d days.", totalDays);
    }
}
