package BasicsOfJavaInDepth.EnhancedModerateLevelTasks;


import java.util.Arrays;


public class FrequencyOfOccurrenceOfNumbers {

    // -------------------------------- unsorted numbers --------------------------------
    public static void unsortedNumbersOccurrence(int[] numbers) {
        StringBuilder s = new StringBuilder();
        System.out.println(Arrays.toString(numbers) + "\n");
        int counter = 0;
        int countDuplicates = 0;

        // frequency of occurrence of numbers in unsorted array
        for (int i = 0; i < numbers.length; i++) {
            counter = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    if (i > j) {
                        break;
                    } else {
                        counter++;
                    }
                }
            }
            if (counter > 0) {
                System.out.println(numbers[i] + " - " + counter);
            }
            if (counter > 1) {
                countDuplicates++;
                s.append(numbers[i]).append(" ");
            }
        }

        System.out.println("--- and there are " + countDuplicates + " duplicate numbers:");
        String duplicates = s.toString();
        System.out.println("--- " + duplicates);
    }

    // -------------------------------- sorted numbers --------------------------------
    public static int[] sortNumbers(int[] numbers) {
        for (int n : numbers) {
            for (int i = 0; i < numbers.length - 1; i++) {
                int currentNumber = numbers[i];
                int nextNumber = numbers[i + 1];
                if (currentNumber > nextNumber) {
                    numbers[i + 1] = currentNumber;
                    numbers[i] = nextNumber;
                }
            }
        }
        return numbers;
    }

    public static void sortedNumbersOccurrence(int[] sortedNumbers) {
        StringBuilder s = new StringBuilder();
        int counter = 0;
        int countDuplicates = 0;

        // frequency of occurrence of numbers in sorted array
        for (int i = 0; i < sortedNumbers.length; i += counter) {
            counter = 0;
            for (int j = i; j < sortedNumbers.length; j++) {
                if (sortedNumbers[i] == sortedNumbers[j]) {
                    counter++;
                }
            }
            if (counter > 1) {
                countDuplicates++;
                s.append(sortedNumbers[i]).append(" ");
            }
            System.out.println(sortedNumbers[i] + " - " + counter);
        }

        System.out.println("--- and there are " + countDuplicates + " duplicate numbers:");
        String duplicates = s.toString();
        System.out.println("--- " + duplicates);
    }


    public static void main(String[] args) {
        int[] numbers = new int[]{6, 1, 9, 7, 6, 6, 7, 1, 8, 7, 6, 2, 2, 3, 5, 4, 3};

        System.out.println("\n\n------------ An unsorted array of numbers and " +
                "\nthe frequency of occurrence of each number within the array.");
        unsortedNumbersOccurrence(numbers);


        System.out.println("\n\n------------ A sorted array of numbers and " +
                "\nthe frequency of occurrence of each number within the array.");
        int[] sortedNumbers = sortNumbers(numbers);
        System.out.println(Arrays.toString(sortedNumbers) + "\n");
        sortedNumbersOccurrence(sortedNumbers);
    }
}
