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
    public TreeNode insert(int[] nums, int beg,int end)
    {
        if(beg>end)
        return null;

        int mid=(beg+end)/2;

        TreeNode node = new TreeNode(nums[mid]);

        node.left=insert(nums,beg,mid-1);
        node.right=insert(nums,mid+1,end);
        return node;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
       if(nums.length==0)
       return null;
       return insert(nums,0,nums.length-1);

    }
}