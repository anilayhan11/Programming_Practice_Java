package L2_Exercise;

import java.util.Scanner;

public class CinemaTickets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String film = scanner.nextLine();

        double counterMovie = 0;
        double counterStudent = 0;
        double counterStandard = 0;
        double counterKid = 0;


        while (!film.equals("Finish")) {
            double availableSeats = Integer.parseInt(scanner.nextLine());
            String ticketType = scanner.nextLine();
            while (!ticketType.equals("End")) {

                switch (ticketType) {
                    case "student": {
                        counterStudent++;
                        counterMovie++;
                        break;
                    }
                    case "standard": {
                        counterStandard++;
                        counterMovie++;
                        break;
                    }
                    case "kid": {
                        counterKid++;
                        counterMovie++;
                        break;
                    }
                }

                if (availableSeats == counterMovie) {
                    break;
                }
                ticketType = scanner.nextLine();

            }
            double percentFull = (counterMovie / availableSeats) * 100;
            System.out.printf("%s - %.2f%% full.\n", film, percentFull);
            counterMovie = 0;

            film = scanner.nextLine();
        }

        double totalTickets = counterStudent + counterStandard + counterKid;
        System.out.printf("Total tickets: %.0f\n", totalTickets);
        System.out.printf("%.2f%% student tickets.\n", counterStudent / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.\n", counterStandard / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.", counterKid / totalTickets * 100);
    }
}
