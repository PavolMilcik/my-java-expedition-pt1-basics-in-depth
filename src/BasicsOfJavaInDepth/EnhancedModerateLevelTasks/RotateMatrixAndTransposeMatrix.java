package BasicsOfJavaInDepth.EnhancedModerateLevelTasks;


import java.util.Arrays;


public class RotateMatrixAndTransposeMatrix {

    // ---------------------------- rotate matrix -------------------------------------------
    public static int[][] rotateMatrix(int[][] matrix) {
        int[][] rotatedMatrix = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                rotatedMatrix[i][j] = matrix[matrix.length - 1 - j][i];
            }
        }

        return rotatedMatrix;
    }

    // ---------------------------- transpose matrix -------------------------------------------
    public static int[][] transposeMatrix(int[][] matrix) {
        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }

        return transposedMatrix;
    }


    public static void main(String[] args) {

        // ----------------------------------------- rotate matrix ---------------------------------
        System.out.println("\n\n---------------- 1. function - Rotate Matrix -----------------");
        System.out.println("The function returns the rotated matrix." +
                "\nA rotated matrix is a matrix of numbers rotated 90 degrees to the right.");

        System.out.println("\n---------------------- rotated matrix A ----------------------------");
        int[][] matrixA = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(matrixA));
        int[][] rotatedMatrixA = rotateMatrix(matrixA);
        System.out.println(Arrays.deepToString(rotatedMatrixA));

        System.out.println("\n----------------------- rotated matrix B ----------------------------");
        int[][] matrixB = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println(Arrays.deepToString(matrixB));
        int[][] rotatedMatrixB = rotateMatrix(matrixB);
        System.out.println(Arrays.deepToString(rotatedMatrixB));

        System.out.println("\n---------------------- rotated matrix C ------------------------");
        int[][] matrixC = new int[][]{{1, 2, 3, 4, 13}, {5, 6, 7, 8, 14}, {9, 10, 11, 12, 15}};
        System.out.println(Arrays.deepToString(matrixC));
        int[][] rotatedMatrixC = rotateMatrix(matrixC);
        System.out.println(Arrays.deepToString(rotatedMatrixC));


        // ----------------------------------------- transpose matrix --------------------------------
        System.out.println("\n\n\n---------------- 2. function - Transpose Matrix -----------------");
        System.out.println("The function returns the transposed matrix." +
                "\nA transposed matrix is a matrix that is created by swapping rows and columns.");

        System.out.println("\n--------------------- transpose matrix D -------------------------");
        int[][] matrixD = new int[][]{{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(matrixD));
        int[][] transposedMatrixD = transposeMatrix(matrixD);
        System.out.println(Arrays.deepToString(transposedMatrixD));

        System.out.println("\n---------------------- transpose matrix E ------------------------");
        int[][] matrixE = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println(Arrays.deepToString(matrixE));
        int[][] transposedMatrixE = transposeMatrix(matrixE);
        System.out.println(Arrays.deepToString(transposedMatrixE));

        System.out.println("\n---------------------- transpose matrix F ------------------------");
        int[][] matrixF = new int[][]{{1, 2, 3, 4, 13}, {5, 6, 7, 8, 14}, {9, 10, 11, 12, 15}};
        System.out.println(Arrays.deepToString(matrixF));
        int[][] transposedMatrixF = transposeMatrix(matrixF);
        System.out.println(Arrays.deepToString(transposedMatrixF));

    }
}
