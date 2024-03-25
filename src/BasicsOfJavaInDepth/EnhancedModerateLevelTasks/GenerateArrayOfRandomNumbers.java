package BasicsOfJavaInDepth.EnhancedModerateLevelTasks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class GenerateArrayOfRandomNumbers {

    public static int countOfRandomNumbers() {
        Scanner myScanner = new Scanner(System.in);
        int countOfRandomNumbers;

        System.out.println("\nHello.");
        System.out.println("The program will generate a array of random numbers, " +
                "\nensuring that no numbers are repeated.");

        while (true) {
            System.out.println("\nInput a number that is equal to or bigger than 2.");
            try {
                countOfRandomNumbers = myScanner.nextInt();
                if (countOfRandomNumbers > 1) {
                    break;
                } else {
                    System.out.println("Input only integer number that is equal to or bigger than 2.");
                    System.out.println("---- Try again.\n");
                }
            } catch (Exception e) {
                System.out.println("Input only integer number that is equal to or bigger than 2.");
                System.out.println("---- Try again.\n");
                myScanner.nextLine();
            }
        }

        return countOfRandomNumbers;
    }

    public static int[] createArrayOfRandomNumbers(int x) {
        Random myRandom = new Random();
        int[] randomNumbers = new int[x];
        int randomNumber;

        int i = 0;
        while (i < randomNumbers.length) {
            int counter = 0;
            randomNumber = myRandom.nextInt(1, x + 1);
            for (int number : randomNumbers) {
                if (randomNumber == number) {
                    break;
                } else {
                    counter++;
                }
            }
            if (counter == randomNumbers.length) {
                randomNumbers[i] = randomNumber;
                i++;
            }
        }

        return randomNumbers;
    }


    public static void main(String[] args) {

        int countOfNumbers = countOfRandomNumbers();
        int[] numbers = createArrayOfRandomNumbers(countOfNumbers);

        System.out.println("\nThe array contains random numbers, " +
                "\nand no numbers are repeated within it. --->");
        System.out.println(Arrays.toString(numbers));
    }
}
