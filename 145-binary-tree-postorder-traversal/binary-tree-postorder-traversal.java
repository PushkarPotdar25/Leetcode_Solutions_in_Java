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
    public List<Integer> postorderTraversal(TreeNode root) {
        //your code goes here
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        if(root == null) return ans;
        st.push(root);

        while(!st.isEmpty()){
            TreeNode curr = st.pop();
            st2.push(curr);
            if(curr.left != null) st.push(curr.left);
            if(curr.right != null) st.push(curr.right);
        }
        while(!st2.isEmpty()){
            ans.add(st2.pop().val);
        }
        
        return ans;
    }
}