// You are given a square 2D image matrix where each integer represents a pixel.
// Write a method transposeMatrix to transform the matrix into its Transpose - in-place. 

public static void transposeMatrix(int[][] matrix) {
    int rows = matrix.length;
    int columns = matrix[0].length;
    
    for(int i = 0; i <= rows / 2; i++) {
        for(int j = i; j < columns; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }
}