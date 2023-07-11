class Solution {
    public int height(TreeNode node, int start){
        if(node == null){
            return start;
        }
        return Math.max(height(node.left, start + 1), height(node.right, start + 1));
    }

    public boolean balance(TreeNode node, int start){
        if(node == null){
            return true;
        }
        int left = height(node.left, start + 1);
        int right = height(node.right, start + 1);
        return Math.abs(left - right) <= 1 && balance(node.left, start + 1) && balance(node.right, start + 1);
    }

    public boolean isBalanced(TreeNode root) {
        return balance(root, 0); 
    }
}