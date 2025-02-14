class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int temp;

        for(int i = 0; i < accounts.length; i++){
            temp = 0;
            for(int j = 0; j < accounts[i].length; j++){
                temp += accounts[i][j];

                if(temp > max){
                    max = temp;
                }
            }
        }

        return max;
    }
}
