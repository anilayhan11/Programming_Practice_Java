package ProgrammingBasicsWithJava.ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class PipesInPool_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poolVol = Integer.parseInt(scanner.nextLine());
        int pipe1 = Integer.parseInt(scanner.nextLine());
        int pipe2 = Integer.parseInt(scanner.nextLine());
        double timeAway = Double.parseDouble(scanner.nextLine());

        double pipe1Cont = timeAway * pipe1;
        double pipe2Cont = timeAway * pipe2;
        double poolFullnessLt = pipe1Cont + pipe2Cont;

        if (poolVol >= poolFullnessLt) {
            double poolFullnessPer = poolFullnessLt / poolVol;
            double pipe1Per = pipe1Cont / poolVol;
            double pipe2Per = pipe2Cont / poolVol;
            System.out.printf("The pool is %f%% full. Pipe 1: f%. Pipe 2: f%.", poolFullnessPer, pipe1Per, pipe2Per);
        } else {
            System.out.printf("For {часовете, които тръбите са пълнили вода} hours the pool overflows with {литрите вода в повече} liters.");
        }
    }
}
