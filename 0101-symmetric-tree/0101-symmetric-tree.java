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
    public boolean isSymmetric(TreeNode root) {
         Queue<TreeNode> a = new LinkedList<>();
        Queue<TreeNode> b = new LinkedList<>();

        a.add(root.left);
        b.add(root.right);

        while (!a.isEmpty() && !b.isEmpty()) {
            TreeNode temp1 = a.poll();
            TreeNode temp2 = b.poll();
            if (temp1 == null && temp2 == null)
                continue;
            if (temp1 == null || temp2 == null)
                return false;
            if (temp1.val != temp2.val)
                return false;

            a.add(temp1.left);
            b.add(temp2.right);

            a.add(temp1.right);
            b.add(temp2.left);

        }
        return true;

    }
}