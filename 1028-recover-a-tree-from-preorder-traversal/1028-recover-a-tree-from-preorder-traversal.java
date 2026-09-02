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
    int index = 0;

    public TreeNode recoverFromPreorder(String traversal) {
        return build(traversal, 0);
    }

    private TreeNode build(String s, int depth) {

        int n = s.length();
        int i = index;
        int count = 0;

        while (i < n && s.charAt(i) == '-') {
            count++;
            i++;
        }

        if (count != depth)
            return null;

        int num = 0;

        while (i < n && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');
            i++;
        }

        index = i;

        TreeNode root = new TreeNode(num);

        root.left = build(s, depth + 1);
        root.right = build(s, depth + 1);

        return root;
    }
}