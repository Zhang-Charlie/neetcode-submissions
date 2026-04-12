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

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        dfs(root,0);
        return ans;
    }

    private void dfs(TreeNode node, int depth){
        if(node == null) return;

        if(depth == ans.size()){
            ans.add(new ArrayList());
        }

        ans.get(depth).add(node);
        dfs(node.left, depth + 1);
        dfs(node.right, depth + 1);
        return ans;
    }
}
