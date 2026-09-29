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
    public int findSecondMinimumValue(TreeNode root) {

        int min = root.val;
        long secmin = Long.MAX_VALUE;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {

            TreeNode temp = q.poll();

            if (temp.val > min && temp.val < secmin) {
                secmin = temp.val;
            }

            if (temp.left != null)
                q.offer(temp.left);

            if (temp.right != null)
                q.offer(temp.right);
        }

        if (secmin == Long.MAX_VALUE)
            return -1;

        return (int) secmin;
    }
}