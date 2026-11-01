/*public class matadd {

    public static int[][] sumMatrices(int[][] m1, int[][] m2) {
        int[][] res = new int[m1.length][m2[0].length];

        for (int row = 0; row < m1.length; row++) {
            for (int col = 0; col < m2[0].length; col++) {
                res[row][col] = m1[row][col] + m2[row][col];

            }

        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matA = { {5, 9, 3}, {4, 2, 8}, {0, 1, 3} };
        int[][] matB = { {1, 7, 3}, {2, 7, 4}, {0, 1, 3} };

        int[][] output = sumMatrices(matA, matB);
        for (int row = 0; row < matA.length; row++) {
            for (int col = 0; col < matA[0].length; col++) {
                System.out.print(output[row][col]+" ");

            }
            System.out.println();

        }
    }
}*/
public class matadd {

    public static void displayMatrix(int[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[][] a = { {9, 5, 3}, {0, 3, 4}, {6, 2, 0} };

        displayMatrix(a);
    }
}