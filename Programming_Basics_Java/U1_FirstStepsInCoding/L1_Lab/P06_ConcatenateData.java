package L1_Lab;

import java.util.Scanner;

public class ConcatenateData_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();

        // Print formatted text (see "String Format Specifiers"). Common ones are:
        // %s - string
        // %d - signed integer
        // %f - float

        System.out.printf("You are %s %s, a %d-year-old person from %s.", firstName, lastName, age, town);
    }
}
