class Solution {
    public int arrangeCoins(int n) {
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }

        int count = 0;
        int cost = 1;
        while(n > 0){
            if(n - cost >= 0){
                n = n - cost;
                cost = cost + 1;
                count++;
            }
            else{
                break;
            }
        }

        return count;
    }
}
