package BasicsOfJavaInDepth.EnhancedModerateLevelTasks;


public class TriangleRhombusNumbersInRows {

    // ------------------------ 1. The Triangle - 'The Christmas Tree' ----------------------------
    public static void triangleByForLoop(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = n; space >= row; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= row; star++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void triangleByWhileLoop(int n) {
        int row = 1;
        while (row <= n) {
            int space = n;
            int star = 1;
            while (space >= row) {
                System.out.print(" ");
                space--;
            }
            while (star <= row) {
                System.out.print(" *");
                star++;
            }
            System.out.println();
            row++;
        }
    }


    // ------------------------------ 2. The Rhombus - 'Kamzík' ---------------------------------
    public static void rhombusByForLoop(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = n; space >= row; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= row; star++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= row; space++) {
                System.out.print(" ");
            }
            for (int star = n; star >= row; star--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void rhombusByWhileLoop(int n) {
        int rowA = 1;
        while (rowA <= n) {
            int space = n;
            int star = 1;
            while (space >= rowA) {
                System.out.print(" ");
                space--;
            }
            while (star <= rowA) {
                System.out.print(" *");
                star++;
            }
            System.out.println();
            rowA++;
        }

        int rowB = 1;
        while (rowB <= n) {
            int space = 1;
            int star = n;
            while (space <= rowB) {
                System.out.print(" ");
                space++;
            }
            while (star >= rowB) {
                System.out.print(" *");
                star--;
            }
            System.out.println();
            rowB++;
        }
    }


    // --------------------------------- 3. Numbers in rows ----------------------------------
    public static void numbersInRowsByForLoop(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void numbersInRowsByWhileLoop(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
            i++;
        }

        int k = 1;
        while (k < n) {
            int l = 1;
            while (l <= n - k) {
                System.out.print(l + " ");
                l++;
            }
            System.out.println();
            k++;
        }
    }


    // -------------------- 4. Rhombus with a special character in the center -------------------
    public static void specialRhombusByForLoop(int rows) {
        // The 'rows' should be an even number so that the special character is exactly in the center.

        for (int row = 1; row <= rows; row++) {
            for (int space = row; space <= rows; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= row; star++) {
                if (row == rows - 1 && star == rows / 2) {
                    System.out.print(" o");
                } else if (row == rows && star == rows / 2 || row == rows && star == rows / 2 + 1) {
                    System.out.print(" o");
                } else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }

        for (int row = 1; row < rows; row++) {
            for (int space = 1; space <= row + 1; space++) {
                System.out.print(" ");
            }
            for (int star = row; star < rows; star++) {
                if (row == 1 && star == rows / 2) {
                    System.out.print(" o");
                } else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

//         ------------------ 1. Example - The Triangle - 'The Christmas Tree' --------------------------------
//                                               *
//                                              * *
//                                             * * *
//                                            * * * *
//                                           * * * * *
//                                          * * * * * *
        System.out.println("\n\n-------- 1. Example - The Triangle - 'The Christmas Tree' --- ");
        System.out.println("-------- by For and While loops --- ");
        triangleByForLoop(6);
        System.out.println();
        triangleByWhileLoop(6);


//         --------------- 2. Example - The Rhombus - 'Kamzík' ------------------------------------------------
//                                           *
//                                          * *
//                                         * * *
//                                        * * * *
//                                        * * * *
//                                         * * *
//                                          * *
//                                           *
        System.out.println("\n---------- 2. Example - The Rhombus - 'Kamzík' - by For and While loops --- ");
        rhombusByForLoop(4);
        System.out.println();
        rhombusByWhileLoop(4);


//         --------------------- 3. Example - Numbers in rows  ----------------------------------------------
//                                          1
//                                          1 2
//                                          1 2 3
//                                          1 2 3 4
//                                          1 2 3 4 5
//                                          1 2 3 4
//                                          1 2 3
//                                          1 2
//                                          1
        System.out.println("\n---------- 3. Example - Numbers in rows - by For and While loops --- ");
        numbersInRowsByForLoop(5);
        System.out.println();
        numbersInRowsByWhileLoop(5);


//         ----------- 4. Example - Rhombus with a special character in the center. ---------------------------
//                                           *
//                                          * *
//                                         * * *
//                                        * * * *
//                                       * * o * *
//                                      * * o o * *
//                                       * * o * *
//                                        * * * *
//                                         * * *
//                                          * *
//                                           *
        System.out.println("\n-------- 4. Example - Rhombus with a special character in the center --- ");
        System.out.println("-------- by For loop --- ");
        // The 'rows' should be an even number so that the special character is exactly in the center.
        specialRhombusByForLoop(6);
        System.out.println();

    }
}
