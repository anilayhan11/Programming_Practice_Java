package Exercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPeople = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0.00;


        switch (type) {
            case "Students":
                switch (day) {
                    case "Friday":
                        price += 8.45;
                    case "Saturday":
                        price += 9.80;
                    case "Sunday":
                        price += 10.46;
                }

            case "Business":
                switch (day) {
                    case "Friday":
                        price += 10.90;
                    case "Saturday":
                        price += 15.60;
                    case "Sunday":
                        price += 16.00;
                }
            case "Regular":
                switch (day) {
                    case "Friday":
                        price += 15.00;
                    case "Saturday":
                        price += 20.00;
                    case "Sunday":
                        price += 22.50;
                }

        }
        if (type.equals("Students") && numPeople >= 30) {
            totalPrice = totalPrice * 0.85;
        }
        if (type.equals("Business") && numPeople >= 100)  {
            numPeople -= 10;
        }
        if (type.equals("Regular") && numPeople >= 10 && numPeople <= 20)  {
            totalPrice = totalPrice * 0.95;
        }
        double totalPrice =  price * numPeople;
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
