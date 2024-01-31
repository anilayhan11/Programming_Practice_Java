package U5_List.L1_Lab.L2_Exercise;

import java.util.Scanner;

public class SuppliesForSchool_05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int pens = Integer.parseInt(scan.nextLine());
        int markers = Integer.parseInt(scan.nextLine());
        int cleaning = Integer.parseInt(scan.nextLine());
        int percentDiscount = Integer.parseInt(scan.nextLine());

        double totalPrice = (pens * 5.80) + (markers * 7.20) + (cleaning * 1.20);
        double finalDiscount = totalPrice * (percentDiscount / 100.0);
        double finalPrice = totalPrice - finalDiscount;

        System.out.println(finalPrice);
    }
}
