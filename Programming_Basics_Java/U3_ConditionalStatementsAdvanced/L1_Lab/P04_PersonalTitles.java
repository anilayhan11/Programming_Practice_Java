package U5_List.L1_Lab;

import java.util.Scanner;

public class PersonalTitles_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String pol = scanner.nextLine();

        String title = null;

        if (pol.equals("f")) {
            if (age >= 16) {
                title = "Ms.";
            } else {
                title = "Miss";
            }
        } else if (pol.equals("m")) {
            if (age >= 16) {
                title = "Mr.";
            } else {
                title = "Master";
            }
        }
        if (title != null) {
            System.out.println(title);
        }
    }
}
