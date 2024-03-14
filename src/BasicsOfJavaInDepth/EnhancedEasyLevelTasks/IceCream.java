package BasicsOfJavaInDepth.EnhancedEasyLevelTasks;

import java.util.Scanner;


public class IceCream {

    public static int numberOfScoops() {
        Scanner myScanner = new Scanner(System.in);
        int userNumberOfScoops;

        System.out.println("\nHello.");
        while (true) {
            System.out.println("Write the number of ice cream scoops:");
            try {
                userNumberOfScoops = myScanner.nextInt();
                if (userNumberOfScoops > 0 && userNumberOfScoops <= 10) {
                    break;
                } else {
                    System.out.println("You may write some scoops, but no more than 10.\n");
                    System.out.println("----- Try again.");
                }
            } catch (Exception e) {
                System.out.println("Write only integer number!\n");
                System.out.println("----- Try again.");
                myScanner.nextLine();
            }
        }

        return userNumberOfScoops;
    }

    public static double priceOfIceCream(int scoopsNumber) {
        double evenPrice = 1.5;
        double oddPrice = 1.25;
        double totalPrice;

        // total price by if-else statement --->
//        if (scoopsNumber % 2 == 0) {
//            totalPrice = evenPrice * scoopsNumber;
//        } else {
//            totalPrice = oddPrice * scoopsNumber;
//        }

        // or total price by ternary operator --->
        totalPrice = scoopsNumber % 2 == 0 ? scoopsNumber * evenPrice : scoopsNumber * oddPrice;

        return totalPrice;
    }

    public static String returnIceCreamStory(int scoops, double price) {
        double evenPrice = 1.5;
        double oddPrice = 1.25;
        String returnedString;

        if (scoops % 2 == 0) {
            returnedString = "\nBecause you have an even number of scoops, the price for one scoop is "
                    + evenPrice + " €.\n" + "You want " + scoops + " scoops of ice cream.\n" +
                    "--- So, the total price for your ice cream is " + price + " €.";
        } else {
            returnedString = "\nBecause you have an odd number of scoops, the price for one scoop is "
                    + oddPrice + " €.\n" + "You want " + scoops + " scoops of ice cream.\n" +
                    "--- So, the total price for your ice cream is " + price + " €.";
        }

        return returnedString;
    }


    public static void main(String[] args) {

        int scoopNumbers = numberOfScoops();
        double iceCreamPrice = priceOfIceCream(scoopNumbers);

        System.out.println(returnIceCreamStory(scoopNumbers, iceCreamPrice));
    }
}
