/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return recursionHelper(nums, 0, nums.length - 1);
    }

    private TreeNode recursionHelper(int[] nums, int left, int right){
        if(left > right){
            return null;
        }

        // mid is = left + right(nums.length - left) / 2 to get middle of array or subarray
        // you cant just do left + right because the values you're passing in for left and right change
        int mid = left + (right - left) / 2;
        // make a new tree node at mid
        TreeNode root = new TreeNode(nums[mid]);

        // perform operation for all left nodes
        root.left = recursionHelper(nums, left, mid - 1);
        // perform all operations for all right nodes
        root.right = recursionHelper(nums, mid + 1, right);

        return root;
    }
}
