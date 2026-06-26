class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();

        TreeNode curr = root;

        while(curr != null || !st.isEmpty()){

            // Go to the leftmost node
            while(curr != null){
                st.push(curr);
                curr = curr.left;
            }

            // Left subtree finished
            curr = st.pop();

            // Visit the current node
            ans.add(curr.val);

            // Now move to the right subtree
            curr = curr.right;
        }

        return ans;
    }
}