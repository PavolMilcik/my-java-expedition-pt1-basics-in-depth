package BasicsOfJavaInDepth.JavaCollectionsTasks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;


public class RemoveItemsOptions {
    public static void main(String[] args) {

        System.out.println("\n\n---- creating a list of numbers using a 'for loop':");
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            listOfNumbers.add(i);
        }
        System.out.println(listOfNumbers);


        System.out.println("\n---- sorting a list of numbers using a 'Comparator':");
        listOfNumbers.sort(Comparator.reverseOrder());
        System.out.println(listOfNumbers);
        listOfNumbers.sort(Comparator.naturalOrder());
        System.out.println(listOfNumbers);


        System.out.println("\n---- removing items from a list of numbers using a 'for loop':");
        for (int i = listOfNumbers.size() - 1; i >= 0; i--) {
            if (listOfNumbers.get(i) % 5 == 0) {
                listOfNumbers.remove(i);
            }
        }
        System.out.println(listOfNumbers);


        System.out.println("\n---- removing items from a list of numbers using a 'removeIf':");
        listOfNumbers.removeIf(number -> number % 3 == 0);
        System.out.println(listOfNumbers);


        System.out.println("\n---- removing items from a list of numbers using a 'Iterator':");
        Iterator<Integer> iteratorNumbers = listOfNumbers.iterator();
        while (iteratorNumbers.hasNext()) {
            int currentNumber = iteratorNumbers.next();
            if (currentNumber % 2 == 0) {
                iteratorNumbers.remove();
            }
        }
        System.out.println(listOfNumbers);
    }
}
