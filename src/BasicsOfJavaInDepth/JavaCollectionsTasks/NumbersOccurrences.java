package BasicsOfJavaInDepth.JavaCollectionsTasks;


import java.util.*;

public class NumbersOccurrences {

    public static void main(String[] args) {
        System.out.println("\n--- ArrayList of numbers ---");
        ArrayList<Integer> numbersList = new ArrayList<>(
                List.of(1, 6, 6, 5, 2, 5, 2, 5, 1, 1, 3, 8, 3, 7, 9, 6, 6));
        System.out.println(numbersList);

        HashMap<Integer, Integer> numbersMapA = new HashMap<>();
        HashMap<Integer, Integer> numbersMapB = new HashMap<>();

        // create numbersMapA using a 'containsKey'
        System.out.println("\n----A. create MapA of numbers from ArrayList ---");
        for (int number : numbersList) {
            if (!numbersMapA.containsKey(number)) {
                numbersMapA.put(number, 1);
            } else {
                int currentValue = numbersMapA.get(number);
                numbersMapA.replace(number, currentValue + 1);
            }
        }
        System.out.println(numbersMapA);

        // create numbersMapB using a 'getOrDefault'
        System.out.println("\n----B. create MapB of numbers from ArrayList ---");
        for (int number : numbersList) {
            int currentValue = numbersMapB.getOrDefault(number, 0);
            numbersMapB.put(number, currentValue + 1);
        }
        System.out.println(numbersMapB);


        // max ValueA in numbersMapA using a 'keySet'
        System.out.println("\n--- A. the most frequently occurring number in the list is... ---");
        int maxValueA = 0;
        int maxKeyA = 0;
        for (Integer key : numbersMapA.keySet()) {
            int currentValueA = numbersMapA.get(key);
            if (currentValueA >= maxValueA) {
                maxValueA = currentValueA;
                maxKeyA = key;
            }
        }
        System.out.println(maxKeyA + " is in list - " + maxValueA + " times");

        // max ValueB in numbersMapB using a 'Map.Entry' and 'entrySet()'
        System.out.println("\n--- B. the most frequently occurring number in the list is... ---");
        int maxValueB = 0;
        int maxKeyB = 0;
        for (Map.Entry<Integer, Integer> entry : numbersMapB.entrySet()) {
            int currentValueB = entry.getValue();
            if (currentValueB >= maxValueB) {
                maxValueB = currentValueB;
                maxKeyB = entry.getKey();
            }
        }
        System.out.println(maxKeyB + " is in list - " + maxValueB + " times");
    }
}
