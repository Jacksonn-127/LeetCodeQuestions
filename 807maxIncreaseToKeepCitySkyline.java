class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int l = grid.length;
        int[] row = new int[l];
        int[] col = new int[l];

        int sum = 0;
    
        for(int i = 0; i < l; i++){
            row[i] = grid[i][0];
            col[i] = grid[0][i];
            for(int j = 0; j < l; j++){
                row[i] = Math.max(row[i], grid[i][j]);
                col[i] = Math.max(col[i], grid[j][i]);
            }
        }

        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                sum+= Math.min(row[i], col[j])-grid[i][j];
            }
        }

        return sum;
    }


}
