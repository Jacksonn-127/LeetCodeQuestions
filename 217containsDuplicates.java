class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashy = new HashSet<>();

        // check for edge cases
        if(nums == null || nums.length == 1){
            return false;
        }

        // check if number is contained at current index, if so return true
        for(int i = 0; i < nums.length; i++){
            if(hashy.contains(nums[i])){
                return true;
            }
        // if not contained add it to the list
            hashy.add(nums[i]);

        }
        // if it hasn't been returned as true already then it has to be false
        return false;
    }
}
