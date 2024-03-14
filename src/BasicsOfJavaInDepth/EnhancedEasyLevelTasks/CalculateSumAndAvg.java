package BasicsOfJavaInDepth.EnhancedEasyLevelTasks;

import java.util.Scanner;


public class CalculateSumAndAvg {

    public static int[] startStopNumbers() {
        Scanner myScanner = new Scanner(System.in);
        int startNumber;
        int stopNumber;

        System.out.println("\nHello, please input two numbers.");
        System.out.println("Method will calculate and return the sum and average\n" +
                "of the numbers between two specified numbers, including them.\n");

        while (true) {
            try {
                System.out.println("Write first number: ");
                startNumber = myScanner.nextInt();
                System.out.println("Write second number: ");
                stopNumber = myScanner.nextInt();
                if (stopNumber < startNumber) {
                    System.out.println("Second number must be bigger than first number!");
                    System.out.println("--- Try again\n");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Only integer number!");
                System.out.println("--- Try again\n");
                myScanner.nextLine();
            }
        }

        return new int[]{startNumber, stopNumber};
    }

    public static double[] sumAndAvg() {
        int[] userNumbersArray = startStopNumbers();
        int startNumber = userNumbersArray[0];
        int stopNumber = userNumbersArray[1];

        double sum = 0;
        double counter = 0;
        for (double i = startNumber; i <= stopNumber; i++) {
            counter++;
            sum += i;
        }

        double avg = sum / counter;

        return new double[]{sum, avg};
    }


    public static void main(String[] args) {

        double[] sumAvgArray = sumAndAvg();
        double sumResult = sumAvgArray[0];
        double avgResult = sumAvgArray[1];

        System.out.println("\n--- Calculated sum is: " + sumResult);
        System.out.println("--- Calculated average is: " + avgResult);
    }
}
