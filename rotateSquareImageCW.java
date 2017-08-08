// You are given a square 2D image matrix where each integer represents a pixel. 
// Write a method rotateSquareImageCW to rotate the image clockwise - in-place.

public static void rotateSquareImageCW(int[][] matrix) {
    int rows = matrix.length;
    int columns = rows;
    for(int i = 0; i <= rows / 2; i++) {
        for(int j = i; j < columns; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }
    for(int i = 0; i < matrix.length; i++){
        for(int j = 0; j < matrix[i].length/2; j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i][matrix[i].length - j - 1];
            matrix[i][matrix[i].length - j - 1] = temp;
        }
    }
}