public class Matrix {
    public static void main(String[] args) {
        int a[][] = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        int b[][] = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};

//creating another matrix to store the multiplication of two matrices
        int c[][] = new int[3][3];
        int add[][] = new int[3][3];
        int sub[][] = new int[3][3];
        int transpose[][] = new int[3][3];
        int original[][]={{1,3,4},{2,4,3},{3,4,5}};


        System.out.println("Multiplying matrices");
//multiplying and printing multiplication of 2 matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];

                }//end of k loop
                System.out.print(c[i][j] + " ");  //printing matrix element
            }//end of j loop
            System.out.println();//new line
        }
        System.out.println("Adding matrices");
        //Adding 2 matrics
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                add[i][j] = a[i][j] + b[i][j];
                sub[i][j] = a[i][j] - b[i][j];
                System.out.print(add[i][j] + " ");
            }
            System.out.println();//new line
        }
        System.out.println("sub of Matrices");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sub[i][j] = a[i][j] - b[i][j];
                System.out.print(sub[i][j] + " ");
            }
            System.out.println();//new line
        }


//Code to transpose a matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[i][j] = original[j][i];
            }
        }

        System.out.println("Printing Matrix without transpose:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(original[i][j] + " ");
            }
            System.out.println();//new line
        }
        System.out.println("Printing Matrix After Transpose:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();//new line
        }


    }
}