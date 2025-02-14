class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int m = nums.length / 2;
        return nums[m];
    }
}
