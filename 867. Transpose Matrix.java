class Solution {
    public int[][] transpose(int[][] matrix) {
        // new array to store result
        int[][] res = new int[matrix[0].length][matrix.length];

        // for each row of the original matrix store it in the columns of result 
        for(int i =0; i < matrix.length; i++){
            for(int k = 0; k < matrix[0].length; k++){
                res[k][i] = matrix[i][k];
            }
        }

        return res;
    }
}
