class Solution {
    public void rotate(int[][] matrix) {
        // transpose image first
        for (int i = 0; i < matrix.length; i++) {
                for (int k = i + 1; k < matrix.length; k++) {
                    int temp = matrix[i][k];
                    matrix[i][k] = matrix[k][i];
                    matrix[k][i] = temp;
                }
            }

        // swap left and right columns
        int temp2;
        for(int i  = 0; i < matrix.length; i++){
            for(int k = 0; k < matrix.length / 2; k++){
                temp2 = matrix[i][matrix.length - (k + 1)];
                matrix[i][matrix.length - (k + 1)] = matrix[i][k];
                matrix[i][k] = temp2;
            }
        }
    }
}
