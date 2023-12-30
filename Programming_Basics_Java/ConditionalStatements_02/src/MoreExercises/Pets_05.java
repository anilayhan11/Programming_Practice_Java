package MoreExercises;

import java.util.Scanner;

public class Pets_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int foodGivenKg = Integer.parseInt(scanner.nextLine());
        double dogFoodKg = Double.parseDouble(scanner.nextLine());
        double catFoodKg = Double.parseDouble(scanner.nextLine());
        double turtleFoodKg = Double.parseDouble(scanner.nextLine()) / 1000;
        double totalFoodEatenKg = (dogFoodKg * days) + (catFoodKg * days)+ (turtleFoodKg * days);


        if (foodGivenKg >= totalFoodEatenKg) {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodGivenKg - totalFoodEatenKg));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(totalFoodEatenKg - foodGivenKg));
        }
    }
}
