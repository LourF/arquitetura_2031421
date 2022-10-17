public class Main {
    public static void main(String[] args) {
    final int [][] matrix = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
    };
    matrixUtilities.show(matrix);

    boolean a = matrixUtilities.isMatrix(matrix);
    System.out.println(a);
    }
}