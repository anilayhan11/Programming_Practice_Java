package MoreExercise;

import java.util.Scanner;

public class FlowerShop_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnolias = Integer.parseInt(scanner.nextLine());
        int hyacinths = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cacti = Integer.parseInt(scanner.nextLine());
        double presentPrice = Double.parseDouble(scanner.nextLine());
        double flowerEarnings = ((magnolias * 3.25) + (hyacinths * 4.00) + (roses * 3.50) + (cacti * 8)) * 0.95;

        if (flowerEarnings >= presentPrice) {
            System.out.printf("She is left with %.0f leva.", Math.floor(flowerEarnings - presentPrice));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(presentPrice - flowerEarnings));
        }
    }
}
