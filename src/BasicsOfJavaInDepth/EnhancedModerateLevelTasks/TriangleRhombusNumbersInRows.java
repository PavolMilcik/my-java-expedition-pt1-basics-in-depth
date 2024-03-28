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


    public static void main(String[] args) {

//         ----------------------------- The Triangle - 'The Christmas Tree' ----------------------------
//                                               *
//                                              * *
//                                             * * *
//                                            * * * *
//                                           * * * * *
//                                          * * * * * *
        System.out.println("\n\n--- 1. Example - The Triangle - 'The Christmas Tree' - by For and While loops --- ");
        triangleByForLoop(6);
        System.out.println();
        triangleByWhileLoop(6);


//         ------------------------- The Rhombus - 'Kamzík' -------------------------------------------
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


//         ---------------------------- Numbers in rows  -----------------------------------------
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

    }
}
