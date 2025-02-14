class Solution {
    public int kthFactor(int n, int k) {
       List<Integer> temp = new ArrayList<>();
        int returnVal = -1;

        for(int i = 1; i <= (n/2) + 1; i++){
            if(n % i == 0){
                temp.add(i);
            }
        }
        temp.add(n);

        if(temp.size() >= k){
            returnVal = temp.get(k - 1);
        }

        return returnVal;
    }
}
