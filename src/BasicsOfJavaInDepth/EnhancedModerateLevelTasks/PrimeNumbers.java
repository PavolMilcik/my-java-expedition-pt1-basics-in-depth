package BasicsOfJavaInDepth.EnhancedModerateLevelTasks;

import java.util.Arrays;
import java.util.Scanner;


public class PrimeNumbers {

    public static int[] startStopInterval() {
        Scanner myScanner = new Scanner(System.in);
        int userNumber = 0;
        int start;
        int stop;

        System.out.println("\nHello.\nThis program return prime numbers between user start and stop interval.");

        while (true) {
            System.out.println("\nStart number must be bigger than 1, for example 2.");
            System.out.println("Write the start interval number:");
            try {
                userNumber = myScanner.nextInt();
            } catch (Exception e) {
                System.out.println("Write only integer number!");
                System.out.println("---- Try again.");
                myScanner.nextLine();
            }
            if (userNumber > 1) {
                start = userNumber;
                break;
            }
        }

        while (true) {
            System.out.println("\nStop number must be bigger than start number, for example 100." +
                    "\nStart number is: " + start + ".");
            System.out.println("Write the stop interval number:");
            try {
                userNumber = myScanner.nextInt();
            } catch (Exception e) {
                System.out.println("Write only integer number!");
                System.out.println("---- Try again.");
                myScanner.nextLine();
            }
            if (userNumber > start) {
                stop = userNumber;
                break;
            }
        }

        return new int[]{start, stop};
    }

    public static String primeNumbersString() {
        StringBuilder s = new StringBuilder();

        int[] startStopInterval = startStopInterval();
        int start = startStopInterval[0];
        int stop = startStopInterval[1];

        // find prime numbers
        for (int number = start; number <= stop; number++) {
            int counter = 0;
            for (int divider = 2; divider < number; divider++) {
                if (number % divider == 0) {
                    counter++;
                    break;
                }
            }
            // here is a prime number
            if (counter == 0) {
                s.append(number).append(",");
            }
        }

        System.out.println("\nPrime numbers between " + start + " and " + stop + ", inclusive:");

        return s.toString();
    }

    public static int[] primeNumbersIntArray() {
        String primeNumbersStr = primeNumbersString();
        String[] numbersStringArray = primeNumbersStr.split(",");
        int[] primeNumbersArray = new int[numbersStringArray.length];

        for (int i = 0; i < numbersStringArray.length; i++) {
            primeNumbersArray[i] = Integer.parseInt(numbersStringArray[i]);
        }

        return primeNumbersArray;
    }


    public static void main(String[] args) {

        int[] primeNumbers = primeNumbersIntArray();
        System.out.println(Arrays.toString(primeNumbers));

        for (int number : primeNumbers) {
            System.out.println(number);
        }
    }
}
