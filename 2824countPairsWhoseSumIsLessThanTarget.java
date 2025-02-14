class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int returnValue = 0;

        for(int i = 0; i < nums.size(); i++){
            for(int j = i + 1; j < nums.size(); j++){
                int temp = nums.get(i) + nums.get(j);
                if(temp < target){
                    returnValue++;
                }
            }
        }

        return returnValue;
    }
}
