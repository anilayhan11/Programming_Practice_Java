package U5_List.L1_Lab.MoreExercise;

import java.util.Scanner;

public class LectureHall_05 {
    public static void main(String[] args) {

        // Read width and height of lecture hall
        Scanner scanner = new Scanner(System.in);
        double w = (Double.parseDouble(scanner.nextLine()) * 100);
        double h = (Double.parseDouble(scanner.nextLine()) * 100) - 100;

        // Calculate the number of seats that can fit in the width and height
        double wSeats = w / 120; // double wSeats = Math.round(w / 120);
        // int wSeatsInt = (int) wSeats;
        wSeats = Math.floor(wSeats);

        double hSeats = h / 70; // double hSeats = Math.round(h / 70);
        // int hSeatsInt = (int) hSeats;
        hSeats = Math.floor(hSeats);


        //Calculate the total number of seats that can fit in the lecture hall
        double SeatsTotalHall = (wSeats * hSeats) - 3;

        System.out.println(SeatsTotalHall);


    }
}
