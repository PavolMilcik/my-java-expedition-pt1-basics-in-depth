package BasicsOfJavaInDepth.EnhancedEasyLevelTasks;

import java.util.Arrays;


public class MaxNumberAndMaxRowSum {

    public static int findMaxNumber(int[][] numbers) {
        int maxNumber = numbers[0][0];
        for (int[] row : numbers) {
            for (int number : row) {
                if (maxNumber <= number) {
                    maxNumber = number;
                }
            }
        }
        return maxNumber;
    }

    public static int findMaxRowSum(int[][] numbers) {
        int maxRowSum = numbers[0][0];
        for (int[] row : numbers) {
            int rowSum = 0;
            for (int number : row) {
                rowSum += number;
            }
            if (maxRowSum <= rowSum) {
                maxRowSum = rowSum;
            }
        }
        return maxRowSum;
    }


    public static void main(String[] args) {

        int[][] numbers = new int[][]{{5, 8, 25}, {25, 16, 3}, {17, 17, 11}};
        System.out.println("\n--- The multidimensional array of numbers is: " + Arrays.deepToString(numbers));
        System.out.println("--- The max number from multidimensional array is: " + findMaxNumber(numbers));
        System.out.println("--- The max row sum from multidimensional array is: " + findMaxRowSum(numbers));
    }
}
