
//Clock wise
class ClockwiseMatrixRotation {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] rotated = new int[n][n];

        // Fill rotated matrix with 90° clockwise rotated values
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = matrix[i][j];
            }
        }

        // Copy back to original matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rotated[i][j];
            }
        }
    }
}

/*
//Anti clock
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] rotated = new int[n][n];

        // Fill rotated matrix with 90° anti-clockwise rotated values
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[n - 1 - j][i] = matrix[i][j];
            }
        }

        // Copy back to original matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rotated[i][j];
            }
        }
    }
}
*/ 
