package U5_List.L1_Lab;

import java.util.Scanner;

public class YardGreening_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int metersSquared = Integer.parseInt(scanner.nextLine());

        // 1m^2 = 7.61 lv
        double totalPrice = metersSquared * 7.61;

        // 18% discount
        double discount = totalPrice * 0.18;

        double discountPrice = totalPrice - discount;


        System.out.printf("The final price is: %.2f lv.\n", discountPrice);
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}
