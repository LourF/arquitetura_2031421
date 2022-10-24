public class Main {
    public static void main(String[] args) {
    final int [][] matrix = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
    };
        final int [][] matrix2 = {
                {1, 0, 0},
                {0, 2, 0},
                {0, 0, 1}
        };
    matrixUtilities.show(matrix);

    boolean a = matrixUtilities.isMatrix(matrix);
    System.out.println(a);

    boolean b = matrixUtilities.isIdentity(matrix);
    System.out.println(b);

    int [][] productM= matrixUtilities.multiplyBy(matrix, 2);
    matrixUtilities.show(productM);;

    boolean c = matrixUtilities.areCompatibleForSum(matrix, matrix2);
    System.out.println(c);

    matrixUtilities.show(matrixUtilities.sumOf(matrix,matrix2));

    CharacterDrawingUtilities.drawElement('+');

    CharacterDrawingUtilities.drawNewLine();

    CharacterDrawingUtilities.drawHorizontalSegmentWith('+', 5);

    CharacterDrawingUtilities.drawNewLine();

    CharacterDrawingUtilities.drawFilledRectangleWith('x', 5,5);

    CharacterDrawingUtilities.drawNewLine();

    CharacterDrawingUtilities.drawEmptyRectangleWith('x', 5,5);
    }

}