package MoreExercise;

import java.util.Scanner;

public class WeddingSeats_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sectorInput = scanner.nextLine();
        char lastSector = sectorInput.charAt(0);

        int rowsFirstSector = Integer.parseInt(scanner.nextLine());
        int seatsOdd = Integer.parseInt(scanner.nextLine());
        int seatsEven = seatsOdd + 2;
        int seats = 0;
        int counter = 0;

        for (char i = 'A'; i <= lastSector; i++) {
            rowsFirstSector++;
            for (int j = 1; j <= rowsFirstSector - 1; j++) {
                if (j % 2 == 0) {
                    seats = seatsEven;
                } else {
                    seats = seatsOdd;
                }
                for (int k = 1; k <= seats; k++) {

                    //convert int into char
                    char seat = (char) (k + 96);
                    counter++;
                    System.out.printf("%s%d%s\n", i, j, seat);
                }
            }
        }
        System.out.println(counter);
    }
}