package MoreExercises;

import java.util.Scanner;

public class PipesInPool_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int V = Integer.parseInt(scanner.nextLine());
        int P1 = Integer.parseInt(scanner.nextLine());
        int P2 = Integer.parseInt(scanner.nextLine());
        double H = Double.parseDouble(scanner.nextLine());

        double waterP1 = H * P1;
        double waterP2 = H * P2;
        double total = waterP1 + waterP2;
        double fullPercent = total / V * 100;
        double p1Percent = waterP1 / total * 100;
        double p2Percent = waterP2 / total * 100;
        double overflow = total - V;

        if (total <= V) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", fullPercent, p1Percent, p2Percent);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", H, overflow);
        }
    }
}
