class Solution {
    public int maximumPossibleSize(int[] nums) {
        int len = nums.length;
        int curr = -1;
        int removed = 0;
        for(int i =0; i < len; i++){
            if(nums[i] < curr){
                removed++;
            }
            else{
                curr = nums[i];
            }
        }

        return len - removed;
    }
}
