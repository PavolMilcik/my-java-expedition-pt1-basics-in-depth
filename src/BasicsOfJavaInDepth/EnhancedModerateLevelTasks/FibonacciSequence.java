package BasicsOfJavaInDepth.EnhancedModerateLevelTasks;

import java.util.Arrays;
import java.util.Scanner;


public class FibonacciSequence {

    public static int stopNumber() {
        Scanner myScanner = new Scanner(System.in);
        int userNumber = 0;
        int stop;

        System.out.println("\nHello.\nThe program will return a Fibonacci sequence " +
                "\nup to a specified stop number provided by the user.");

        while (true) {
            System.out.println("\nStop number must be bigger than number 2, for example 100.");
            System.out.println("Write the stop interval number:");
            try {
                userNumber = myScanner.nextInt();
            } catch (Exception e) {
                System.out.println("Write only integer number!");
                System.out.println("---- Try again.");
                myScanner.nextLine();
            }
            if (userNumber > 2) {
                stop = userNumber;
                break;
            }
        }

        return stop;
    }

    public static String fibonacciString() {
        int stopNumber = stopNumber();
        StringBuilder s = new StringBuilder();

        // find a fibonacci sequence
        int a = 0;
        int b = 1;
        int sum = a + b;
        while (sum <= stopNumber) {
            s.append(sum).append(",");
            a = b;
            b = sum;
            sum = a + b;
        }

        System.out.println("\nFibonacci sequence up to " + stopNumber + ", inclusive:");

        return s.toString();
    }

    public static int[] fibonacciIntArray() {
        String fibonacciStr = fibonacciString();
        String[] numbersStringArray = fibonacciStr.split(",");
        int[] fibonacciArray = new int[numbersStringArray.length];

        for (int i = 0; i < numbersStringArray.length; i++) {
            fibonacciArray[i] = Integer.parseInt(numbersStringArray[i]);
        }

        return fibonacciArray;
    }


    public static void main(String[] args) {

        int[] fibonacciNumbers = fibonacciIntArray();
        System.out.println(Arrays.toString(fibonacciNumbers));

        for (int number : fibonacciNumbers) {
            System.out.println(number);
        }
    }
}
