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
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        int cnt = 0;
        if(root == null) return ans;
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelnum = queue.size();
            List<Integer> subans = new ArrayList<>();
            for(int i=0;i<levelnum;i++){
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                subans.add(queue.poll().val);
            }
            if(cnt % 2 == 1){
                Collections.reverse(subans);
                ans.add(subans);
            }
            else{
                ans.add(subans);
            }
            cnt++;
        }
        return ans;
    }
}