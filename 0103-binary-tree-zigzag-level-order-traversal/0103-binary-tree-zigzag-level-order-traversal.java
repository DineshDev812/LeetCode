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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null)
        return new ArrayList<>();
        List<List<Integer>> li=new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        boolean ltor=true;
        while(!q.isEmpty())
        {
            int size=q.size();
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
            TreeNode node=q.poll();
            
            if(ltor)
            {
                l.add(node.val);
            }
            else
            {
                l.add(0,node.val);
            }
            if(node.left!=null)
            {
                q.offer(node.left);
            }
            if(node.right!=null)
            {
                q.offer(node.right);
            }
           
            }
            li.add(l);
            ltor=!ltor;
        }
        return li;
    }
}