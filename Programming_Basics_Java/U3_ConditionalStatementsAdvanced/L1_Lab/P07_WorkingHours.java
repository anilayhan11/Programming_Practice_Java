package U5_Lists.L1_Lab;

import java.util.Scanner;

public class WorkingHours_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        /*
        if (hour >= 10 && hour <= 18 && !day.equals("Sunday")) {
            System.out.println("open");
        } else {
            System.out.println("closed");
            }
        */

        boolean workDay = day.equals("Monday") ||
                day.equals("Tuesday") ||
                day.equals("Wednesday") ||
                day.equals("Thursday") ||
                day.equals("Friday") ||
                day.equals("Saturday");

        boolean workHour = hour >= 10 && hour <= 18;

        if (workDay && workHour) {
            System.out.println("open");
        } else {
            System.out.println("closed");
        }
    }
}
