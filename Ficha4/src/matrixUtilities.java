public class matrixUtilities {
    public static void show (int [][] matrix){
        for (int i = 0 ; i < matrix.length ; i++ ){
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
    public static boolean isMatrix (int [][] matrix){
        int size = matrix[0].length;

        for (int i = 1; i < matrix.length ; i++) {
        if (matrix[i].length == size){
            if(matrix[i].length != size)
                return false;
            }
        }
        return true;
    }
    public static void isIdentity (int[][] matrix){
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                if (i== j & matrix[i][j] == 1){
                    
                }
            }
        }
    }
}
