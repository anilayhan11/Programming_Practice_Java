package U5_List.L1_Lab.MoreExercise;

import java.util.Scanner;

public class BikeRace_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniorRidersNumber = Integer.parseInt(scanner.nextLine());
        int seniorRidersNumber = Integer.parseInt(scanner.nextLine());
        String terrain = scanner.nextLine();

        double collectedMoney = 0.00;

        switch (terrain) {
            case "trail":
                collectedMoney = (juniorRidersNumber * 5.50 + seniorRidersNumber * 7.00) * 0.95;
                break;
            case "cross-country":
                if ((juniorRidersNumber + seniorRidersNumber) >= 50) {
                    collectedMoney = (juniorRidersNumber * (8.00 * 0.75) + seniorRidersNumber * (9.50 * 0.75)) * 0.95;
                } else {
                    collectedMoney = (juniorRidersNumber * 8.00 + seniorRidersNumber * 9.50) * 0.95;
                }
                break;
            case "downhill":
                collectedMoney = (juniorRidersNumber * 12.25 + seniorRidersNumber * 13.75) * 0.95;
                break;
            case "road":
                collectedMoney = (juniorRidersNumber * 20.00 + seniorRidersNumber * 21.50) * 0.95;
                break;
            default:
                System.out.println("Invalid terrain");
        }
        System.out.printf("%.2f", collectedMoney);
    }
}
