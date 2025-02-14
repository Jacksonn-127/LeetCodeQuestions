class Solution {
    public int largestAltitude(int[] gain) {
        int current = 0;
        int temp = 0;

        for(int i = 0; i < gain.length; i++){
            current += gain[i];
            if(current > temp){
                temp = current;
            }
        }

        return temp;
    }
}
