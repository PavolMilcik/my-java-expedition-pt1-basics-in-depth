package BasicsOfJavaInDepth.EnhancedEasyLevelTasks;

import java.util.Scanner;


public class SumCountOfAndAvg {

    public static double[] getSumCountOfAndAvg() {
        Scanner myScanner = new Scanner(System.in);
        String userInput;
        int userNumber;
        int sum = 0;
        int counter = 0;
        double avg;

        System.out.println("\nHello, please input integer numbers.");
        System.out.println("This method will calculate and return the sum, count of numbers\nand " +
                "average of the numbers.");
        System.out.println("To stop the program, input the letter s\n");

        while (true) {
            if (counter == 0) {
                System.out.println("Please write the first integer number, or to stop the program - s");
            } else {
                System.out.println("Write next integer number, or to stop the program - s.");
            }

            userInput = myScanner.nextLine();
            if (userInput.equals("s")) {
                break;
            } else {
                try {
                    userNumber = Integer.parseInt(userInput);
                    sum += userNumber;
                    counter++;
                } catch (Exception e) {
                    System.out.println("Write only integer numbers or letter 's'!");
                    System.out.println("---- Try again.\n");
                }
            }
        }

        if (counter == 0) {
            avg = 0;
        } else {
            avg = (double) sum / counter;
            avg = (double) Math.round(avg * 100) / 100;
        }

        return new double[]{sum, counter, avg};
    }


    public static void main(String[] args) {

        double[] returnedSumCountOfAndAvgArray = getSumCountOfAndAvg();
        double sumNumbers = returnedSumCountOfAndAvgArray[0];
        int countOfNumbers = (int) returnedSumCountOfAndAvgArray[1];
        double avgNumbers = returnedSumCountOfAndAvgArray[2];

        System.out.println("\n\n--- Calculated sum is: " + sumNumbers);
        System.out.println("--- Calculated count of user input numbers is: " + countOfNumbers);
        System.out.println("--- Calculated average is: " + avgNumbers);
    }
}
