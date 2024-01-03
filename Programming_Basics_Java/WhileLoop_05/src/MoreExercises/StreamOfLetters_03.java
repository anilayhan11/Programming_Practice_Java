package MoreExercises;

import java.util.Scanner;

public class StreamOfLetters_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String word = "";

        boolean isMetC = false;
        boolean isMetO = false;
        boolean isMetN = false;

        while (!input.equals("End")) {

            char letter = input.charAt(0); //convert String to char to set valid range of letters
            if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {

                switch (input) {
                    case "c":
                        if (isMetC) {
                            word += input;
                        }
                        isMetC = true;
                        break;
                    case "o":
                        if (isMetO) {
                            word += input;
                        }
                        isMetO = true;
                        break;
                    case "n":
                        if (isMetN) {
                            word += input;
                        }
                        isMetN = true;
                        break;
                    default:
                        word += input;
                        break;
                }

                    if (isMetC && isMetO && isMetN) {
                        System.out.print(word + " ");
                        isMetC = false;
                        isMetO = false;
                        isMetN = false;

                        word = "";
                    }
                }
                input = scanner.nextLine();

            }
        }
    }
