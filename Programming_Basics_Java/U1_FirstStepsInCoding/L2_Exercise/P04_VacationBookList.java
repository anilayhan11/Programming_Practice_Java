package U5_List.L1_Lab.L2_Exercise;

import java.util.Scanner;

public class VacationBookList_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int numberOfDays = Integer.parseInt(scanner.nextLine());
        int hoursPerDay = (numberOfPages / pagesPerHour) / numberOfDays;

        System.out.println(hoursPerDay);

    }
}
