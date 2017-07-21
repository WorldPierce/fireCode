// You are given an m x n 2D image matrix where each integer represents a pixel. 
// Flip it in-place along its horizontal axis.

public static void flipHorizontalAxis(int[][] matrix) {
    for(int i = matrix.length - 1; i >= matrix.length/2; i-- ){
        for(int j = 0; j < matrix[i].length; j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[(matrix.length - 1) - i][j];
            matrix[(matrix.length - 1) - i][j] = temp;
        }
    }
}