package L2_Exercise;

import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int stayNights = Integer.parseInt(scanner.nextLine());

        double priceStudio = 0;
        double priceApartment = 0;

        switch (month) {
            case "May":
            case "October":
                priceStudio = 50.00 * stayNights;
                priceApartment = 65.00 * stayNights;

                if (stayNights > 14) {
                    priceStudio = priceStudio * 0.70;
                    priceApartment = priceApartment * 0.90;
                } else if (stayNights > 7) {
                    priceStudio = priceStudio * 0.95;
                }
                System.out.printf("Apartment: %.2f lv. %nStudio: %.2f lv.", priceApartment, priceStudio);

                break;

            case "June":
            case "September":
                priceStudio = 75.20 * stayNights;
                priceApartment = 68.70 * stayNights;

                if (stayNights > 14) {
                    priceStudio = priceStudio * 0.80;
                    priceApartment = priceApartment * 0.90;
                }
                System.out.printf("Apartment: %.2f lv. %nStudio: %.2f lv.", priceApartment, priceStudio);

                break;

            case "July":
            case "August":
                priceStudio = 76.00 * stayNights;
                priceApartment = 77.00 * stayNights;

                if (stayNights > 14) {
                    priceApartment = priceApartment * 0.90;
                }
                System.out.printf("Apartment: %.2f lv. %nStudio: %.2f lv.", priceApartment, priceStudio);

                break;
        }
    }
}
