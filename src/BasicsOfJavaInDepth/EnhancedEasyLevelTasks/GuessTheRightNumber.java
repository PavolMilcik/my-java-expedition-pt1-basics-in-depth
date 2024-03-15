package BasicsOfJavaInDepth.EnhancedEasyLevelTasks;

import java.util.Scanner;


public class GuessTheRightNumber {

    public static int guessTheNumber() {
        Scanner myScanner = new Scanner(System.in);
        int wantedNumber = 7;
        int userNumber;

        System.out.println("\nHello.\nGuess the number between 1 and 10.");
        System.out.println("If you guess the correct number, you win and the program ends.");
        System.out.println("How quickly can you find the right number?");

        while (true) {
            try {
                userNumber = myScanner.nextInt();
                if (userNumber == wantedNumber) {
                    break;
                } else if (userNumber < 1 || userNumber > 10) {
                    System.out.println("The number must be between 1 and 10, inclusive.");
                    System.out.println("---- Try again.\n");
                } else {
                    System.out.println("No, it is not the right number.");
                    System.out.println("---- Try again.\n");
                }
            } catch (Exception e) {
                System.out.println("Write only integer numbers!");
                System.out.println("---- Try again.\n");
                myScanner.nextLine();
            }
        }

        return userNumber;
    }


    public static void main(String[] args) {

        int userWantedNumber = guessTheNumber();
        System.out.println("You found the right number: " + userWantedNumber + ".\nThe end.");
    }
}
