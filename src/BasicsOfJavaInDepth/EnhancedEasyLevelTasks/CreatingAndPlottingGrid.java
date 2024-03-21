package BasicsOfJavaInDepth.EnhancedEasyLevelTasks;

import java.util.Arrays;
import java.util.Scanner;


public class CreatingAndPlottingGrid {

    public static int[] initializeGrid() {
        int[] numberOfRowsColumns = new int[2];
        Scanner myScanner = new Scanner(System.in);
        int userRows;
        int userColumns;
        System.out.println("Hello, this method will create a grid of stars.");

        while (true) {
            System.out.println("\n1. Please, input the number of ROWS for the grid of stars.");
            System.out.println("Use only integer numbers, between 1 and 10, inclusive.");
            try {
                userRows = myScanner.nextInt();
                if (userRows > 10 || userRows < 1) {
                    System.out.println("Use only integer numbers, between 1 and 10, inclusive.");
                    System.out.println("---- Try again.");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Write only integer number!");
                System.out.println("---- Try again.");
                myScanner.nextLine();
            }
        }

        while (true) {
            System.out.println("\n2. Please, input the number of COLUMNS for the grid of stars.");
            System.out.println("Use only integer numbers, between 1 and 10, inclusive.");
            try {
                userColumns = myScanner.nextInt();
                if (userColumns > 10 || userColumns < 1) {
                    System.out.println("Use only integer numbers, between 1 and 10, inclusive.");
                    System.out.println("---- Try again.");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Write only integer number!");
                System.out.println("---- Try again.");
                myScanner.nextLine();
            }
        }

        numberOfRowsColumns[0] = userRows;
        numberOfRowsColumns[1] = userColumns;
        return numberOfRowsColumns;
    }

    public static String[][] creatingGrid(int[] rowsColumns) {
        int rows = rowsColumns[0];
        int columns = rowsColumns[1];
        String[][] gridOfStars = new String[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                gridOfStars[row][column] = "*";
            }
        }
        return gridOfStars;
    }

    public static void plottingGrid(String[][] grid) {
        System.out.println("Plotting the grid of stars using an enhanced 'for' loop ->");
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[row].length; column++) {
                System.out.print(grid[row][column] + " ");
            }
            System.out.println();
        }

        System.out.println("\nPlotting the grid of stars using a shortened 'for each' loop ->");
        for (String[] row : grid) {
            for (String star : row) {
                System.out.print(star + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        int[] userRowsColumns = initializeGrid();
        System.out.println("\n---------------- Number of rows and columns for a grid.");
        System.out.println(Arrays.toString(userRowsColumns));

        System.out.println("\n---------------- Creating the raw grid of stars.");
        String[][] gridOfStars = creatingGrid(userRowsColumns);
        System.out.println(Arrays.deepToString(gridOfStars));

        System.out.println("\n---------------- Plotting the grid of stars.");
        plottingGrid(gridOfStars);
    }
}
