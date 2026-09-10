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
// class Solution {
//     //  public static int count=0;
//     int sum=0;
//     int count=0;
//     int ans=0;
//     public void countAvg(TreeNode node) {
//         // TreeNode temp=node;
//         if (node == null)
//             return ;
//         // if (node.left == null && node.right == null)
//         //     return 1;

//         countAvg(node.left);
//         countAvg(node.right);
//         sum+=node.val;
//         count++;
//         if ((sum)/count == node.val) {
//             ans++;
//         }
//         // return ans;
//     }

//     public int averageOfSubtree(TreeNode root) {
//         // int sum = 0, counts = 0,ans=0;
//         countAvg(root);
//          return ans;
class Solution {

    int ans = 0;

     class Data {
        int sum;
        int count;

        Data(int sum, int count) {
            this.sum = sum;
            this.count = count;
        }
    }

    public Data countAvg(TreeNode node) {

        if (node == null)
            return new Data(0, 0);

        Data left = countAvg(node.left);
        Data right = countAvg(node.right);

        int sum = left.sum + right.sum + node.val;
        int count = left.count + right.count + 1;

        if (sum / count == node.val)
            ans++;

        return new Data(sum, count);
    }

    public int averageOfSubtree(TreeNode root) {
        countAvg(root);
        return ans;
   
    }
}