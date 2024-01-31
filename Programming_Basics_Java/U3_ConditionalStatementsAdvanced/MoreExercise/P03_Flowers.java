package U5_List.L1_Lab.MoreExercise;

import java.util.Scanner;

public class Flowers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int boughtHrizantemi = Integer.parseInt(scanner.nextLine());
        int boughtRozi = Integer.parseInt(scanner.nextLine());
        int boughtLaleta = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();

        double price = 0.00;

        switch (season) {
            case "Spring":
            case "Summer":
                price = boughtHrizantemi * 2.00 + boughtRozi * 4.10 + boughtLaleta * 2.50;
                break;
            case "Autumn":
            case "Winter":
                price = boughtHrizantemi * 3.75 + boughtRozi * 4.50 + boughtLaleta * 4.15;
                break;
            default:
                System.out.println("Invalid season");
        }

        if (holiday.equals("Y")) {
            price = price * 1.15;
        }
        if (season.equals("Spring") && boughtLaleta > 7) {
            price = price * 0.95;
        }
        if (season.equals("Winter") && boughtRozi >= 10) {
            price = price * 0.90;
        }
        if ((boughtHrizantemi + boughtRozi + boughtLaleta) > 20) {
            price = price * 0.80;
        }

        System.out.printf("%.2f", (price + 2.00));
    }
}

